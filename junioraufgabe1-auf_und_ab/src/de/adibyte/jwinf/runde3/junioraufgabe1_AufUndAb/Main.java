package de.adibyte.jwinf.runde3.junioraufgabe1_AufUndAb;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Main {
	private JFrame frmJwinfJunioraufgabe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmJwinfJunioraufgabe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJwinfJunioraufgabe = new JFrame();
		frmJwinfJunioraufgabe.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/de/adibyte/tools/pic/aik-logo-klein-blau-wei\u00DF-transparent.png")));
		frmJwinfJunioraufgabe.setTitle("JWINF - Junioraufgabe1: Auf und Ab - Adrian Ivo Kolar | Home");
		frmJwinfJunioraufgabe.setBounds(100, 100, 450, 300);
		frmJwinfJunioraufgabe.getContentPane().setLayout(null);
		
		JLabel lblZahl = new JLabel("Zahl:");
		lblZahl.setBounds(10, 65, 33, 14);
		frmJwinfJunioraufgabe.getContentPane().add(lblZahl);
		
		JRadioButton rdbtn1 = new JRadioButton("1");

		rdbtn1.setBounds(106, 61, 109, 23);
		frmJwinfJunioraufgabe.getContentPane().add(rdbtn1);
		
		JRadioButton rdbtn2 = new JRadioButton("2");
		rdbtn2.setBounds(106, 87, 109, 23);
		frmJwinfJunioraufgabe.getContentPane().add(rdbtn2);
		
		JRadioButton rdbtn3 = new JRadioButton("3");
		rdbtn3.setBounds(106, 113, 109, 23);
		frmJwinfJunioraufgabe.getContentPane().add(rdbtn3);
		
		JRadioButton rdbtn4 = new JRadioButton("4");
		rdbtn4.setBounds(225, 61, 109, 23);
		frmJwinfJunioraufgabe.getContentPane().add(rdbtn4);
		
		JRadioButton rdbtn5 = new JRadioButton("5");
		rdbtn5.setBounds(225, 87, 109, 23);
		frmJwinfJunioraufgabe.getContentPane().add(rdbtn5);
		
		JRadioButton rdbtn6 = new JRadioButton("6");
		rdbtn6.setBounds(225, 113, 109, 23);
		frmJwinfJunioraufgabe.getContentPane().add(rdbtn6);
		
		JButton btnBerechen = new JButton("berechen");
		btnBerechen.setBounds(139, 143, 89, 23);
		frmJwinfJunioraufgabe.getContentPane().add(btnBerechen);
		
		JPanel panelStatus = new JPanel();
		panelStatus.setBounds(109, 197, 225, 53);
		frmJwinfJunioraufgabe.getContentPane().add(panelStatus);
		panelStatus.setLayout(null);
		
		JLabel lblNochNichtsIst = new JLabel("Noch nichts ist passiert");
		lblNochNichtsIst.setBounds(10, 11, 205, 14);
		panelStatus.add(lblNochNichtsIst);
		
		JButton btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				About.main(null);
			}
		});
		btnAbout.setBounds(335, 11, 89, 23);
		frmJwinfJunioraufgabe.getContentPane().add(btnAbout);
		
		rdbtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtn1.setSelected(true);
				rdbtn2.setSelected(false);
				rdbtn3.setSelected(false);
				rdbtn4.setSelected(false);
				rdbtn5.setSelected(false);
				rdbtn6.setSelected(false);
			}
		});
		rdbtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtn1.setSelected(false);
				rdbtn2.setSelected(true);
				rdbtn3.setSelected(false);
				rdbtn4.setSelected(false);
				rdbtn5.setSelected(false);
				rdbtn6.setSelected(false);
			}
		});
		rdbtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtn1.setSelected(false);
				rdbtn2.setSelected(false);
				rdbtn3.setSelected(true);
				rdbtn4.setSelected(false);
				rdbtn5.setSelected(false);
				rdbtn6.setSelected(false);
			}
		});
		rdbtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtn1.setSelected(false);
				rdbtn2.setSelected(false);
				rdbtn3.setSelected(false);
				rdbtn4.setSelected(true);
				rdbtn5.setSelected(false);
				rdbtn6.setSelected(false);
			}
		});
		rdbtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtn1.setSelected(false);
				rdbtn2.setSelected(false);
				rdbtn3.setSelected(false);
				rdbtn4.setSelected(false);
				rdbtn5.setSelected(true);
				rdbtn6.setSelected(false);
			}
		});
		rdbtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				rdbtn1.setSelected(false);
				rdbtn2.setSelected(false);
				rdbtn3.setSelected(false);
				rdbtn4.setSelected(false);
				rdbtn5.setSelected(false);
				rdbtn6.setSelected(true);
			}
		});
		btnBerechen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(rdbtn1.isSelected()) {
					lblNochNichtsIst.setText(null);
					rechnenclass.InRechnen(1);
				}
				else if(rdbtn2.isSelected()) {
					lblNochNichtsIst.setText(null);
					rechnenclass.InRechnen(2);
				}
				else if(rdbtn3.isSelected()) {
					lblNochNichtsIst.setText(null);
					rechnenclass.InRechnen(3);
				}
				else if(rdbtn4.isSelected()) {
					lblNochNichtsIst.setText(null);
					rechnenclass.InRechnen(4);
				}
				else if(rdbtn5.isSelected()) {
					lblNochNichtsIst.setText(null);
					rechnenclass.InRechnen(5);
				}
				else if(rdbtn6.isSelected()) {
					lblNochNichtsIst.setText(null);
					rechnenclass.InRechnen(6);
				}
				else{
					panelStatus.setBackground(Color.RED);
					lblNochNichtsIst.setText("Bitte wähle eine Zahl aus!");
				}
			}
		});
	}
}
