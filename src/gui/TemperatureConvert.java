package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TemperatureConvert extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Jtext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TemperatureConvert frame = new TemperatureConvert();
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
	public TemperatureConvert() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Jtext = new JTextField();
		Jtext.setBounds(29, 34, 96, 19);
		contentPane.add(Jtext);
		Jtext.setColumns(10);
		
		JLabel JCel = new JLabel("Celsius");
		JCel.setBounds(134, 34, 43, 17);
		JCel.setForeground(new Color(128, 0, 0));
		JCel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(JCel);
		
		JLabel JFah = new JLabel("Fahrenheit");
		JFah.setForeground(new Color(128, 0, 0));
		JFah.setFont(new Font("Tahoma", Font.PLAIN, 14));
		JFah.setBounds(134, 67, 78, 13);
		contentPane.add(JFah);
		
		JButton Jbtn = new JButton("Convert");
		Jbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double calsius = Double.parseDouble(Jtext.getText());
				double f=(calsius*9/5)+32;
				JFah.setText(Double.toString(f));
			}
		});
		Jbtn.setBounds(29, 63, 96, 21);
		contentPane.add(Jbtn);
		
	
	}
}
