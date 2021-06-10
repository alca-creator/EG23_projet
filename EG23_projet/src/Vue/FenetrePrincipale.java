package Vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Component;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;

public class FenetrePrincipale {

	public JFrame framePilotutt;
	private JFrame frmConnexion;
	private JFrame frameGestionEnseignants;
	//private JFrame frmBonjour;
	private JTextField textField;
	private JTextField textField_1;
	JPanel panel_profil = new JPanel();
	JLayeredPane layeredPane = new JLayeredPane();
	JPanel panel_gestion_ues = new JPanel();
	JPanel panel_statistiques = new JPanel();
	JPanel panel_gestion_semestre = new JPanel();
	JPanel panel_repartition = new JPanel();
	JPanel panel_gestion_enseignants = new JPanel();
	private JTextField textMonNom;
	private JTextField textMonPrenom;
	private boolean profilValide = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetrePrincipale window = new FenetrePrincipale();
					window.framePilotutt.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FenetrePrincipale() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		framePilotutt = new JFrame();
		framePilotutt.setBounds(100, 100, 1096, 758);
		framePilotutt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framePilotutt.getContentPane().setLayout(null);
		
		JPanel panel_menu = new JPanel();
		panel_menu.setBounds(0, 104, 261, 528);
		panel_menu.setBackground(new Color(255, 153, 0));
		framePilotutt.getContentPane().add(panel_menu);
		panel_menu.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBackground(new Color(255, 153, 0));
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMenu.setBounds(0, 0, 261, 28);
		panel_menu.add(lblMenu);
		
