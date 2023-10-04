package buttonwindow1;

import java.awt.Frame;
import java.awt.Button;

/**
 * Demonstration of the control element Button (without any functionality behind it)
 */

class ButtonWindow
{
	public static void main(String[] args)
	{
		// create a Frame instance and set the window title of this Frame 
		Frame buttonWindow = new Frame("Ein Fenster f�r die Schaltfl�che");
		
		// set the size of the window
		buttonWindow.setSize(300,100);
		
		// create a button and add it to the window
		Button myButton =  new Button("Das ist die Beispielschaltfl�che");
		buttonWindow.add(myButton);
		
		// show window (Frame)
        buttonWindow.setVisible(true);
	}
}