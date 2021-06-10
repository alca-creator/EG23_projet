package Vue;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.JScrollPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class FenetreGestionEnseignants {

	private static JFrame frameGestionEnseignants;
	private JFrame framePilotutt;
	private static JTable table;

	/**
	 * Launch the application.
	 */
	public static void ouvreGestionEnseignants() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreGestionEnseignants window = new FenetreGestionEnseignants();
					window.frameGestionEnseignants.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the application.
	 */
	public FenetreGestionEnseignants() {
		initialize();
	}
	
	 
	/**
	 * Initialize the contents of the frameGestionEnseignants.
	 */
	private void initialize() {
		frameGestionEnseignants = new JFrame();
		frameGestionEnseignants.setBounds(100, 100, 1096, 758);
		frameGestionEnseignants.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameGestionEnseignants.getContentPane().setLayout(null);
		
		JPanel panel_menu = new JPanel();
		panel_menu.setBounds(0, 104, 261, 528);
		panel_menu.setBackground(new Color(255, 153, 0));
		frameGestionEnseignants.getContentPane().add(panel_menu);
		panel_menu.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setBackground(new Color(255, 153, 0));
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMenu.setBounds(0, 0, 261, 28);
		panel_menu.add(lblMenu);
		
		JButton btnGestionEnseignants = new JButton("Gestion des enseignants");
		btnGestionEnseignants.setBounds(0, 123, 261, 21);
		btnGestionEnseignants.setBorderPainted(false);
		btnGestionEnseignants.setForeground(Color.BLUE);
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
				frameGestionEnseignants.setVisible(false);
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
				frameGestionEnseignants.setVisible(false);
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
				frameGestionEnseignants.setVisible(false);
				FenetreStatistiquesFlux.ouvreStatistiquesFlux();
			}
		});
		btnStatistiques.setBackground(new Color(255, 153, 0));
		btnStatistiques.setBorderPainted(false);
		btnStatistiques.setBounds(0, 285, 261, 21);
		panel_menu.add(btnStatistiques);
		
		JButton btnSemestreEnCours = new JButton("Gestion du semestre en cours");
		btnSemestreEnCours.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameGestionEnseignants.setVisible(false);
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
		frameGestionEnseignants.getContentPane().add(panel_header);
		panel_header.setLayout(null);
		
		JButton btnDeconnexion = new JButton("Se d\u00E9connecter");
		btnGestionUE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameGestionEnseignants.setVisible(false);
			}
		});
		btnDeconnexion.setForeground(new Color(245, 255, 250));
		btnDeconnexion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane deconnexion = new JOptionPane();
				int option = deconnexion.showConfirmDialog(null, "Etes vous sur de vouloir vous déconnecter ?", "Deconnexion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(option == JOptionPane.OK_OPTION) {
					frameGestionEnseignants.setVisible(false);
				}
			}
		});
		btnDeconnexion.setBackground(new Color(0, 0, 128));
		btnDeconnexion.setBorderPainted(false);
		btnDeconnexion.setBounds(929, 10, 153, 32);
		panel_header.add(btnDeconnexion);
		
		JLabel lbtnTexte = new JLabel("Gestion des enseignants");
		lbtnTexte.setHorizontalAlignment(SwingConstants.CENTER);
		lbtnTexte.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbtnTexte.setForeground(new Color(0, 0, 0));
		lbtnTexte.setBounds(347, 84, 587, 35);
		frameGestionEnseignants.getContentPane().add(lbtnTexte);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(274, 212, 798, 463);
		frameGestionEnseignants.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Abou Amsha", "Khuloud", "Ma\u00EEtre de conf\u00E9rence ", "IF02", "20", "10/10/2016"},
				{"Tixier", "Matthieu", "Professeur", "GL02", "10", "06/09/2013"},
				{"Lemercier", "Marc", "Ma\u00EEtre de conf\u00E9rence", "LO07", "0", "09/11/2014"},
				{"Benel", "Aur\u00E9lien", "Professeur", "IF05/IF14", "35", "20/02/2016"},
				{"Salembier", "Pascal", "Professeur", "IF17", "4", "28/01/2011"},
				{"Di Loreto", "Ines", "Ma\u00EEtre de conf\u00E9rence", "GL01", "50", "20/04/2014"},
				{"Thorel", "Nicolas", "Professeur", "MM01", "2", "15/03/2012"},
				{"Nigro", "Jean Marc", "Ma\u00EEtre de conf\u00E9rence", "EG23", "20", "19/02/2015"},
				{"Bruyant ", "Sabiha", "Professeur", "/", "2", "10/10/2018"},
				{"Doyen", "Guillaume", "Professeur ", "LO02", "20", "02/02/2010"},
				
			},
			new String[] {
				"Nom", "Pr\u00E9nom", "Type d'enseignement", "Responsable UE", "Nombre d'heures suppl\u00E9mentaires", "Date d'entr\u00E9e"
			}
		));
		
		JPanel panel = new JPanel();
		panel.setBounds(971, 156, 101, 60);
		frameGestionEnseignants.getContentPane().add(panel);
		panel.setLayout(null);
		ImageIcon modifier = new ImageIcon(FenetreGestionEnseignants.class.getResource("/imgs/modifier.png"));
		ImageIcon newModifier = new ImageIcon((modifier).getImage().getScaledInstance(40,35, Image.SCALE_DEFAULT));
		
		JLabel lblUTT = new JLabel("");
		ImageIcon utt = new ImageIcon(FenetreGestionEnseignants.class.getResource("/imgs/logo_utt.png"));
	    ImageIcon newutt = new ImageIcon((utt).getImage().getScaledInstance(100,45, Image.SCALE_SMOOTH)); 
	  	lblUTT.setIcon(newutt);
		lblUTT.setBounds(0, 0, 170, 52);
		panel_header.add(lblUTT);
		
		JButton btnSupprimer = new JButton("New button");
		btnSupprimer.setToolTipText("supprimer un profil");
		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane deconnexion = new JOptionPane();
				int option = deconnexion.showConfirmDialog(null, "Etes vous sur de vouloir supprimer ce profil ?", "Suppression d'un profil", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(option == JOptionPane.OK_OPTION) {
				((DefaultTableModel)table.getModel()).removeRow(table.getSelectedRow());
	               JOptionPane.showMessageDialog(null, "Le profil a été supprimé avec succès !");
	            }
			}
			
		});
		btnSupprimer.setForeground(new Color(192, 192, 192));
		btnSupprimer.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ImageIcon supprimer = new ImageIcon(FenetreGestionEnseignants.class.getResource("/imgs/poubelle1.png"));
		ImageIcon newSupprimer = new ImageIcon((supprimer).getImage().getScaledInstance(45,45, Image.SCALE_DEFAULT)); 
	  	btnSupprimer.setIcon(newSupprimer);
		btnSupprimer.setBounds(58, 10, 40, 38);
		btnSupprimer.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(btnSupprimer);
		
		JButton btnAdd = new JButton("New button");
		btnAdd.setToolTipText("ajouter un profil");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane add = new JOptionPane();
				int option = add.showConfirmDialog(null, "Etes vous sur de vouloir ajouter un nouveau profil ?", "Ajout d'un profil", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(option == JOptionPane.OK_OPTION) {
				frameGestionEnseignants.setEnabled(false);
				NouvelEnseignant.ouvreFormulaire();
			}
			}
		});
		ImageIcon add = new ImageIcon(FenetreGestionEnseignants.class.getResource("/imgs/plus.png"));
	    ImageIcon newAdd = new ImageIcon((add).getImage().getScaledInstance(45,45, Image.SCALE_SMOOTH)); 
	  	btnAdd.setIcon(newAdd);
		btnAdd.setBounds(10, 10, 40, 38);
		panel.add(btnAdd);
		
	}
	
	public static String getNom() {
		String name = (String) table.getValueAt(table.getSelectedRow(), 0);
		return name;
	}
	
	public static String getPrenom() {
		String prenom = (String) table.getValueAt(table.getSelectedRow(), 1);
		return prenom;
	}
	
	public static String getEnseignement() {
		String enseignement = (String) table.getValueAt(table.getSelectedRow(), 2);
		return enseignement;
	}
	
	public static String getResponsable() {
		String responsable = (String) table.getValueAt(table.getSelectedRow(), 3);
		return responsable;
	}
	
	public static int getHeures() {
		int heures = (Integer) table.getValueAt(table.getSelectedRow(), 0);
		return heures;
	}
	
	public static JTable getTable() {
		return table;
	}
	
	public static Frame getFrameGestionEnseignants() {
		return frameGestionEnseignants;
	}
}
