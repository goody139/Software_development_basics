package alllayout1;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Scrollbar;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;

/**
 * Demonstration of different Layouts
 */

class AllLayoutTest
{
	public static void main(String[] args)
	{
		// create the main window
		Frame myMainWindow = new Frame("Ein eigenes Fenster");
		myMainWindow.setSize(650,400);
		myMainWindow.setLocation(10,10);

		// first area: Grid Layout 
		Panel area = new Panel();
		area.setLayout(new GridLayout(2,2));
		area.setSize(600,400);
		myMainWindow.add(BorderLayout.CENTER, area);

		// second area: Flow Layout
		Panel a = new Panel();
		a.setSize(300,200);
		a.setLayout(new FlowLayout());
		a.setBackground(new Color(150,150,150));
		a.add(new Button("Der Knopf"));
		a.add(new TextField("meinText"));
		a.add(new Button("noch ein Knopf"));
		a.add(new TextField("zweiter Text"));
		a.add(new Scrollbar());

		// third area: Border Layout
		Panel b = new Panel();
		b.setSize(300,200);
		b.setLayout(new BorderLayout());
		b.setBackground(new Color(200,200,200));
		b.add(BorderLayout.WEST, new Button("Der Knopf"));
		b.add(BorderLayout.EAST, new TextField("meinText"));
		b.add(BorderLayout.SOUTH, new Button("noch ein Knopf"));
		b.add(BorderLayout.NORTH, new TextField("zweiter Text"));
		b.add(BorderLayout.CENTER, new Scrollbar());

		// fourth area: Card Layout
		Panel c = new Panel();
		c.setSize(300,200);
		CardLayout myCardLayout = new CardLayout();
		c.setLayout(myCardLayout);
		c.setBackground(new Color(100,100,100));
		// inserting the card layers (here only control elements)
		// we could insert constainers each with their own layout, too
		// second parameter identifies the card container
		c.add(new Button("Der Knopf"), "eins");
		c.add(new TextField("meinText"), "zwei");
		c.add(new Button("noch ein Knopf"), "drei");
		c.add(new TextField("zweiter Text"), "vier");
		c.add(new Scrollbar(), "fünf");
		// change the visible card layout (two alternatives)
		// myCardLayout.next(c);
		// ((CardLayout)c.getLayout()).next(c);

		// fifth area: Grid Layout
		Panel d = new Panel();
		d.setSize(300,200);
		d.setLayout(new GridLayout(2,2));
		d.add(new Button("Knopf"));
		d.add(new TextField("meinText"));
		d.add(new Button("wieder ein Knopf"));
		d.add(new Scrollbar());

		// add area 2 to 5 to area 1 (area 1, Grid Layout is the container for the others)
		area.add(a);
		area.add(b);
		area.add(c);
		area.add(d);
		
		// myMainWindow.pack();
		// show the main window
		myMainWindow.setVisible(true);
	}
}