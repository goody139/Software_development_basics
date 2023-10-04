package gridbaglayout1;

import java.awt.*;

/**
 * Demonstration of the GridBagLayout: much more flexible
 * concept behind: a grid
 * each field in the grid can be addressed by its x-/y-position
 * constraints are defined for the elements in each grid field
 * components may be positioned over several columns and lines 
 */

@SuppressWarnings("serial")
public class GridBagLayoutTest extends Frame {
	public GridBagLayoutTest(String theWindowTitle) {
      // call the super constructor (Frame)
	  super(theWindowTitle);
	  
	  // set the layout of our frame to GridBagLayout
	  GridBagLayout gbl = new GridBagLayout();
	  this.setLayout(gbl);
	
	  // creating our components
	  Button but1 = new Button("Hallo");
	  Button but2 = new Button("Hallo2");
	  Button but3 = new Button("Hallo3");
	  Checkbox cb1 = new Checkbox("Checkbox 1");
	  TextField tf1 = new TextField("Textfeld 1");
	  
	  // constraints for our elements
	  GridBagConstraints c = new GridBagConstraints();
	  c.fill = GridBagConstraints.BOTH;   // how the components should fill the area
	  c.weightx = 90;                     // width
	  c.weighty = 100;                    // height
	  c.insets = new Insets(0,5,10,15);   // define distances

	  // add the first button to the gridbag together with the constraints
	  c.gridx = 0;                        // x-position
	  c.gridy = 0;                        // y-position
	  c.gridwidth = 1;                    // width
	  c.gridheight = 2;                   // height
	  gbl.setConstraints(but1,c);          
	  add(but1);
		
	  // add the second button to the gridbag together with the constraints
	  c.gridx = 1;
	  c.gridy = 0;
	  c.gridwidth = 3;
	  c.gridheight = 1;
	  gbl.setConstraints(but2, c);
	  add(but2);

	  // add the third button to the gridbag together with the constraints
	  c.gridx = 1;
	  c.gridy = 1;
	  c.gridwidth = 2;
	  c.gridheight = 1;
	  gbl.setConstraints(but3, c);
	  add(but3);

	  // add the text field to the gridbag together with the constraints
	  c.gridx = 3;
	  c.gridy = 1;
	  c.gridwidth = 1;
	  c.gridheight = 2;
	  gbl.setConstraints(tf1, c);
	  add(tf1);
		
	  // add the checkbox to the gridbag together with the constraints
	  c.gridx = 0;
	  c.gridy = 2;
	  c.gridwidth = 3;
	  c.gridheight = 1;
	  gbl.setConstraints(cb1, c);
	  add(cb1);
	}

	
	public static void main(String[] args) {
		// create the main window
		GridBagLayoutTest myMainWindow = new GridBagLayoutTest("Beispiel GridBagLayout");

		// make the main window visible
		myMainWindow.pack();
		myMainWindow.setVisible( true );
	}
}
