package multithreading;

/*
 Initially if you directly call run method through objects of that class
 it will be called as a normal method
 and we get a sequential output
 	Hi
	Hi
	Hi
	Hi
	Hi
	Hello
	Hello
	Hello
	Hello
	Hello
	we are getting a sequential output because there is only one thread i.e main thread
	running and tasks are executed one after another
	
	Now,
 	when a class extends Thread class it becomes a thread
 	
 	now, when you call the run method through start method the object of that class
 	will behave as a thread
 	
 	and as you can see there is two object of different class means there is two thread
 	and we are calling run method simultaneously, means both thread start executing at same
 	time
 	
 	so we see mixed output in console as thread is running simultaneously
 		Hi
		Hello
		Hello
		Hi
		Hello
		Hi
		Hello
		Hi
		Hello
		Hi
		here the both thread is running simultaneously so the "scheduler" have to decide 
		which one will go first -
		and it is completely random

 	
 	but if we dealy any thread by slight difference we can see sequential output
 	like :
 		Hi
		Hello
		Hi
		Hello
		Hi
		Hello
		Hi
		Hello
		Hi
		Hello
		
 	we are seeing this type of output because one thread is running slightly later that first one
 	
 
 */

public class Practical {
	
	public static void main(String args[] ) throws InterruptedException{
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		
		obj1.start();
//		Thread.sleep(10);
		obj2.start();

	}
}


class Hi extends Thread{
	
	public void run() {
		
		for(int i=0; i<5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Hello extends Thread{
	
	public void run() {
			
			for(int i=0; i<5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
}