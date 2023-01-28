import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main{
	public static void main(String [] args) {
		
		JLabel label = new JLabel(); // create label
		Border border = BorderFactory.createLineBorder(Color.green,3 );
		label.setText("Hey! chris"); //set text of label
		ImageIcon image = new ImageIcon("c logo.jpg");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT,CENTRE,RIGHT OF imageicon
		label.setVerticalTextPosition(JLabel.TOP);      // set txt top, centre , bottom of imageicon
		label.setForeground(new Color(0x123456));      // text color
		label.setFont(new Font("MV Boli",Font.PLAIN, 20)); // set font of text
		label.setIconTextGap(-20); // set gap of  text to image
		label.setBackground(Color.black); // set background color
		label.setOpaque(true); // display background color
		label.setBorder(border); // sets border of label 
		label.setVerticalAlignment(JLabel.CENTER); // set vertical position of text within label
		label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of text within label
	
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(450,450);
		frame.setVisible(true);
		
		frame.add(label);
		
		frame.pack();
	}
}