package proyecto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class principal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private FondoPanel contentPane;
	private JButton btnNewButton_1;
	private JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
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
	public principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new FondoPanel(); 
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido a HUNDRED");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(128, 128, 192));
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel.setBounds(86, 23, 282, 47);
		contentPane.add(lblNewLabel);
		
		btnNewButton_1 = new JButton("Inciar sesión");
		btnNewButton_1.addActionListener((ActionListener) this); 
		btnNewButton_1.setBounds(147, 100, 129, 21);
		contentPane.add(btnNewButton_1);
		
		btnNewButton = new JButton("Registro");
		btnNewButton.addActionListener((ActionListener) this); 
		btnNewButton.setBounds(168, 132, 89, 23);
		contentPane.add(btnNewButton);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnNewButton_1)) {
			iniciar frame = new iniciar();
			frame.setVisible(true);
			dispose();
		}if (e.getSource().equals(btnNewButton)) {
			registro frame = new registro();
			frame.setVisible(true);
			dispose();
		}
		
	}

}

