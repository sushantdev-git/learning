package Multithreading;

class BRTicket
{
	int total_seats=10;
	synchronized void bookseat(int seats)
	{
		
		

		
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

public class Syncrhonized_block extends Thread{
	
	int seats;
	BRTicket b;
	
	Syncrhonized_block(BRTicket b){
		this.b = b;
	}
	
	public void run() {
		
//		synchronized(b) {//when ever you need to synchronized object 
//			//you can synchronized it via synchronize block
//			
//		}
		b.bookseat(seats);
		System.out.println(Thread.currentThread().getName());
	}
	
	
	public static void main(String args[]) {
		BRTicket b1 = new BRTicket();
		Syncrhonized_block p1 = new Syncrhonized_block(b1);
		p1.seats = 7;
		p1.start();
		
		Syncrhonized_block p2 = new Syncrhonized_block(b1);
		p2.seats = 3;
		p2.start();
		
		Syncrhonized_block p3 = new Syncrhonized_block(b1);
		p3.seats = 2;
		p3.start();
	}
	
}
