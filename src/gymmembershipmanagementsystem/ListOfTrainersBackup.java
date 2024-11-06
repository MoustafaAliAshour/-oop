package gymmembershipmanagementsystem;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListOfTrainersBackup extends JFrame {
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private JButton backButton;
    private static final String FILE_NAME = FileNames.TRAINER_FILENAME;

    public ListOfTrainersBackup() {
        super("List Of Trainers");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null); 

        initComponents();
        loadDataToTable();
  
        setSize(750, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {
        jTable1 = new JTable();
        jScrollPane1 = new JScrollPane(jTable1);

        // Create the Back button
        backButton = new JButton("<-");
        backButton.setBounds(10, 10, 50, 30);
        backButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                navigateBack();
            }
        });

        jScrollPane1.setBounds(10, 50, 720, 300);

        add(backButton);
        add(jScrollPane1);
    }

    private void navigateBack() {
        try {
            AdminPage adminPage = new AdminPage();
            adminPage.setVisible(true);
            adminPage.setLocationRelativeTo(null);
            adminPage.pack();
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error navigating back: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadDataToTable() {
        Vector<String> columnNames = new Vector<>();
        columnNames.add("Id");
        columnNames.add("Name");
        columnNames.add("Email");
        columnNames.add("Speciality");
        columnNames.add("Phone Number");

        Vector<Vector<String>> data = new Vector<>();

        if (!Files.exists(Paths.get(FILE_NAME))) {
            JOptionPane.showMessageDialog(this, "The file does not exist.", "File Not Found", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",\\s*");
                if (values.length != 5) {
                    JOptionPane.showMessageDialog(this, "Invalid data format in file.", "Data Error", JOptionPane.WARNING_MESSAGE);
                    continue;
                }

                Vector<String> row = new Vector<>();
                for (String value : values) {
                    row.add(value.trim());
                }
                data.add(row);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        if (!data.isEmpty()) {
            jTable1.setModel(new DefaultTableModel(data, columnNames) {
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return false;
                }
            });
        } else {
            JOptionPane.showMessageDialog(this, "No data to display.", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new ListOfTrainersBackup());
    }
}
