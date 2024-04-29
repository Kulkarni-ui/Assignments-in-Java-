package assignment9;

public class Main {
	
	public static void main(String[] args) {
		Thread thread1 = new Thread("Thread 1");
		Thread thread2 = new Thread("Thread 2");
		// Start both threads
		thread1.start();
		thread2.start();
		// Check if threads are alive
		System.out.println(thread1.getName() + " is alive: " + thread1.isAlive());
		System.out.println(thread2.getName() + " is alive: " + thread2.isAlive());
		try {
			// Wait for thread1 to finish
			thread1.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread was interrupted.");
		}
		System.out.println(thread1.getName() + " is alive: " + thread1.isAlive());
		System.out.println(thread2.getName() + " is alive: " + thread2.isAlive());
		// Set the name of thread2
		thread2.setName("Renamed Thread 2");
		System.out.println("Renamed thread2 name: " + thread2.getName());
	}
}