		JButton btnGestionEnseignants = new JButton("Gestion des enseignants");
		btnGestionEnseignants.setToolTipText("Veuillez valider votre profil");
		btnGestionEnseignants.setEnabled(false);
		btnGestionEnseignants.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				framePilotutt.setVisible(false);
				FenetreGestionEnseignants.ouvreGestionEnseignants();
			}
		});
		btnGestionEnseignants.setBounds(0, 123, 261, 21);
		btnGestionEnseignants.setBorderPainted(false);
		btnGestionEnseignants.setBackground(new Color(255, 153, 0));
		panel_menu.add(btnGestionEnseignants);
		
		JButton btnProfil = new JButton("Profil");
		btnProfil.setBackground(new Color(255, 153, 0));
		btnProfil.setBorderPainted(false);
		btnProfil.setForeground(Color.BLUE);
		btnProfil.setBounds(0, 69, 261, 21);
		panel_menu.add(btnProfil);
		
		JButton btnGestionUE = new JButton("Gestion des UE");
		btnGestionUE.setToolTipText("Veuillez valider votre profil");
		btnGestionUE.setEnabled(false);
		btnGestionUE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				framePilotutt.setVisible(false);
				FenetreGestionUE.ouvreGestionUE();
			}
		});
		btnGestionUE.setBackground(new Color(255, 153, 0));
		btnGestionUE.setBorderPainted(false);
		btnGestionUE.setBounds(0, 177, 261, 21);
		panel_menu.add(btnGestionUE);
		
		JButton btnRepartitionEtu = new JButton("R\u00E9partition des \u00E9tudiants");
		btnRepartitionEtu.setToolTipText("Veuillez valider votre profil");
		btnRepartitionEtu.setEnabled(false);
		btnRepartitionEtu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				framePilotutt.setVisible(false);
				FenetreRepartitionEtu.ouvreRepartitionEtu();
			}
		});
		btnRepartitionEtu.setBackground(new Color(255, 153, 0));
		btnRepartitionEtu.setBorderPainted(false);
		btnRepartitionEtu.setBounds(0, 231, 261, 21);
		panel_menu.add(btnRepartitionEtu);
		
		JButton btnStatistiques = new JButton("Statistiques des flux");
		btnStatistiques.setToolTipText("Veuillez valider votre profil");
		btnStatistiques.setEnabled(false);
		btnStatistiques.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				framePilotutt.setVisible(false);
				FenetreStatistiquesFlux.ouvreStatistiquesFlux();
			}
		});
		btnStatistiques.setBackground(new Color(255, 153, 0));
		btnStatistiques.setBorderPainted(false);
		btnStatistiques.setBounds(0, 285, 261, 21);
		panel_menu.add(btnStatistiques);
		
		JButton btnSemestreEnCours = new JButton("Gestion du semestre en cours");
		btnSemestreEnCours.setToolTipText("Veuillez valider votre profil");
		btnSemestreEnCours.setEnabled(false);
		btnSemestreEnCours.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				framePilotutt.setVisible(false);
				FenetreGestionSemestre.ouvreGestionSemestre();
			}
		});
		btnSemestreEnCours.setBackground(new Color(255, 153, 0));
		btnSemestreEnCours.setBorderPainted(false);
		btnSemestreEnCours.setBounds(0,339, 261, 21);
		panel_menu.add(btnSemestreEnCours);
		
		JPanel panel_header = new JPanel();
		panel_header.setBackground(new Color(0, 0, 128));
		panel_header.setBounds(0, 0, 1082, 52);
		framePilotutt.getContentPane().add(panel_header);
		panel_header.setLayout(null);
		
		JButton btnDeconnexion = new JButton("Se d\u00E9connecter");
		btnDeconnexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane deconnexion = new JOptionPane();
				int option = deconnexion.showConfirmDialog(null, "Etes vous sur de vouloir vous déconnecter ?", "Deconnexion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(option == JOptionPane.OK_OPTION) {
					framePilotutt.setVisible(false);
					btnGestionEnseignants.setEnabled(true);
				}
			}
		});
		btnDeconnexion.setForeground(new Color(245, 255, 250));
		btnDeconnexion.setBackground(new Color(0, 0, 128));
		btnDeconnexion.setBorderPainted(false);
		btnDeconnexion.setBounds(929, 10, 153, 32);
		panel_header.add(btnDeconnexion);
		
		JLabel lblUTT = new JLabel("");
		ImageIcon utt = new ImageIcon(FenetreGestionEnseignants.class.getResource("/imgs/logo_utt.png"));
	    ImageIcon newutt = new ImageIcon((utt).getImage().getScaledInstance(100,45, Image.SCALE_SMOOTH)); 
	  	lblUTT.setIcon(newutt);
		lblUTT.setBounds(0, 0, 170, 52);
		panel_header.add(lblUTT);
		
		JLabel lbtnTexte = new JLabel("Profil");
		lbtnTexte.setHorizontalAlignment(SwingConstants.CENTER);
		lbtnTexte.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbtnTexte.setForeground(new Color(0, 0, 0));
		lbtnTexte.setBounds(347, 84, 587, 35);
		framePilotutt.getContentPane().add(lbtnTexte);
		
		JLabel lblNom = new JLabel("Nom :");
		lblNom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNom.setBounds(539, 198, 49, 35);
		framePilotutt.getContentPane().add(lblNom);
		
		JLabel lblPrenom = new JLabel("Pr\u00E9nom :");
		lblPrenom.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrenom.setBounds(539, 254, 83, 35);
		framePilotutt.getContentPane().add(lblPrenom);
		
		textMonNom = new JTextField();
		textMonNom.setText("Entrez votre nom ici");
		textMonNom.setBounds(670, 203, 137, 19);
		framePilotutt.getContentPane().add(textMonNom);
		textMonNom.setColumns(10);
		
		textMonPrenom = new JTextField();
		textMonPrenom.setText("Entrez votre pr\u00E9nom ici");
		textMonPrenom.setBounds(670, 256, 137, 19);
		framePilotutt.getContentPane().add(textMonPrenom);
		textMonPrenom.setColumns(10);
		
		JLabel lblDepartement = new JLabel("D\u00E9partement : ");
		lblDepartement.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDepartement.setBounds(539, 307, 95, 35);
		framePilotutt.getContentPane().add(lblDepartement);
		
		
		
		JButton btnValiderProfil = new JButton("Valider");
		btnValiderProfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nom = textMonNom.getText();
				String prenom = textMonPrenom.getText();
				JOptionPane bienvenue = new JOptionPane();
				int option = bienvenue.showConfirmDialog(null, "Bienvenue " + prenom +" "+ nom  +" !\n Vos informations ont bien été enregistrées." , "Connexion", JOptionPane.OK_CANCEL_OPTION);
				if(option == JOptionPane.OK_OPTION) {
				 btnGestionEnseignants.setEnabled(true);
				 btnGestionEnseignants.setToolTipText(null);
				 btnGestionUE.setEnabled(true);
				 btnGestionUE.setToolTipText(null);
				 btnRepartitionEtu.setEnabled(true);
				 btnRepartitionEtu.setToolTipText(null);
				 btnStatistiques.setEnabled(true);
				 btnStatistiques.setToolTipText(null);
				 btnSemestreEnCours.setEnabled(true);
				 btnSemestreEnCours.setToolTipText(null);
				}
			}
		});
		btnValiderProfil.setBounds(611, 420, 85, 21);
		framePilotutt.getContentPane().add(btnValiderProfil);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Choisissez votre d\u00E9partement");
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ISI", "RT", "GI", "MTE", "GM"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(670, 316, 72, 21);
		framePilotutt.getContentPane().add(comboBox);
		
		 
	}
}
