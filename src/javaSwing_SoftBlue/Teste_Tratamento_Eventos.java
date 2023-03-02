package javaSwing_SoftBlue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.EventObject;
import java.awt.event.ActionEvent;

public class Teste_Tratamento_Eventos extends JFrame {

	private JPanel contentPane;
	public EventObject e;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		  try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	        	System.err.println(ex);
	        } catch (InstantiationException ex) {
	            System.err.println(ex);
	        } catch (IllegalAccessException ex) {
	        	System.err.println(ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	        	System.err.println(ex);
	        }
		  
		  
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste_Tratamento_Eventos frame = new Teste_Tratamento_Eventos();
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
	public Teste_Tratamento_Eventos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 378, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// teste de tratamento de eventos 
		
		AbrirCaixa action = new AbrirCaixa();
		JButton b1 = new JButton("Botão 1");
		b1.addActionListener(action);
		b1.setBounds(30, 41, 119, 37);
		contentPane.add(b1);
		
		JButton b2 = new JButton("Botão 2");
		b2.addActionListener(action);
		b2.setBounds(210, 41, 119, 37);
		contentPane.add(b2);
	}
	
	public class AbrirCaixa implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton) e.getSource();
			String nome = b.getText();
			JOptionPane.showMessageDialog(null, nome + "foi pressionado");
			
		}
		
	}
}
