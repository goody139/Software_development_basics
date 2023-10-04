package threadgroup1;

/**
 * Group information about the active threads
 */
public class ThreadInfo {
	public static void main(String[] args) {
		ThreadGroup top = Thread.currentThread().getThreadGroup();

		while (top.getParent() != null)
			top = top.getParent();

		showGroupInfo("    ",top);
	}

	public static void showGroupInfo(String indent, ThreadGroup group) {
		Thread[] threads = new Thread[group.activeCount()];

		group.enumerate(threads, false);
		System.out.println(indent + group);

		for (Thread t : threads)
			if (t != null)
				System.out.printf("%s%s -> %s is %sDaemon%n",indent ,group.getName(), t,
						t.isDaemon() ? "" : "no ");

		ThreadGroup[] activeGroup = new ThreadGroup[group.activeGroupCount()];
		group.enumerate(activeGroup, false);
		for (ThreadGroup g : activeGroup)
			showGroupInfo(indent+indent, g);
	}
}
