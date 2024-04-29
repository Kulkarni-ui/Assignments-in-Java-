package assignment9;
public class thread extends Thread {
public thread(String name) {
super(name);
}
public void run() {
System.out.println("Thread " +
Thread.currentThread().getName() + " is running.");
try {
// Sleep for 1 second
Thread.sleep(1000);
} catch (InterruptedException e) {
System.out.println("Thread " +
Thread.currentThread().getName() + " was interrupted.");
}
System.out.println("Thread " +
Thread.currentThread().getName() + " is finished.");
}
}
