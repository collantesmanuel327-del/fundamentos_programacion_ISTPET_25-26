package Bucles_2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class holi_iwi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField a;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					holi_iwi frame = new holi_iwi();
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
	public holi_iwi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize( 450, 300);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRonaldio = new JLabel("holi+\r\n");
		lblRonaldio.setBounds(115, 21, 122, 12);
		contentPane.add(lblRonaldio);
		
		JButton btnNewButton = new JButton("enternet");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				a.setText("holi");
			}
		});
		btnNewButton.setBounds(153, 162, 84, 20);
		contentPane.add(btnNewButton);
		
		a = new JTextField();
		a.setBounds(153, 45, 96, 18);
		contentPane.add(a);
		a.setColumns(10);

	}
}
