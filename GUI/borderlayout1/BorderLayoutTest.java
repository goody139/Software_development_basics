package borderlayout1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Scrollbar;

/**
 * Demonstrating the usage of the Border Layout
 */
public class BorderLayoutTest {

    public static void main(String[] args) {
        Frame f = new Frame();

        f.setLayout(new BorderLayout());

        Choice choice = new Choice();

        choice.addItem("Fritz Fischer");
        choice.addItem("Karin Mustermann");
        choice.addItem("Lisa Simpson");

        f.add(choice, BorderLayout.NORTH);
        
        f.add(new Button("Press Me!"),BorderLayout.SOUTH);

        f.add(new Label("Just a Label", Label.LEFT), BorderLayout.WEST);
        
        f.add(new Button("Button in the Center!"),BorderLayout.CENTER);
        
        // scrollbar: orientation, start value, visible, min value, max value
        f.add(new Scrollbar(Scrollbar.HORIZONTAL, 42, 1, 0, 100), BorderLayout.EAST);
 
        // f.add(new Button("NEW BUTTON!!"));
        // f.add(new Button("NEW BUTTON!!"),BorderLayout.CENTER);
        
        f.pack();
        f.setVisible(true);
    }
}
