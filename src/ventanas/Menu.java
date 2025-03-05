package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Inicio de Sesion");
		btnNewButton.addActionListener(new ActionListener() {
			
			//Inicio de sesion
			public void actionPerformed(ActionEvent e) {
				Principal Principal = new Principal();
				Principal.setVisible(true);          
				dispose();                            
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(10, 72, 196, 35);
		contentPane.add(btnNewButton);
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMenu.setBounds(185, 11, 71, 23);
		contentPane.add(lblMenu);
		
		JButton btnConfiguracion = new JButton("Configuracion");
		btnConfiguracion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Configuracion Configuracion = new Configuracion();
				Configuracion.setVisible(true);          
				dispose();     
			}
		});
		btnConfiguracion.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnConfiguracion.setBounds(230, 72, 196, 35);
		contentPane.add(btnConfiguracion);
		
		JButton btnConfiguracion_1 = new JButton("Sonidos");
		btnConfiguracion_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sonido Sonido = new Sonido();
				Sonido.setVisible(true);          
				dispose();     
			}
		});
		btnConfiguracion_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnConfiguracion_1.setBounds(111, 137, 196, 35);
		contentPane.add(btnConfiguracion_1);
	}
}
