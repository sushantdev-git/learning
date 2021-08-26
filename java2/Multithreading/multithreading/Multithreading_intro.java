package multithreading;

public class Multithreading_intro {
	
	/*
	 >Thread is a lightweight sub process
	 
	 >it is the smallest independent unit of a program
	 
	 >contains a separate path of execution
	 
	 >Every java program contains at least one thread
	 
	 >A thread is created & controlled by the java.lang.Thread class
	 
	 
	 Life cycle of thread
	 	
	 	A java thread can lie only in one of the shown states at any point of time
	 	
	 	New :
	 		A new thread begins its life cycle in this state & remains here
	 		until the program starts the thread. it is also known as born thread
	 		
	 	Runnable:
	 		Once a newly born thread starts, the thread comes under runnable state. A
	 		Thread stays in this state is until it is executing its task.
	 		
	 	Running:
	 		In this state a thread starts executing by entering run() method and the yeild()
	 		method can send them to go back to the runnable state.
	 		
	 	Waiting:
	 		A thread enters this state when it is temporarily in an inactive state i.e 
	 		it is still alive but is not eligible to run. It can be in waiting, 
	 		sleeping, or blocked state.
	 	
	 	Terminated:
	 		A runnable thread enters the terminated state when it completes
	 		its task or otherwise terminates.
	 	
	 	Example:
	 		When you play a song in a media player
	 		Button to play audio: new thread
	 		stars playing: runnable to running
	 		pause: waiting
	 		stop or song ended: terminated
	 	
	 	Example:
	 		Download image
	 		download button clicked: new thread
	 		image downloading(in background fetching data from server): runnable to running
	 		download image finish: terminated
	 	
	 
	 Create a thread:
	 	Why we want to create a thread:
	 	
	 		By default in java a thread in created when main 
	 		method is created which is called a main thread.
	 		
	 		Main method contains instructions which main thread
	 		will execute one by one
	 		
	 		But, when you have long set of instructions in main method
	 		it can take a long time
	 		In, this case the below written instructions get blocked
	 		due to which some time operating systems gives
	 		pop-up like:
	 			you want to kill that application or wait
	 			
	 		To avoid these long set of instruction to run in main,
	 		and to decrease time taken by program to complete
	 		we need Thread
	 		
	 		Now thread can be executed with thread class or Runnable Interface
	 		These both class and interface are present in java.lang package
	 		so we need not to import these.
	
	Difference between Thread class and Runnable interface
	
		Thread class									Runnable interface
		> Each thread creates its unique object         > Each thread created its unique object
		> More memory consumption						> More Memory consumption
		> A class extending Thread class can't extend	> Along with runnable a class can implement
		any other class									any other interface and extend other class
		> Thread class is extended only if there is 	> Runnable is implemented only if there is a need 
		a need of overriding other method of it			of special run method
		>Enables tight coupling							>Enables loose coupling
		
		#coupling means dependency of elements of class over each other
	 		
	 
	Java Main thread
		
		>Main thread is the most important thread of a java program
		>It is executed whenever a java program starts
		>Every program must contains this thread for its execution to take place
		>Java main thread is needed of because of the following reasons:
			1> From this, other "child" thread are spawned
			2> It must be the last thread to finish execution i.e
			when the main thread stops program terminates
	
	
	
	 
	 */
}
