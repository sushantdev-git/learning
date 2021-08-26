package multithreading;
//class Mytask{
//	
//	void executeTask() {
//		for(int i=0; i<=10; i++) {
//			System.out.println("@@ Printing Document #"+i+" - Printer 2");
//		}
//	}
//	
//}

class Yourtask extends Thread{
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println("@@ Printing Document #"+i+" - Printer 2");
		}
	}
	
}

class CA{
	
}

//class Mytask extends Thread,CA{ -> this is a error as multiple inheritance is not supported
class Mytask extends CA implements Runnable{//You can implement runnable in case
	//of multiple inheritance
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println("## Printing Document #"+i+" - Printer 3");
		}
	}
	
}


public class Thread_domo_class {
	
	//main method represents main thread
	public static void main(String args[]) {
		/*
		 Whatever we write in here will be executed by main thread
		 threads always executed the jobs in a sequence
		 Thread is an Execution context
		 
		 */
		
		//job1
		System.out.println("Applicatio is started");
		
		
		
		//job2
		Yourtask task1 = new Yourtask(); //Child Thread / Worker Thread
		//This task will not affect the performance of main thread
		//task.executeTask()
		task1.start();  //start shell internally execute run method
		
		Runnable r = new Mytask();//This is a polymorphic statement
		//Referance of variable if interface is pointing to object 
		//which implents it
		
		Thread task2 = new Thread(r);
		task2.setDaemon(true);//Daemon thread is a thread which will be started
		//when program starts, and it starts will main thread
		task2.start();
		
		//Till job2 is not completed, below written jobs are waiting and are not executed
		//In case job2 is a long running operation, i.e several documents are suppose to be printed
		//or you can say long running operation
		//In such a use case OS/JVM shall give a message that app is not responding
		//some sluggish behavior in app can be observed -> App seems to hang
		
		//Now main and Mytask are executing both parallely or concurrently!!
		//Thats why we are getting mixed output
		
		//job3
		for(int i=1; i<=10; i++) {
			System.out.println("^^ Printing Document #"+i+" - Printer 1");
		}
		
		//job4
		System.out.println("Application finished");
	}
	
}
