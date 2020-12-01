package view;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import br.ufsc.inf.leobr.cliente.Proxy;
import br.ufsc.inf.leobr.cliente.Jogada;
import br.ufsc.inf.leobr.cliente.OuvidorProxy;
import br.ufsc.inf.leobr.cliente.Proxy;
import br.ufsc.inf.leobr.cliente.exception.ArquivoMultiplayerException;
import br.ufsc.inf.leobr.cliente.exception.JahConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoConectadoException;
import br.ufsc.inf.leobr.cliente.exception.NaoPossivelConectarException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ArenaView extends JFrame {

	private JPanel contentPane;
	protected Proxy proxy;
	protected String nomeAdversario;
	protected String meuNome; 
	//protected String nomeAdversario = String.valueOf(proxy.obterNomeAdversarios());
	//protected String  meuNome = String.valueOf(proxy.getNomeJogador());

	public ArenaView() {
		// JPanel deckPanel = getDeckPanelFlowLayout();
		this.proxy = Proxy.getInstance();
		this.nomeAdversario = String.valueOf(proxy.obterNomeAdversarios());
		this.meuNome = String.valueOf(proxy.getNomeJogador());

		// JFrame
		setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1401, 825);

		// JPanel 0 (Base0)
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// JPanel 1 Deck -- Cards
		JPanel deckPanel = new JPanel();
		deckPanel.setBackground(Color.GRAY);
		deckPanel.setBounds(10, 296, 1348, 427);
		contentPane.add(deckPanel);
		deckPanel.setLayout(null);

//------Button---------------------------------------------------------------------------------------------------------------------------------
		Button exitButton = new Button("DESISTIR");
		exitButton.setBounds(1054, 277, 284, 139);
		deckPanel.add(exitButton);
		exitButton.setBackground(new Color(128, 0, 0));
		exitButton.setForeground(Color.WHITE);
		exitButton.setFont(new Font("Dialog", Font.BOLD, 12));

		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		Button confirmButton = new Button("CONFIRMAR JOGADA");
		confirmButton.setBounds(1054, 132, 284, 139);
		deckPanel.add(confirmButton);
		confirmButton.setFont(new Font("Dialog", Font.BOLD, 12));
		confirmButton.setForeground(Color.WHITE);
		confirmButton.setBackground(new Color(0, 128, 0));

		confirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

//--------------------------------------------------------------------------------------------------------------------------------------------

//------JPanel Card ----------------------------------------------------------------------------------------------------------
		JPanel card = new JPanel();
		card.setBounds(22, 3, 140, 201);
		deckPanel.add(card);
		card.setLayout(null);

		JLabel imgCard1 = new JLabel("", new ImageIcon(ArenaView.class.getResource("/assets/Aatrox.png")),
				JLabel.CENTER);
		imgCard1.setBounds(10, 11, 120, 91);
		card.add(imgCard1);

		JLabel label_1 = new JLabel("health: 33.94");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setForeground(Color.WHITE);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(10, 103, 120, 19);
		card.add(label_1);

		card.setBorder(new EmptyBorder(20, 20, 20, 20));
		card.setBackground(Color.BLACK);
		card.setPreferredSize(new Dimension(140, 275));

		JLabel lblArmor = new JLabel("armor: 50");
		lblArmor.setHorizontalAlignment(SwingConstants.CENTER);
		lblArmor.setForeground(Color.WHITE);
		lblArmor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblArmor.setBounds(10, 122, 120, 19);
		card.add(lblArmor);

		JLabel lblSpell = new JLabel("spell: 95");
		lblSpell.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpell.setForeground(Color.WHITE);
		lblSpell.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSpell.setBounds(10, 142, 120, 19);
		card.add(lblSpell);

		JLabel lblDemage = new JLabel("demage: 250");
		lblDemage.setHorizontalAlignment(SwingConstants.CENTER);
		lblDemage.setForeground(Color.WHITE);
		lblDemage.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDemage.setBounds(10, 161, 120, 19);
		card.add(lblDemage);

		JLabel lblProtection = new JLabel("protection: 100");
		lblProtection.setHorizontalAlignment(SwingConstants.CENTER);
		lblProtection.setForeground(Color.WHITE);
		lblProtection.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProtection.setBounds(10, 180, 120, 19);
		card.add(lblProtection);

//------JPanel Card ----------------------------------------------------------------------------------------------------------
		JPanel card2 = new JPanel();
		card2.setLayout(null);
		card2.setPreferredSize(new Dimension(140, 275));
		card2.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		card2.setBackground(Color.BLACK);
		card2.setBounds(22, 215, 140, 201);
		deckPanel.add(card2);

		JLabel imgCard2 = new JLabel("", new ImageIcon(ArenaView.class.getResource("/assets/Aatrox.png")),
				SwingConstants.CENTER);
		imgCard2.setBounds(10, 11, 120, 91);
		card2.add(imgCard2);

		JLabel label_1_1 = new JLabel("health: 33.94");
		label_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_1.setForeground(Color.WHITE);
		label_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1_1.setBounds(10, 103, 120, 19);
		card2.add(label_1_1);

		JLabel label_1_2 = new JLabel("health: 33.94");
		label_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_2.setForeground(Color.WHITE);
		label_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1_2.setBounds(10, 122, 120, 19);
		card2.add(label_1_2);

		JLabel label_1_3 = new JLabel("health: 33.94");
		label_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_3.setForeground(Color.WHITE);
		label_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1_3.setBounds(10, 142, 120, 19);
		card2.add(label_1_3);

		JLabel label_1_4 = new JLabel("health: 33.94");
		label_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_4.setForeground(Color.WHITE);
		label_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1_4.setBounds(10, 161, 120, 19);
		card2.add(label_1_4);

		JLabel label_1_6 = new JLabel("health: 33.94");
		label_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_6.setForeground(Color.WHITE);
		label_1_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1_6.setBounds(10, 180, 120, 19);
		card2.add(label_1_6);

//------JPanel Card ----------------------------------------------------------------------------------------------------------
		JPanel card3 = new JPanel();
		card3.setLayout(null);
		card3.setPreferredSize(new Dimension(140, 275));
		card3.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		card3.setBackground(Color.BLACK);
		card3.setBounds(194, 3, 140, 201);
		deckPanel.add(card3);

		JLabel imgLabel_2 = new JLabel("", new ImageIcon(ArenaView.class.getResource("/assets/Aatrox.png")),
				SwingConstants.CENTER);
		imgLabel_2.setBounds(10, 11, 120, 91);
		card3.add(imgLabel_2);

		JLabel label_1_7 = new JLabel("health: 33.94");
		label_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_7.setForeground(Color.WHITE);
		label_1_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1_7.setBounds(10, 103, 120, 19);
		card3.add(label_1_7);

		JLabel lblArmor_1 = new JLabel("armor: 50");
		lblArmor_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblArmor_1.setForeground(Color.WHITE);
		lblArmor_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblArmor_1.setBounds(10, 122, 120, 19);
		card3.add(lblArmor_1);

		JLabel lblSpell_1 = new JLabel("spell: 95");
		lblSpell_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpell_1.setForeground(Color.WHITE);
		lblSpell_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSpell_1.setBounds(10, 142, 120, 19);
		card3.add(lblSpell_1);

		JLabel lblDemage_1 = new JLabel("demage: 250");
		lblDemage_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDemage_1.setForeground(Color.WHITE);
		lblDemage_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDemage_1.setBounds(10, 161, 120, 19);
		card3.add(lblDemage_1);

		JLabel lblProtection_1 = new JLabel("protection: 100");
		lblProtection_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblProtection_1.setForeground(Color.WHITE);
		lblProtection_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProtection_1.setBounds(10, 180, 120, 19);
		card3.add(lblProtection_1);

//------JPanel Card ----------------------------------------------------------------------------------------------------------
		JPanel card4 = new JPanel();
		card4.setLayout(null);
		card4.setPreferredSize(new Dimension(140, 275));
		card4.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		card4.setBackground(Color.BLACK);
		card4.setBounds(371, 3, 140, 201);
		deckPanel.add(card4);

		JLabel imgLabel_2_1 = new JLabel("", new ImageIcon(ArenaView.class.getResource("/assets/Aatrox.png")),
				SwingConstants.CENTER);
		imgLabel_2_1.setBounds(10, 11, 120, 91);
		card4.add(imgLabel_2_1);

		JLabel label_1_7_1 = new JLabel("health: 33.94");
		label_1_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_7_1.setForeground(Color.WHITE);
		label_1_7_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1_7_1.setBounds(10, 103, 120, 19);
		card4.add(label_1_7_1);

		JLabel lblArmor_1_1 = new JLabel("armor: 50");
		lblArmor_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblArmor_1_1.setForeground(Color.WHITE);
		lblArmor_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblArmor_1_1.setBounds(10, 122, 120, 19);
		card4.add(lblArmor_1_1);

		JLabel lblSpell_1_1 = new JLabel("spell: 95");
		lblSpell_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpell_1_1.setForeground(Color.WHITE);
		lblSpell_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSpell_1_1.setBounds(10, 142, 120, 19);
		card4.add(lblSpell_1_1);

		JLabel lblDemage_1_1 = new JLabel("demage: 250");
		lblDemage_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDemage_1_1.setForeground(Color.WHITE);
		lblDemage_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDemage_1_1.setBounds(10, 161, 120, 19);
		card4.add(lblDemage_1_1);

		JLabel lblProtection_1_1 = new JLabel("protection: 100");
		lblProtection_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblProtection_1_1.setForeground(Color.WHITE);
		lblProtection_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProtection_1_1.setBounds(10, 180, 120, 19);
		card4.add(lblProtection_1_1);

//------JPanel Card ----------------------------------------------------------------------------------------------------------
		JPanel card5 = new JPanel();
		card5.setLayout(null);
		card5.setPreferredSize(new Dimension(140, 275));
		card5.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		card5.setBackground(Color.BLACK);
		card5.setBounds(545, 3, 140, 201);
		deckPanel.add(card5);

		JLabel imgLabel_2_1_1 = new JLabel("", new ImageIcon(ArenaView.class.getResource("/assets/Aatrox.png")),
				SwingConstants.CENTER);
		imgLabel_2_1_1.setBounds(10, 11, 120, 91);
		card5.add(imgLabel_2_1_1);

		JLabel label_1_7_1_1 = new JLabel("health: 33.94");
		label_1_7_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_7_1_1.setForeground(Color.WHITE);
		label_1_7_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1_7_1_1.setBounds(10, 103, 120, 19);
		card5.add(label_1_7_1_1);

		JLabel lblArmor_1_1_1 = new JLabel("armor: 50");
		lblArmor_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblArmor_1_1_1.setForeground(Color.WHITE);
		lblArmor_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblArmor_1_1_1.setBounds(10, 122, 120, 19);
		card5.add(lblArmor_1_1_1);

		JLabel lblSpell_1_1_1 = new JLabel("spell: 95");
		lblSpell_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpell_1_1_1.setForeground(Color.WHITE);
		lblSpell_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSpell_1_1_1.setBounds(10, 142, 120, 19);
		card5.add(lblSpell_1_1_1);

		JLabel lblDemage_1_1_1 = new JLabel("demage: 250");
		lblDemage_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDemage_1_1_1.setForeground(Color.WHITE);
		lblDemage_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDemage_1_1_1.setBounds(10, 161, 120, 19);
		card5.add(lblDemage_1_1_1);

		JLabel lblProtection_1_1_1 = new JLabel("protection: 100");
		lblProtection_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblProtection_1_1_1.setForeground(Color.WHITE);
		lblProtection_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProtection_1_1_1.setBounds(10, 180, 120, 19);
		card5.add(lblProtection_1_1_1);

//------JPanel Card ----------------------------------------------------------------------------------------------------------
		JPanel card6 = new JPanel();
		card6.setLayout(null);
		card6.setPreferredSize(new Dimension(140, 275));
		card6.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		card6.setBackground(Color.BLACK);
		card6.setBounds(720, 3, 140, 201);
		deckPanel.add(card6);

		JLabel imgLabel_2_1_1_1 = new JLabel("", new ImageIcon(ArenaView.class.getResource("/assets/Aatrox.png")),
				SwingConstants.CENTER);
		imgLabel_2_1_1_1.setBounds(10, 11, 120, 91);
		card6.add(imgLabel_2_1_1_1);

		JLabel label_1_7_1_1_1 = new JLabel("health: 33.94");
		label_1_7_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_7_1_1_1.setForeground(Color.WHITE);
		label_1_7_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1_7_1_1_1.setBounds(10, 103, 120, 19);
		card6.add(label_1_7_1_1_1);

		JLabel lblArmor_1_1_1_1 = new JLabel("armor: 50");
		lblArmor_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblArmor_1_1_1_1.setForeground(Color.WHITE);
		lblArmor_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblArmor_1_1_1_1.setBounds(10, 122, 120, 19);
		card6.add(lblArmor_1_1_1_1);

		JLabel lblSpell_1_1_1_1 = new JLabel("spell: 95");
		lblSpell_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpell_1_1_1_1.setForeground(Color.WHITE);
		lblSpell_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSpell_1_1_1_1.setBounds(10, 142, 120, 19);
		card6.add(lblSpell_1_1_1_1);

		JLabel lblDemage_1_1_1_1 = new JLabel("demage: 250");
		lblDemage_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDemage_1_1_1_1.setForeground(Color.WHITE);
		lblDemage_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDemage_1_1_1_1.setBounds(10, 161, 120, 19);
		card6.add(lblDemage_1_1_1_1);

		JLabel lblProtection_1_1_1_1 = new JLabel("protection: 100");
		lblProtection_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblProtection_1_1_1_1.setForeground(Color.WHITE);
		lblProtection_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProtection_1_1_1_1.setBounds(10, 180, 120, 19);
		card6.add(lblProtection_1_1_1_1);

//------JPanel Card ----------------------------------------------------------------------------------------------------------
		JPanel card7 = new JPanel();
		card7.setLayout(null);
		card7.setPreferredSize(new Dimension(140, 275));
		card7.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		card7.setBackground(Color.BLACK);
		card7.setBounds(895, 3, 140, 201);
		deckPanel.add(card7);

		JLabel imgLabel_2_1_1_1_1 = new JLabel("", new ImageIcon(ArenaView.class.getResource("/assets/Aatrox.png")),
				SwingConstants.CENTER);
		imgLabel_2_1_1_1_1.setBounds(10, 11, 120, 91);
		card7.add(imgLabel_2_1_1_1_1);

		JLabel label_1_7_1_1_1_1 = new JLabel("health: 33.94");
		label_1_7_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_7_1_1_1_1.setForeground(Color.WHITE);
		label_1_7_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1_7_1_1_1_1.setBounds(10, 103, 120, 19);
		card7.add(label_1_7_1_1_1_1);

		JLabel lblArmor_1_1_1_1_1 = new JLabel("armor: 50");
		lblArmor_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblArmor_1_1_1_1_1.setForeground(Color.WHITE);
		lblArmor_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblArmor_1_1_1_1_1.setBounds(10, 122, 120, 19);
		card7.add(lblArmor_1_1_1_1_1);

		JLabel lblSpell_1_1_1_1_1 = new JLabel("spell: 95");
		lblSpell_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpell_1_1_1_1_1.setForeground(Color.WHITE);
		lblSpell_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSpell_1_1_1_1_1.setBounds(10, 142, 120, 19);
		card7.add(lblSpell_1_1_1_1_1);

		JLabel lblDemage_1_1_1_1_1 = new JLabel("demage: 250");
		lblDemage_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDemage_1_1_1_1_1.setForeground(Color.WHITE);
		lblDemage_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDemage_1_1_1_1_1.setBounds(10, 161, 120, 19);
		card7.add(lblDemage_1_1_1_1_1);

		JLabel lblProtection_1_1_1_1_1 = new JLabel("protection: 100");
		lblProtection_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblProtection_1_1_1_1_1.setForeground(Color.WHITE);
		lblProtection_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProtection_1_1_1_1_1.setBounds(10, 180, 120, 19);
		card7.add(lblProtection_1_1_1_1_1);

//------JPanel Card ----------------------------------------------------------------------------------------------------------
		JPanel card8 = new JPanel();
		card8.setLayout(null);
		card8.setPreferredSize(new Dimension(140, 275));
		card8.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		card8.setBackground(Color.BLACK);
		card8.setBounds(895, 215, 140, 201);
		deckPanel.add(card8);

		JLabel imgLabel_2_1_1_1_1_1 = new JLabel("", new ImageIcon(ArenaView.class.getResource("/assets/Aatrox.png")),
				SwingConstants.CENTER);
		imgLabel_2_1_1_1_1_1.setBounds(10, 11, 120, 91);
		card8.add(imgLabel_2_1_1_1_1_1);

		JLabel label_1_7_1_1_1_1_1 = new JLabel("health: 33.94");
		label_1_7_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_7_1_1_1_1_1.setForeground(Color.WHITE);
		label_1_7_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1_7_1_1_1_1_1.setBounds(10, 103, 120, 19);
		card8.add(label_1_7_1_1_1_1_1);

		JLabel lblArmor_1_1_1_1_1_1 = new JLabel("armor: 50");
		lblArmor_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblArmor_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblArmor_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblArmor_1_1_1_1_1_1.setBounds(10, 122, 120, 19);
		card8.add(lblArmor_1_1_1_1_1_1);

		JLabel lblSpell_1_1_1_1_1_1 = new JLabel("spell: 95");
		lblSpell_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpell_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblSpell_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSpell_1_1_1_1_1_1.setBounds(10, 142, 120, 19);
		card8.add(lblSpell_1_1_1_1_1_1);

		JLabel lblDemage_1_1_1_1_1_1 = new JLabel("demage: 250");
		lblDemage_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblDemage_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblDemage_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDemage_1_1_1_1_1_1.setBounds(10, 161, 120, 19);
		card8.add(lblDemage_1_1_1_1_1_1);

		JLabel lblProtection_1_1_1_1_1_1 = new JLabel("protection: 100");
		lblProtection_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblProtection_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblProtection_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProtection_1_1_1_1_1_1.setBounds(10, 180, 120, 19);
		card8.add(lblProtection_1_1_1_1_1_1);

//------JPanel Card ----------------------------------------------------------------------------------------------------------
		JPanel card9 = new JPanel();
		card9.setLayout(null);
		card9.setPreferredSize(new Dimension(140, 275));
		card9.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		card9.setBackground(Color.BLACK);
		card9.setBounds(720, 215, 140, 201);
		deckPanel.add(card9);

		JLabel imgLabel_2_2 = new JLabel("", new ImageIcon(ArenaView.class.getResource("/assets/Aatrox.png")),
				SwingConstants.CENTER);
		imgLabel_2_2.setBounds(10, 11, 120, 91);
		card9.add(imgLabel_2_2);

		JLabel label_1_7_2 = new JLabel("health: 33.94");
		label_1_7_2.setBackground(new Color(105, 105, 105));
		label_1_7_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_7_2.setForeground(Color.WHITE);
		label_1_7_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1_7_2.setBounds(10, 103, 120, 19);
		card9.add(label_1_7_2);

		JLabel lblArmor_1_2 = new JLabel("armor: 50");
		lblArmor_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblArmor_1_2.setForeground(Color.WHITE);
		lblArmor_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblArmor_1_2.setBounds(10, 122, 120, 19);
		card9.add(lblArmor_1_2);

		JLabel lblSpell_1_2 = new JLabel("spell: 95");
		lblSpell_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpell_1_2.setForeground(Color.WHITE);
		lblSpell_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSpell_1_2.setBounds(10, 142, 120, 19);
		card9.add(lblSpell_1_2);

		JLabel lblDemage_1_2 = new JLabel("demage: 250");
		lblDemage_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblDemage_1_2.setForeground(Color.WHITE);
		lblDemage_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDemage_1_2.setBounds(10, 161, 120, 19);
		card9.add(lblDemage_1_2);

		JLabel lblProtection_1_2 = new JLabel("protection: 100");
		lblProtection_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblProtection_1_2.setForeground(Color.WHITE);
		lblProtection_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProtection_1_2.setBounds(10, 180, 120, 19);
		card9.add(lblProtection_1_2);

//------JPanel Card ----------------------------------------------------------------------------------------------------------
		JPanel card10 = new JPanel();
		card10.setLayout(null);
		card10.setPreferredSize(new Dimension(140, 275));
		card10.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		card10.setBackground(Color.BLACK);
		card10.setBounds(545, 215, 140, 201);
		deckPanel.add(card10);

		JLabel imgLabel_2_3 = new JLabel("", new ImageIcon(ArenaView.class.getResource("/assets/Aatrox.png")),
				SwingConstants.CENTER);
		imgLabel_2_3.setBounds(10, 11, 120, 91);
		card10.add(imgLabel_2_3);

		JLabel label_1_7_3 = new JLabel("health: 33.94");
		label_1_7_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_7_3.setForeground(Color.WHITE);
		label_1_7_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1_7_3.setBounds(10, 103, 120, 19);
		card10.add(label_1_7_3);

		JLabel lblArmor_1_3 = new JLabel("armor: 50");
		lblArmor_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblArmor_1_3.setForeground(Color.WHITE);
		lblArmor_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblArmor_1_3.setBounds(10, 122, 120, 19);
		card10.add(lblArmor_1_3);

		JLabel lblSpell_1_3 = new JLabel("spell: 95");
		lblSpell_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpell_1_3.setForeground(Color.WHITE);
		lblSpell_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSpell_1_3.setBounds(10, 142, 120, 19);
		card10.add(lblSpell_1_3);

		JLabel lblDemage_1_3 = new JLabel("demage: 250");
		lblDemage_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblDemage_1_3.setForeground(Color.WHITE);
		lblDemage_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDemage_1_3.setBounds(10, 161, 120, 19);
		card10.add(lblDemage_1_3);

		JLabel lblProtection_1_3 = new JLabel("protection: 100");
		lblProtection_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblProtection_1_3.setForeground(Color.WHITE);
		lblProtection_1_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProtection_1_3.setBounds(10, 180, 120, 19);
		card10.add(lblProtection_1_3);

//------JPanel Card ----------------------------------------------------------------------------------------------------------
		JPanel card11 = new JPanel();
		card11.setLayout(null);
		card11.setPreferredSize(new Dimension(140, 275));
		card11.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		card11.setBackground(Color.BLACK);
		card11.setBounds(371, 215, 140, 201);
		deckPanel.add(card11);

		JLabel imgLabel_2_4 = new JLabel("", new ImageIcon(ArenaView.class.getResource("/assets/Aatrox.png")),
				SwingConstants.CENTER);
		imgLabel_2_4.setBounds(10, 11, 120, 91);
		card11.add(imgLabel_2_4);

		JLabel label_1_7_4 = new JLabel("health: 33.94");
		label_1_7_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_7_4.setForeground(Color.WHITE);
		label_1_7_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1_7_4.setBounds(10, 103, 120, 19);
		card11.add(label_1_7_4);

		JLabel lblArmor_1_4 = new JLabel("armor: 50");
		lblArmor_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblArmor_1_4.setForeground(Color.WHITE);
		lblArmor_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblArmor_1_4.setBounds(10, 122, 120, 19);
		card11.add(lblArmor_1_4);

		JLabel lblSpell_1_4 = new JLabel("spell: 95");
		lblSpell_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpell_1_4.setForeground(Color.WHITE);
		lblSpell_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSpell_1_4.setBounds(10, 142, 120, 19);
		card11.add(lblSpell_1_4);

		JLabel lblDemage_1_4 = new JLabel("demage: 250");
		lblDemage_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblDemage_1_4.setForeground(Color.WHITE);
		lblDemage_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDemage_1_4.setBounds(10, 161, 120, 19);
		card11.add(lblDemage_1_4);

		JLabel lblProtection_1_4 = new JLabel("protection: 100");
		lblProtection_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblProtection_1_4.setForeground(Color.WHITE);
		lblProtection_1_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProtection_1_4.setBounds(10, 180, 120, 19);
		card11.add(lblProtection_1_4);

//------JPanel Card ----------------------------------------------------------------------------------------------------------
		JPanel card12 = new JPanel();
		card12.setLayout(null);
		card12.setPreferredSize(new Dimension(140, 275));
		card12.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		card12.setBackground(Color.BLACK);
		card12.setBounds(194, 215, 140, 201);
		deckPanel.add(card12);

		JLabel imgLabel_2_5 = new JLabel("", new ImageIcon(ArenaView.class.getResource("/assets/Aatrox.png")),
				SwingConstants.CENTER);
		imgLabel_2_5.setBounds(10, 11, 120, 91);
		card12.add(imgLabel_2_5);

		JLabel label_1_7_5 = new JLabel("health: 33.94");
		label_1_7_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_7_5.setForeground(Color.WHITE);
		label_1_7_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1_7_5.setBounds(10, 103, 120, 19);
		card12.add(label_1_7_5);

		JLabel lblArmor_1_5 = new JLabel("armor: 50");
		lblArmor_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblArmor_1_5.setForeground(Color.WHITE);
		lblArmor_1_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblArmor_1_5.setBounds(10, 122, 120, 19);
		card12.add(lblArmor_1_5);

		JLabel lblSpell_1_5 = new JLabel("spell: 95");
		lblSpell_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpell_1_5.setForeground(Color.WHITE);
		lblSpell_1_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSpell_1_5.setBounds(10, 142, 120, 19);
		card12.add(lblSpell_1_5);

		JLabel lblDemage_1_5 = new JLabel("demage: 250");
		lblDemage_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblDemage_1_5.setForeground(Color.WHITE);
		lblDemage_1_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDemage_1_5.setBounds(10, 161, 120, 19);
		card12.add(lblDemage_1_5);

		JLabel lblProtection_1_5 = new JLabel("protection: 100");
		lblProtection_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblProtection_1_5.setForeground(Color.WHITE);
		lblProtection_1_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProtection_1_5.setBounds(10, 180, 120, 19);
		card12.add(lblProtection_1_5);

//------JLabel avisos----------------------------------------------------------------------------------------------------------
		JLabel lblNewLabel = new JLabel("SELECIONE 3 CARTAS POR RODADA");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(1054, 30, 284, 14);
		deckPanel.add(lblNewLabel);

		JLabel lblEConfirmeSua = new JLabel("E CONFIRME SUA JOGADA");
		lblEConfirmeSua.setForeground(Color.WHITE);
		lblEConfirmeSua.setFont(new Font("Consolas", Font.BOLD, 16));
		lblEConfirmeSua.setHorizontalAlignment(SwingConstants.CENTER);
		lblEConfirmeSua.setBounds(1054, 55, 284, 14);
		deckPanel.add(lblEConfirmeSua);

		JLabel lblNewLabel_1 = new JLabel("0 DE 3 CARTAS SELECIONADAS");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(1062, 100, 276, 14);
		deckPanel.add(lblNewLabel_1);
//--------------------------------------------------------------------------------------------------------------------------------------------

//------Panel Duelo------------------------------------------------------------------------------------------------------------------------------
		JPanel dueloPanel = new JPanel();
		dueloPanel.setBackground(Color.GRAY);
		dueloPanel.setLayout(null);
		dueloPanel.setBounds(10, 11, 1348, 274);
		contentPane.add(dueloPanel);

// Player 1 Cards
		JPanel card_duelo1 = new JPanel();
		card_duelo1.setForeground(Color.GRAY);
		card_duelo1.setLayout(null);
		card_duelo1.setPreferredSize(new Dimension(140, 275));
		card_duelo1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		card_duelo1.setBackground(Color.DARK_GRAY);
		card_duelo1.setBounds(1048, 11, 140, 251);
		dueloPanel.add(card_duelo1);

		JLabel label_10 = new JLabel("", new ImageIcon(ArenaView.class.getResource("/assets/Aatrox.png")),
				SwingConstants.CENTER);
		label_10.setBounds(10, 11, 120, 120);
		card_duelo1.add(label_10);

		JLabel label_1_5 = new JLabel("health: 33.94");
		label_1_5.setForeground(new Color(255, 255, 255));
		label_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_5.setBounds(10, 150, 120, 14);
		card_duelo1.add(label_1_5);

		JLabel label_2_5 = new JLabel("armor:  50");
		label_2_5.setForeground(Color.WHITE);
		label_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_2_5.setBounds(10, 169, 120, 14);
		card_duelo1.add(label_2_5);

		JLabel label_3_5 = new JLabel("spell:  95");
		label_3_5.setForeground(Color.WHITE);
		label_3_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_3_5.setBounds(10, 188, 120, 14);
		card_duelo1.add(label_3_5);

		JLabel label_4_5 = new JLabel("damage: 250");
		label_4_5.setForeground(Color.WHITE);
		label_4_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_4_5.setBounds(10, 207, 120, 14);
		card_duelo1.add(label_4_5);

		JLabel label_5_5 = new JLabel("protection: 100");
		label_5_5.setForeground(Color.WHITE);
		label_5_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5_5.setBounds(10, 226, 120, 14);
		card_duelo1.add(label_5_5);

		JPanel card_duelo2 = new JPanel();
		card_duelo2.setForeground(Color.GRAY);
		card_duelo2.setLayout(null);
		card_duelo2.setPreferredSize(new Dimension(140, 275));
		card_duelo2.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		card_duelo2.setBackground(Color.DARK_GRAY);
		card_duelo2.setBounds(1198, 11, 140, 251);
		dueloPanel.add(card_duelo2);

		JLabel label_6_1 = new JLabel("", new ImageIcon(ArenaView.class.getResource("/assets/Aatrox.png")),
				SwingConstants.CENTER);
		label_6_1.setBounds(10, 11, 120, 120);
		card_duelo2.add(label_6_1);

		JLabel label_1_1_1 = new JLabel("health: 33.94");
		label_1_1_1.setForeground(Color.WHITE);
		label_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_1_1.setBounds(10, 150, 120, 14);
		card_duelo2.add(label_1_1_1);

		JLabel label_2_1_1 = new JLabel("armor:  50");
		label_2_1_1.setForeground(Color.WHITE);
		label_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_2_1_1.setBounds(10, 169, 120, 14);
		card_duelo2.add(label_2_1_1);

		JLabel label_3_1_1 = new JLabel("spell:  95");
		label_3_1_1.setForeground(Color.WHITE);
		label_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_3_1_1.setBounds(10, 188, 120, 14);
		card_duelo2.add(label_3_1_1);

		JLabel label_4_1_1 = new JLabel("damage: 250");
		label_4_1_1.setForeground(Color.WHITE);
		label_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_4_1_1.setBounds(10, 207, 120, 14);
		card_duelo2.add(label_4_1_1);

		JLabel label_5_1_1 = new JLabel("protection: 100");
		label_5_1_1.setForeground(Color.WHITE);
		label_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_5_1_1.setBounds(10, 226, 120, 14);
		card_duelo2.add(label_5_1_1);

		JPanel card_duelo3 = new JPanel();
		card_duelo3.setLayout(null);
		card_duelo3.setPreferredSize(new Dimension(140, 275));
		card_duelo3.setForeground(Color.GRAY);
		card_duelo3.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		card_duelo3.setBackground(Color.DARK_GRAY);
		card_duelo3.setBounds(898, 11, 140, 251);
		dueloPanel.add(card_duelo3);

		JLabel label_10_1 = new JLabel("", new ImageIcon(ArenaView.class.getResource("/assets/Aatrox.png")),
				SwingConstants.CENTER);
		label_10_1.setBounds(10, 11, 120, 120);
		card_duelo3.add(label_10_1);

		JLabel label_1_5_1 = new JLabel("health: 33.94");
		label_1_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_5_1.setForeground(Color.WHITE);
		label_1_5_1.setBounds(10, 150, 120, 14);
		card_duelo3.add(label_1_5_1);

		JLabel label_2_5_1 = new JLabel("armor:  50");
		label_2_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_2_5_1.setForeground(Color.WHITE);
		label_2_5_1.setBounds(10, 169, 120, 14);
		card_duelo3.add(label_2_5_1);

		JLabel label_3_5_1 = new JLabel("spell:  95");
		label_3_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_3_5_1.setForeground(Color.WHITE);
		label_3_5_1.setBounds(10, 188, 120, 14);
		card_duelo3.add(label_3_5_1);

		JLabel label_4_5_1 = new JLabel("damage: 250");
		label_4_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_4_5_1.setForeground(Color.WHITE);
		label_4_5_1.setBounds(10, 207, 120, 14);
		card_duelo3.add(label_4_5_1);

		JLabel label_5_5_1 = new JLabel("protection: 100");
		label_5_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_5_5_1.setForeground(Color.WHITE);
		label_5_5_1.setBounds(10, 226, 120, 14);
		card_duelo3.add(label_5_5_1);

//Placar------------------------------------------------------------------------------------------------------------------------------------------------
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(460, 11, 428, 251);
		dueloPanel.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel_4_1 = new JLabel("0");
		lblNewLabel_4_1.setBounds(328, 112, 39, 82);
		panel.add(lblNewLabel_4_1);
		lblNewLabel_4_1.setFont(new Font("Arial", Font.BOLD, 70));
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblNewLabel_3 = new JLabel("X");
		lblNewLabel_3.setBounds(47, 94, 335, 121);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Segoe Print", Font.BOLD, 59));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblNewLabel_4_1_1 = new JLabel("0");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setFont(new Font("Arial", Font.BOLD, 70));
		lblNewLabel_4_1_1.setBounds(61, 112, 39, 82);
		panel.add(lblNewLabel_4_1_1);

		JLabel playerLabel2 = new JLabel("["+meuNome+"]");
		playerLabel2.setBounds(328, 41, 90, 16);
		panel.add(playerLabel2);
		playerLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		playerLabel2.setFont(new Font("Tahoma", Font.BOLD, 13));

		JLabel rodadaLabel = new JLabel("RODADA 1");
		rodadaLabel.setBounds(10, 11, 408, 19);
		panel.add(rodadaLabel);
		rodadaLabel.setHorizontalAlignment(SwingConstants.CENTER);
		rodadaLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));

		JLabel playerLabel1 = new JLabel(nomeAdversario);
		playerLabel1.setBounds(10, 41, 90, 16);
		panel.add(playerLabel1);
		playerLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		playerLabel1.setFont(new Font("Tahoma", Font.BOLD, 13));
