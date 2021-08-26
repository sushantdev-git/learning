package multithreading;
/*
	Multithreading is the ability of a program to run two or more threads
	concurrently, where each thread can handle a different task at the 
	same time making optimal use of available resources.

*/
class Printer{
		
	synchronized void printDocument(int numOfCopies, String docName){
		//when we use synchronized we lock our method with one thread
		//when execution of one thread is completed then any other thread
		//can access this method
		
		for (int i=1; i<=numOfCopies; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(">> Printing "+docName+" "+i);
		}
	}
}

class MyThread extends Thread{
	Printer pRef;
	
	MyThread(Printer p){
		pRef = p;
	}
	
	public void run() {
		
		synchronized(this) {
			pRef.printDocument(10, "JhonCopy.pdf");
		}
		
	}
}

class YourThread extends Thread{
	Printer pRef;
	
	YourThread(Printer p){
		pRef = p;
	}
	
	public void run() {
		
		synchronized(this) {//we can also use synchronized block to synchronized our block
			pRef.printDocument(10, "SushantCopy.pdf");
		}
		
	}
}

class T3 extends Thread{
	Printer pRef;
	
	T3(Printer p){
		pRef = p;
	}
	
	public void run() {
		
		synchronized(this) {//we can also use synchronized block to synchronized our block
			pRef.printDocument(10, "IshantCopy.pdf");
		}
		
	}
}


public class Multithreading {
	
	
	
	//main is representing main thread
	public static void main(String args[]) {
		
		System.out.println("Application started");
		
		Printer printer = new Printer();
//		printer.printDocument(10, "SushantProfile.pdf");
		
		//Scenario is that we have multiple thread working on the same Printer object
		//If Multiple Threads are going to work on the same single object we must Synchronized Them
		
		MyThread mRef  = new MyThread(printer);//MyThread is having reference to Printer object
		YourThread yRef = new YourThread(printer);//YourThread is having reference to Printer Object
		T3 t = new T3(printer);
		mRef.start();
//		try {
//			mRef.join();when we use join we are saying all first mRef will be completely
		//executed than any other thread will executed
		
		//but this is impossible to every object to mark join 
		//so we use synchronized keyword with our method
		
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		yRef.start();
		t.start();
		
		
		
		System.out.println("Applicatio finished");
	}
}
