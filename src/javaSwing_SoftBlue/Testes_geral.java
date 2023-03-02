package javaSwing_SoftBlue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Testes_geral extends JFrame {

	private JPanel contentPane;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Testes_geral frame = new Testes_geral();
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
	public Testes_geral() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		
		
		//permite criar uma barra no menu do container
		JMenuBar mb = new JMenuBar ();
		
		JMenu m1= new JMenu("Arquivo");
		m1.setMnemonic('A');
		
		JMenuItem mil = new JMenuItem("Sair");
		mil.setMnemonic('S');
		m1.add(mil);
		
		JMenu m2 = new JMenu ("Editar");
		m2.setMnemonic('E');
		
		mb.add(m1);
		mb.add(m2);
		frame.setJMenuBar(mb);
	    
		
	}

}
