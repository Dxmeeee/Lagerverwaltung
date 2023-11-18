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
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_5;
    private JTextField textField_9;
    private JTextField textField_10;
    private JTextField textField_12;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_11;
    private JTextField textField_13;

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
        textPaneExistingProduct.setText("bei bestehende Ware:");
        textPaneExistingProduct.setBounds(6, 6, 165, 37);
        panel.add(textPaneExistingProduct);

        JTextPane textPaneNewProduct = new JTextPane();
        textPaneNewProduct.setEditable(false);
        textPaneNewProduct.setBackground(SystemColor.window);
        textPaneNewProduct.setText("bei neuer Ware:");
        textPaneNewProduct.setBounds(351, 6, 106, 37);
        panel.add(textPaneNewProduct);

        textField_2 = new JTextField();
        textField_2.setBounds(492, 50, 130, 26);
        panel.add(textField_2);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(492, 88, 130, 26);
        panel.add(textField_3);

        JButton btnConfirm = new JButton("Bestätigen");
        btnConfirm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonConfirmed();
            }
        });
        btnConfirm.setBounds(354, 197, 117, 29);
        panel.add(btnConfirm);

        JButton btnReset = new JButton("Zurücksetzen");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resetFields();
            }
        });
        btnReset.setBounds(492, 197, 117, 29);
        panel.add(btnReset);
        
        JTextPane txtpnSpalte_1_1 = new JTextPane();
        txtpnSpalte_1_1.setEditable(false);
        txtpnSpalte_1_1.setText("Menge:");
        txtpnSpalte_1_1.setBackground(SystemColor.window);
        txtpnSpalte_1_1.setBounds(354, 126, 58, 16);
        panel.add(txtpnSpalte_1_1);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(6, 77, 257, 27);
        panel.add(comboBox);
        
        JLabel lblNewLabel = new JLabel("Bitte wählen sie das Modell aus:");
        lblNewLabel.setBounds(6, 55, 257, 16);
        panel.add(lblNewLabel);
        
        JLabel lblJetztDieEingetroffene = new JLabel("Jetzt die eingetroffene Menge:");
        lblJetztDieEingetroffene.setBounds(6, 116, 257, 16);
        panel.add(lblJetztDieEingetroffene);
        
        JSpinner spinner = new JSpinner();
        spinner.setBounds(6, 144, 136, 26);
        panel.add(spinner);
        
        JLabel lblNewLabel_1 = new JLabel("Hersteller:");
        lblNewLabel_1.setBounds(351, 55, 106, 16);
        panel.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Typbezeichnung:");
        lblNewLabel_2.setBounds(351, 93, 120, 16);
        panel.add(lblNewLabel_2);
        
        JButton btnConfirm_1 = new JButton("Bestätigen");
        btnConfirm_1.setBounds(6, 197, 117, 29);
        panel.add(btnConfirm_1);
        
        JButton btnReset_1 = new JButton("Zurücksetzen");
        btnReset_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnReset_1.setBounds(146, 197, 117, 29);
        panel.add(btnReset_1);
        
        JSpinner spinner_6 = new JSpinner();
        spinner_6.setBounds(492, 126, 130, 26);
        panel.add(spinner_6);
        
        textField_6 = new JTextField();
        textField_6.setBounds(6, 275, 655, 133);
        panel.add(textField_6);
        textField_6.setColumns(10);
        
        JButton btnNewButton_2 = new JButton("Zurück zur Homepage");
        btnNewButton_2.setBounds(478, 6, 183, 27);
        panel.add(btnNewButton_2);
        
        JPanel panel_1 = new JPanel();
        tabbedPane.addTab("Festplattenspeicher", null, panel_1, null);
        panel_1.setLayout(null);
        
        JTextPane textPaneExistingProduct_1 = new JTextPane();
        textPaneExistingProduct_1.setText("bei bestehende Ware:");
        textPaneExistingProduct_1.setEditable(false);
        textPaneExistingProduct_1.setBackground(SystemColor.window);
        textPaneExistingProduct_1.setBounds(6, 6, 165, 37);
        panel_1.add(textPaneExistingProduct_1);
        
        JTextPane textPaneNewProduct_1 = new JTextPane();
        textPaneNewProduct_1.setText("bei neuer Ware:");
        textPaneNewProduct_1.setEditable(false);
        textPaneNewProduct_1.setBackground(SystemColor.window);
        textPaneNewProduct_1.setBounds(351, 6, 106, 37);
        panel_1.add(textPaneNewProduct_1);
        
        textField = new JTextField();
        textField.setBounds(492, 50, 130, 26);
        panel_1.add(textField);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(492, 88, 130, 26);
        panel_1.add(textField_1);
        
        JButton btnConfirm_2 = new JButton("Bestätigen");
        btnConfirm_2.setBounds(354, 197, 117, 29);
        panel_1.add(btnConfirm_2);
        
        JButton btnReset_2 = new JButton("Zurücksetzen");
        btnReset_2.setBounds(492, 197, 117, 29);
        panel_1.add(btnReset_2);
        
        JTextPane txtpnSpalte_1_1_1 = new JTextPane();
        txtpnSpalte_1_1_1.setText("Menge:");
        txtpnSpalte_1_1_1.setEditable(false);
        txtpnSpalte_1_1_1.setBackground(SystemColor.window);
        txtpnSpalte_1_1_1.setBounds(354, 126, 58, 16);
        panel_1.add(txtpnSpalte_1_1_1);
        
        JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setBounds(6, 77, 257, 27);
        panel_1.add(comboBox_1);
        
        JLabel lblNewLabel_3 = new JLabel("Bitte wählen sie das Modell aus:");
        lblNewLabel_3.setBounds(6, 55, 257, 16);
        panel_1.add(lblNewLabel_3);
        
        JLabel lblJetztDieEingetroffene_1 = new JLabel("Jetzt die eingetroffene Menge:");
        lblJetztDieEingetroffene_1.setBounds(6, 116, 257, 16);
        panel_1.add(lblJetztDieEingetroffene_1);
        
        JSpinner spinner_1 = new JSpinner();
        spinner_1.setBounds(6, 144, 136, 26);
        panel_1.add(spinner_1);
        
        JLabel lblNewLabel_1_1 = new JLabel("Hersteller:");
        lblNewLabel_1_1.setBounds(351, 55, 106, 16);
        panel_1.add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_2_1 = new JLabel("Typbezeichnung:");
        lblNewLabel_2_1.setBounds(351, 93, 120, 16);
        panel_1.add(lblNewLabel_2_1);
        
        JButton btnConfirm_2_1 = new JButton("Bestätigen");
        btnConfirm_2_1.setBounds(0, 197, 117, 29);
        panel_1.add(btnConfirm_2_1);
        
        JButton btnReset_2_1 = new JButton("Zurücksetzen");
        btnReset_2_1.setBounds(129, 197, 117, 29);
        panel_1.add(btnReset_2_1);
        
        textField_7 = new JTextField();
        textField_7.setColumns(10);
        textField_7.setBounds(6, 275, 655, 133);
        panel_1.add(textField_7);
        
        JButton btnNewButton_2_1 = new JButton("Zurück zur Homepage");
        btnNewButton_2_1.setBounds(478, 6, 183, 27);
        panel_1.add(btnNewButton_2_1);
        
        JSpinner spinner_7 = new JSpinner();
        spinner_7.setBounds(492, 126, 130, 26);
        panel_1.add(spinner_7);
        
        JPanel panel_2 = new JPanel();
        tabbedPane.addTab("Hauptspeicher", null, panel_2, null);
        panel_2.setLayout(null);
        
        JTextPane textPaneExistingProduct_2 = new JTextPane();
        textPaneExistingProduct_2.setText("bei bestehende Ware:");
        textPaneExistingProduct_2.setEditable(false);
        textPaneExistingProduct_2.setBackground(SystemColor.window);
        textPaneExistingProduct_2.setBounds(6, 6, 165, 37);
        panel_2.add(textPaneExistingProduct_2);
        
        JTextPane textPaneNewProduct_2 = new JTextPane();
        textPaneNewProduct_2.setText("bei neuer Ware:");
        textPaneNewProduct_2.setEditable(false);
        textPaneNewProduct_2.setBackground(SystemColor.window);
        textPaneNewProduct_2.setBounds(351, 6, 106, 37);
        panel_2.add(textPaneNewProduct_2);
        
        textField_5 = new JTextField();
        textField_5.setBounds(492, 50, 130, 26);
        panel_2.add(textField_5);
        
        JButton btnConfirm_3 = new JButton("Bestätigen");
        btnConfirm_3.setBounds(354, 197, 117, 29);
        panel_2.add(btnConfirm_3);
        
        JButton btnReset_3 = new JButton("Zurücksetzen");
        btnReset_3.setBounds(492, 197, 117, 29);
        panel_2.add(btnReset_3);
        
        JComboBox comboBox_2 = new JComboBox();
        comboBox_2.setBounds(6, 77, 257, 27);
        panel_2.add(comboBox_2);
        
        JLabel lblBitteWhlenSie = new JLabel("Bitte wählen Sie die Größe aus:");
        lblBitteWhlenSie.setBounds(6, 55, 257, 16);
        panel_2.add(lblBitteWhlenSie);
        
        JLabel lblJetztDieEingetroffene_2 = new JLabel("Jetzt die eingetroffene Menge:");
        lblJetztDieEingetroffene_2.setBounds(6, 116, 257, 16);
        panel_2.add(lblJetztDieEingetroffene_2);
        
        JSpinner spinner_2 = new JSpinner();
        spinner_2.setBounds(6, 144, 136, 26);
        panel_2.add(spinner_2);
        
        JLabel lblNewLabel_1_2 = new JLabel("Größe:");
        lblNewLabel_1_2.setBounds(351, 55, 106, 16);
        panel_2.add(lblNewLabel_1_2);
        
        JLabel lblNewLabel_2_2 = new JLabel("Menge:");
        lblNewLabel_2_2.setBounds(351, 93, 120, 16);
        panel_2.add(lblNewLabel_2_2);
        
        JSpinner spinner_5 = new JSpinner();
        spinner_5.setBounds(492, 88, 130, 26);
        panel_2.add(spinner_5);
        
        JButton btnConfirm_3_1 = new JButton("Bestätigen");
        btnConfirm_3_1.setBounds(6, 197, 117, 29);
        panel_2.add(btnConfirm_3_1);
        
        JButton btnReset_3_1 = new JButton("Zurücksetzen");
        btnReset_3_1.setBounds(135, 197, 117, 29);
        panel_2.add(btnReset_3_1);
        
        textField_8 = new JTextField();
        textField_8.setColumns(10);
        textField_8.setBounds(6, 275, 655, 133);
        panel_2.add(textField_8);
        
        JButton btnNewButton_2_2 = new JButton("Zurück zur Homepage");
        btnNewButton_2_2.setBounds(478, 6, 183, 27);
        panel_2.add(btnNewButton_2_2);
        
        JPanel panel_3 = new JPanel();
        tabbedPane.addTab("Prozessoren", null, panel_3, null);
        panel_3.setLayout(null);
        
        JTextPane textPaneExistingProduct_3 = new JTextPane();
        textPaneExistingProduct_3.setText("bei bestehende Ware:");
        textPaneExistingProduct_3.setEditable(false);
        textPaneExistingProduct_3.setBackground(SystemColor.window);
        textPaneExistingProduct_3.setBounds(6, 6, 165, 37);
        panel_3.add(textPaneExistingProduct_3);
        
        JTextPane textPaneNewProduct_3 = new JTextPane();
        textPaneNewProduct_3.setText("bei neuer Ware:");
        textPaneNewProduct_3.setEditable(false);
        textPaneNewProduct_3.setBackground(SystemColor.window);
        textPaneNewProduct_3.setBounds(351, 6, 106, 37);
        panel_3.add(textPaneNewProduct_3);
        
        textField_9 = new JTextField();
        textField_9.setBounds(492, 50, 130, 26);
        panel_3.add(textField_9);
        
        textField_10 = new JTextField();
        textField_10.setColumns(10);
        textField_10.setBounds(492, 88, 130, 26);
        panel_3.add(textField_10);
        
        JButton btnConfirm_4 = new JButton("Bestätigen");
        btnConfirm_4.setBounds(354, 197, 117, 29);
        panel_3.add(btnConfirm_4);
        
        JButton btnReset_4 = new JButton("Zurücksetzen");
        btnReset_4.setBounds(492, 197, 117, 29);
        panel_3.add(btnReset_4);
        
        JTextPane txtpnSpalte_1_1_3 = new JTextPane();
        txtpnSpalte_1_1_3.setText("Menge:");
        txtpnSpalte_1_1_3.setEditable(false);
        txtpnSpalte_1_1_3.setBackground(SystemColor.window);
        txtpnSpalte_1_1_3.setBounds(354, 126, 89, 16);
        panel_3.add(txtpnSpalte_1_1_3);
        
        JComboBox comboBox_3 = new JComboBox();
        comboBox_3.setBounds(6, 77, 257, 27);
        panel_3.add(comboBox_3);
        
        JLabel lblNewLabel_5 = new JLabel("Bitte wählen Sie das Modell aus:");
        lblNewLabel_5.setBounds(6, 55, 257, 16);
        panel_3.add(lblNewLabel_5);
        
        JLabel lblJetztDieEingetroffene_3 = new JLabel("Jetzt die eingetroffene Menge:");
        lblJetztDieEingetroffene_3.setBounds(6, 116, 257, 16);
        panel_3.add(lblJetztDieEingetroffene_3);
        
        JSpinner spinner_3 = new JSpinner();
        spinner_3.setBounds(6, 144, 136, 26);
        panel_3.add(spinner_3);
        
        JLabel lblNewLabel_1_3 = new JLabel("Hersteller:");
        lblNewLabel_1_3.setBounds(351, 55, 106, 16);
        panel_3.add(lblNewLabel_1_3);
        
        JLabel lblNewLabel_2_3 = new JLabel("Taktfrequenz:");
        lblNewLabel_2_3.setBounds(351, 93, 120, 16);
        panel_3.add(lblNewLabel_2_3);
        
        JSpinner spinner_4 = new JSpinner();
        spinner_4.setBounds(492, 126, 130, 26);
        panel_3.add(spinner_4);
        
        JButton btnConfirm_4_1 = new JButton("Bestätigen");
        btnConfirm_4_1.setBounds(6, 197, 117, 29);
        panel_3.add(btnConfirm_4_1);
        
        JButton btnReset_4_1 = new JButton("Zurücksetzen");
        btnReset_4_1.setBounds(135, 197, 117, 29);
        panel_3.add(btnReset_4_1);
        
        textField_11 = new JTextField();
        textField_11.setColumns(10);
        textField_11.setBounds(6, 275, 655, 133);
        panel_3.add(textField_11);
        
        JButton btnNewButton_2_3 = new JButton("Zurück zur Homepage");
        btnNewButton_2_3.setBounds(478, 6, 183, 27);
        panel_3.add(btnNewButton_2_3);
        
        JPanel panel_4 = new JPanel();
        tabbedPane.addTab("Fertigrechner", null, panel_4, null);
        panel_4.setLayout(null);
        
        JTextPane txtpnFertigrechnerEinlagern = new JTextPane();
        txtpnFertigrechnerEinlagern.setText("Fertigrechner einlagern:");
        txtpnFertigrechnerEinlagern.setEditable(false);
        txtpnFertigrechnerEinlagern.setBackground(SystemColor.window);
        txtpnFertigrechnerEinlagern.setBounds(6, 6, 165, 37);
        panel_4.add(txtpnFertigrechnerEinlagern);
        
        textField_12 = new JTextField();
        textField_12.setBounds(124, 50, 130, 26);
        panel_4.add(textField_12);
        
        JButton btnConfirm_5 = new JButton("Bestätigen");
        btnConfirm_5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnConfirm_5.setBounds(6, 197, 117, 29);
        panel_4.add(btnConfirm_5);
        
        JButton btnReset_5 = new JButton("Zurücksetzen");
        btnReset_5.setBounds(135, 197, 117, 29);
        panel_4.add(btnReset_5);
        
        JLabel lblNewLabel_1_4 = new JLabel("Auftragsnr:");
        lblNewLabel_1_4.setBounds(6, 55, 106, 16);
        panel_4.add(lblNewLabel_1_4);
        
        JLabel lblNewLabel_2_4 = new JLabel("Betriebssystem:");
        lblNewLabel_2_4.setBounds(6, 93, 120, 16);
        panel_4.add(lblNewLabel_2_4);
        
        JComboBox comboBox_4 = new JComboBox();
        comboBox_4.setBounds(124, 88, 130, 27);
        panel_4.add(comboBox_4);
        
        textField_13 = new JTextField();
        textField_13.setColumns(10);
        textField_13.setBounds(6, 275, 655, 133);
        panel_4.add(textField_13);
        
        JButton btnNewButton_2_4 = new JButton("Zurück zur Homepage");
        btnNewButton_2_4.setBounds(478, 6, 183, 27);
        panel_4.add(btnNewButton_2_4);

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

