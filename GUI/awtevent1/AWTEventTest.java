package awtevent1;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Demonstrating event handling with a time consuming listener (bad design)
 */
public class AWTEventTest {

    public static void main(String[] args) {
        Frame f = new Frame("Test Application");

        f.setLayout(new FlowLayout());

        final Canvas canvas = new Canvas();
        canvas.setSize(100, 100);
        
        Button bKurz = new Button("Short Action");
        bKurz.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                int r = (int) (Math.random() * 255 + 0.5);
                int g = (int) (Math.random() * 255 + 0.5);
                int b = (int) (Math.random() * 255 + 0.5);
                canvas.setBackground(new Color(r, g, b));
            }

        });

        // now with a time consuming listener (events are partially lost + slow application) 
        Button bLang = new Button("Long Action");
        bLang.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 100; i++) {
                    System.out.printf("Control Number %d%n", i);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }

            }
        });
        
        f.add(bKurz);
        f.add(bLang);
        f.add(canvas);
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        f.pack();
        f.setVisible(true);
    }

}
