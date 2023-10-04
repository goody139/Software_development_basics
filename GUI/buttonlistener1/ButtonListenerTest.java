package buttonlistener1;

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

/**
 * Demonstration of Listener Implementations
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

        KeyListener aPrivateKeyListener = new MyKeyListener();
        bKey.addKeyListener(aPrivateKeyListener);
        
        // we can add the same listener twice (in case of the event it is called twice)
 //       bKey.addKeyListener(aPrivateKeyListener);
        
        // we can add multiple different KeyListeners
//        KeyListener aSecondPrivateKeyListener = new MySecondKeyListener();      
//        bKey.addKeyListener(aSecondPrivateKeyListener);
        
          // alternative KeyListener as inner class realization
//        bKey.addKeyListener(new KeyListener() {
//
//            public void keyPressed(KeyEvent e) {
//                System.out.println("Key pressed");
//            }
//
//            public void keyReleased(KeyEvent e) {
//                System.out.println("Key released");
//            }
//
//            public void keyTyped(KeyEvent e) {
//            	// only called if a character key is pressed (not for function keys e.g. F1) 
//                System.out.println("Key typed");
//            }
//
//        });

        bMouse.addMouseListener(new MouseAdapter() {

            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse is on the Button");
            }

            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse is not on the Button");

            }

            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse key pressed");
            }


        });

        bMouseMotion.addMouseMotionListener(new MouseMotionListener() {

            public void mouseDragged(MouseEvent e) {
                System.out.println("Mouse move while mouse key pressed");
            }

            public void mouseMoved(MouseEvent e) {
                System.out.println("Mouse move");
            }
            
        });
        
        bMouseWheel.addMouseWheelListener(new MouseWheelListener() {

            public void mouseWheelMoved(MouseWheelEvent e) {
                System.out.println("Mouse wheel moved");
            }
        });
        
        
        // add control elements (each having its own listener) to the window
        f.add(bFocus,BorderLayout.NORTH);
        f.add(bMouse,BorderLayout.SOUTH);
        f.add(bMouseMotion,BorderLayout.EAST);
        f.add(bMouseWheel,BorderLayout.WEST);
        f.add(bKey,BorderLayout.CENTER);

        // we are using an adapter for the window events
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.pack();
        f.setVisible(true);
    }

}
