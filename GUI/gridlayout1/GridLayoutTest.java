package gridlayout1;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

/**
 * Demonstrating the Grid Layout
 */
public class GridLayoutTest {

    public static void main(String[] args) {
        Frame f = new Frame();

      
        f.setLayout(new GridLayout(2,3)); // 2 lines, 3 columns
        // f.setLayout(new GridLayout(4,3)); // might vary to what we want (AWT optimizes)
        // f.setLayout(new GridLayout(0,3)); // 0(?) lines, 3 columns => due to 0 lines we ensure to definitely have 3 columns, lines will automatically be determined
        // f.setLayout(new GridLayout(0,0)); // 0(?) lines, 0(?) columns => Exception
        // f.setLayout(new GridLayout(4,0)); // 4 lines, 0(?) columns => definitely 4 lines, columnes will be determined by AWT
        
        Choice choice = new Choice();
        choice.addItem("Fritz Fischer");
        choice.addItem("Karin Mustermann");
        choice.addItem("Bart Simpson");
        f.add(choice);
        
        f.add(new Button("Press Me!"));

        f.add(new Label("Just a Label", Label.LEFT));
        
        f.add(new Button("Just a Button"));
        
        f.add(new Label("Just another Label", Label.LEFT));
        
        f.pack();
        f.setVisible(true);
    }
}
