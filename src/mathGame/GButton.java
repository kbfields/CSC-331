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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * @author Jack
 *
 */
public class GButton extends JButton implements ActionListener  {
	private Image img;
	private boolean answered;
	private boolean working;
	private int w;
	private int h;
	byte value = 0;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GButton(Image img) {
		this.img = img;
		w = img.getWidth(this);
		h = img.getHeight(this);
		setPreferredSize(new Dimension(w, h));
		answered = false;
		working = false;
	}
	
	public void actionPerformed(ActionEvent e){
		value++;
		value%=3;
		switch(value){
			case 0:
				
				break;
			case 1:
				
				break;
			case 2:
				
				break;
		   }
		}

	public void setAnswered() {
		answered = true;
	}

	public boolean getAnswered() {
		return answered;
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		if (!answered) {
			if (working){
				g2.setColor(Color.lightGray);
				g2.fillRect(0, 0, w, h);
				g2.setPaint(Color.yellow);
				g2.setFont(new Font("Sans-serif", Font.BOLD, 20));
				g2.drawString("Testing, one, two, three.", w/3, h/2);
				((JFrame)SwingUtilities.getRoot(this)).setTitle("Testing, one, two, three.");
			}
			else{
				g2.setColor(Color.darkGray);
				g2.fillRect(0, 0, w, h);
			}
			working = !working;  // toggles on and off
		} else {
			g2.drawImage(img, 0, 0, this);
			((JFrame)SwingUtilities.getRoot(this)).setTitle("Testing GPanel");
		}
		answered = !answered; // toggles on and off 
	}

	public static void main(String[] args) {
		JFrame f = new JFrame("Testing GPanel - resize, maximize and back to see behavior");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(new GButton(new ImageIcon("bear.jpg").getImage()));

		f.pack();
		f.setVisible(true);
	}

}
