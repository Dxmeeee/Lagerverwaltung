package Datenbank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Einfügen extends JFrame {

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;

    public Einfügen() {
        initialize();
    }

    private void initialize() {
        setTitle("Datenbankding");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        textField1 = new JTextField();
        getContentPane().add(textField1);
        textField1.setColumns(10);

        textField2 = new JTextField();
        getContentPane().add(textField2);
        textField2.setColumns(10);

        textField3 = new JTextField();
        getContentPane().add(textField3);
        textField3.setColumns(10);

        textField4 = new JTextField();
        getContentPane().add(textField4);
        textField4.setColumns(10);

        textField5 = new JTextField();
        getContentPane().add(textField5);
        textField5.setColumns(10);

        textField6 = new JTextField();
        getContentPane().add(textField6);
        textField6.setColumns(10);

        textField7 = new JTextField();
        getContentPane().add(textField7);
        textField7.setColumns(10);

        JButton insertButton = new JButton("Einfügen");
        insertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                buttonPressed();
            }
        });
        getContentPane().add(insertButton);
    }

    private void buttonPressed() {
        if (!textField6.getText().isEmpty()) {
            System.out.println("MySQL Connect Example");

            try (Connection conn = DriverManager.getConnection("jdbc:mysql://3.69.96.96:80/db1", "db1", "!db1.wip23?WS6")) {
                conn.setAutoCommit(false); // Set auto-commit to false

                System.out.println("Connected to database");

                String sql = "INSERT INTO festplatte (produktnr, hersteller, typbezeichnung, flur, regal, spalte, menge) VALUES (?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement statement = conn.prepareStatement(sql)) {
                    statement.setInt(1, Integer.parseInt(textField1.getText()));
                    statement.setString(2, textField2.getText());
                    statement.setString(3, textField3.getText());
                    statement.setInt(4, Integer.parseInt(textField4.getText()));
                    statement.setInt(5, Integer.parseInt(textField5.getText()));
                    statement.setInt(6, Integer.parseInt(textField6.getText()));
                    statement.setInt(7, Integer.parseInt(textField7.getText()));

                    System.out.println("Executing SQL statement: " + statement.toString());

                    int rowsAffected = statement.executeUpdate();
                    System.out.println(rowsAffected + " Datensatz erfolgreich eingefügt.");
                }

                conn.commit(); // Explicitly commit changes
                System.out.println("Changes committed");

            } catch (SQLException e) {
                System.err.println("SQLException: " + e.getMessage());
                e.printStackTrace();
            } catch (Exception e) {
                System.err.println("Exception: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                Einfügen window = new Einfügen();
                window.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}