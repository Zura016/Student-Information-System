package gui;

import javax.swing.JOptionPane;

public class ShowInputDialogExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=JOptionPane.showInputDialog(null,"What's your name?");
		JOptionPane.showMessageDialog(null,"Hello, " + name);
	}

}
