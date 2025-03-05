package ventanas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Configuracion extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Configuracion frame = new Configuracion();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Configuracion() {
        setTitle("Configuración");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblConfiguracion = new JLabel("CONFIGURACION");
        lblConfiguracion.setBounds(134, 10, 188, 25);
        lblConfiguracion.setFont(new Font("Tahoma", Font.BOLD, 20));
        contentPane.add(lblConfiguracion);

        JCheckBox chckbxNewCheckBox = new JCheckBox("Activar Notificaciones");
        chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        chckbxNewCheckBox.setBounds(6, 55, 194, 21);
        contentPane.add(chckbxNewCheckBox);

        JCheckBox chckbxTemaOscuro = new JCheckBox("Tema Oscuro");
        chckbxTemaOscuro.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        chckbxTemaOscuro.setBounds(6, 78, 194, 21);
        contentPane.add(chckbxTemaOscuro);

        JLabel lblDiseo = new JLabel("Diseño");
        lblDiseo.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblDiseo.setBounds(23, 113, 97, 25);
        contentPane.add(lblDiseo);

        JRadioButton rdbtnNewRadioButton = new JRadioButton("Compacto");
        rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rdbtnNewRadioButton.setBounds(23, 144, 103, 21);
        contentPane.add(rdbtnNewRadioButton);

        JRadioButton rdbtnExtendido = new JRadioButton("Extendido");
        rdbtnExtendido.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rdbtnExtendido.setBounds(23, 167, 103, 21);
        contentPane.add(rdbtnExtendido);

        ButtonGroup designGroup = new ButtonGroup();
        designGroup.add(rdbtnNewRadioButton);
        designGroup.add(rdbtnExtendido);

        JLabel lblIconos = new JLabel("Iconos");
        lblIconos.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblIconos.setBounds(315, 113, 97, 25);
        contentPane.add(lblIconos);

        JRadioButton rdbtnPequeo = new JRadioButton("Pequeños");
        rdbtnPequeo.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rdbtnPequeo.setBounds(309, 144, 103, 21);
        contentPane.add(rdbtnPequeo);

        JRadioButton rdbtnMedianos = new JRadioButton("Medianos");
        rdbtnMedianos.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rdbtnMedianos.setBounds(309, 167, 103, 21);
        contentPane.add(rdbtnMedianos);

        JRadioButton rdbtnGrande = new JRadioButton("Grandes");
        rdbtnGrande.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rdbtnGrande.setBounds(309, 190, 103, 21);
        contentPane.add(rdbtnGrande);

        ButtonGroup iconGroup = new ButtonGroup();
        iconGroup.add(rdbtnPequeo);
        iconGroup.add(rdbtnMedianos);
        iconGroup.add(rdbtnGrande);

        JButton btnNewButton_1 = new JButton("Menu");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Menu menu = new Menu();
                menu.setVisible(true);
                dispose();
            }
        });
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_1.setBounds(6, 232, 85, 21);
        contentPane.add(btnNewButton_1);
        
        JButton btnNewButton = new JButton("Guardar");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton.setBounds(168, 208, 85, 21);
        contentPane.add(btnNewButton);
    }
}
