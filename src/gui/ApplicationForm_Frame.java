package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class ApplicationForm_Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textname;
	private JTextField textfname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationForm_Frame frame = new ApplicationForm_Frame();
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
	public ApplicationForm_Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 821, 715);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 64, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Application Form");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.PLAIN, 21));
		lblNewLabel.setBounds(185, 33, 186, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(48, 95, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		textname = new JTextField();
		textname.setBounds(257, 92, 163, 19);
		contentPane.add(textname);
		textname.setColumns(10);
		
		textfname = new JTextField();
		textfname.setBounds(257, 147, 163, 19);
		contentPane.add(textfname);
		textfname.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Father Name");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(35, 150, 100, 13);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(48, 210, 45, 13);
		contentPane.add(lblNewLabel_3);
		
		JRadioButton rdbtnmale = new JRadioButton("Male");
		rdbtnmale.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		rdbtnmale.setBounds(257, 206, 103, 21);
		contentPane.add(rdbtnmale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		rdbtnFemale.setBounds(385, 206, 103, 21);
		contentPane.add(rdbtnFemale);
		
		JLabel lblNewLabel_3_1 = new JLabel("Batch No.");
		lblNewLabel_3_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(48, 271, 87, 13);
		contentPane.add(lblNewLabel_3_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Batch 90", "Batch 96", "Batch 110", "Batch 115"}));
		comboBox.setBounds(257, 267, 103, 21);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Course");
		lblNewLabel_3_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_3_1_1.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		lblNewLabel_3_1_1.setBounds(48, 348, 87, 13);
		contentPane.add(lblNewLabel_3_1_1);
		
		JCheckBox chckbxjava = new JCheckBox("Java");
		chckbxjava.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		chckbxjava.setBounds(257, 344, 93, 21);
		contentPane.add(chckbxjava);
		
		JCheckBox chckbxcsa = new JCheckBox("CSA");
		chckbxcsa.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		chckbxcsa.setBounds(374, 344, 93, 21);
		contentPane.add(chckbxcsa);
		
		JCheckBox chckbxeng = new JCheckBox("English");
		chckbxeng.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		chckbxeng.setBounds(257, 393, 93, 21);
		contentPane.add(chckbxeng);
		
		JCheckBox chckbxweb = new JCheckBox("Web");
		chckbxweb.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		chckbxweb.setBounds(374, 393, 93, 21);
		contentPane.add(chckbxweb);
		
		JButton btnshow = new JButton("Show");
		btnshow.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		btnshow.setBounds(257, 458, 85, 21);
		contentPane.add(btnshow);
		
		JButton btnnext = new JButton("Next");
		btnnext.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		btnnext.setBounds(399, 458, 85, 21);
		contentPane.add(btnnext);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(248, 489, 327, 153);
		contentPane.add(textArea);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(ApplicationForm_Frame.class.getResource("/images/i.jpg")));
		lblNewLabel_4.setBounds(497, 10, 300, 127);
		contentPane.add(lblNewLabel_4);
	}
}
