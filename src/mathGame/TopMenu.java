
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
		JCheckBoxMenuItem checkboxItemA = new JCheckBoxMenuItem("Add/Subtract");
		checkboxItemA.setMnemonic(KeyEvent.VK_7);
		checkboxItemA.setSelected(true);
		Quiz.MathSymbol();
		menu.add(checkboxItemA);

		JCheckBoxMenuItem checkboxItemB = new JCheckBoxMenuItem("Multiplication/Division");
		checkboxItemB.setMnemonic(KeyEvent.VK_8);
		checkboxItemB.setSelected(true);
		Quiz.MultDiv();
		menu.add(checkboxItemB);

		menuItemA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MathViewer.Size2x2();
				System.out.println("You selected 2 x 2");
			}
		});

		menuItemB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MathViewer.Size3x3();
				System.out.println("You selected 3 x 3");
			}
		});
		
		menuItemC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MathViewer.Size4x4();
				System.out.println("You selected 4 x 4");
			}
		});

		radioItemA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String image = ImageSplitter.getFileName("ThemeA.jpg");
				System.out.println("You clicked on the 1st radio menu option");
				
			}
		});

		radioItemB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String image = ImageSplitter.getFileName("ThemeB.jpg");
				System.out.println("You clicked on the 2nd radio menu option");
				
			}
		});
		
		radioItemC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String image = ImageSplitter.getFileName("ThemeC.jpg");
				System.out.println("You clicked on the 3rd radio menu option");
				
			}
		});

		return menuBar;
	}

}

