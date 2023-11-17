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

public class WarenAusgang {

	private JFrame frame;
	
	private JTextField txtBitteWhlenSie;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WarenAusgang window = new WarenAusgang();
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
	public WarenAusgang() {
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
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Grafikkarten", null, panel, null);
		panel.setLayout(null);
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setBounds(27, 50, 189, 27);
        panel.add(comboBox);
        fillComboBoxFromDatabase(comboBox);
		
		
		comboBox.setBounds(27, 50, 189, 27);
		panel.add(comboBox);
		
		txtBitteWhlenSie = new JTextField();
		txtBitteWhlenSie.setEditable(false);
		txtBitteWhlenSie.setBackground(SystemColor.window);
		txtBitteWhlenSie.setForeground(Color.DARK_GRAY);
		txtBitteWhlenSie.setFont(new Font("Lucida Grande", Font.ITALIC, 9));
		txtBitteWhlenSie.setText("Bitte wählen Sie hier das Modell aus.");
		txtBitteWhlenSie.setBounds(27, 25, 189, 26);
		panel.add(txtBitteWhlenSie);
		txtBitteWhlenSie.setColumns(10);
		
		JButton btnNewButton = new JButton("Bestätigen");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(27, 243, 117, 29);
		panel.add(btnNewButton);
		
		JButton btnZurcksetzen = new JButton("Zurücksetzen");
		btnZurcksetzen.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        comboBox.setSelectedIndex(0); // Setze das Dropdown-Menü auf den ersten Eintrag zurück
			    }
			
			
		});
		btnZurcksetzen.setBounds(158, 243, 117, 29);
		panel.add(btnZurcksetzen);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(27, 130, 71, 26);
		panel.add(spinner);
		//hsdhshgd
		
	
		
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Prozessoren", null, panel_1, null);
		panel_1.setLayout(null);
		
		
		JComboBox comboBox_1 = new JComboBox<Object>(new Object[]{});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Modell", "Intel i7 11700k 4Ghz", "Intel i9 ", "Razen 5 "}));
	    
		comboBox_1.setBounds(27, 50, 189, 27);
		panel_1.add(comboBox_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setText("Bitte wählen Sie hier das Modell aus.");
		textField.setForeground(Color.DARK_GRAY);
		textField.setFont(new Font("Lucida Grande", Font.ITALIC, 9));
		textField.setColumns(10);
		textField.setBackground(SystemColor.window);
		textField.setBounds(27, 25, 189, 26);
		panel_1.add(textField);
		
		JButton btnNewButton_1 = new JButton("Bestätigen");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(27, 230, 117, 29);
		panel_1.add(btnNewButton_1);
		
		JButton btnZurcksetzen_1 = new JButton("Zurücksetzen");
		btnZurcksetzen_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			        comboBox_1.setSelectedIndex(0);
			    }
			
		});
		btnZurcksetzen_1.setBounds(158, 230, 117, 29);
		panel_1.add(btnZurcksetzen_1);
		
				
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Hauptspeicher", null, panel_2, null);
		panel_2.setLayout(null);
		
		JComboBox<Object> comboBox_1_1 = new JComboBox<Object>(new Object[]{});
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Modell", "8 GB RAM", "16 GB RAM ", "32 GB RAM"}));
		comboBox_1_1.setBounds(27, 39, 189, 27);
		panel_2.add(comboBox_1_1);
		
		textField_1 = new JTextField();
		textField_1.setText("Bitte wählen Sie hier das Modell aus.");
		textField_1.setForeground(Color.DARK_GRAY);
		textField_1.setFont(new Font("Lucida Grande", Font.ITALIC, 9));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(SystemColor.window);
		textField_1.setBounds(26, 17, 189, 26);
		panel_2.add(textField_1);
		
		JButton btnNewButton_1_1 = new JButton("Bestätigen");
		btnNewButton_1_1.setBounds(27, 256, 117, 29);
		panel_2.add(btnNewButton_1_1);
		
		JButton btnZurcksetzen_1_1 = new JButton("Zurücksetzen");
		btnZurcksetzen_1_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			        comboBox_1_1.setSelectedIndex(0);
			    }
			
		});
		btnZurcksetzen_1_1.setBounds(158, 256, 117, 29);
		panel_2.add(btnZurcksetzen_1_1);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Festplattenspeicher", null, panel_3, null);
		panel_3.setLayout(null);
		
		JComboBox<Object> comboBox_1_1_1 = new JComboBox<Object>(new Object[]{});
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"Modell", "500 GB ", "1 TB ", "2 TB"}));
		comboBox_1_1_1.setBounds(27, 41, 189, 27);
		panel_3.add(comboBox_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setText("Bitte wählen Sie hier das Modell aus.");
		textField_2.setForeground(Color.DARK_GRAY);
		textField_2.setFont(new Font("Lucida Grande", Font.ITALIC, 9));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(SystemColor.window);
		textField_2.setBounds(27, 17, 189, 26);
		panel_3.add(textField_2);
		
		JButton btnNewButton_1_1_1 = new JButton("Bestätigen");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1_1.setBounds(27, 260, 117, 29);
		panel_3.add(btnNewButton_1_1_1);
		
		JButton btnZurcksetzen_1_1_1 = new JButton("Zurücksetzen");
		btnZurcksetzen_1_1_1.addActionListener(new ActionListener() {
				 public void actionPerformed(ActionEvent e) {
				        comboBox_1_1_1.setSelectedIndex(0);
				    }
			
		});
		btnZurcksetzen_1_1_1.setBounds(158, 260, 117, 29);
		panel_3.add(btnZurcksetzen_1_1_1);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Fertigrechner", null, panel_4, null);
		panel_4.setLayout(null);
		
		JComboBox<Object> comboBox_1_1_1_1 = new JComboBox<Object>(new Object[]{});
		comboBox_1_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"Modell", "Rechner 1", "Rechner 2 ", "Rechner 3"}));
		comboBox_1_1_1_1.setBounds(27, 46, 189, 27);
		panel_4.add(comboBox_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setText("Bitte wählen Sie hier das Modell aus.");
		textField_3.setForeground(Color.DARK_GRAY);
		textField_3.setFont(new Font("Lucida Grande", Font.ITALIC, 9));
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(SystemColor.window);
		textField_3.setBounds(27, 19, 189, 26);
		panel_4.add(textField_3);
		
		JButton btnNewButton_1_1_1_1 = new JButton("Bestätigen");
		btnNewButton_1_1_1_1.setBounds(27, 264, 117, 29);
		panel_4.add(btnNewButton_1_1_1_1);
		
		JButton btnZurcksetzen_1_1_1_1 = new JButton("Zurücksetzen");
		btnZurcksetzen_1_1_1_1.addActionListener(new ActionListener() {
			
				public void actionPerformed(ActionEvent e) {
			        comboBox_1_1_1_1.setSelectedIndex(0);
			}
		});
		btnZurcksetzen_1_1_1_1.setBounds(158, 264, 117, 29);
		panel_4.add(btnZurcksetzen_1_1_1_1);
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

