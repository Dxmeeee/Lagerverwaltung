package Design;

import javax.swing.*;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class WarenEingang extends JFrame {
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextPane txtpnProduktnr_1;
    private JTextPane txtpnRegal;
    private JTextPane txtpnSpalte;
    private JTextPane txtpnZeile;
    private JTextPane txtpnProduktnr_5;
    private JTextPane txtpnMenge;
    private JPanel panel_1;
    private JPanel panel_2;
    private JPanel panel_3;
    private JPanel panel_4;

    public WarenEingang() {
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

        JTextPane txtpnBestehendeWare_4 = new JTextPane();
        txtpnBestehendeWare_4.setBackground(SystemColor.window);
        txtpnBestehendeWare_4.setText("bestehende Ware:");
        txtpnBestehendeWare_4.setBounds(6, 6, 136, 16);
        panel.add(txtpnBestehendeWare_4);

        JTextPane txtpnNeueWare_4 = new JTextPane();
        txtpnNeueWare_4.setBackground(SystemColor.window);
        txtpnNeueWare_4.setText("neue Ware:");
        txtpnNeueWare_4.setBounds(335, 6, 136, 16);
        panel.add(txtpnNeueWare_4);

        textField_1 = new JTextField();
        textField_1.setBounds(492, 50, 130, 26);
        panel.add(textField_1);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(492, 88, 130, 26);
        panel.add(textField_2);

        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(492, 126, 130, 26);
        panel.add(textField_3);

        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(492, 164, 130, 26);
        panel.add(textField_4);

        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(492, 202, 130, 26);
        panel.add(textField_5);

        textField_6 = new JTextField();
        textField_6.setColumns(10);
        textField_6.setBounds(492, 240, 130, 26);
        panel.add(textField_6);

        textField_7 = new JTextField();
        textField_7.setColumns(10);
        textField_7.setBounds(492, 278, 130, 26);
        panel.add(textField_7);

        JTextPane txtpnProduktnr = new JTextPane();
        txtpnProduktnr.setBackground(SystemColor.window);
        txtpnProduktnr.setText("Produktnummer:");
        txtpnProduktnr.setBounds(335, 50, 118, 16);
        panel.add(txtpnProduktnr);

       

        JButton btnNewButton_1 = new JButton("Bestätigen");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonBestätigt();
            }
        });
        btnNewButton_1.setBounds(354, 316, 117, 29);
        panel.add(btnNewButton_1);

        JButton btnNewButton = new JButton("Zurücksetzen");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                zurücksetzen();
            }
        });
        btnNewButton.setBounds(505, 316, 117, 29);
        panel.add(btnNewButton);
        
        txtpnProduktnr_1 = new JTextPane();
        txtpnProduktnr_1.setText("Hersteller:");
        txtpnProduktnr_1.setBackground(SystemColor.window);
        txtpnProduktnr_1.setBounds(335, 88, 118, 16);
        panel.add(txtpnProduktnr_1);
        
        txtpnRegal = new JTextPane();
        txtpnRegal.setText("Regal:");
        txtpnRegal.setBackground(SystemColor.window);
        txtpnRegal.setBounds(335, 164, 118, 16);
        panel.add(txtpnRegal);
        
        txtpnSpalte = new JTextPane();
        txtpnSpalte.setText("Spalte:");
        txtpnSpalte.setBackground(SystemColor.window);
        txtpnSpalte.setBounds(335, 202, 118, 16);
        panel.add(txtpnSpalte);
        
        txtpnZeile = new JTextPane();
        txtpnZeile.setText("Zeile:");
        txtpnZeile.setBackground(SystemColor.window);
        txtpnZeile.setBounds(335, 240, 118, 16);
        panel.add(txtpnZeile);
        
        txtpnProduktnr_5 = new JTextPane();
        txtpnProduktnr_5.setText("Typbezeichnung:");
        txtpnProduktnr_5.setBackground(SystemColor.window);
        txtpnProduktnr_5.setBounds(335, 126, 118, 16);
        panel.add(txtpnProduktnr_5);
        
        txtpnMenge = new JTextPane();
        txtpnMenge.setText("Menge:");
        txtpnMenge.setBackground(SystemColor.window);
        txtpnMenge.setBounds(335, 278, 118, 16);
        panel.add(txtpnMenge);
        
        panel_1 = new JPanel();
        tabbedPane.addTab("Prozessoren", null, panel_1, null);
        
        panel_2 = new JPanel();
        tabbedPane.addTab("New tab", null, panel_2, null);
        
        panel_3 = new JPanel();
        tabbedPane.addTab("New tab", null, panel_3, null);
        
        panel_4 = new JPanel();
        tabbedPane.addTab("New tab", null, panel_4, null);

        // Make the frame visible
        setVisible(true);
    }

    private void buttonBestätigt() {
        addToDatabase();
        auslesen();
    }

    private void zurücksetzen() {
        textField_1.setText("");
        textField_2.setText("");
        textField_3.setText("");
        textField_4.setText("");
        textField_5.setText("");
        textField_6.setText("");
        textField_7.setText("");
    }

    private void addToDatabase() {
        try {
            String url = "jdbc:mysql://3.69.96.96:80/db1";
            String user = "db1";
            String password = "!db1.wip23?WS6";

            Connection conn = DriverManager.getConnection(url, user, password);

            String sql = "INSERT INTO grafikkarte (produktnr, hersteller, typbezeichnung, flur, regal, spalte, menge) VALUES (?, ?, ?, ?, ?, ?, ?)";

            try (PreparedStatement statement = conn.prepareStatement(sql)) {
                statement.setInt(1, Integer.parseInt(textField_1.getText()));
                statement.setString(2, textField_2.getText());
                statement.setString(3, textField_3.getText());
                statement.setInt(4, Integer.parseInt(textField_4.getText()));
                statement.setInt(5, Integer.parseInt(textField_5.getText()));
                statement.setInt(6, Integer.parseInt(textField_6.getText()));
                statement.setInt(7, Integer.parseInt(textField_7.getText()));

                int rowsAffected = statement.executeUpdate();
                System.out.println(rowsAffected + " Datensatz erfolgreich eingefügt.");
            }

            conn.close();

        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void auslesen() {
        try {
            String url = "jdbc:mysql://3.69.96.96:80/db1";
            String user = "db1";
            String password = "!db1.wip23?WS6";

            Connection conn = DriverManager.getConnection(url, user, password);

            // Hier kannst du den Code aus deinem Auslesen-Beispiel verwenden

            conn.close();

        } catch (SQLException e) {
            System.err.println("SQLException: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new WarenEingang();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}

