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
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Homepage extends JFrame {

    private JFrame frame;
    private JTextField txtSuche;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Homepage window = new Homepage();
                    window.setVisible(true);  // Änderung: Verwende setVisible anstelle von frame.setVisible
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Homepage() {
        initialize();
    }

    private void initialize() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 700, 500);
        getContentPane().setLayout(null);

        JPanel panelOben = new JPanel();
        panelOben.setBounds(0, 0, 700, 35);
        getContentPane().add(panelOben);

        JTextPane txtpnSmartLogapplication = new JTextPane();
        txtpnSmartLogapplication.setEditable(false);
        txtpnSmartLogapplication.setBackground(SystemColor.window);
        txtpnSmartLogapplication.setFont(new Font("Lucida Grande", Font.BOLD, 20));
        txtpnSmartLogapplication.setText("Smart Log.-Application");
        panelOben.add(txtpnSmartLogapplication);

        JPanel panelRechts = new JPanel();
        panelRechts.setBounds(507, 35, 193, 436);
        getContentPane().add(panelRechts);

        JButton btnWareneingang = new JButton("Wareneingang");
        btnWareneingang.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Wareneingang wareneingang = new Wareneingang();
                wareneingang.setVisible(true);
            }
        });

        txtSuche = new JTextField();
        txtSuche.setText("Suche");
        txtSuche.setColumns(10);

        JButton btnWarenausgang = new JButton("Warenausgang");
        btnWarenausgang.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Warenausgang warenausgang = new Warenausgang();
                warenausgang.setVisible(true);
            }
        });

        JButton btnInventur = new JButton("Inventur");
     
        JButton btnLagerverwaltung = new JButton("Lagerverwaltung");

        JButton btnMitarbeiterverwaltung = new JButton("Mitarbeiterverwaltung");
        btnMitarbeiterverwaltung.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Mitarbeiterverwaltung mitarbeiterverwaltung = new Mitarbeiterverwaltung();
                mitarbeiterverwaltung.setVisible(true);
            }
        });
        
        JButton btnNewButton = new JButton("Logout");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        GroupLayout gl_panelRechts = new GroupLayout(panelRechts);
        gl_panelRechts.setHorizontalGroup(
            gl_panelRechts.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panelRechts.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(gl_panelRechts.createParallelGroup(Alignment.TRAILING, false)
                        .addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnWarenausgang, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnWareneingang, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInventur, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLagerverwaltung, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMitarbeiterverwaltung, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSuche, Alignment.LEADING))
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gl_panelRechts.setVerticalGroup(
            gl_panelRechts.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panelRechts.createSequentialGroup()
                    .addComponent(txtSuche, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(12)
                    .addComponent(btnWareneingang)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(btnWarenausgang)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(btnInventur)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(btnLagerverwaltung)
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(btnMitarbeiterverwaltung)
                    .addPreferredGap(ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                    .addComponent(btnNewButton)
                    .addContainerGap())
        );
        panelRechts.setLayout(gl_panelRechts);
        
        JPanel panelUnten = new JPanel();
        panelUnten.setBounds(0, 471, 700, 1);
        getContentPane().add(panelUnten);
        panelUnten.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setBounds(0, 0, 61, 16);
        panelUnten.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Smart Log.");
        lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
        lblNewLabel_1.setBounds(6, 431, 131, 35);
        getContentPane().add(lblNewLabel_1);
    }

    public void setVisible(boolean visible) {
        super.setVisible(visible);
    }
}
