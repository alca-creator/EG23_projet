import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.GridBagLayout;
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

public class Fenetre_principale {

	public JFrame frmPilotutt;
	private JFrame frmConnexion;
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

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fenetre_principale window = new Fenetre_principale(frmConnexion);
					window.frmPilotutt.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public Fenetre_principale(JFrame frmConnexion) {
		this.frmConnexion = frmConnexion;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPilotutt = new JFrame();
		frmPilotutt.setTitle("Pilot'UTT");
		frmPilotutt.getContentPane().setBackground(Color.WHITE);
		frmPilotutt.setBounds(100, 100, 1081, 723);
		frmPilotutt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPilotutt.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel_menu = new JPanel();
		panel_menu.setForeground(Color.WHITE);
		panel_menu.setBackground(new Color(255, 153, 0));
		frmPilotutt.getContentPane().add(panel_menu, BorderLayout.WEST);
		GridBagLayout gbl_panel_menu = new GridBagLayout();
		gbl_panel_menu.columnWidths = new int[]{0, 0};
		gbl_panel_menu.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_menu.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_menu.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_menu.setLayout(gbl_panel_menu);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setFont(new Font("Bebas", Font.BOLD, 30));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panel_menu.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Gestion des enseignants");
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.addFocusListener(new FocusAdapter() {
		
			@Override
			public void focusLost(FocusEvent e) {
				btnNewButton_1.setForeground(Color.WHITE);
			}
		});
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_gestion_enseignants);
				layeredPane.repaint();
				layeredPane.revalidate();
				btnNewButton_1.setForeground(Color.BLUE);
				
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(255, 153, 0));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 2;
		panel_menu.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Gestion des UEs");
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.setContentAreaFilled(false);
		btnNewButton_3.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				btnNewButton_3.setForeground(Color.WHITE);
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_gestion_ues);
				layeredPane.repaint();
				layeredPane.revalidate();
				btnNewButton_3.setForeground(Color.BLUE);
			}
		});
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_3.gridx = 0;
		gbc_btnNewButton_3.gridy = 3;
		panel_menu.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("R\u00E9partition des \u00E9tudiants");
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				btnNewButton_2.setForeground(Color.WHITE);
			}
		});
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_repartition);
				layeredPane.repaint();
				layeredPane.revalidate();
				btnNewButton_2.setForeground(Color.BLUE);
			}
		});
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 4;
		panel_menu.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("Statistiques des flux entrants et sortants");
		btnNewButton_4.setFocusPainted(false);
		btnNewButton_4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				btnNewButton_4.setForeground(Color.WHITE);
			}
		});
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setContentAreaFilled(false);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_statistiques);
				layeredPane.repaint();
				layeredPane.revalidate();
				btnNewButton_4.setForeground(Color.BLUE);
			}
		});
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_4.gridx = 0;
		gbc_btnNewButton_4.gridy = 5;
		panel_menu.add(btnNewButton_4, gbc_btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Gestion du semestre en cours");
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				btnNewButton_5.setForeground(Color.WHITE);
			}
		});
		btnNewButton_5.setContentAreaFilled(false);
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layeredPane.removeAll();
				layeredPane.add(panel_gestion_semestre);
				layeredPane.repaint();
				layeredPane.revalidate();
				btnNewButton_5.setForeground(Color.BLUE);
			}
		});
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton_5.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton_5.gridx = 0;
		gbc_btnNewButton_5.gridy = 6;
		panel_menu.add(btnNewButton_5, gbc_btnNewButton_5);
		
		JButton btnNewButton = new JButton("Profil");
		btnNewButton.setFocusPainted(false);
		btnNewButton.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				btnNewButton.setForeground(Color.WHITE);
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				layeredPane.removeAll();
				layeredPane.add(panel_profil);
				layeredPane.repaint();
				layeredPane.revalidate();
				btnNewButton.setForeground(Color.BLUE);
				
			}
		});
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 7;
		panel_menu.add(btnNewButton, gbc_btnNewButton);
		
		JPanel panel_header = new JPanel();
		frmPilotutt.getContentPane().add(panel_header, BorderLayout.NORTH);
		panel_header.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Fenetre_principale.class.getResource("/imgs/Fichier 3.png")));
		panel_header.add(lblNewLabel, BorderLayout.WEST);
		
		JButton btnNewButton_7 = new JButton("D\u00E9connexion");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmPilotutt.setVisible(false);
				frmConnexion.setVisible(true);
			}
		});
		panel_header.add(btnNewButton_7, BorderLayout.EAST);
		
		
		frmPilotutt.getContentPane().add(layeredPane, BorderLayout.CENTER);
		layeredPane.setLayout(new CardLayout(0, 0));
		panel_profil.setBorder(null);
		panel_profil.setBackground(Color.WHITE);
		layeredPane.add(panel_profil, "name_123165121508000");
		GridBagLayout gbl_panel_profil = new GridBagLayout();
		gbl_panel_profil.columnWidths = new int[]{228, 82, 34, 145, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_profil.rowHeights = new int[]{70, 27, 54, 19, 19, 21, 55, 21, 0};
		gbl_panel_profil.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_profil.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_profil.setLayout(gbl_panel_profil);
		
		JLabel lblNewLabel_2 = new JLabel("Profil");
		lblNewLabel_2.setFont(new Font("Bebas", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 3;
		gbc_lblNewLabel_2.gridy = 1;
		panel_profil.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nom");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 3;
		panel_profil.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField = new JTextField();
		textField.setToolTipText("Dupont");
		textField.setColumns(10);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.anchor = GridBagConstraints.NORTHWEST;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 3;
		panel_profil.add(textField, gbc_textField);
		
		JLabel lblNewLabel_3_1 = new JLabel("Pr\u00E9nom");
		GridBagConstraints gbc_lblNewLabel_3_1 = new GridBagConstraints();
		gbc_lblNewLabel_3_1.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblNewLabel_3_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3_1.gridx = 1;
		gbc_lblNewLabel_3_1.gridy = 4;
		panel_profil.add(lblNewLabel_3_1, gbc_lblNewLabel_3_1);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Eric");
		textField_1.setText("");
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 4;
		panel_profil.add(textField_1, gbc_textField_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("D\u00E9partement");
		GridBagConstraints gbc_lblNewLabel_3_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_3_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_3_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3_1_1.gridx = 1;
		gbc_lblNewLabel_3_1_1.gridy = 5;
		panel_profil.add(lblNewLabel_3_1_1, gbc_lblNewLabel_3_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ISI", "A2I", "GI", "GM", "MTE", "RT", "TC", "MM"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.anchor = GridBagConstraints.NORTH;
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 5;
		panel_profil.add(comboBox, gbc_comboBox);
		
		JButton btnNewButton_6 = new JButton("Enregistrer");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							String prenom = textField_1.getText();
							Fenetre_confirmation_enregistre window = new Fenetre_confirmation_enregistre(prenom);
							window.frmBonjour.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
		});
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_6.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnNewButton_6.gridx = 3;
		gbc_btnNewButton_6.gridy = 7;
		panel_profil.add(btnNewButton_6, gbc_btnNewButton_6);
		
		
		panel_gestion_ues.setBackground(Color.WHITE);
		layeredPane.add(panel_gestion_ues, "name_123165150412000");
		panel_gestion_ues.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2_1 = new JLabel("Gestion des UES");
		lblNewLabel_2_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_2_1.setFont(new Font("Bebas", Font.PLAIN, 30));
		panel_gestion_ues.add(lblNewLabel_2_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Evolution des effectifs");
		lblNewLabel_2_1_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		panel_gestion_ues.add(lblNewLabel_2_1_1, BorderLayout.WEST);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Fenetre_principale.class.getResource("/imgs/evolution_effectif_exemple.PNG")));
		panel_gestion_ues.add(lblNewLabel_4, BorderLayout.CENTER);
		panel_gestion_enseignants.setBackground(Color.WHITE);
		
		
		layeredPane.add(panel_gestion_enseignants, "name_127261704486600");
		panel_gestion_enseignants.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_gestion_enseignants.add(panel_1, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2_2 = new JLabel("Gestion des enseignants");
		lblNewLabel_2_2.setFont(new Font("Bebas", Font.PLAIN, 30));
		panel_1.add(lblNewLabel_2_2);
		
		JPanel panel_2 = new JPanel();
		panel_gestion_enseignants.add(panel_2, BorderLayout.CENTER);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setViewportBorder(null);
		scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_2.add(scrollPane_1);
		
		JPanel panel_3 = new JPanel();
		scrollPane_1.setViewportView(panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{800, 45, 0};
		gbl_panel_3.rowHeights = new int[]{0, 438, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(Fenetre_principale.class.getResource("/imgs/evolution_entree_sorties (1).png")));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 0;
		panel_3.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Fenetre_principale.class.getResource("/imgs/evolution_entree_sorties (1).png")));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 1;
		panel_3.add(lblNewLabel_6, gbc_lblNewLabel_6);
		panel_repartition.setBackground(Color.WHITE);
		
		
		layeredPane.add(panel_repartition, "name_127286689951600");
		panel_repartition.setLayout(null);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Repartition des etudiants");
		lblNewLabel_2_2_1.setFont(new Font("Bebas", Font.PLAIN, 30));
		lblNewLabel_2_2_1.setBounds(244, 55, 332, 36);
		panel_repartition.add(lblNewLabel_2_2_1);
		panel_gestion_semestre.setBackground(Color.WHITE);
		
		
		layeredPane.add(panel_gestion_semestre, "name_127499013671500");
		panel_gestion_semestre.setLayout(null);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Gestion du semestre en cours");
		lblNewLabel_2_2_1_1.setFont(new Font("Bebas", Font.PLAIN, 30));
		lblNewLabel_2_2_1_1.setBounds(222, 58, 332, 36);
		panel_gestion_semestre.add(lblNewLabel_2_2_1_1);
		panel_statistiques.setBackground(Color.WHITE);
		
		
		layeredPane.add(panel_statistiques, "name_127434009971300");
		GridBagLayout gbl_panel_statistiques = new GridBagLayout();
		gbl_panel_statistiques.columnWidths = new int[]{851, 0};
		gbl_panel_statistiques.rowHeights = new int[]{538, 0};
		gbl_panel_statistiques.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_statistiques.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_statistiques.setLayout(gbl_panel_statistiques);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 0;
		panel_statistiques.add(scrollPane, gbc_scrollPane);
		
		
		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("Statistiques des flux entrants et sortants");
		lblNewLabel_2_2_1_1_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		scrollPane.setColumnHeaderView(lblNewLabel_2_2_1_1_1);
		lblNewLabel_2_2_1_1_1.setFont(new Font("Bebas", Font.PLAIN, 30));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		scrollPane.setViewportView(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Fenetre_principale.class.getResource("/imgs/evolution_entree_sorties (1).png")));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 0;
		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setIcon(new ImageIcon(Fenetre_principale.class.getResource("/imgs/nombre_de_diplomee_2011.png")));
		GridBagConstraints gbc_lblNewLabel_5_1 = new GridBagConstraints();
		gbc_lblNewLabel_5_1.gridx = 0;
		gbc_lblNewLabel_5_1.gridy = 1;
		panel.add(lblNewLabel_5_1, gbc_lblNewLabel_5_1);
	}
}
