/**
 * 
 */
package mathGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

/**
 * @author Jack
 *
 */
public class TopMenu {
	JTextArea output;
	JScrollPane scrollPane;
	String fileName;
	/**
	 * Creates 2 top menu options with radio options and checkbox items and
	 * submenu.
	 * 
	 * @return
	 */

	public JMenuBar menu(MathViewer viewer) {
		JMenuBar menuBar;
		JMenu menu;
		JMenu submenu;
		fileName = "bear.jpg";
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
		// Add the first option under "Pig Menus"
		menu.add(menuItemA);
		// Adds a second option
		JMenuItem menuItemB = new JMenuItem("3 x 3", KeyEvent.VK_2);
		menuItemB.getAccessibleContext().setAccessibleDescription("Creates 9 Math Problems");		
		menu.add(menuItemB);
		// Adds a third option
		JMenuItem menuItemC = new JMenuItem("4 x 4", KeyEvent.VK_3);
		menuItemC.getAccessibleContext().setAccessibleDescription("Creates 16 Math Problems");		
		menu.add(menuItemC);

		// Separator & new button group
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

		// Group of checkbox items. Select multiple
		menu.addSeparator();
		JCheckBoxMenuItem checkboxItemA = new JCheckBoxMenuItem("Select multiple (\"Checkbox\") add/sub");
		checkboxItemA.setMnemonic(KeyEvent.VK_7);
		checkboxItemA.setSelected(true);
		menu.add(checkboxItemA);

		JCheckBoxMenuItem checkboxItemB = new JCheckBoxMenuItem("Select multiple (\"Checkbox\") mul/div");
		checkboxItemB.setMnemonic(KeyEvent.VK_8);
		checkboxItemB.setSelected(true);
		menu.add(checkboxItemB);

		JCheckBoxMenuItem checkboxItemC = new JCheckBoxMenuItem("Select multiple (\"Checkbox\") mixed");
		checkboxItemC.setMnemonic(KeyEvent.VK_9);
		checkboxItemC.setSelected(true);
		menu.add(checkboxItemC);

		/*// Add a submenu
		menu.addSeparator();
		submenu = new JMenu("Submenu");
		submenu.setMnemonic(KeyEvent.VK_8);

		JMenuItem menuItemC = new JMenuItem("Item for submenu", KeyEvent.VK_9);
		menuItemC.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
		submenu.add(menuItemC);

		JMenuItem menuItemD = new JMenuItem("2nd item for submenu", KeyEvent.VK_0);
		submenu.add(menuItemD);
		menu.add(submenu);

		// Second Option in top menu bar
		menu = new JMenu("Pig Menu 2");
		menu.setMnemonic(KeyEvent.VK_A);
		menu.getAccessibleContext().setAccessibleDescription("This also does nothing");
		menuBar.add(menu);

		JMenuItem menuItemE = new JMenuItem("Walk 1st column of pigs");
		menuItemE.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.ALT_MASK));
		menu.add(menuItemE);

		JMenuItem menuItemF = new JMenuItem("Walk 2nd column of pigs");
		menuItemE.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_4, ActionEvent.ALT_MASK));
		menu.add(menuItemF);

		JMenuItem menuItemG = new JMenuItem("Walk 3rd column of pigs");
		menuItemE.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_5, ActionEvent.ALT_MASK));
		menu.add(menuItemG);
*/
		// PigViewer viewer = new PigViewer();

		menuItemA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("You selected 2 x 2");
			}
		});

		menuItemB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("You selected 3 x 3");
			}
		});
		
		menuItemC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("You selected 4 x 4");
			}
		});
/*
		menuItemC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("You clicked on the 1st submenu option");
				System.out.println("...Does nothing.");
			}
		});

		menuItemD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("You clicked on the 2nd submenu option");
				System.out.println("...Does nothing.");
			}
		});

		menuItemE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("You clicked on the 1st menu option for Menu Pig 2");
			}
		});

		menuItemF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("You clicked on the 2nd menu option for Menu Pig 2");
				
			}
		});

		menuItemG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("You clicked on the 1st menu option for Menu Pig 2");
				
			}
		});
*/
		radioItemA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("You clicked on the 1st radio menu option");
				
			}
		});

		radioItemB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("You clicked on the 2nd radio menu option");
				
			}
		});
		
		radioItemC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("You clicked on the 3rd radio menu option");
				
			}
		});
/*
		checkboxItemA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("You clicked on the 1st checkbox menu option");
				
			}
		});

		checkboxItemB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("You clicked on the 2nd checkbox menu option");
				
				if (checkboxItemB.isSelected()) {
					System.out.println("checkbosItemB is selected");
				} else {
					System.out.println("checkbosItemB is unselected");
				}
			}
		});

		checkboxItemC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("You clicked on the 2nd checkbox menu option");
				
			}
		});
*/
		return menuBar;
	}

}

