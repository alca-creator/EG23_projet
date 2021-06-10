package Vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NouvelEnseignant {

	private static JFrame frame;
	private static JTextField txtPrenom;
	private static JTextField txtNom;
	private static JTextField txtEnseignement;
	private static JTextField txtresponsable;
	private static JTextField txtheure;

	/**
	 * Launch the application.
	 */
	public static void ouvreFormulaire() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NouvelEnseignant window = new NouvelEnseignant();
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
	public NouvelEnseignant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 647, 442);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 623, 395);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNom = new JLabel("Nom : ");
		lblNom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNom.setBounds(121, 78, 58, 26);
		panel.add(lblNom);
		
		JLabel lblPrenom = new JLabel("Pr\u00E9nom :");
		lblPrenom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrenom.setBounds(121, 114, 58, 26);
		panel.add(lblPrenom);
		
		JLabel lblTypeEnseignement = new JLabel("Type d'enseignement :");
		lblTypeEnseignement.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTypeEnseignement.setForeground(new Color(0, 0, 0));
		lblTypeEnseignement.setBounds(121, 150, 178, 26);
		panel.add(lblTypeEnseignement);
		
		JLabel lblResponsableUE = new JLabel("Responsable UE :");
		lblResponsableUE.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblResponsableUE.setBounds(121, 186, 156, 26);
		panel.add(lblResponsableUE);
		
		JLabel lblNbHeures = new JLabel("Nombre d'heures supl\u00E9mmentaires :");
		lblNbHeures.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNbHeures.setForeground(new Color(0, 0, 0));
		lblNbHeures.setBounds(121, 219, 240, 26);
		panel.add(lblNbHeures);
		
		JLabel lblFormulaire = new JLabel("Formulaire ");
		lblFormulaire.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFormulaire.setBounds(259, 10, 111, 31);
		panel.add(lblFormulaire);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				((DefaultTableModel)FenetreGestionEnseignants.getTable().getModel()).addRow(
		                   new Object[]{
		                         NouvelEnseignant.getNom(),
		                         NouvelEnseignant.getPrenom(),
		                         NouvelEnseignant.getTypeEnseignement(),
		                         NouvelEnseignant.getResponsable(),
		                         NouvelEnseignant.getHeuresSup(),
		                         "14/06/2021"
		                   }
		        );
				FenetreGestionEnseignants.getFrameGestionEnseignants().setEnabled(true);
				FenetreGestionEnseignants.getFrameGestionEnseignants().setVisible(true);
				}
			});
		
		btnValider.setBounds(273, 324, 90, 31);
		panel.add(btnValider);
		
			
		txtPrenom = new JTextField();
		txtPrenom.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtPrenom.setText("entrer le pr\u00E9nom ici");
		txtPrenom.setBounds(189, 113, 156, 26);
		panel.add(txtPrenom);
		txtPrenom.setColumns(10);
		
		txtNom = new JTextField();
		txtNom.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtNom.setText("entrer le nom ici");
		txtNom.setColumns(10);
		txtNom.setBounds(181, 77, 164, 26);
		panel.add(txtNom);
		
		txtEnseignement = new JTextField();
		txtEnseignement.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtEnseignement.setText("entrer le type d'enseignement ici");
		txtEnseignement.setColumns(10);
		txtEnseignement.setBounds(273, 149, 177, 26);
		panel.add(txtEnseignement);
		
		txtresponsable = new JTextField();
		txtresponsable.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtresponsable.setText("entrer le responsable ici");
		txtresponsable.setColumns(10);
		txtresponsable.setBounds(240, 185, 178, 26);
		panel.add(txtresponsable);
		
		txtheure = new JTextField();
		txtheure.setFont(new Font("Tahoma", Font.ITALIC, 10));
		txtheure.setColumns(10);
		txtheure.setBounds(354, 218, 96, 26);
		panel.add(txtheure);
		
		JLabel lblh = new JLabel("h");
		lblh.setFont(new Font("Dialog", Font.PLAIN, 14));
		lblh.setForeground(new Color(0, 0, 0));
		lblh.setBounds(463, 219, 52, 22);
		panel.add(lblh);
	}
	
	public static String getNom() {
		String name = txtNom.getText();
		return name;		
	}
	
	public static String getPrenom() {
		String prenom = txtPrenom.getText();
		return prenom;		
	}
	
	public static String getTypeEnseignement() {
		String enseignement = txtEnseignement.getText();
		return enseignement;		
	}
	
	public static String getResponsable() {
		String responsable = txtresponsable.getText();
		return responsable;		
	}
	
	public static String getHeuresSup() {
		String heure = txtheure.getText();
		return heure;		
	}
		
}
