package timer1;

import java.util.Date;
import java.util.TimerTask;

/**
 * Task which has to be performed with a time schedule
 */
public class MyTimerTask extends TimerTask {

	/* (non-Javadoc)
	 * @see java.util.TimerTask#run()
	 */
	@Override
	public void run() {
		System.out.printf("Time: %tT %n", new Date());
	}

}
