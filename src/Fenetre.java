import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JWindow;

public class Fenetre {

	public void jFrameFenetre() {

		// JLabel emptyLabel = new JLabel("Hello World");
		JFrame frameProf = new JFrame("Frame Prof");
		frameProf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

		frameProf.setLayout(new BorderLayout());
		frameProf.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));

		frameProf.setSize(500, 500);
		frameProf.setLocationRelativeTo(null);
		final JTextField text = new JTextField();
		text.setPreferredSize(new Dimension(200, 24));

		// JLabel emptyLabel = new JLabel("Hello World");
		JFrame frameEtudiant = new JFrame("Frame Etudiant");
		frameEtudiant.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

		frameEtudiant.setLayout(new BorderLayout());
		frameEtudiant.getContentPane().setLayout(
				new FlowLayout(FlowLayout.CENTER));

		frameEtudiant.setSize(500, 500);
		frameEtudiant.setLocationRelativeTo(null);
		final JTextField textEtudiant = new JTextField();
		textEtudiant.setPreferredSize(new Dimension(200, 24));

		text.addKeyListener(new KeyListener() {

			public void keyPressed(KeyEvent e) {
				if (text.getText().length() > 0) {
					textEtudiant.setText(text.getText());
				}
			}

			@Override
			public void keyTyped(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});
		frameProf.add(text);
		frameProf.setResizable(true);
		frameProf.setVisible(true);
		
		frameEtudiant.add(textEtudiant);
		frameEtudiant.setResizable(true);
		frameEtudiant.setVisible(true);

	}

	public static void main(String[] args) {
		Fenetre fenetre = new Fenetre();
		fenetre.jFrameFenetre();
	}

}
