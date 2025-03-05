package ventanas;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Principal extends JFrame {

    private static final long serialVersionUID = 1L; // Para serialización
    private JTextField textField;
    private JPasswordField passwordField;

    /**
     * Constructor para inicializar la ventana Principal.
     */
    public Principal() {
        setTitle("Ventana Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("NUEVO USUARIO");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setBounds(125, 10, 189, 23);
        getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Nombre:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_1.setBounds(95, 43, 85, 19);
        getContentPane().add(lblNewLabel_1);

        textField = new JTextField();
        textField.setBounds(233, 43, 96, 19);
        getContentPane().add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_1_1 = new JLabel("Contraseña:");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_1_1.setBounds(95, 72, 106, 19);
        getContentPane().add(lblNewLabel_1_1);

        passwordField = new JPasswordField();
        passwordField.setBounds(233, 72, 96, 19);
        getContentPane().add(passwordField);

        JLabel lblNewLabel_1_1_1 = new JLabel("Idioma:");
        lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_1_1_1.setBounds(95, 101, 106, 25);
        getContentPane().add(lblNewLabel_1_1_1);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setModel(new DefaultComboBoxModel<>(new String[]{"Español", "Inglés", "Catalán", "Alemán", "Ruso"}));
        comboBox.setToolTipText("");
        comboBox.setBounds(233, 101, 96, 21);
        getContentPane().add(comboBox);

        JLabel lblNewLabel_1_1_2 = new JLabel("Comunicación:");
        lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblNewLabel_1_1_2.setBounds(95, 132, 125, 23);
        getContentPane().add(lblNewLabel_1_1_2);


        JButton btnNewButton = new JButton("Guardar");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton.setBounds(175, 215, 85, 21);
        getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Menu");
        btnNewButton_1.addActionListener(new ActionListener() {

            // Vuelta al menú
            public void actionPerformed(ActionEvent e) {
                Menu menu = new Menu();
                menu.setVisible(true);
                dispose();
            }
        });
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_1.setBounds(10, 232, 85, 21);
        getContentPane().add(btnNewButton_1);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("Telefono");
        chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
        chckbxNewCheckBox.setBounds(226, 136, 93, 21);
        getContentPane().add(chckbxNewCheckBox);
        
        JCheckBox chckbxEmail = new JCheckBox("e-mail");
        chckbxEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
        chckbxEmail.setBounds(226, 161, 93, 21);
        getContentPane().add(chckbxEmail);
    }
}
