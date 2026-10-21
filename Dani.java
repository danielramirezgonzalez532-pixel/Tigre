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
		frame.setTitle("HOLA GIT"); // Establece el título de la ventana
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// Centra la ventana en la pantalla al ejecutar
		frame.setLocationRelativeTo(null);
		
		// Agrega la etiqueta con el texto de la imagen
		JLabel lblHolaGithub = new JLabel("HOLA GITHUB CON GIT"); //[cite: 1]
		lblHolaGithub.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblHolaGithub.setBounds(100, 110, 260, 30);
		frame.getContentPane().add(lblHolaGithub);
	}

}