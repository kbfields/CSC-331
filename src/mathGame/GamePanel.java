/**
 * 
 */
package mathGame;

import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * GamePAnel class extends JFrame and assists in creating the game window
 * @author mingo_000
 *
 */
public class GamePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	GButton[] gButtons;
	private int problem = 0;
	public GamePanel() {
	}
	/**
	 * method addImages sends images to class GButton
	 * iterates variable problems
	 * @param imgs
	 */
	public void addImages(Image[] imgs) {
		for(Image img : imgs)
			add(new GButton(img,problem));
			problem++;
			
	}
	

	public static void main(String[] args) throws Exception {
		String fileName = "bear.jpg";
		Image[] imgs = ImageSplitter.splitImage(fileName, 2, 2, false);
		JFrame f = new JFrame("Testing GamePanel - resize to see behavior");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GamePanel gp = new GamePanel();
		gp.addImages(imgs);
	
		f.add(gp);

		f.pack();
		f.setVisible(true);
	}

}
