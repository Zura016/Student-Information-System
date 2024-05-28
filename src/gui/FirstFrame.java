package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame();
		frame.setLocation(new Point(650,250));
		frame.setSize(new Dimension(300,250));
		frame.setTitle("First Frame");
		frame.setVisible(true);
		
		JButton button1=new JButton();
		button1.setText("I'm a Button");
		button1.setBackground(Color.blue);
		frame.add(button1);
		
		JButton button2=new JButton();
		button2.setText("Click Here");
		button2.setBackground(Color.red);
		frame.add(button2);
		frame.setLayout(new FlowLayout());
	}

}
