
package mathGame;

import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class MathViewer extends JFrame {
	private GamePanel gamePanel;
	private static final long serialVersionUID = 1L;

	public MathViewer(Image[] imgs) {
		setTitle("Math Games");
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TopMenu topMenu = new TopMenu();
		setJMenuBar(topMenu.menu(this));
		gamePanel = new GamePanel();
		gamePanel.setLayout(new GridLayout((int) (Math.sqrt(imgs.length)), (int) (Math.sqrt(imgs.length)), 1, 1));
		gamePanel.addImages(imgs);

		add(gamePanel, BorderLayout.CENTER);

		pack();
		setVisible(true);
	}

	public static Image[] splitImage(String fileName, int rows, int cols, boolean saveToFile) {
		BufferedImage[] imgs = new BufferedImage[rows * cols]; // Image array to
																// hold images
		Image[] images = new Image[rows * cols];
		int pieceWidth = 100;
		int pieceHeight = 100;

		try {
			File file = new File(fileName); // takes picture from
											// directory
			FileInputStream fis = new FileInputStream(file);
			BufferedImage image = ImageIO.read(fis); // reading the image file

			pieceWidth = image.getWidth() / cols; // determines the width
			pieceHeight = image.getHeight() / rows; // and height of each piece
			
			for (int x = 0; x < rows; x++) {
				for (int y = 0; y < cols; y++) {
					// Initialize the image array with image pieces
					imgs[x * rows + y] = new BufferedImage(pieceWidth, pieceHeight, image.getType());
					// draws the image piece
					Graphics2D gr = imgs[x * rows + y].createGraphics();
					gr.drawImage(image, 0, 0, pieceWidth, pieceHeight, pieceWidth * y, pieceHeight * x,
							pieceWidth * y + pieceWidth, pieceHeight * x + pieceHeight, null);
					gr.dispose();
				}
			}
			System.out.print("\nSplitting done " + pieceWidth / cols + " X " + pieceHeight / rows);
			if (saveToFile) {
				// writing mini images into image files
				String name = fileName.split(".")[0];
				for (int i = 0; i < imgs.length; i++) {
					ImageIO.write(imgs[i], "jpg", new File(name + i + ".jpg"));
				}
				System.out.println("Mini images saved to files");
			}
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}

		for (int i = 0; i < rows * cols; i++) {
			Image img = (Image) imgs[i];
			if (pieceWidth / cols < 100) {
				images[i] = img.getScaledInstance(2*pieceWidth, 2*pieceHeight, Image.SCALE_DEFAULT);
				System.out.println(" resized to " + 2*pieceWidth + " X " + 2*pieceHeight);
			} else
				images[i] = img;
		}

		return images;

	}

	public void setImages(String fileName, int rows, int cols) {
		remove(gamePanel);
		//revalidate();

		gamePanel = new GamePanel();
		gamePanel.setLayout(new GridLayout(rows, cols, 1, 1));
		gamePanel.addImages(splitImage(fileName, rows, cols, false));
		add(gamePanel, BorderLayout.CENTER);
		repaint();

	}
	public static int NumberFamily(int x){
		int numberfamily = x;
		return numberfamily;
	}

	/**
	 * @param args
	 * @return 
	 */
	public static String getImage(int choice){
		String[] pictures = {"ThemeA.jpg","ThemeB.jpg","ThemeC.jpg"};
		return pictures[choice];
	}
	
	
	static void Size4x4() {
		// TODO Auto-generated method stub
		Image[] imgs = null;
		try {
			imgs = splitImage(getImage(0), 4, 4, false);
			MathViewer mv = new MathViewer(imgs);
			ArrayList<String> Questions = Quiz.Equations(15, NumberFamily(0));
			System.out.println(Questions);
			//Quiz.Solution()
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void Size3x3() {
		// TODO Auto-generated method stub
		Image[] imgs = null;
		try {
			imgs = splitImage(getImage(1), 3, 3, false);
			MathViewer mv = new MathViewer(imgs);
			ArrayList<String> Questions = Quiz.Equations(8, NumberFamily(0));
			System.out.println(Questions);
			//Quiz.Solution()
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void Size2x2() {
		// TODO Auto-generated method stub
		Image[] imgs = null;
		MathViewer mv;
		try {
			imgs = splitImage(getImage(2), 2, 2, false);
			mv = new MathViewer(imgs);
			ArrayList<String> Questions = Quiz.Equations(3, NumberFamily(0));
			System.out.println(Questions);
			//Quiz.Solution()
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

/*		Image[] imgs = null;
		MathViewer mv = new MathViewer(imgs);
		try {
			imgs = splitImage(getImage(" "), 4, 4, false);
			MathViewer mv = new MathViewer(imgs);
			Quiz.Equations(15, NumberFamily(0));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
*/