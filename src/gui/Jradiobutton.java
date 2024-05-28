package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Jradiobutton extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jradiobutton frame = new Jradiobutton();
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
	public Jradiobutton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gender");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(32, 64, 53, 17);
		contentPane.add(lblNewLabel);
		
		JRadioButton rbmale = new JRadioButton("Male");
		rbmale.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbmale.setBounds(169, 64, 103, 21);
		contentPane.add(rbmale);
		
		JRadioButton rbfemale = new JRadioButton("Female");
		rbfemale.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbfemale.setBounds(169, 116, 103, 21);
		contentPane.add(rbfemale);
		
		JRadioButton rbother = new JRadioButton("Other");
		rbother.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbother.setBounds(169, 169, 103, 21);
		contentPane.add(rbother);
		
		ButtomGroup bg = new Buttom
		
		JButton btnNewButton = new JButton("Choose");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(329, 64, 85, 21);
		contentPane.add(btnNewButton);
		
		
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(329, 116, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}
