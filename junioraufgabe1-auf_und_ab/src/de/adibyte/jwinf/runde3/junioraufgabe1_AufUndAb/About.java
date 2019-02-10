package de.adibyte.jwinf.runde3.junioraufgabe1_AufUndAb;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class About extends JDialog {


	private static final long serialVersionUID = 4197829197411341583L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			About dialog = new About();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public About() {
		setTitle("JWINF - Junioraufgabe1: Auf und Ab - Adrian Ivo Kolar | About");
		setIconImage(Toolkit.getDefaultToolkit().getImage(About.class.getResource("/de/adibyte/tools/pic/aik-logo-klein-blau-wei\u00DF-transparent.png")));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblAdrianIvoKolar = new JLabel("Adrian Ivo Kolar");
		lblAdrianIvoKolar.setBounds(47, 56, 84, 14);
		contentPanel.add(lblAdrianIvoKolar);
		
		JLabel lblAdibyte = new JLabel("adibyte");
		lblAdibyte.setBounds(67, 81, 57, 14);
		contentPanel.add(lblAdibyte);
		
		JLabel lblGrafiken = new JLabel("Grafiken:");
		lblGrafiken.setBounds(266, 130, 57, 14);
		contentPanel.add(lblGrafiken);
		
		JLabel lblMadamewatermelon = new JLabel("MadameWatermelon");
		lblMadamewatermelon.setBounds(247, 155, 121, 14);
		contentPanel.add(lblMadamewatermelon);
		
		JButton btnMadamewatermelonAufDeviantartcom = new JButton("madamewatermelon auf deviantart");
		btnMadamewatermelonAufDeviantartcom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				de.adibyte.tools.browser.MainBrowserA("https://www.deviantart.com/madamewatermelon");
			}
		});
		btnMadamewatermelonAufDeviantartcom.setBounds(180, 180, 244, 23);
		contentPanel.add(btnMadamewatermelonAufDeviantartcom);
		
		JLabel lblProgrammiertVon = new JLabel("Programmiert von:");
		lblProgrammiertVon.setBounds(35, 31, 121, 14);
		contentPanel.add(lblProgrammiertVon);
		
		JButton btnGithub = new JButton("adiko01 auf Github");
		btnGithub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				de.adibyte.tools.browser.MainBrowserA("https://github.com/adiko01");
			}
		});
		btnGithub.setBounds(10, 106, 157, 23);
		contentPanel.add(btnGithub);
		
		JButton btnDiesesProgrammAuf = new JButton("Dieses Programm auf Github");
		btnDiesesProgrammAuf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				de.adibyte.tools.browser.MainBrowserA("https://github.com/adiko01/jwinf-junioraufgabe1--Auf-und-Ab");
			}
		});
		btnDiesesProgrammAuf.setBounds(206, 27, 218, 23);
		contentPanel.add(btnDiesesProgrammAuf);
		
		JButton btnLizenz = new JButton("Lizenz");
		btnLizenz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Lizenz();
			}
		});
		btnLizenz.setBounds(22, 195, 89, 23);
		contentPanel.add(btnLizenz);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
	private static void Lizenz() {
		ImageIcon icon = new ImageIcon(About.class.getResource("pic/CC-BY-SA.png"));
		JOptionPane.showMessageDialog(null, "\n"
				+ "Dieses Werk ist lizenziert unter einer\n"
				+ "Creative Commons Namensnennung\n"
				+ "Weitergabe unter gleichen Bedingungen 4.0 International Lizenz.\n"
				+ "\n"
				, "JWINF - Junioraufgabe1: Auf und Ab - Adrian Ivo Kolar | Lizens", JOptionPane.QUESTION_MESSAGE, icon);
	}
}
