package nulllayout1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Demonstrating the Null Layout
 */
public class NullLayoutTest {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setBounds(100, 100, 600, 400); // x, y, width, height

        f.setLayout(null); 
        
        Button bt1 = new Button("Press Me!");
        bt1.setBounds(30, 40, 70, 30);
        f.add(bt1);

        Label l1 = new Label("Just a Label", Label.LEFT);
        l1.setBounds(35, 100, 100, 30);
        f.add(l1);

        // f.pack(); // pack is no good for null layouts
        f.setVisible(true);

        
        waitForReturn();

        // label moves in x direction (to the right)
        for (int i = 0; i < 100; i++) {
            l1.setBounds(35+i, 100, 100, 30);
        }
        
        waitForReturn();
        
        // label moves in y direction (down)
        for (int i = 0; i < 50; i++) {
            l1.setBounds(135, 100 + i, 100, 30);
        }
        
        
        waitForReturn();
        
        // label disappears (label is shrinked and is afterwards to small to be visible)
        for (int i = 0; i < 100; i++) {
            l1.setBounds(135, 150, 100-i, 30);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
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
