package buttonlistener2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

/**
 * Demonstration of Listener Implementations
 * Using the event to give a more detailed output
 */

public class ButtonListenerTest {

    public static void main(String[] args) {
        Frame f = new Frame("Button Listener Test");
        f.setLayout(new BorderLayout());

        Button bFocus = new Button("Focus (focus yes or no / get focus with a click)");
        Button bMouse = new Button("Mouse (mouse on button or not / mouse key pressed or not)");
        Button bMouseMotion = new Button("MouseMotion (mouse moving / mouse moving while mouse key pressed)");
        Button bMouseWheel = new Button("MouseWheel (wheel moving)");
        Button bKey = new Button("Key (pressed or not)");

        bFocus.addFocusListener(new FocusListener() {
           	
            public void focusGained(FocusEvent e) {
                System.out.println("Having the Focus");
            }

            public void focusLost(FocusEvent e) {
                System.out.println("Lost the Focus");
            }     
        });

        
         bKey.addKeyListener(new KeyListener() {
        
            public void keyPressed(KeyEvent e) {
            	System.out.println("Key pressed");
                System.out.println("with character " + e.getKeyChar());     
            }
        
            public void keyReleased(KeyEvent e) {
            	System.out.println("Key released");
                System.out.println("on " + new Date(e.getWhen()));        	
            }
        
            public void keyTyped(KeyEvent e) {
            	// only called if a character key is pressed (not for function keys e.g. F1)
            	System.out.println("Key typed");
            }
        });
        

        bMouse.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse is on the Button");
                System.out.printf("Button coordinates of the mouse: (%d|%d)%n",e.getX(),e.getY());
            }

            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse is not on the Button");

            }

            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse key pressed with mouse key: " + e.getButton());
            }


        });

        bMouseMotion.addMouseMotionListener(new MouseMotionListener() {

            public void mouseDragged(MouseEvent e) {
                System.out.println("Mouse move while mouse key pressed");
               
            }

            public void mouseMoved(MouseEvent e) {
                System.out.println("Mouse move");
                System.out.printf("with screen coordinates: (%d|%d)%n", e.getXOnScreen(),e.getYOnScreen());
            }
            
        });
        
        bMouseWheel.addMouseWheelListener(new MouseWheelListener() {

            public void mouseWheelMoved(MouseWheelEvent e) {
                System.out.println("Mouse wheel moved: " + e.getWheelRotation() + " units");
            }
        });
        
        
        f.add(bFocus, BorderLayout.NORTH);
        f.add(bMouse, BorderLayout.SOUTH);
        f.add(bMouseMotion, BorderLayout.EAST);
        f.add(bMouseWheel, BorderLayout.WEST);
        f.add(bKey, BorderLayout.CENTER);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.pack();
        f.setVisible(true);
    }

}
