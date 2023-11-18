package Design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Inventur extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventur window = new Inventur();
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
	public Inventur() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 690, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Grafikkarten", null, panel, null);
		panel.setLayout(null);
		
		JTextPane txtpnProduktnr_1 = new JTextPane();
		txtpnProduktnr_1.setText("Produktnr.");
		txtpnProduktnr_1.setBounds(6, 6, 76, 16);
		panel.add(txtpnProduktnr_1);
		
		JTextPane txtpnHersteller_1 = new JTextPane();
		txtpnHersteller_1.setText("Hersteller");
		txtpnHersteller_1.setBounds(94, 6, 76, 16);
		panel.add(txtpnHersteller_1);
		
		JTextPane txtpnTypbezeichnung = new JTextPane();
		txtpnTypbezeichnung.setText("Typbezeichnung");
		txtpnTypbezeichnung.setBounds(182, 6, 136, 16);
		panel.add(txtpnTypbezeichnung);
		
		JTextPane txtpnLagerort = new JTextPane();
		txtpnLagerort.setText("Lagerort");
		txtpnLagerort.setBounds(330, 6, 124, 16);
		panel.add(txtpnLagerort);
		
		JTextPane txtpnMenge = new JTextPane();
		txtpnMenge.setText("Menge");
		txtpnMenge.setBounds(466, 6, 48, 16);
		panel.add(txtpnMenge);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Prozessoren", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTextPane txtpnProduktnr_1_1 = new JTextPane();
		txtpnProduktnr_1_1.setText("Produktnr.");
		txtpnProduktnr_1_1.setBounds(6, 6, 76, 16);
		panel_1.add(txtpnProduktnr_1_1);
		
		JTextPane txtpnHersteller_1_1 = new JTextPane();
		txtpnHersteller_1_1.setText("Hersteller");
		txtpnHersteller_1_1.setBounds(94, 6, 76, 16);
		panel_1.add(txtpnHersteller_1_1);
		
		JTextPane txtpnTaktfrequenz = new JTextPane();
		txtpnTaktfrequenz.setText("Taktfrequenz");
		txtpnTaktfrequenz.setBounds(182, 6, 136, 16);
		panel_1.add(txtpnTaktfrequenz);
		
		JTextPane txtpnLagerort_1 = new JTextPane();
		txtpnLagerort_1.setText("Lagerort");
		txtpnLagerort_1.setBounds(330, 6, 124, 16);
		panel_1.add(txtpnLagerort_1);
		
		JTextPane txtpnMenge_1 = new JTextPane();
		txtpnMenge_1.setText("Menge");
		txtpnMenge_1.setBounds(466, 6, 48, 16);
		panel_1.add(txtpnMenge_1);
		
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Hauptspeicher", null, panel_2, null);
		panel_2.setLayout(null);
		
		JTextPane txtpnProduktnr_1_2 = new JTextPane();
		txtpnProduktnr_1_2.setText("Produktnr.");
		txtpnProduktnr_1_2.setBounds(6, 6, 76, 16);
		panel_2.add(txtpnProduktnr_1_2);
		
		JTextPane txtpnGre = new JTextPane();
		txtpnGre.setText("Größe");
		txtpnGre.setBounds(94, 6, 76, 16);
		panel_2.add(txtpnGre);
		
		JTextPane txtpnLagerort_2 = new JTextPane();
		txtpnLagerort_2.setText("Lagerort");
		txtpnLagerort_2.setBounds(182, 6, 124, 16);
		panel_2.add(txtpnLagerort_2);
		
		JTextPane txtpnMenge_2 = new JTextPane();
		txtpnMenge_2.setText("Menge");
		txtpnMenge_2.setBounds(318, 6, 48, 16);
		panel_2.add(txtpnMenge_2);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Festplattenspeicher", null, panel_3, null);
		panel_3.setLayout(null);
		
		JTextPane txtpnProduktnr_1_3 = new JTextPane();
		txtpnProduktnr_1_3.setText("Produktnr.");
		txtpnProduktnr_1_3.setBounds(6, 6, 76, 16);
		panel_3.add(txtpnProduktnr_1_3);
		
		JTextPane txtpnHersteller_1_3 = new JTextPane();
		txtpnHersteller_1_3.setText("Hersteller");
		txtpnHersteller_1_3.setBounds(94, 6, 76, 16);
		panel_3.add(txtpnHersteller_1_3);
		
		JTextPane txtpnTypbezeichnung_3 = new JTextPane();
		txtpnTypbezeichnung_3.setText("Typbezeichnung");
		txtpnTypbezeichnung_3.setBounds(182, 6, 136, 16);
		panel_3.add(txtpnTypbezeichnung_3);
		
		JTextPane txtpnLagerort_3 = new JTextPane();
		txtpnLagerort_3.setText("Lagerort");
		txtpnLagerort_3.setBounds(330, 6, 124, 16);
		panel_3.add(txtpnLagerort_3);
		
		JTextPane txtpnMenge_3 = new JTextPane();
		txtpnMenge_3.setText("Menge");
		txtpnMenge_3.setBounds(466, 6, 48, 16);
		panel_3.add(txtpnMenge_3);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Fertigrechner", null, panel_4, null);
		panel_4.setLayout(null);
		
		JTextPane txtpnProduktnr = new JTextPane();
		txtpnProduktnr.setText("Auftragsnr.");
		txtpnProduktnr.setBounds(6, 6, 76, 16);
		panel_4.add(txtpnProduktnr);
		
		JTextPane txtpnBetriebssystem = new JTextPane();
		txtpnBetriebssystem.setText("Betriebssystem");
		txtpnBetriebssystem.setBounds(94, 6, 115, 16);
		panel_4.add(txtpnBetriebssystem);
		
		JTextPane txtpnLagerort_3_1 = new JTextPane();
		txtpnLagerort_3_1.setText("Lagerort");
		txtpnLagerort_3_1.setBounds(221, 6, 124, 16);
		panel_4.add(txtpnLagerort_3_1);
		
		JTextPane txtpnLagerort_3_2 = new JTextPane();
		txtpnLagerort_3_2.setText("Menge");
		txtpnLagerort_3_2.setBounds(357, 6, 48, 16);
		panel_4.add(txtpnLagerort_3_2);
		frame.getContentPane().setLayout(groupLayout);
	}
}
