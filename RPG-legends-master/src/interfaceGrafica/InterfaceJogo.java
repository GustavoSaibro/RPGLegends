package interfaceGrafica;

import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import view.ArenaView;

public class InterfaceJogo extends JFrame {

	private JPanel contentPane;
	public JTextField txtJogador;
	private AtorJogador atorJogador;
	public String nomeJogador;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceJogo frame = new InterfaceJogo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public InterfaceJogo() {
		atorJogador = new AtorJogador();

		// JFrame
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 653, 489);

		// JPanel 0 (Base0)
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Panel 1 (Base1 Image)
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(10, 11, 409, 700);
		contentPane.add(panel);
		panel.setLayout(null);

		// Label 1 (Image)
		JLabel label1 = new JLabel("");
		label1.setIcon(new ImageIcon(InterfaceJogo.class.getResource("/assets/bg.jpg")));
		label1.setBounds(0, 0, 409, 428);
		panel.add(label1);

		// TextField
		txtJogador = new JTextField();
		txtJogador.setText("Digite aqui seu nome\r\n");
		txtJogador.setBounds(433, 111, 194, 20);
		contentPane.add(txtJogador);
		txtJogador.setColumns(10);

		
		
		// Button 1
		Button button = new Button("CONECTAR");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomeJogador = String.valueOf(txtJogador.getText());
				
				String mensagem = atorJogador.conectar("localhost", nomeJogador);
				JOptionPane.showMessageDialog(null, mensagem);
			}
		});
		button.setForeground(SystemColor.text);
		button.setBackground(new Color(0, 128, 0));
		button.setFont(new Font("Arial", Font.BOLD, 12));
		button.setBounds(429, 202, 198, 23);
		contentPane.add(button);

		// Button 2
		Button button2 = new Button("DESCONECTAR");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nomeJogador = String.valueOf(txtJogador.getText());
				
				String mensagem = atorJogador.desconectar();
				JOptionPane.showMessageDialog(null, mensagem);
			}
		});
		button2.setFont(new Font("Arial", Font.BOLD, 12));
		button2.setForeground(SystemColor.text);
		button2.setBackground(new Color(128, 0, 0));
		button2.setBounds(429, 231, 198, 23);
		contentPane.add(button2);

		// Button 3
		Button button3 = new Button("INICIAR PARTIDA");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensagem = atorJogador.iniciarPartida();
				//ArenaView.setVisible();
				JOptionPane.showMessageDialog(null, mensagem);
			}
		});
		button3.setFont(new Font("Arial", Font.BOLD, 12));
		button3.setBackground(Color.BLACK);
		button3.setForeground(SystemColor.text);
		button3.setBounds(429, 260, 198, 23);
		contentPane.add(button3);

		// Label 2 (Text)
		JLabel label2 = new JLabel("DIGITE SEU NOME");
		label2.setForeground(Color.WHITE);
		label2.setBounds(485, 81, 103, 23);
		contentPane.add(label2);

		// Label 3 (Text)
		JLabel label3 = new JLabel("INE5417 - 04208A");
		label3.setForeground(Color.WHITE);
		label3.setBounds(429, 425, 134, 14);
		contentPane.add(label3);
	}

}