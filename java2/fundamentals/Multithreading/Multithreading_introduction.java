package Multithreading;

public class Multithreading_introduction extends Thread{
	
	/*
	 Multithreading in java is a process of executing multiple threads simultaneously.
	 
	 A thread is a lightweight sub-process, the smallest unit of processing.
	 Multiprocessing and multithreading, both are used to achieve multitasking.
	 
	 Thread is smallest unit of process.
	 A thread is a path of execution within a process
	 
	 However, we use multithreading than multiprocessing because threads use a shared area.
	 They don't allocate separate memory area so saved memory, and context switching between
	 the threads take less time than process.
	 
	 Java Multithreading is mostly used in games, animation etc.
	 
	 Advantages of java Multithreading,
		 Multiple operations at same time
		 it saves time as process occur simultaneously
		 threads are independent, so it doesn't effect other process
	 
	 Multitasking
	 	Multitasking is a process of executing multiple tasks simultaneously.
	 
	 process-based multitasking
	 thread-based multitasking
	 
	 Process-based multitasking
	 	Each process has an address in memory, In other words, each process allocates
	 
	 Context-switching - to travel from one thread to another thread in running status 
	 is done via context-switching
	 
	 Thread-based Multitasking
		 threads share the same address space.
		 A thread is lightweight.
		 Cost of communication between the thread is low
	
	Java thread class
		We can use thread class to achieve thread programming
			#we get thread error when we don't define main in program
		Thread class extends object class and implements Runnable interface.
	
	Thread creation by extending by extending the Thread class
		java.lang.Thread is by default imported
		Thread class provide some method
		like run(), start()
		
	You can see all methods of Thread class
	using : javap java.lang.Thread
	
	 
	 */
	int value[]= {1,2,3,4,5};
	
	public void run() {
		for(int i=0; i<5; i++) {
			value[i] = value[i]*value[i];
			System.out.println("After squaring values "+value[i]);
		}
	}
	
	public static void main(String args[]) {
		Multithreading_introduction t1 = new Multithreading_introduction();
		t1.start();//start will search run method and execute that method
	}
}
