package github;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Dani {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dani window = new Dani();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Dani() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("HOLA GIT"); 
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		frame.setLocationRelativeTo(null);
		
		
		JLabel lblHolaGithub = new JLabel("DANIEL RAMIREZ GONZALEZ"); 
		lblHolaGithub.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHolaGithub.setBounds(73, 110, 287, 30);
		frame.getContentPane().add(lblHolaGithub);
	}

}
