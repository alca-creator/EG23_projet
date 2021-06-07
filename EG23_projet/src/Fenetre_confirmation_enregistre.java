import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fenetre_confirmation_enregistre {

	public JFrame frmBonjour;
	private String prenom;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre_confirmation_enregistre window = new Fenetre_confirmation_enregistre();
					window.frmBonjour.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public Fenetre_confirmation_enregistre(String prenom) {
		this.prenom =prenom;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBonjour = new JFrame();
		frmBonjour.setTitle("Bonjour !");
		frmBonjour.setBounds(100, 100, 450, 300);
		frmBonjour.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBonjour.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bonjour " + this.prenom + " !");
		lblNewLabel.setBounds(149, 47, 100, 13);
		frmBonjour.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Vos informations ont bien \u00E9t\u00E9 enregistr\u00E9es.");
		lblNewLabel_1.setBounds(97, 85, 193, 52);
		frmBonjour.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBonjour.setVisible(false);
			}
		});
		btnNewButton.setBounds(149, 147, 85, 21);
		frmBonjour.getContentPane().add(btnNewButton);
	}

}
