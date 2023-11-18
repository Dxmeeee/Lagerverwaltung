package Design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class Mitarbeiterverwaltung extends JFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mitarbeiterverwaltung window = new Mitarbeiterverwaltung();
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
	public Mitarbeiterverwaltung() {
		initialize();
	}
	public void setVisible(boolean visible) {
	        super.setVisible(visible);
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
		tabbedPane.addTab("Mitarbeiter hinzufügen", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Vorname");
		lblNewLabel.setBounds(6, 50, 109, 32);
		panel.add(lblNewLabel);
		
		JLabel lblNachname = new JLabel("Nachname:");
		lblNachname.setBounds(6, 94, 109, 32);
		panel.add(lblNachname);
		
		textField = new JTextField();
		textField.setBounds(127, 94, 151, 32);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(127, 50, 151, 32);
		panel.add(textField_1);
		
		JLabel lblGeschlecht = new JLabel("Geschlecht:");
		lblGeschlecht.setBounds(6, 6, 109, 32);
		panel.add(lblGeschlecht);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(127, 6, 151, 32);
		panel.add(comboBox);
		
		JLabel lblAdminrechte = new JLabel("Adminrechte:");
		lblAdminrechte.setBounds(6, 137, 109, 32);
		panel.add(lblAdminrechte);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(127, 138, 151, 32);
		panel.add(comboBox_1);
		
		JButton btnConfirm_1 = new JButton("Bestätigen");
		btnConfirm_1.setBounds(6, 181, 117, 29);
		panel.add(btnConfirm_1);
		
		JButton btnReset_1 = new JButton("Zurücksetzen");
		btnReset_1.setBounds(127, 181, 117, 29);
		panel.add(btnReset_1);
		
		JButton btnNewButton_2_1 = new JButton("Zurück zur Homepage");
		btnNewButton_2_1.setBounds(478, 6, 183, 27);
		panel.add(btnNewButton_2_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(6, 257, 655, 151);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Mitarbeiter löschen", null, panel_1, null);
		panel_1.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(6, 50, 180, 32);
		panel_1.add(textField_2);
		
		JLabel lblBitteGebenSie = new JLabel("Bitte geben Sie die UserId des Mitarbeiters ein:");
		lblBitteGebenSie.setBounds(6, 6, 303, 32);
		panel_1.add(lblBitteGebenSie);
		
		JButton btnConfirm_1_1 = new JButton("Bestätigen");
		btnConfirm_1_1.setBounds(6, 94, 117, 29);
		panel_1.add(btnConfirm_1_1);
		
		JButton btnReset_1_1 = new JButton("Zurücksetzen");
		btnReset_1_1.setBounds(135, 94, 117, 29);
		panel_1.add(btnReset_1_1);
		
		JButton btnNewButton_2 = new JButton("Zurück zur Homepage");
		btnNewButton_2.setBounds(478, 6, 183, 27);
		panel_1.add(btnNewButton_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(6, 257, 655, 151);
		panel_1.add(textField_4);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Mitarbeiterliste", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton btnNewButton_2_2 = new JButton("Zurück zur Homepage");
		btnNewButton_2_2.setBounds(478, 6, 183, 27);
		panel_2.add(btnNewButton_2_2);
		
		JLabel lblGeschlecht_1 = new JLabel("UserId:");
		lblGeschlecht_1.setBounds(6, 10, 109, 32);
		panel_2.add(lblGeschlecht_1);
		
		JLabel lblNachname_1 = new JLabel("Geschlecht:");
		lblNachname_1.setBounds(127, 10, 109, 32);
		panel_2.add(lblNachname_1);
		
		JLabel lblVorname = new JLabel("Nachname:");
		lblVorname.setBounds(248, 10, 109, 32);
		panel_2.add(lblVorname);
		
		JLabel lblUserid = new JLabel("Vorname:");
		lblUserid.setBounds(369, 10, 109, 32);
		panel_2.add(lblUserid);
	}
}
