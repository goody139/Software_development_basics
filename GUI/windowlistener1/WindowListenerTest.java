package windowlistener1;

import java.awt.Frame;

/**
 * Demonstrating the usage of a WindowListener
 */
public class WindowListenerTest {

    public static void main(String[] args) {
        Frame f = new Frame("Das Testfenster");
        f.addWindowListener(new MyWindowListener());
        f.setSize(200,150);
        f.setVisible(true);
    }
}
