import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main{
	public static void main(String [] args) {
		
		//JFrame is GUI window to add components to 
		JFrame frame = new JFrame();  // creates a frame
		frame.setSize(430, 430); // sets the  x-dimensions, and y-dimensions of frame
		frame.setTitle("Example for JFrame"); // sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out our application
		frame.setResizable(false); // prevent frame from being resized
		frame.setVisible(true); // make frame visible
		
		ImageIcon logo = new ImageIcon("c logo.jpg"); // create image logo
		frame.setIconImage(logo.getImage()); // change or set icon of frame
		frame.getContentPane().setBackground(new Color(0x123456)); // change color of background
	}
}