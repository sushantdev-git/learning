package Multithreading;

class resource{
	int item;
	boolean flag = false;
	
	public synchronized void produce(int item) {
		
		while(flag) {
			
			try {
				wait();
			}
			catch(Exception e) {
				System.err.println("You got some error");
			}
		}
		
		System.out.println("Producer "+item);
		this.item = item;
		flag = true;
		notify();
	}
	
    public synchronized void consume() {
		
		while(!flag) {
			
			try {
				wait();
			}
			catch(Exception e) {
				
			}
		}
		
		System.out.println("Consumer"+item);
		flag = false;
		notify();
	}
}

class producer implements Runnable{
	
	resource r;
	
	public producer(resource r) {
		this.r = r;
		Thread t = new Thread(this,"producer");
		t.start();
	}
	
	public void run() {
			
		int i=0;
		while(true) {
			r.produce(i++);
			try {
				Thread.sleep(1000);//thread can throw interrupted exception
			}
			catch(Exception e) {
				
			}
		}
	}
	
}

class consumer implements Runnable{
	
	resource r;
	
	public consumer(resource r) {
		this.r = r;
		Thread t = new Thread(this,"producer");
		t.start();
	}
	
	public void run() {
			
		while(true) {
			r.consume();
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
		}
	}
	
}
public class Inter_thread_communication{
	/*
	 Thread can communicate with each other with these three methods
	 wait() - used to wait the thread
	 notify() - used to notify a thread
	 notifyAll() - used to notify all thread
	 */
	public static void main(String args[]) {
		
		resource r = new resource( );
		producer p = new producer(r);
		consumer c = new consumer(r);

	}
	
}


