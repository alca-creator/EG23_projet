package Vue;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;

public class FenetreGestionSemestre {

	private JFrame frameGestionSemestre;

	/**
	 * Launch the application.
	 */
	public static void ouvreGestionSemestre() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreGestionSemestre window = new FenetreGestionSemestre();
					window.frameGestionSemestre.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FenetreGestionSemestre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameGestionSemestre = new JFrame();
		frameGestionSemestre.setBounds(100, 100, 1096, 758);
		frameGestionSemestre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameGestionSemestre.getContentPane().setLayout(null);
		
		JPanel panel_menu = new JPanel();
		panel_menu.setBounds(0, 104, 261, 528);
		panel_menu.setBackground(new Color(255, 153, 0));
		frameGestionSemestre.getContentPane().add(panel_menu);
		panel_menu.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBackground(new Color(255, 153, 0));
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMenu.setBounds(0, 0, 261, 28);
		panel_menu.add(lblMenu);
		
		JButton btnGestionEnseignants = new JButton("Gestion des enseignants");
		btnGestionEnseignants.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameGestionSemestre.setVisible(false);
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
		btnProfil.setBounds(0, 69, 261, 21);
		panel_menu.add(btnProfil);
		
		JButton btnGestionUE = new JButton("Gestion des UE");
		btnGestionUE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameGestionSemestre.setVisible(false);
				FenetreGestionUE.ouvreGestionUE();
			}
		});
		btnGestionUE.setBackground(new Color(255, 153, 0));
		btnGestionUE.setBorderPainted(false);
		btnGestionUE.setBounds(0, 177, 261, 21);
		panel_menu.add(btnGestionUE);
		
		JButton btnRepartitionEtu = new JButton("R\u00E9partition des \u00E9tudiants");
		btnRepartitionEtu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameGestionSemestre.setVisible(false);
				FenetreRepartitionEtu.ouvreRepartitionEtu();
			}
		});
		btnRepartitionEtu.setBackground(new Color(255, 153, 0));
		btnRepartitionEtu.setBorderPainted(false);
		btnRepartitionEtu.setBounds(0, 231, 261, 21);
		panel_menu.add(btnRepartitionEtu);
		
		JButton btnStatistiques = new JButton("Statistiques des flux");
		btnStatistiques.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameGestionSemestre.setVisible(false);
				FenetreStatistiquesFlux.ouvreStatistiquesFlux();
			}
		});
		btnStatistiques.setBackground(new Color(255, 153, 0));
		btnStatistiques.setBorderPainted(false);
		btnStatistiques.setBounds(0, 285, 261, 21);
		panel_menu.add(btnStatistiques);
		
		JButton btnSemestreEnCours = new JButton("Gestion du semestre en cours");
		btnSemestreEnCours.setBackground(new Color(255, 153, 0));
		btnSemestreEnCours.setBorderPainted(false);
		btnSemestreEnCours.setForeground(Color.BLUE);
		btnSemestreEnCours.setBounds(0,339, 261, 21);
		panel_menu.add(btnSemestreEnCours);
		
		JPanel panel_header = new JPanel();
		panel_header.setBackground(new Color(0, 0, 128));
		panel_header.setBounds(0, 0, 1082, 52);
		frameGestionSemestre.getContentPane().add(panel_header);
		panel_header.setLayout(null);
		
		JLabel lblUTT = new JLabel("");
		ImageIcon utt = new ImageIcon(FenetreGestionEnseignants.class.getResource("/imgs/logo_utt.png"));
	    ImageIcon newutt = new ImageIcon((utt).getImage().getScaledInstance(100,45, Image.SCALE_SMOOTH)); 
	  	lblUTT.setIcon(newutt);
		lblUTT.setBounds(0, 0, 170, 52);
		panel_header.add(lblUTT);
		
		JButton btnDeconnexion = new JButton("Se d\u00E9connecter");
		btnDeconnexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane deconnexion = new JOptionPane();
				int option = deconnexion.showConfirmDialog(null, "Etes vous sur de vouloir vous déconnecter ?", "Deconnexion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(option == JOptionPane.OK_OPTION) {
					frameGestionSemestre.setVisible(false);
				}
			}
		});
		btnDeconnexion.setForeground(new Color(245, 255, 250));
		btnDeconnexion.setBackground(new Color(0, 0, 128));
		btnDeconnexion.setBorderPainted(false);
		btnDeconnexion.setBounds(929, 10, 153, 32);
		panel_header.add(btnDeconnexion);
		
		JLabel lbtnTexte = new JLabel("Gestion du semestre");
		lbtnTexte.setHorizontalAlignment(SwingConstants.CENTER);
		lbtnTexte.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbtnTexte.setForeground(new Color(0, 0, 0));
		lbtnTexte.setBounds(347, 84, 587, 35);
		frameGestionSemestre.getContentPane().add(lbtnTexte);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(291, 172, 770, 250);
		frameGestionSemestre.getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblRetard = new JLabel("");
		ImageIcon retard = new ImageIcon(FenetreGestionEnseignants.class.getResource("/imgs/tableau_retard.png"));
	    ImageIcon newRetard = new ImageIcon((retard).getImage().getScaledInstance(750,450, Image.SCALE_SMOOTH)); 
	  	lblRetard.setIcon(newRetard);
		panel.add(lblRetard);
		
		JLabel lblTableauRetard = new JLabel("");
		lblTableauRetard.setLabelFor(frameGestionSemestre);
		lblTableauRetard.setVerticalAlignment(SwingConstants.TOP);
		lblTableauRetard.setBackground(new Color(240, 240, 240));
		lblTableauRetard.setHorizontalAlignment(SwingConstants.LEFT);
		
	    
		JLabel lblMsg1 = new JLabel("Liste des \u00E9tudiants avec un retard :");
		lblMsg1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMsg1.setBounds(291, 139, 261, 23);
		frameGestionSemestre.getContentPane().add(lblMsg1);
		
		JLabel lblMsg2 = new JLabel("Liste des \u00E9tudiants candidats \u00E0 l'excellence :");
		lblMsg2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMsg2.setBounds(291, 432, 332, 23);
		frameGestionSemestre.getContentPane().add(lblMsg2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(291, 465, 550, 246);
		frameGestionSemestre.getContentPane().add(scrollPane_1);
		
		JPanel panel_1 = new JPanel();
		scrollPane_1.setViewportView(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblAvance = new JLabel("");
		ImageIcon avance = new ImageIcon(FenetreGestionEnseignants.class.getResource("/imgs/tableau_AVANCE.png"));
	    ImageIcon newAvance = new ImageIcon((avance).getImage().getScaledInstance(530,300, Image.SCALE_SMOOTH)); 
	  	lblAvance.setIcon(newAvance);
		panel_1.add(lblAvance);
		
	}
}
