package Threads;

public class ThreadsMain {
	public static void main(String[] args) {
		MyThreads t1 = new MyThreads();
		MyThreads t2 = new MyThreads();
		
		t1.setName("Ping");
		t2.setName("Pong");
		
		t1.start();
		Thread.yield();
		t2.start();
	}
}
