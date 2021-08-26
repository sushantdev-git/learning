package Multithreading;

class BookRailwayTicketSeat
{
	int total_seats=10;
	synchronized void bookseat(int seats)//if you remove synchronized, this will create data inconsistancy
	//means data will not be manipulate as required
	
	//Thread output will always be random you can't predict that
	{
	
		System.out.println("New Thread is created"+Thread.currentThread().getName());
		System.out.println("New Thread is created"+Thread.currentThread().getName());
		System.out.println("New Thread is created"+Thread.currentThread().getName());
		
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
class Booking extends Thread
{
	static BookRailwayTicketSeat b;
	int seats;
	public void run()
	{
		b.bookseat(seats);
	}
	public static void main(String x[])
	{
		b=new BookRailwayTicketSeat();
		Booking Person1=new Booking();
		Person1.seats=7;
		Person1.start();
		Booking Person2=new Booking();
		Person2.seats=10;
		Person2.start();
		Booking Person3=new Booking();
		Person3.seats=10;
		Person3.start();
	}
}