//Placar------------------------------------------------------------------------------------------------------------------------------------------------

//Player 2 Cards ------------------------------------------------------------------------------------------------------------------------------------
		JPanel card_duelo4 = new JPanel();
		card_duelo4.setLayout(null);
		card_duelo4.setPreferredSize(new Dimension(140, 275));
		card_duelo4.setForeground(Color.GRAY);
		card_duelo4.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		card_duelo4.setBackground(Color.DARK_GRAY);
		card_duelo4.setBounds(10, 11, 140, 251);
		dueloPanel.add(card_duelo4);

		JLabel label_10_1_1 = new JLabel("", new ImageIcon(ArenaView.class.getResource("/assets/Aatrox.png")),
				SwingConstants.CENTER);
		label_10_1_1.setBounds(10, 11, 120, 120);
		card_duelo4.add(label_10_1_1);

		JLabel label_1_5_1_1 = new JLabel("health: 33.94");
		label_1_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_5_1_1.setForeground(Color.WHITE);
		label_1_5_1_1.setBounds(10, 150, 120, 14);
		card_duelo4.add(label_1_5_1_1);

		JLabel label_2_5_1_1 = new JLabel("armor:  50");
		label_2_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_2_5_1_1.setForeground(Color.WHITE);
		label_2_5_1_1.setBounds(10, 169, 120, 14);
		card_duelo4.add(label_2_5_1_1);

		JLabel label_3_5_1_1 = new JLabel("spell:  95");
		label_3_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_3_5_1_1.setForeground(Color.WHITE);
		label_3_5_1_1.setBounds(10, 188, 120, 14);
		card_duelo4.add(label_3_5_1_1);

		JLabel label_4_5_1_1 = new JLabel("damage: 250");
		label_4_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_4_5_1_1.setForeground(Color.WHITE);
		label_4_5_1_1.setBounds(10, 207, 120, 14);
		card_duelo4.add(label_4_5_1_1);

		JLabel label_5_5_1_1 = new JLabel("protection: 100");
		label_5_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_5_5_1_1.setForeground(Color.WHITE);
		label_5_5_1_1.setBounds(10, 226, 120, 14);
		card_duelo4.add(label_5_5_1_1);

		JPanel card_duelo5 = new JPanel();
		card_duelo5.setLayout(null);
		card_duelo5.setPreferredSize(new Dimension(140, 275));
		card_duelo5.setForeground(Color.GRAY);
		card_duelo5.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		card_duelo5.setBackground(Color.DARK_GRAY);
		card_duelo5.setBounds(160, 11, 140, 251);
		dueloPanel.add(card_duelo5);

		JLabel label_10_1_1_1 = new JLabel("", new ImageIcon(ArenaView.class.getResource("/assets/Aatrox.png")),
				SwingConstants.CENTER);
		label_10_1_1_1.setBounds(10, 11, 120, 120);
		card_duelo5.add(label_10_1_1_1);

		JLabel label_1_5_1_1_1 = new JLabel("health: 33.94");
		label_1_5_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_5_1_1_1.setForeground(Color.WHITE);
		label_1_5_1_1_1.setBounds(10, 150, 120, 14);
		card_duelo5.add(label_1_5_1_1_1);

		JLabel label_2_5_1_1_1 = new JLabel("armor:  50");
		label_2_5_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_2_5_1_1_1.setForeground(Color.WHITE);
		label_2_5_1_1_1.setBounds(10, 169, 120, 14);
		card_duelo5.add(label_2_5_1_1_1);

		JLabel label_3_5_1_1_1 = new JLabel("spell:  95");
		label_3_5_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_3_5_1_1_1.setForeground(Color.WHITE);
		label_3_5_1_1_1.setBounds(10, 188, 120, 14);
		card_duelo5.add(label_3_5_1_1_1);

		JLabel label_4_5_1_1_1 = new JLabel("damage: 250");
		label_4_5_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_4_5_1_1_1.setForeground(Color.WHITE);
		label_4_5_1_1_1.setBounds(10, 207, 120, 14);
		card_duelo5.add(label_4_5_1_1_1);

		JLabel label_5_5_1_1_1 = new JLabel("protection: 100");
		label_5_5_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_5_5_1_1_1.setForeground(Color.WHITE);
		label_5_5_1_1_1.setBounds(10, 226, 120, 14);
		card_duelo5.add(label_5_5_1_1_1);

		JPanel card_duelo6 = new JPanel();
		card_duelo6.setLayout(null);
		card_duelo6.setPreferredSize(new Dimension(140, 275));
		card_duelo6.setForeground(Color.GRAY);
		card_duelo6.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		card_duelo6.setBackground(Color.DARK_GRAY);
		card_duelo6.setBounds(310, 11, 140, 251);
		dueloPanel.add(card_duelo6);

		JLabel label_10_1_1_2 = new JLabel("", new ImageIcon(ArenaView.class.getResource("/assets/Aatrox.png")),
				SwingConstants.CENTER);
		label_10_1_1_2.setBounds(10, 11, 120, 120);
		card_duelo6.add(label_10_1_1_2);

		JLabel label_1_5_1_1_2 = new JLabel("health: 33.94");
		label_1_5_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_1_5_1_1_2.setForeground(Color.WHITE);
		label_1_5_1_1_2.setBounds(10, 150, 120, 14);
		card_duelo6.add(label_1_5_1_1_2);

		JLabel label_2_5_1_1_2 = new JLabel("armor:  50");
		label_2_5_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2_5_1_1_2.setForeground(Color.WHITE);
		label_2_5_1_1_2.setBounds(10, 169, 120, 14);
		card_duelo6.add(label_2_5_1_1_2);

		JLabel label_3_5_1_1_2 = new JLabel("spell:  95");
		label_3_5_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_3_5_1_1_2.setForeground(Color.WHITE);
		label_3_5_1_1_2.setBounds(10, 188, 120, 14);
		card_duelo6.add(label_3_5_1_1_2);

		JLabel label_4_5_1_1_2 = new JLabel("damage: 250");
		label_4_5_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_4_5_1_1_2.setForeground(Color.WHITE);
		label_4_5_1_1_2.setBounds(10, 207, 120, 14);
		card_duelo6.add(label_4_5_1_1_2);

		JLabel label_5_5_1_1_2 = new JLabel("protection: 100");
		label_5_5_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_5_5_1_1_2.setForeground(Color.WHITE);
		label_5_5_1_1_2.setBounds(10, 226, 120, 14);
		card_duelo6.add(label_5_5_1_1_2);

	}
//--------------------------------------------------------------------------------------------------------------------------------------

	public static void setVisible() {
		ArenaView frame = new ArenaView();
		frame.setVisible(true);
	}

	public static void setNotVisible() {
		ArenaView frame = new ArenaView();
		frame.setVisible(false);
	}
}
