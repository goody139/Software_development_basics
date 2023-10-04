package timer1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Timer;

/**
 * Demo for Timer and TimerTask.
 * After one second the time is printed once.
 * After three seconds the time is printed each second.
 */
public class TimerTest {
	public static void main(String[] args) {
		// create Timer 
		Timer timer = new Timer();
		
		// Give a task to the timer and schedule it for printing after 3000 milliseconds
		timer.schedule(new MyTimerTask(), 3000);
		
		// Schedule a task with a 5 seconds delay and a repetition
		// each second.
		// The task has to be a new Task instance (each task can be started only once)
		timer.schedule(new MyTimerTask(), 5000,1000);
		
		// Wait for a return
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			br.readLine();
		} catch (IOException e) { }
		
		// Stop all tasks of the timer instance
		timer.cancel();
	}

}
