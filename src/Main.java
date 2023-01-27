import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main{
	public static void main(String [] args) {
		
		JLabel label = new JLabel(); // create label
		label.setText("Hello chris."); //set text of label
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450,450);
		frame.setVisible(true);
		
		frame.add(label);
	
	}
}