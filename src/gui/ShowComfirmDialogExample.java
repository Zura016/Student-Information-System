package gui;

import javax.swing.JOptionPane;

public class ShowComfirmDialogExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice =JOptionPane.showConfirmDialog(null,"Erase your hard disk?");
		if(choice == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Disk Erase!!");
		}
		else if(choice==JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Disk did not Erase!!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Cancelled");
		}
	}

}
