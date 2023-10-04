package flowlayout1;

import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

/**
 * Demonstrating the Flow Layout
 */
public class FlowLayoutTest {

    public static void main(String[] args) {
        Frame f = new Frame();

        f.setLayout(new FlowLayout());

        Choice choice = new Choice();

        choice.addItem("Fritz Fischer");
        choice.addItem("Karin Mustermann");
        choice.addItem("Bart Simpson");

        f.add(choice);
        f.add(new Button("Press Me!"));

        f.add(new Label("Just a Label", Label.LEFT));
        
        f.pack();
        f.setVisible(true);
    }
}
