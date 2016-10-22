
package mathGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class TopMenu {
	JTextArea output;
	JScrollPane scrollPane;
	/**
	 * Creates 2 top menu options with radio options and checkbox items and
	 * submenu.
	 * 
	 * @return
	 */

	public JMenuBar menu(MathViewer viewer) {
		JMenuBar menuBar;
		JMenu menu;
		// Creates the first menu
		menuBar = new JMenuBar();

		// Outside the first menu- Name on top
		menu = new JMenu("Selections");
		menuBar.add(menu);

		// Inside the first menu: Names first option, sets shortcut to 1.
		JMenuItem menuItemA = new JMenuItem("2 x 2", KeyEvent.VK_1);
		// Type Alt+1 to shortcut the first option without the menu displayed
		menuItemA.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuItemA.getAccessibleContext().setAccessibleDescription("Creates 4 Math Problems");
		// Add the first option 
		menu.add(menuItemA);
		// Adds a second option
		JMenuItem menuItemB = new JMenuItem("3 x 3", KeyEvent.VK_2);
		menuItemB.getAccessibleContext().setAccessibleDescription("Creates 9 Math Problems");		
		menu.add(menuItemB);
		// Adds a third option
		JMenuItem menuItemC = new JMenuItem("4 x 4", KeyEvent.VK_3);
		menuItemC.getAccessibleContext().setAccessibleDescription("Creates 16 Math Problems");		
		menu.add(menuItemC);

		// Picture
		menu.addSeparator();
		ButtonGroup radiogroup = new ButtonGroup();
		// Creates either/or options
		JRadioButtonMenuItem radioItemA = new JRadioButtonMenuItem("Theme A");
		radioItemA.setSelected(true);
		// Assigns shortcut
		radioItemA.setMnemonic(KeyEvent.VK_4);
		radiogroup.add(radioItemA);
		menu.add(radioItemA);

		JRadioButtonMenuItem radioItemB = new JRadioButtonMenuItem("Theme B");
		radioItemB.setMnemonic(KeyEvent.VK_5);
		radiogroup.add(radioItemB);
		menu.add(radioItemB);
		
		JRadioButtonMenuItem radioItemC = new JRadioButtonMenuItem("Theme C");
		radioItemC.setMnemonic(KeyEvent.VK_6);
		radiogroup.add(radioItemC);
		menu.add(radioItemC);

		// Operands
		menu.addSeparator();
		ButtonGroup radiogroup2 = new ButtonGroup();
		// Creates either/or options
		JRadioButtonMenuItem radioItemD = new JRadioButtonMenuItem("Add/Subtract");
		radioItemD.setSelected(true);
		// Assigns shortcut
		radioItemD.setMnemonic(KeyEvent.VK_7);
		radiogroup2.add(radioItemD);
		menu.add(radioItemD);

		JRadioButtonMenuItem radioItemE = new JRadioButtonMenuItem("Multiply/Divide");
		radioItemE.setMnemonic(KeyEvent.VK_8);
		radiogroup2.add(radioItemE);
		menu.add(radioItemE);
				
		JRadioButtonMenuItem radioItemF = new JRadioButtonMenuItem("Random");
		radioItemF.setMnemonic(KeyEvent.VK_9);
		radiogroup2.add(radioItemF);
		menu.add(radioItemF);
		
		//Number family
		menu.addSeparator();
		ButtonGroup radiogroup3 = new ButtonGroup();
		// Creates either/or options
		JRadioButtonMenuItem radioItemG = new JRadioButtonMenuItem("0");
		radioItemG.setSelected(true);
		// Assigns shortcut
		radiogroup3.add(radioItemG);
		menu.add(radioItemG);

		JRadioButtonMenuItem radioItemH = new JRadioButtonMenuItem("1");
		radiogroup3.add(radioItemH);
		menu.add(radioItemH);
				
		JRadioButtonMenuItem radioItemI = new JRadioButtonMenuItem("2");
		radiogroup3.add(radioItemI);
		menu.add(radioItemI);
		JRadioButtonMenuItem radioItemJ = new JRadioButtonMenuItem("3");;
		// Assigns shortcut
		radiogroup3.add(radioItemJ);
		menu.add(radioItemJ);

		JRadioButtonMenuItem radioItemZ = new JRadioButtonMenuItem("4");
		radiogroup3.add(radioItemZ);
		menu.add(radioItemZ);
				
		JRadioButtonMenuItem radioItemK = new JRadioButtonMenuItem("5");
		radiogroup3.add(radioItemK);
		menu.add(radioItemK);
		
		JRadioButtonMenuItem radioItemL = new JRadioButtonMenuItem("6");
		// Assigns shortcut
		radiogroup3.add(radioItemL);
		menu.add(radioItemL);

		JRadioButtonMenuItem radioItemM = new JRadioButtonMenuItem("7");
		radiogroup3.add(radioItemM);
		menu.add(radioItemM);
				
		JRadioButtonMenuItem radioItemN = new JRadioButtonMenuItem("8");
		radiogroup3.add(radioItemN);
		menu.add(radioItemN);
		
		JRadioButtonMenuItem radioItemO = new JRadioButtonMenuItem("9");
		radiogroup3.add(radioItemO);
		menu.add(radioItemO);
		
		JRadioButtonMenuItem radioItemP = new JRadioButtonMenuItem("10");
		radiogroup3.add(radioItemP);
		menu.add(radioItemP);
		
		JRadioButtonMenuItem radioItemQ = new JRadioButtonMenuItem("11");
		radiogroup3.add(radioItemQ);
		menu.add(radioItemQ);
		
		JRadioButtonMenuItem radioItemR = new JRadioButtonMenuItem("12");
		radiogroup3.add(radioItemR);
		menu.add(radioItemR);

		//Action Listeners for buttons
		
		//Dimensions and game
		menuItemA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MathViewer.Size2x2();
				System.out.println("You selected 2 x 2");
			}
		});

		menuItemB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MathViewer.Size3x3();
				System.out.println("You selected 3 x 3");
			}
		});
		
		menuItemC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MathViewer.Size4x4();
				System.out.println("You selected 4 x 4");
			}
		});
		//Photo booth
		radioItemA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MathViewer.getImage(0);
				System.out.println("You clicked on the 1st radio menu option");
				
			}
		});

		radioItemB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MathViewer.getImage(1);
				System.out.println("You clicked on the 2nd radio menu option");
				
			}
		});
		
		radioItemC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MathViewer.getImage(2);
				System.out.println("You clicked on the 3rd radio menu option");
				
			}
		});
		//Listeners for Operands
		radioItemD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quiz.getMath(Quiz.MathSymbol());
				System.out.println("You clicked on the 1st Add/Subtract option");
				
			}
		});
		
		radioItemE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quiz.getMath(Quiz.MultDiv());
				System.out.println("You clicked on the 2nd Multiplication/Division option");
				
			}
		});
		
		radioItemF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Quiz.getMath(Quiz.Rand());
				System.out.println("You clicked on the 3rd radio Random Equations option");
				
			}
		});
		
		//Math family listeners
		radioItemG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MathViewer.NumberFamily(0);
				System.out.println("You clicked on the 0 number family menu option");
				
			}
		});
		
		radioItemH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MathViewer.NumberFamily(1);
				System.out.println("You clicked on the 1 number family option");
				
			}
		});
		
		radioItemI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MathViewer.NumberFamily(2);
				System.out.println("You clicked on the 2 number family option");
				
			}
		});
		
		radioItemJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MathViewer.NumberFamily(3);
				System.out.println("You clicked on the 3 number family option");
				
			}
		});
		radioItemK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MathViewer.NumberFamily(5);
				System.out.println("You clicked on the 5 number family option");
				
			}
		});
		
		radioItemL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MathViewer.NumberFamily(6);
				System.out.println("You clicked on the 6 number family option");
				
			}
		});
		
		radioItemM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MathViewer.NumberFamily(7);
				System.out.println("You clicked on the 7 number family option");
				
			}
		});
		
		radioItemN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MathViewer.NumberFamily(8);
				System.out.println("You clicked on the 8 number family option");
				
			}
		});
		radioItemO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MathViewer.NumberFamily(9);
				System.out.println("You clicked on the 9 number family option");
				
			}
		});
		
		radioItemZ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MathViewer.NumberFamily(4);
				System.out.println("You clicked on the 4 option");
				
			}
		});
		radioItemP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MathViewer.NumberFamily(10);
				System.out.println("You clicked on the 10 number family option");
				
			}
		});
		radioItemQ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MathViewer.NumberFamily(11);
				System.out.println("You clicked on the 11 number family option");
				
			}
		});
		radioItemR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MathViewer.NumberFamily(12);
				System.out.println("You clicked on the 12 number family option");
				
			}
		});

		return menuBar;
	}

}

