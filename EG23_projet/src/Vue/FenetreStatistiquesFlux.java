package Vue;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.SwingConstants;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.JComboBox;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLayeredPane;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class FenetreStatistiquesFlux {

	private JFrame frameStatistiques;

	/**
	 * Launch the application.
	 */
	public static void ouvreStatistiquesFlux() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetreStatistiquesFlux window = new FenetreStatistiquesFlux();
					window.frameStatistiques.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FenetreStatistiquesFlux() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 */
	public static Image scaleImage(Image source, int width, int height) {
	    BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
	    Graphics2D g = (Graphics2D) img.getGraphics();
	    g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	    g.drawImage(source, 0, 0, width, height, null);
	    g.dispose();
	    return img;
	}
	
	public static Image scaleImage(final Image source, final double factor) {
	    int width = (int) (source.getWidth(null) * factor);
	    int height = (int) (source.getHeight(null) * factor);
	    return scaleImage(source, width, height);
	}
	
	public static Image scaleImage(Image source, int size) {
	    int width = source.getWidth(null);
	    int height = source.getHeight(null);
	    double f = 0;
	    if (width < height) {//portrait
	        f = (double) height / (double) width;
	        width = (int) (size / f);
	        height = size;
	    } else {//paysage
	        f = (double) width / (double) height;
	        width = size;
	        height = (int) (size / f);
	    }
	    return scaleImage(source, width, height);
	}
	
	
	
	

	  
	private void initialize() {
		frameStatistiques = new JFrame();
		frameStatistiques.setBounds(100, 100, 1096, 758);
		frameStatistiques.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameStatistiques.getContentPane().setLayout(null);
		
		JPanel panel_menu = new JPanel();
		panel_menu.setBounds(0, 104, 261, 528);
		panel_menu.setBackground(new Color(255, 153, 0));
		frameStatistiques.getContentPane().add(panel_menu);
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
				frameStatistiques.setVisible(false);
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
				frameStatistiques.setVisible(false);
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
				frameStatistiques.setVisible(false);
				FenetreRepartitionEtu.ouvreRepartitionEtu();
			}
		});
		btnRepartitionEtu.setBackground(new Color(255, 153, 0));
		btnRepartitionEtu.setBorderPainted(false);
		btnRepartitionEtu.setBounds(0, 231, 261, 21);
		panel_menu.add(btnRepartitionEtu);
		
		JButton btnStatistiques = new JButton("Statistiques des flux");
		btnStatistiques.setBackground(new Color(255, 153, 0));
		btnStatistiques.setBorderPainted(false);
		btnStatistiques.setForeground(Color.BLUE);
		btnStatistiques.setBounds(0, 285, 261, 21);
		panel_menu.add(btnStatistiques);
		
		JButton btnSemestreEnCours = new JButton("Gestion du semestre en cours");
		btnSemestreEnCours.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frameStatistiques.setVisible(false);
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
		frameStatistiques.getContentPane().add(panel_header);
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
					frameStatistiques.setVisible(false);
				}
			}
		});
		btnDeconnexion.setForeground(new Color(245, 255, 250));
		btnDeconnexion.setBackground(new Color(0, 0, 128));
		btnDeconnexion.setBorderPainted(false);
		btnDeconnexion.setBounds(929, 10, 153, 32);
		panel_header.add(btnDeconnexion);
		
		JLabel lbtnTexte = new JLabel("Statistiques des flux entrants et sortants");
		lbtnTexte.setHorizontalAlignment(SwingConstants.CENTER);
		lbtnTexte.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbtnTexte.setForeground(new Color(0, 0, 0));
		lbtnTexte.setBounds(347, 84, 587, 35);
		frameStatistiques.getContentPane().add(lbtnTexte);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(281, 183, 801, 450);
		frameStatistiques.getContentPane().add(scrollPane);
		
		JPanel panel = new JPanel();
		scrollPane.setViewportView(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{782, 0};
		gbl_panel.rowHeights = new int[]{328, 328, 328, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		ImageIcon icon = new ImageIcon(getClass().getResource("/imgs/evolution_entree_sorties (1).png"));
		//Image zoom = scaleImage(icon.getImage(), 0.8d);//facteur
		Image zoom = scaleImage(icon.getImage(), 600);//taille en pixels
		Icon iconScaled = new ImageIcon(zoom);
		final JLabel lblTest = new JLabel(iconScaled);
		GridBagConstraints gbc_lblTest = new GridBagConstraints();
		gbc_lblTest.insets = new Insets(0, 0, 5, 0);
		gbc_lblTest.gridx = 0;
		gbc_lblTest.gridy = 0;
		panel.add(lblTest, gbc_lblTest);
		
		JPanel sousPanel = new JPanel();
		sousPanel.setLayout(null);
		GridBagConstraints gbc_sousPanel = new GridBagConstraints();
		gbc_sousPanel.insets = new Insets(0, 0, 5, 0);
		gbc_sousPanel.fill = GridBagConstraints.BOTH;
		gbc_sousPanel.gridx = 0;
		gbc_sousPanel.gridy = 1;
		panel.add(sousPanel, gbc_sousPanel);
		
		JLabel lblMsgNbDiplome = new JLabel("Nombre de diplom\u00E9s ISI en ");
		lblMsgNbDiplome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMsgNbDiplome.setBounds(29, 13, 202, 22);
		sousPanel.add(lblMsgNbDiplome);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(195, 63, 458, 279);
		sousPanel.add(layeredPane);
		
		JPanel panel2011 = new JPanel();
		panel2011.setBounds(0, 0, 458, 300);
		layeredPane.add(panel2011);
		
		JLabel lbl2011 = new JLabel("");
		lbl2011.setVerticalAlignment(SwingConstants.TOP);
		ImageIcon graph2011 = new ImageIcon(FenetreGestionEnseignants.class.getResource("/imgs/nbdiplomee2011P.png"));
	    ImageIcon new2011 = new ImageIcon((graph2011).getImage().getScaledInstance(530,270, Image.SCALE_SMOOTH));
	    lbl2011.setIcon(new2011);
	  	panel2011.add(lbl2011);
		
			  		
		JPanel panel2012 = new JPanel();
		panel2012.setBounds(0, 0, 458, 300);
		layeredPane.add(panel2012);
		
		JLabel lbl2012 = new JLabel("");
		lbl2012.setVerticalAlignment(SwingConstants.TOP);
		ImageIcon graph2012 = new ImageIcon(FenetreGestionEnseignants.class.getResource("/imgs/nbdiplomee2012.png"));
	    ImageIcon new2012 = new ImageIcon((graph2012).getImage().getScaledInstance(530,270, Image.SCALE_SMOOTH));
	    lbl2012.setIcon(new2012);
		panel2012.add(lbl2012);
		
		JPanel panel2013 = new JPanel();
		panel2013.setBounds(0, 0, 458, 300);
		layeredPane.add(panel2013);
		
		JLabel lbl2013 = new JLabel("");
		lbl2013.setVerticalAlignment(SwingConstants.TOP);
		ImageIcon graph2013 = new ImageIcon(FenetreGestionEnseignants.class.getResource("/imgs/nbdiplomee2013.png"));
	    ImageIcon new2013 = new ImageIcon((graph2013).getImage().getScaledInstance(530,270, Image.SCALE_SMOOTH));
	  	lbl2013.setIcon(new2013);
		panel2013.add(lbl2013);
		
		JPanel panel2014 = new JPanel();
		panel2014.setBounds(0, 0, 458, 300);
		layeredPane.add(panel2014);
		
		JLabel lbl2014 = new JLabel("");
		lbl2014.setVerticalAlignment(SwingConstants.TOP);
		ImageIcon graph2014 = new ImageIcon(FenetreGestionEnseignants.class.getResource("/imgs/nbdiplomee2014.png"));
	    ImageIcon new2014 = new ImageIcon((graph2014).getImage().getScaledInstance(530,270, Image.SCALE_SMOOTH));
	  	lbl2014.setIcon(new2014);
		panel2014.add(lbl2014);
		
		JPanel panel2015 = new JPanel();
		panel2015.setBounds(0, 0, 458, 300);
		layeredPane.add(panel2015);
		
		JLabel lbl2015 = new JLabel("");
		lbl2015.setVerticalAlignment(SwingConstants.TOP);
		ImageIcon graph2015 = new ImageIcon(FenetreGestionEnseignants.class.getResource("/imgs/nbdiplomee2015.png"));
	    ImageIcon new2015 = new ImageIcon((graph2015).getImage().getScaledInstance(530,270, Image.SCALE_SMOOTH));
	  	lbl2015.setIcon(new2015);
		panel2015.add(lbl2015);
		
		JPanel panel2016 = new JPanel();
		panel2016.setBounds(0, 0, 458, 300);
		layeredPane.add(panel2016);
		
		JLabel lbl2016 = new JLabel("");
		lbl2016.setVerticalAlignment(SwingConstants.TOP);
		ImageIcon graph2016 = new ImageIcon(FenetreGestionEnseignants.class.getResource("/imgs/nbdiplomee2016.png"));
	    ImageIcon new2016 = new ImageIcon((graph2016).getImage().getScaledInstance(530,270, Image.SCALE_SMOOTH));
	  	lbl2016.setIcon(new2016);
		panel2016.add(lbl2016);
		
		JPanel panel2017 = new JPanel();
		panel2017.setBounds(0, 0, 458, 300);
		layeredPane.add(panel2017);
		
		JLabel lbl2017 = new JLabel("");
		lbl2017.setVerticalAlignment(SwingConstants.TOP);
		ImageIcon graph2017 = new ImageIcon(FenetreGestionEnseignants.class.getResource("/imgs/nbdiplomee2017.png"));
	    ImageIcon new2017 = new ImageIcon((graph2017).getImage().getScaledInstance(530,270, Image.SCALE_SMOOTH));
	  	lbl2017.setIcon(new2017);
		panel2017.add(lbl2017);
		
		JPanel panel2018 = new JPanel();
		panel2018.setBounds(0, 0, 458, 300);
		layeredPane.add(panel2018);
		
		JLabel lbl2018 = new JLabel("");
		lbl2018.setVerticalAlignment(SwingConstants.TOP);
		ImageIcon graph2018 = new ImageIcon(FenetreGestionEnseignants.class.getResource("/imgs/nbdiplomee2018.png"));
	    ImageIcon new2018 = new ImageIcon((graph2018).getImage().getScaledInstance(530,270, Image.SCALE_SMOOTH));
	  	lbl2018.setIcon(new2018);
		panel2018.add(lbl2018);
		
		JPanel panel2019 = new JPanel();
		panel2019.setBounds(0, 0, 458, 300);
		layeredPane.add(panel2019);
		
		JLabel lbl2019 = new JLabel("");
		lbl2019.setVerticalAlignment(SwingConstants.TOP);
		ImageIcon graph2019 = new ImageIcon(FenetreGestionEnseignants.class.getResource("/imgs/nbdiplomee2019.png"));
	    ImageIcon new2019 = new ImageIcon((graph2019).getImage().getScaledInstance(530,270, Image.SCALE_SMOOTH));
	  	lbl2019.setIcon(new2019);
		panel2019.add(lbl2019);
		
		JPanel panel2020 = new JPanel();
		panel2020.setBounds(0, 0, 458, 300);
		layeredPane.add(panel2020);
		
		JLabel lbl2020 = new JLabel("");
		lbl2020.setVerticalAlignment(SwingConstants.TOP);
		ImageIcon graph2020 = new ImageIcon(FenetreGestionEnseignants.class.getResource("/imgs/nbdiplomee20120.png"));
	    ImageIcon new2020 = new ImageIcon((graph2020).getImage().getScaledInstance(530,270, Image.SCALE_SMOOTH));
	  	lbl2020.setIcon(new2020);
		panel2020.add(lbl2020);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("2011")) {
				layeredPane.removeAll();
				layeredPane.add(panel2011);
				layeredPane.repaint();
				layeredPane.revalidate();
				}else if(comboBox.getSelectedItem().equals("2013")) {
					layeredPane.removeAll();
					layeredPane.add(panel2013);
					layeredPane.repaint();
					layeredPane.revalidate();
					}
				else if(comboBox.getSelectedItem().equals("2012")) {
					layeredPane.removeAll();
					layeredPane.add(panel2012);
					layeredPane.repaint();
					layeredPane.revalidate();
					}
				else if(comboBox.getSelectedItem().equals("2014")) {
					layeredPane.removeAll();
					layeredPane.add(panel2014);
					layeredPane.repaint();
					layeredPane.revalidate();
					}
				else if(comboBox.getSelectedItem().equals("2015")) {
					layeredPane.removeAll();
					layeredPane.add(panel2015);
					layeredPane.repaint();
					layeredPane.revalidate();
					}
				else if(comboBox.getSelectedItem().equals("2016")) {
					layeredPane.removeAll();
					layeredPane.add(panel2016);
					layeredPane.repaint();
					layeredPane.revalidate();
					}
				else if(comboBox.getSelectedItem().equals("2017")) {
					layeredPane.removeAll();
					layeredPane.add(panel2017);
					layeredPane.repaint();
					layeredPane.revalidate();
					}
				else if(comboBox.getSelectedItem().equals("2018")) {
					layeredPane.removeAll();
					layeredPane.add(panel2018);
					layeredPane.repaint();
					layeredPane.revalidate();
					}
				else if(comboBox.getSelectedItem().equals("2019")) {
					layeredPane.removeAll();
					layeredPane.add(panel2019);
					layeredPane.repaint();
					layeredPane.revalidate();
					}
				else if(comboBox.getSelectedItem().equals("2020")) {
					layeredPane.removeAll();
					layeredPane.add(panel2020);
					layeredPane.repaint();
					layeredPane.revalidate();
					}
				
				
				/*if(comboBox.getSelectedItem().equals("2011")){
					lbl2011.setVisible(true);
					lbl2012.setVisible(false);
				}else if(comboBox.getSelectedItem().equals("2012")) {
					lbl2012.setVisible(true);
					lbl2011.setVisible(false);
					
				}*/
			
			  /*switch(comboBox.getSelectedItem().toString()) {
				  case "2011":
					  layeredPane.moveToFront(panel2011);
					  layeredPane.moveToBack(panel2012);
					  layeredPane.moveToBack(lbl2013);
					  layeredPane.moveToBack(lbl2014);
					  layeredPane.moveToBack(lbl2015);
					  layeredPane.moveToBack(lbl2016);
					  layeredPane.moveToBack(lbl2017);
					  layeredPane.moveToBack(lbl2018);
					  layeredPane.moveToBack(lbl2019);
					  layeredPane.moveToBack(lbl2020);
				    break;
				  case "2012":
					  layeredPane.moveToFront(panel2012);
					  layeredPane.moveToBack(panel2011);
					  layeredPane.moveToBack(lbl2013);
					  layeredPane.moveToBack(lbl2014);
					  layeredPane.moveToBack(lbl2015);
					  layeredPane.moveToBack(lbl2016);
					  layeredPane.moveToBack(lbl2017);
					  layeredPane.moveToBack(lbl2018);
					  layeredPane.moveToBack(lbl2019);
					  layeredPane.moveToBack(lbl2020);
				    break;
				  case "2013":
					  layeredPane.moveToFront(lbl2013);
					  layeredPane.moveToBack(lbl2012);
					  layeredPane.moveToBack(lbl2011);
					  layeredPane.moveToBack(lbl2014);
					  layeredPane.moveToBack(lbl2015);
					  layeredPane.moveToBack(lbl2016);
					  layeredPane.moveToBack(lbl2017);
					  layeredPane.moveToBack(lbl2018);
					  layeredPane.moveToBack(lbl2019);
					  layeredPane.moveToBack(lbl2020);
				    break;
			      case "2014":
			    	  layeredPane.moveToFront(lbl2014);
					  layeredPane.moveToBack(lbl2012);
					  layeredPane.moveToBack(lbl2013);
					  layeredPane.moveToBack(lbl2011);
					  layeredPane.moveToBack(lbl2015);
					  layeredPane.moveToBack(lbl2016);
					  layeredPane.moveToBack(lbl2017);
					  layeredPane.moveToBack(lbl2018);
					  layeredPane.moveToBack(lbl2019);
					  layeredPane.moveToBack(lbl2020);
				  break;
			      case "2015":
			    	  layeredPane.moveToFront(lbl2015);
					  layeredPane.moveToBack(lbl2012);
					  layeredPane.moveToBack(lbl2013);
					  layeredPane.moveToBack(lbl2014);
					  layeredPane.moveToBack(lbl2011);
					  layeredPane.moveToBack(lbl2016);
					  layeredPane.moveToBack(lbl2017);
					  layeredPane.moveToBack(lbl2018);
					  layeredPane.moveToBack(lbl2019);
					  layeredPane.moveToBack(lbl2020);
				  break;
			      case "2016":
			    	  layeredPane.moveToFront(lbl2016);
					  layeredPane.moveToBack(lbl2012);
					  layeredPane.moveToBack(lbl2013);
					  layeredPane.moveToBack(lbl2014);
					  layeredPane.moveToBack(lbl2015);
					  layeredPane.moveToBack(lbl2011);
					  layeredPane.moveToBack(lbl2017);
					  layeredPane.moveToBack(lbl2018);
					  layeredPane.moveToBack(lbl2019);
					  layeredPane.moveToBack(lbl2020);
				  break;
			      case "2017":
			    	  layeredPane.moveToFront(lbl2017);
					  layeredPane.moveToBack(lbl2012);
					  layeredPane.moveToBack(lbl2013);
					  layeredPane.moveToBack(lbl2014);
					  layeredPane.moveToBack(lbl2015);
					  layeredPane.moveToBack(lbl2016);
					  layeredPane.moveToBack(lbl2011);
					  layeredPane.moveToBack(lbl2018);
					  layeredPane.moveToBack(lbl2019);
					  layeredPane.moveToBack(lbl2020);
				  break;
			      case "2018":
			    	  layeredPane.moveToFront(lbl2018);
					  layeredPane.moveToBack(lbl2012);
					  layeredPane.moveToBack(lbl2013);
					  layeredPane.moveToBack(lbl2014);
					  layeredPane.moveToBack(lbl2015);
					  layeredPane.moveToBack(lbl2016);
					  layeredPane.moveToBack(lbl2017);
					  layeredPane.moveToBack(lbl2011);
					  layeredPane.moveToBack(lbl2019);
					  layeredPane.moveToBack(lbl2020);
				  break;
			      case "2019":
			    	  layeredPane.moveToFront(lbl2019);
					  layeredPane.moveToBack(lbl2012);
					  layeredPane.moveToBack(lbl2013);
					  layeredPane.moveToBack(lbl2014);
					  layeredPane.moveToBack(lbl2015);
					  layeredPane.moveToBack(lbl2016);
					  layeredPane.moveToBack(lbl2017);
					  layeredPane.moveToBack(lbl2018);
					  layeredPane.moveToBack(lbl2011);
					  layeredPane.moveToBack(lbl2020);
				  break;
			      case "2020":
			    	  layeredPane.moveToFront(lbl2020);
					  layeredPane.moveToBack(lbl2012);
					  layeredPane.moveToBack(lbl2013);
					  layeredPane.moveToBack(lbl2014);
					  layeredPane.moveToBack(lbl2015);
					  layeredPane.moveToBack(lbl2016);
					  layeredPane.moveToBack(lbl2017);
					  layeredPane.moveToBack(lbl2018);
					  layeredPane.moveToBack(lbl2019);
					  layeredPane.moveToBack(lbl2011);
				  break;
				  default:
					  layeredPane.moveToFront(panel2011);
					  layeredPane.moveToBack(panel2012);
					  layeredPane.moveToBack(lbl2013);
					  layeredPane.moveToBack(lbl2014);
					  layeredPane.moveToBack(lbl2015);
					  layeredPane.moveToBack(lbl2016);
					  layeredPane.moveToBack(lbl2017);
					  layeredPane.moveToBack(lbl2018);
					  layeredPane.moveToBack(lbl2019);
					  layeredPane.moveToBack(lbl2020);*/
				}	
			
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020"}));
		comboBox.setToolTipText("Choisissez votre ann\u00E9e");
		comboBox.setBounds(217, 13, 69, 27);
		sousPanel.add(comboBox);
	
		
				
		
		
		
	}
}
