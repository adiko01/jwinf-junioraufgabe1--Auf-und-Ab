package de.adibyte.tools;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

public class AllgmeinError extends JDialog {
	private static final long serialVersionUID = -4396587231196761322L;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String Title) {
		try {
			AllgmeinError dialog = new AllgmeinError(Title);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AllgmeinError(String Title) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AllgmeinError.class.getResource("/de/adibyte/tools/pic/Achtung32x32.png")));
		setTitle(Title);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblEinFehlerIst = new JLabel("Ein Fehler ist aufgetreten");
			lblEinFehlerIst.setFont(new Font("Tahoma", Font.BOLD, 21));
			lblEinFehlerIst.setBounds(10, 11, 414, 32);
			contentPanel.add(lblEinFehlerIst);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
