package cardlayout1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Window;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Demonstrating the Card Layout
 */
public class CardLayoutTest {

    private static BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));

    public static void main(String[] args) {
        Frame f = new Frame();
        
        // card 1
        Panel card1 = new Panel();
        card1.setLayout(new BorderLayout());

        Button bt1 = new Button("North");
        card1.add(bt1, BorderLayout.NORTH);

        Button bt2 = new Button("South");
        card1.add(bt2, BorderLayout.SOUTH);

        Button bt3 = new Button("East");
        card1.add(bt3, BorderLayout.EAST);

        Button bt4 = new Button("West");
        card1.add(bt4, BorderLayout.WEST);

        Button bt5 = new Button("Center");
        card1.add(bt5, BorderLayout.CENTER);

        // card 2
        Panel card2 = new Panel();
        card2.setLayout(new GridLayout(3,0));
        
        Label l1 = new Label("One");
        card2.add(l1);
        
        Label l2 = new Label("Two");
        card2.add(l2);
        
        Label l3 = new Label("Three");
        card2.add(l3);
        
        Label l4 = new Label("Four");
        card2.add(l4);
        
        Label l5 = new Label("Five");
        card2.add(l5);
        
        // combine both to the card layout
        CardLayout cards = new CardLayout();
        
        // labels to identify the cards
        final String LABELSTRING = "Labels";
        final String BUTTONSTRING = "Buttons";
        
        f.setLayout(cards);
        f.add(card1,BUTTONSTRING);
        f.add(card2,LABELSTRING);
        f.pack();
        f.setVisible(true);

        waitForReturn();
        cards.show(f,LABELSTRING);
        
        waitForReturn();
        cards.show(f,BUTTONSTRING);
        
        waitForReturn();
        cards.next(f); // get the next card on the stack
    }
    
    // helper method
    private static void waitForReturn() {
        try {
            System.out.println("Hit return to continue!");
            br.readLine();
        } catch (IOException e) {
            // Auto-generated catch block
            e.printStackTrace();
        }
    }

}
