/**
 * 
 */
package mathGame;

//import java.awt.Dimension;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
	private static final long serialVersionUID = 1L;
	GPanel[] gPanels;
	public GamePanel() {
	}

	public void addImages(Image[] imgs) {
		for(Image img : imgs)
			add(new GPanel(img));
	}
	

	public static void main(String[] args) throws Exception {
		String fileName = "ThemeC.jpg";
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
