package proyecto;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class registro extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;
    private JTextField textField_1;
    private JButton btnNewButton_1;
    

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    registro frame = new registro();
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
    public registro() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 471, 308);
        contentPane = new FondoPanel2(); 
        contentPane.setBackground(new Color(128, 255, 128));  
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        
        JLabel lblNewLabel = new JLabel("Nombre");
        lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
        lblNewLabel.setBounds(85, 49, 67, 33);
        lblNewLabel.setForeground(Color.WHITE);  
        contentPane.add(lblNewLabel);
        
        
        textField = new JTextField();
        textField.setBounds(200, 53, 96, 19);
        contentPane.add(textField);
        textField.setColumns(10);
        
      
        JLabel lblNewLabel_1 = new JLabel("Contraseña");
        lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
        lblNewLabel_1.setBounds(85, 99, 85, 19);
        lblNewLabel_1.setForeground(Color.WHITE);  
        contentPane.add(lblNewLabel_1);
        
        
        passwordField = new JPasswordField();
        passwordField.setBounds(200, 95, 96, 19);
        contentPane.add(passwordField);
        
        
        JLabel lblNewLabel_2 = new JLabel("DNI");
        lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 14));
        lblNewLabel_2.setBounds(94, 143, 54, 19);
        lblNewLabel_2.setForeground(Color.WHITE); 
        contentPane.add(lblNewLabel_2);
        
        
        textField_1 = new JTextField();
        textField_1.setBounds(200, 139, 96, 19);
        contentPane.add(textField_1);
        textField_1.setColumns(10);
        
        
        JButton btnNewButton = new JButton("Enviar");
        btnNewButton.setForeground(new Color(64, 0, 0));
        btnNewButton.addActionListener(this);
        btnNewButton.setBounds(133, 190, 85, 21);
        contentPane.add(btnNewButton);        
        
        
        btnNewButton_1 = new JButton("Salir");
        btnNewButton_1.addActionListener(this); 
        btnNewButton_1.setBounds(304, 190, 85, 21);
        contentPane.add(btnNewButton_1);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnNewButton_1)) {
            principal p = new principal();
            p.setVisible(true);
            dispose();
        }
    }
}


