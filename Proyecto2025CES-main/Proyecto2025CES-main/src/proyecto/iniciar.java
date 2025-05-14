package proyecto;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class iniciar extends JFrame implements ActionListener{

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JButton btnNewButton;
    private JButton btnNewButton_1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    iniciar frame = new iniciar();
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
    public iniciar() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new FondoPanel1();
        contentPane.setBackground(new Color(128, 255, 128));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        
        JLabel lblNewLabel = new JLabel("DNI");
        lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 19));
        lblNewLabel.setBounds(68, 60, 54, 19);
        lblNewLabel.setForeground(Color.YELLOW); 
        contentPane.add(lblNewLabel);

        
        JLabel lblNewLabel_1 = new JLabel("Contraseña");
        lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 17));
        lblNewLabel_1.setBounds(68, 105, 92, 13);
        lblNewLabel_1.setForeground(Color.YELLOW); 
        contentPane.add(lblNewLabel_1);

        
        textField = new JTextField();
        textField.setBounds(175, 60, 96, 19);
        contentPane.add(textField);
        textField.setColumns(10);

        
        textField_1 = new JTextField();
        textField_1.setBounds(175, 105, 96, 19);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        
        btnNewButton = new JButton("Enviar");
        btnNewButton.addActionListener(this); 
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnNewButton.setBounds(75, 164, 85, 21);
        contentPane.add(btnNewButton);

       
        btnNewButton_1 = new JButton("Salir");
        btnNewButton_1.addActionListener(this);
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
        btnNewButton_1.setBounds(253, 164, 85, 21);
        contentPane.add(btnNewButton_1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnNewButton_1)) {
            principal frame = new principal();
            frame.setVisible(true);
            dispose();
        }
    }
}


