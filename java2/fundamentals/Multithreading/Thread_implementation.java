package Multithreading;

public class Thread_implementation {
	
	public static void main(String args[]) {
		int n=8;
		for(int i=0; i<n; i++) {
			thrd object = new thrd();//creating n new thread and running them simultaneously
			object.start();
		}
	}
	
}
class thrd extends Thread{
	public void run() {
		try {
			System.out.println("Thread"+Thread.currentThread().getId()+" is running");
		}
		catch(Exception e) {
			System.out.println("Exception is caught");
		}
	}
}