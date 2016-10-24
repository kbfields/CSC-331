/**
 * 
 */
package mathGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 * Class GButton extends JButton and implements ActionListener
 * creates JButtons for class Gpanel
 * @author mingo_000
 *
 */
public class GButton extends JButton implements ActionListener  {
	private Image img;
	private int w;
	private int h;
	byte value = 0;
	private int rotate = 0;
	private String math;
	
	private static final long serialVersionUID = 1L;
	/**
	 * GButton class constructor
	 * @param img provides an image for use in JButton icon
	 * @param problem an integer that allows a specific item in an ArrayList to be used
	 */
	public GButton(Image img, int problem) {
		this.img = img;
		w = img.getWidth(this);
		h = img.getHeight(this);
		setPreferredSize(new Dimension(w, h));
		this.addActionListener(this);
		ArrayList<String> Questions = mathGame.Quiz.Equations(7,0);
		math = Questions.get(problem);
	}
	/**
	 * performs action when listener detects activity
	 */
	public void actionPerformed(ActionEvent e){
		value++;
		value%=3;
		switch(value){
			case 0:
				rotate = 0;
				break;
			case 1:
				rotate = 1;
				break;
			case 2:
				String guess = JOptionPane.showInputDialog("Type your answer to the given equation.");
				rotate = 2;
				System.out.println(Integer.parseInt(guess));
				System.out.println(math);
				break;
		   }
		}


	/**
	 * paintComponent for GButton
	 */
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		if (rotate == 0){
			g2.setColor(Color.BLACK);
			g2.fillRect(0, 0, w, h);
		} else if (rotate == 1) {
			g2.setColor(Color.BLACK);
			g2.fillRect(0, 0, w, h);
			g2.setPaint(Color.WHITE);
			g2.setFont(new Font("Sans-serif", Font.BOLD, 20));
			g2.drawString(math, w/3, h/2);
			((JFrame)SwingUtilities.getRoot(this)).setTitle("Testing, one, two, three.");
		} else if (rotate == 2){
			g2.drawImage(img, 0, 0, this);
			((JFrame)SwingUtilities.getRoot(this)).setTitle("Testing GPanel");
		}
	}
	


}
