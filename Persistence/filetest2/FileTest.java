package filetest2;

import java.io.File;

/**
 * Demonstrating the output of resource information
 */
public class FileTest {

	public static void main(String[] args) {
		
		File[] roots = File.listRoots();
		
		for(File f: roots) {
			long freeSpace = f.getFreeSpace();	// since Java6
			long usableSpace = f.getUsableSpace();
			long totalSpace = f.getTotalSpace();
			System.out.println("\nRoot directory " + f.getPath());
			System.out.println("Total space: " + totalSpace/(1024*1024) + " MB");	
			System.out.println("Free space: " + freeSpace/(1024*1024) + " MB");
			System.out.println("Free and usable space: " + usableSpace/(1024*1024) + " MB");
		}
	}

}
