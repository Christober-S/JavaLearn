import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.ImageIcon;


public class MyFrame extends JFrame{
	
	MyFrame(){
		//Jthis is GUI window to add components to 
		this.setSize(430, 430); // sets the  x-dimensions, and y-dimensions of this
		this.setTitle("Example for Jthis"); // sets title of this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out our application
		this.setResizable(false); // prevent this from being resized
		this.setVisible(true); // make this visible
		
		ImageIcon logo = new ImageIcon("c logo.jpg"); // create image logo
		this.setIconImage(logo.getImage()); // change or set icon of this
		this.getContentPane().setBackground(new Color(0x123456)); // change color of background
	}

	
}
