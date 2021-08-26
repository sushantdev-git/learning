package Multithreading;

class BRT
{
	int total_seats=20;
	synchronized void bookseat(int seats)//if you remove synchronized, this will create data inconsistancy
	//means data will not be manipulate as required
	{
		
		//synchronization means if i am using this function then i will lock
		//this function and till i complete no can use this function
		
		
		
		if(total_seats>=seats)
		{
			System.out.println("Seats Booked Sucessfully");
			total_seats=total_seats-seats;
			System.out.println("Seats Left"+total_seats);
		}
		else
		{
			System.out.println("Seats cannot be booked");
		}

	
	}
}
class MyThread1 extends Thread
{
	BRT b1;
	int seats;
	MyThread1(BRT b1, int seats)
	{
		this.b1=b1;
		this.seats=seats;
	}
	public void run()
	{	
		synchronized(b1) {
			b1.bookseat(seats);
			System.out.println(Thread.currentThread().getName());
		}
		
	}
}

class MyThread2 extends Thread
{
	BRT b2;
	int seats;
	MyThread2(BRT b2, int seats)
	{
		this.b2=b2;
		this.seats=seats;
	}
	public void run()
	{
		synchronized(b2) {
			b2.bookseat(seats);
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class Static_synchronized 
{
	public static void main(String x[])
	{
		BRT b1=new BRT();
		MyThread1 t1=new MyThread1(b1,7);
		t1.start();
		MyThread2 t2=new MyThread2(b1,4);
		t2.start();
		
		BRT b2=new BRT();
		MyThread1 t3=new MyThread1(b2,8);
		t3.start();
		MyThread2 t4=new MyThread2(b2,1);
		t4.start();
	
	
	}
}