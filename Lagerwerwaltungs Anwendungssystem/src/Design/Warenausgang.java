package Design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.EventQueue;
import javax.swing.*;
import java.sql.*;

import javax.swing.DefaultComboBoxModel;

public class Warenausgang extends JFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField txtBitteWhlenSie;
	private JTextField textField_7;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtBitteWhlenSie_1;
	private JTextField textField_3;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Warenausgang window = new Warenausgang();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Warenausgang() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(6, 6, 688, 460);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Grafikkarten", null, panel_5, null);
		panel_5.setLayout(null);
		
		JComboBox<String> comboBox_1_4 = new JComboBox<String>();
		comboBox_1_4.setBounds(6, 31, 189, 27);
		panel_5.add(comboBox_1_4);
		
		textField_3 = new JTextField();
		textField_3.setText("Bitte wählen Sie hier das Modell aus.");
		textField_3.setForeground(Color.DARK_GRAY);
		textField_3.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(SystemColor.window);
		textField_3.setBounds(6, 6, 299, 26);
		panel_5.add(textField_3);
		
		
		
		JButton btnNewButton_1_4 = new JButton("Bestätigen");
		btnNewButton_1_4.setBounds(6, 146, 117, 29);
		panel_5.add(btnNewButton_1_4);
		
		JButton btnZurcksetzen_1_4 = new JButton("Zurücksetzen");
		btnZurcksetzen_1_4.setBounds(135, 146, 117, 29);
		panel_5.add(btnZurcksetzen_1_4);
		
		JSpinner spinner_1_3 = new JSpinner();
		spinner_1_3.setBounds(6, 108, 105, 26);
		panel_5.add(spinner_1_3);
		
		textField_8 = new JTextField();
		textField_8.setText("Bitte geben Sie die gewünschte Menge an:");
		textField_8.setForeground(Color.DARK_GRAY);
		textField_8.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBackground(SystemColor.window);
		textField_8.setBounds(6, 70, 299, 26);
		panel_5.add(textField_8);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(6, 204, 655, 204);
		panel_5.add(textField_13);
		
		JButton btnNewButton_2 = new JButton("Zurück zur Homepage");
		btnNewButton_2.setBounds(478, 5, 183, 27);
		panel_5.add(btnNewButton_2);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Festplattenspeicher", null, panel_3, null);
		panel_3.setLayout(null);
		
		JComboBox<String> comboBox_1_2 = new JComboBox<String>();
		comboBox_1_2.setBounds(6, 31, 189, 27);
		panel_3.add(comboBox_1_2);
		
		textField_1 = new JTextField();
		textField_1.setText("Bitte wählen Sie hier das Modell aus.");
		textField_1.setForeground(Color.DARK_GRAY);
		textField_1.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(SystemColor.window);
		textField_1.setBounds(6, 6, 299, 26);
		panel_3.add(textField_1);
		
		JButton btnNewButton_1_2 = new JButton("Bestätigen");
		btnNewButton_1_2.setBounds(6, 146, 117, 29);
		panel_3.add(btnNewButton_1_2);
		
		JButton btnZurcksetzen_1_2 = new JButton("Zurücksetzen");
		btnZurcksetzen_1_2.setBounds(135, 146, 117, 29);
		panel_3.add(btnZurcksetzen_1_2);
		
		JSpinner spinner_1_2 = new JSpinner();
		spinner_1_2.setBounds(6, 108, 105, 26);
		panel_3.add(spinner_1_2);
		
		textField_2 = new JTextField();
		textField_2.setText("Bitte geben Sie die gewünschte Menge an:");
		textField_2.setForeground(Color.DARK_GRAY);
		textField_2.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(SystemColor.window);
		textField_2.setBounds(6, 70, 299, 26);
		panel_3.add(textField_2);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(6, 204, 655, 204);
		panel_3.add(textField_12);
		
		JButton btnNewButton_2_1 = new JButton("Zurück zur Homepage");
		btnNewButton_2_1.setBounds(478, 5, 183, 27);
		panel_3.add(btnNewButton_2_1);
		
				
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Hauptspeicher", null, panel_2, null);
		panel_2.setLayout(null);
		
		JComboBox<String> comboBox_1_1 = new JComboBox<String>();
		comboBox_1_1.setBounds(6, 31, 189, 27);
		panel_2.add(comboBox_1_1);
		
		txtBitteWhlenSie = new JTextField();
		txtBitteWhlenSie.setText("Bitte wählen Sie die Größe aus:");
		txtBitteWhlenSie.setForeground(Color.DARK_GRAY);
		txtBitteWhlenSie.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		txtBitteWhlenSie.setEditable(false);
		txtBitteWhlenSie.setColumns(10);
		txtBitteWhlenSie.setBackground(SystemColor.window);
		txtBitteWhlenSie.setBounds(6, 6, 299, 26);
		panel_2.add(txtBitteWhlenSie);
		
		JButton btnNewButton_1_1 = new JButton("Bestätigen");
		btnNewButton_1_1.setBounds(6, 146, 117, 29);
		panel_2.add(btnNewButton_1_1);
		
		JButton btnZurcksetzen_1_1 = new JButton("Zurücksetzen");
		btnZurcksetzen_1_1.setBounds(135, 146, 117, 29);
		panel_2.add(btnZurcksetzen_1_1);
		
		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setBounds(6, 108, 105, 26);
		panel_2.add(spinner_1_1);
		
		textField_7 = new JTextField();
		textField_7.setText("Bitte geben Sie die gewünschte Menge an:");
		textField_7.setForeground(Color.DARK_GRAY);
		textField_7.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBackground(SystemColor.window);
		textField_7.setBounds(6, 70, 299, 26);
		panel_2.add(textField_7);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(6, 204, 655, 204);
		panel_2.add(textField_11);
		
		JButton btnNewButton_2_2 = new JButton("Zurück zur Homepage");
		btnNewButton_2_2.setBounds(478, 5, 183, 27);
		panel_2.add(btnNewButton_2_2);
	
		
	
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Prozessoren", null, panel_1, null);
		panel_1.setLayout(null);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(6, 31, 189, 27);
		panel_1.add(comboBox_1);
		
		textField = new JTextField();
		textField.setText("Bitte wählen Sie hier das Modell aus.");
		textField.setForeground(Color.DARK_GRAY);
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(SystemColor.window);
		textField.setBounds(6, 6, 299, 26);
		panel_1.add(textField);
		
		JButton btnNewButton_1 = new JButton("Bestätigen");
		btnNewButton_1.setBounds(6, 146, 117, 29);
		panel_1.add(btnNewButton_1);
		
		JButton btnZurcksetzen_1 = new JButton("Zurücksetzen");
		btnZurcksetzen_1.setBounds(135, 146, 117, 29);
		panel_1.add(btnZurcksetzen_1);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(6, 108, 105, 26);
		panel_1.add(spinner_1);
		
		textField_4 = new JTextField();
		textField_4.setText("Bitte geben Sie die gewünschte Menge an:");
		textField_4.setForeground(Color.DARK_GRAY);
		textField_4.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(SystemColor.window);
		textField_4.setBounds(6, 70, 299, 26);
		panel_1.add(textField_4);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 667, 414);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(6, 31, 189, 27);
		panel.add(comboBox);
		
		textField_5 = new JTextField();
		textField_5.setText("Bitte wählen Sie hier das Modell aus.");
		textField_5.setForeground(Color.DARK_GRAY);
		textField_5.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(SystemColor.window);
		textField_5.setBounds(6, 6, 299, 26);
		panel.add(textField_5);
		
		JButton btnNewButton = new JButton("Bestätigen");
		btnNewButton.setBounds(6, 146, 117, 29);
		panel.add(btnNewButton);
		
		JButton btnZurcksetzen = new JButton("Zurücksetzen");
		btnZurcksetzen.setBounds(135, 146, 117, 29);
		panel.add(btnZurcksetzen);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(6, 108, 105, 26);
		panel.add(spinner);
		
		textField_6 = new JTextField();
		textField_6.setText("Bitte geben Sie die gewünschte Menge an:");
		textField_6.setForeground(Color.DARK_GRAY);
		textField_6.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBackground(SystemColor.window);
		textField_6.setBounds(6, 70, 299, 26);
		panel.add(textField_6);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(6, 204, 655, 204);
		panel.add(textField_10);
		
		JButton btnNewButton_2_3 = new JButton("Zurück zur Homepage");
		btnNewButton_2_3.setBounds(478, 5, 183, 27);
		panel.add(btnNewButton_2_3);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Fertigrechner", null, panel_4, null);
		panel_4.setLayout(null);
		
		JComboBox<String> comboBox_1_3 = new JComboBox<String>();
		comboBox_1_3.setBounds(6, 31, 189, 27);
		panel_4.add(comboBox_1_3);
		
		txtBitteWhlenSie_1 = new JTextField();
		txtBitteWhlenSie_1.setText("Bitte wählen Sie die richtige auftragsnr. aus:");
		txtBitteWhlenSie_1.setForeground(Color.DARK_GRAY);
		txtBitteWhlenSie_1.setFont(new Font("Lucida Grande", Font.PLAIN, 12));
		txtBitteWhlenSie_1.setEditable(false);
		txtBitteWhlenSie_1.setColumns(10);
		txtBitteWhlenSie_1.setBackground(SystemColor.window);
		txtBitteWhlenSie_1.setBounds(6, 6, 299, 26);
		panel_4.add(txtBitteWhlenSie_1);
		
		JButton btnNewButton_1_3 = new JButton("Bestätigen");
		btnNewButton_1_3.setBounds(6, 146, 117, 29);
		panel_4.add(btnNewButton_1_3);
		
		JButton btnZurcksetzen_1_3 = new JButton("Zurücksetzen");
		btnZurcksetzen_1_3.setBounds(135, 146, 117, 29);
		panel_4.add(btnZurcksetzen_1_3);
		
		textField_9 = new JTextField();
		textField_9.setBounds(6, 204, 655, 204);
		panel_4.add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnNewButton_2_4 = new JButton("Zurück zur Homepage");
		btnNewButton_2_4.setBounds(478, 5, 183, 27);
		panel_4.add(btnNewButton_2_4);
	}
	
	 private void fillComboBoxFromDatabase(JComboBox<String> comboBox) {
	        try {
	            String url = "jdbc:mysql://3.69.96.96:80/db1";
	            String user = "db1";
	            String password = "!db1.wip23?WS6";

	            Connection connection = DriverManager.getConnection(url, user, password);

	            String getProductsSql = "SELECT hersteller, typbezeichnung FROM grafikkarte";
	            try (PreparedStatement getProductsStatement = connection.prepareStatement(getProductsSql)) {
	                ResultSet resultSet = getProductsStatement.executeQuery();

	                while (resultSet.next()) {
	                    String hersteller = resultSet.getString("hersteller");
	                    String typbezeichnung = resultSet.getString("typbezeichnung");

	                    comboBox.addItem(hersteller + " " + typbezeichnung);
	                }
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
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
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	



	
	}

