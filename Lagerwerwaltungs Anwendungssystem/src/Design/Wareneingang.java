package Design;

import javax.swing.*;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Wareneingang extends JFrame {
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_Spalte; // Neues Textfeld für die Spalte

    public Wareneingang() {
        initialize();
    }

    private void initialize() {
        setBounds(100, 100, 700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(6, 6, 688, 460);
        getContentPane().add(tabbedPane);

        JPanel panel = new JPanel();
        tabbedPane.addTab("Grafikkarten", null, panel, null);
        panel.setLayout(null);

        JTextPane textPaneExistingProduct = new JTextPane();
        textPaneExistingProduct.setEditable(false);
        textPaneExistingProduct.setBackground(SystemColor.window);
        textPaneExistingProduct.setText("bestehende Ware:");
        textPaneExistingProduct.setBounds(6, 6, 136, 16);
        panel.add(textPaneExistingProduct);

        JTextPane textPaneNewProduct = new JTextPane();
        textPaneNewProduct.setEditable(false);
        textPaneNewProduct.setBackground(SystemColor.window);
        textPaneNewProduct.setText("neue Ware:");
        textPaneNewProduct.setBounds(335, 6, 136, 16);
        panel.add(textPaneNewProduct);

        textField_2 = new JTextField();
        textField_2.setBounds(492, 50, 130, 26);
        panel.add(textField_2);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(492, 88, 130, 26);
        panel.add(textField_3);

        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(492, 126, 130, 26);
        panel.add(textField_4);

        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(492, 164, 130, 26);
        panel.add(textField_5);

        textField_6 = new JTextField();
        textField_6.setColumns(10);
        textField_6.setBounds(492, 202, 130, 26);
        panel.add(textField_6);

        textField_7 = new JTextField();
        textField_7.setColumns(10);
        textField_7.setBounds(492, 240, 130, 26);
        panel.add(textField_7);

        textField_Spalte = new JTextField();
        textField_Spalte.setColumns(10);
        textField_Spalte.setBounds(492, 202, 130, 26);
        panel.add(textField_Spalte);

        JButton btnConfirm = new JButton("Bestätigen");
        btnConfirm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonConfirmed();
            }
        });
        btnConfirm.setBounds(354, 316, 117, 29);
        panel.add(btnConfirm);

        JButton btnReset = new JButton("Zurücksetzen");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetFields();
            }
        });
        btnReset.setBounds(505, 316, 117, 29);
        panel.add(btnReset);
        
        JTextPane txtpnSpalte_1 = new JTextPane();
        txtpnSpalte_1.setEditable(false);
        txtpnSpalte_1.setText("Spalte:");
        txtpnSpalte_1.setBackground(SystemColor.window);
        txtpnSpalte_1.setBounds(354, 202, 58, 16);
        panel.add(txtpnSpalte_1);
        
        JTextPane txtpnSpalte_1_1 = new JTextPane();
        txtpnSpalte_1_1.setEditable(false);
        txtpnSpalte_1_1.setText("Menge:");
        txtpnSpalte_1_1.setBackground(SystemColor.window);
        txtpnSpalte_1_1.setBounds(354, 240, 58, 16);
        panel.add(txtpnSpalte_1_1);
        
        JTextPane txtpnSpalte_1_2 = new JTextPane();
        txtpnSpalte_1_2.setEditable(false);
        txtpnSpalte_1_2.setText("Regal:");
        txtpnSpalte_1_2.setBackground(SystemColor.window);
        txtpnSpalte_1_2.setBounds(354, 164, 58, 16);
        panel.add(txtpnSpalte_1_2);
        
        JTextPane txtpnSpalte_1_2_1 = new JTextPane();
        txtpnSpalte_1_2_1.setEditable(false);
        txtpnSpalte_1_2_1.setText("Flur:");
        txtpnSpalte_1_2_1.setBackground(SystemColor.window);
        txtpnSpalte_1_2_1.setBounds(354, 125, 58, 16);
        panel.add(txtpnSpalte_1_2_1);
        
        JTextPane txtpnSpalte_1_2_2 = new JTextPane();
        txtpnSpalte_1_2_2.setEditable(false);
        txtpnSpalte_1_2_2.setText("Typbezeichnung:");
        txtpnSpalte_1_2_2.setBackground(SystemColor.window);
        txtpnSpalte_1_2_2.setBounds(354, 88, 117, 16);
        panel.add(txtpnSpalte_1_2_2);
        
        JTextPane txtpnSpalte_1_2_3 = new JTextPane();
        txtpnSpalte_1_2_3.setEditable(false);
        txtpnSpalte_1_2_3.setText("Hersteller:");
        txtpnSpalte_1_2_3.setBackground(SystemColor.window);
        txtpnSpalte_1_2_3.setBounds(354, 50, 71, 16);
        panel.add(txtpnSpalte_1_2_3);
        
        JPanel panel_1 = new JPanel();
        tabbedPane.addTab("Festplattenspeicher", null, panel_1, null);

        setVisible(true);
    }

    private void buttonConfirmed() {
        addToDatabase();
        readData();
    }

    private void resetFields() {
        textField_2.setText("");
        textField_3.setText("");
        textField_4.setText("");
        textField_5.setText("");
        textField_6.setText("");
        textField_7.setText("");
        textField_Spalte.setText(""); // Zurücksetzen des Spalten-Textfelds
    }

    private void addToDatabase() {
        try {
            String url = "jdbc:mysql://3.69.96.96:80/db1";
            String user = "db1";
            String password = "!db1.wip23?WS6";

            Connection connection = DriverManager.getConnection(url, user, password);

            String getMaxProductNumberSql = "SELECT MAX(produktnr) FROM grafikkarte";
            int maxProductNumber = 0;

            try (PreparedStatement getMaxProductNumberStatement = connection.prepareStatement(getMaxProductNumberSql)) {
                try (var resultSet = getMaxProductNumberStatement.executeQuery()) {
                    if (resultSet.next()) {
                        maxProductNumber = resultSet.getInt(1);
                    }
                }
            }

            int nextProductNumber = maxProductNumber + 1;

            String insertSql = "INSERT INTO grafikkarte (produktnr, hersteller, typbezeichnung, flur, regal, spalte, menge) VALUES (?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement insertStatement = connection.prepareStatement(insertSql)) {
                insertStatement.setInt(1, nextProductNumber);
                insertStatement.setString(2, textField_2.getText());
                insertStatement.setString(3, textField_3.getText());
                insertStatement.setInt(4, Integer.parseInt(textField_4.getText()));
                insertStatement.setInt(5, Integer.parseInt(textField_5.getText()));
                insertStatement.setInt(6, Integer.parseInt(textField_6.getText()));
                insertStatement.setInt(7, Integer.parseInt(textField_7.getText()));

                int rowsAffected = insertStatement.executeUpdate();
                System.out.println(rowsAffected + " Datensatz erfolgreich eingefügt.");
            }

            connection.close();

        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void readData() {
        // Hier kannst du den Code für das Auslesen einfügen
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new Wareneingang();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}

