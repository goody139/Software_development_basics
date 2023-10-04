package buttonlistener1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Demonstration of Listener Implementation (instead of a realization as inner class)
 */
public class MySecondKeyListener implements KeyListener {

    public void keyPressed(KeyEvent e) {
        System.out.println("[Second KeyListener] Key pressed");
    }

    public void keyReleased(KeyEvent e) {
        System.out.println("[Second KeyListener] Key released");
    }

    public void keyTyped(KeyEvent e) {
    	// only called if a character key is pressed (not for function keys e.g. F1) 
        System.out.println("[Second KeyListener] Key typed");
    }

}
