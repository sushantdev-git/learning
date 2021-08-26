package Multithreading;

public class Thread_implmentation_runnable {
	//using runnable interface to use thread
	public static void main(String args[]) {
		int n=8;
		for(int i=0; i<n; i++) {
			Thread object = new Thread(new thrdd());//creating n new thread and running them simultaneously
			//here object is created using main thread class
			//all these objects are used to complete a single task
			object.start();
		}
	}
}
class thrdd implements Runnable{
	public void run() {
		try {
			System.out.println("Thread"+Thread.currentThread().getId()+" is running");
		}
		catch(Exception e) {
			System.out.println("Exception is caught");
		}
	}
}