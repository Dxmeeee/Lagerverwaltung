package Design;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;

public class Homepage {

	private JFrame frame;
	private JTextField txtSuche;
	private JTextField txtSmartLog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage window = new Homepage();
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
	public Homepage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panelMitte = new JPanel();
		frame.getContentPane().add(panelMitte, BorderLayout.CENTER);
		
		txtSmartLog = new JTextField();
		txtSmartLog.setBackground(SystemColor.window);
		txtSmartLog.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		txtSmartLog.setText("Smart Log.");
		txtSmartLog.setColumns(10);
		GroupLayout gl_panelMitte = new GroupLayout(panelMitte);
		gl_panelMitte.setHorizontalGroup(
			gl_panelMitte.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelMitte.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtSmartLog, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(121, Short.MAX_VALUE))
		);
		gl_panelMitte.setVerticalGroup(
			gl_panelMitte.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelMitte.createSequentialGroup()
					.addContainerGap(214, Short.MAX_VALUE)
					.addComponent(txtSmartLog, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panelMitte.setLayout(gl_panelMitte);
		
		JPanel panelOben = new JPanel();
		frame.getContentPane().add(panelOben, BorderLayout.NORTH);
		
		JTextPane txtpnSmartLogapplication = new JTextPane();
		txtpnSmartLogapplication.setBackground(SystemColor.window);
		txtpnSmartLogapplication.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		txtpnSmartLogapplication.setText("Smart Log.-Application");
		panelOben.add(txtpnSmartLogapplication);
		
		JPanel panelRechts = new JPanel();
		frame.getContentPane().add(panelRechts, BorderLayout.EAST);
		
		JButton btnNewButton = new JButton("Wareneingang");
		
		txtSuche = new JTextField();
		txtSuche.setText("Suche");
		txtSuche.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Warenausgang");
		
		JButton btnNewButton_2 = new JButton("Inventur");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnNewButton_3 = new JButton("Lagerverwaltung");
		
		JButton btnNewButton_4 = new JButton("Mitarbeiterverwaltung");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GroupLayout gl_panelRechts = new GroupLayout(panelRechts);
		gl_panelRechts.setHorizontalGroup(
			gl_panelRechts.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelRechts.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelRechts.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(txtSuche))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panelRechts.setVerticalGroup(
			gl_panelRechts.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelRechts.createSequentialGroup()
					.addComponent(txtSuche, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_4)
					.addContainerGap(39, Short.MAX_VALUE))
		);
		panelRechts.setLayout(gl_panelRechts);
	}
}
