package windowadapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Demonstration of the usage of an adapter
 * We create an anonymous inner class which is a subclass of WindowAdapter.
 * WindowAdapter already provides standard implementations for the window events.
 * Therefore, it is sufficient to override only those methods we would like to change in a specific way. 
 */
public class WindowListenerTest {

    public static void main(String[] args) {
        Frame f = new Frame("Das Testfenster");
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("Die Anwendung wird geschlossen");
                System.exit(0);
            }
            
            public void windowActivated(WindowEvent e) {
                System.out.println("Window aktiv");
            }
        });
        f.setSize(200,150);
        f.setVisible(true);
    }
}
