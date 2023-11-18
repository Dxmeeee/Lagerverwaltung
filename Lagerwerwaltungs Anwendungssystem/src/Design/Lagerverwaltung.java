package Design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lagerverwaltung extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lagerverwaltung window = new Lagerverwaltung();
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
	public Lagerverwaltung() {
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
		
		JButton btnNewButton_2_4 = new JButton("Zurück zur Homepage");
		btnNewButton_2_4.setBounds(478, 6, 183, 27);
		panel.add(btnNewButton_2_4);
		
		JLabel lblMindestmengeAnpassen = new JLabel("Mindestmenge anpassen:");
		lblMindestmengeAnpassen.setBounds(6, 10, 176, 32);
		panel.add(lblMindestmengeAnpassen);
		
		JLabel lblStandardmengeAnpassen = new JLabel("Standardmenge anpassen:");
		lblStandardmengeAnpassen.setBounds(6, 54, 176, 32);
		panel.add(lblStandardmengeAnpassen);
		
		JLabel lblHheDesRegals = new JLabel("Höhe des Regals:");
		lblHheDesRegals.setBounds(6, 98, 176, 32);
		panel.add(lblHheDesRegals);
		
		JLabel lblBreiteDesRegals = new JLabel("Breite des Regals:");
		lblBreiteDesRegals.setBounds(6, 142, 176, 32);
		panel.add(lblBreiteDesRegals);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(194, 6, 121, 36);
		panel.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(194, 54, 121, 36);
		panel.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(194, 98, 121, 36);
		panel.add(spinner_2);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(194, 142, 121, 36);
		panel.add(spinner_3);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Festplattenspeicher", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnNewButton_2_3 = new JButton("Zurück zur Homepage");
		btnNewButton_2_3.setBounds(478, 6, 183, 27);
		panel_1.add(btnNewButton_2_3);
		
		JLabel lblMindestmengeAnpassen_1 = new JLabel("Mindestmenge anpassen:");
		lblMindestmengeAnpassen_1.setBounds(6, 10, 176, 32);
		panel_1.add(lblMindestmengeAnpassen_1);
		
		JLabel lblStandardmengeAnpassen_1 = new JLabel("Standardmenge anpassen:");
		lblStandardmengeAnpassen_1.setBounds(6, 54, 176, 32);
		panel_1.add(lblStandardmengeAnpassen_1);
		
		JLabel lblHheDesRegals_1 = new JLabel("Höhe des Regals:");
		lblHheDesRegals_1.setBounds(6, 98, 176, 32);
		panel_1.add(lblHheDesRegals_1);
		
		JLabel lblBreiteDesRegals_1 = new JLabel("Breite des Regals:");
		lblBreiteDesRegals_1.setBounds(6, 142, 176, 32);
		panel_1.add(lblBreiteDesRegals_1);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(194, 6, 121, 36);
		panel_1.add(spinner_4);
		
		JSpinner spinner_1_1 = new JSpinner();
		spinner_1_1.setBounds(194, 54, 121, 36);
		panel_1.add(spinner_1_1);
		
		JSpinner spinner_2_1 = new JSpinner();
		spinner_2_1.setBounds(194, 98, 121, 36);
		panel_1.add(spinner_2_1);
		
		JSpinner spinner_3_1 = new JSpinner();
		spinner_3_1.setBounds(194, 142, 121, 36);
		panel_1.add(spinner_3_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Hauptspeicher", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton btnNewButton_2_2 = new JButton("Zurück zur Homepage");
		btnNewButton_2_2.setBounds(478, 6, 183, 27);
		panel_2.add(btnNewButton_2_2);
		
		JLabel lblMindestmengeAnpassen_2 = new JLabel("Mindestmenge anpassen:");
		lblMindestmengeAnpassen_2.setBounds(6, 10, 176, 32);
		panel_2.add(lblMindestmengeAnpassen_2);
		
		JLabel lblStandardmengeAnpassen_2 = new JLabel("Standardmenge anpassen:");
		lblStandardmengeAnpassen_2.setBounds(6, 54, 176, 32);
		panel_2.add(lblStandardmengeAnpassen_2);
		
		JLabel lblHheDesRegals_2 = new JLabel("Höhe des Regals:");
		lblHheDesRegals_2.setBounds(6, 98, 176, 32);
		panel_2.add(lblHheDesRegals_2);
		
		JLabel lblBreiteDesRegals_2 = new JLabel("Breite des Regals:");
		lblBreiteDesRegals_2.setBounds(6, 142, 176, 32);
		panel_2.add(lblBreiteDesRegals_2);
		
		JSpinner spinner_5 = new JSpinner();
		spinner_5.setBounds(194, 6, 121, 36);
		panel_2.add(spinner_5);
		
		JSpinner spinner_1_2 = new JSpinner();
		spinner_1_2.setBounds(194, 54, 121, 36);
		panel_2.add(spinner_1_2);
		
		JSpinner spinner_2_2 = new JSpinner();
		spinner_2_2.setBounds(194, 98, 121, 36);
		panel_2.add(spinner_2_2);
		
		JSpinner spinner_3_2 = new JSpinner();
		spinner_3_2.setBounds(194, 142, 121, 36);
		panel_2.add(spinner_3_2);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Prozessoren", null, panel_3, null);
		panel_3.setLayout(null);
		
		JButton btnNewButton_2_1 = new JButton("Zurück zur Homepage");
		btnNewButton_2_1.setBounds(478, 6, 183, 27);
		panel_3.add(btnNewButton_2_1);
		
		JLabel lblMindestmengeAnpassen_3 = new JLabel("Mindestmenge anpassen:");
		lblMindestmengeAnpassen_3.setBounds(6, 10, 176, 32);
		panel_3.add(lblMindestmengeAnpassen_3);
		
		JLabel lblStandardmengeAnpassen_3 = new JLabel("Standardmenge anpassen:");
		lblStandardmengeAnpassen_3.setBounds(6, 54, 176, 32);
		panel_3.add(lblStandardmengeAnpassen_3);
		
		JLabel lblHheDesRegals_3 = new JLabel("Höhe des Regals:");
		lblHheDesRegals_3.setBounds(6, 98, 176, 32);
		panel_3.add(lblHheDesRegals_3);
		
		JLabel lblBreiteDesRegals_3 = new JLabel("Breite des Regals:");
		lblBreiteDesRegals_3.setBounds(6, 142, 176, 32);
		panel_3.add(lblBreiteDesRegals_3);
		
		JSpinner spinner_6 = new JSpinner();
		spinner_6.setBounds(194, 6, 121, 36);
		panel_3.add(spinner_6);
		
		JSpinner spinner_1_3 = new JSpinner();
		spinner_1_3.setBounds(194, 54, 121, 36);
		panel_3.add(spinner_1_3);
		
		JSpinner spinner_2_3 = new JSpinner();
		spinner_2_3.setBounds(194, 98, 121, 36);
		panel_3.add(spinner_2_3);
		
		JSpinner spinner_3_3 = new JSpinner();
		spinner_3_3.setBounds(194, 142, 121, 36);
		panel_3.add(spinner_3_3);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Fertigrechner", null, panel_4, null);
		panel_4.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Zurück zur Homepage");
		btnNewButton_2.setBounds(478, 6, 183, 27);
		panel_4.add(btnNewButton_2);
		
		JLabel lblHheDesRegals_4 = new JLabel("Höhe des Regals:");
		lblHheDesRegals_4.setBounds(6, 6, 176, 32);
		panel_4.add(lblHheDesRegals_4);
		
		JLabel lblBreiteDesRegals_4 = new JLabel("Breite des Regals:");
		lblBreiteDesRegals_4.setBounds(6, 56, 176, 32);
		panel_4.add(lblBreiteDesRegals_4);
		
		JSpinner spinner_2_4 = new JSpinner();
		spinner_2_4.setBounds(194, 6, 121, 36);
		panel_4.add(spinner_2_4);
		
		JSpinner spinner_3_4 = new JSpinner();
		spinner_3_4.setBounds(194, 54, 121, 36);
		panel_4.add(spinner_3_4);
	}

}
