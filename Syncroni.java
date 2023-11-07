package BasicJavaPackege;

public class Syncroni {
	int  total_seats=10;
	synchronized void emp(int seats) {
		System.out.println("hi:"+Thread.currentThread().getName());
		System.out.println("hi:"+Thread.currentThread().getName());
		System.out.println("hi:"+Thread.currentThread().getName());
		System.out.println("hi:"+Thread.currentThread().getName());
		synchronized( this) {
			if(total_seats>=seats) {
				System.out.println("seats are booked");
				total_seats=total_seats-seats;
				System.out.println("reaminng tatolseats="+total_seats);
				
			}
			else {
				System.out.println("Seats are not booked ");
				total_seats=total_seats-seats;
				System.out.println("totalseats="+total_seats);
				
			}
			
			
		}
		System.out.println("hi:"+Thread.currentThread().getName());
		System.out.println("hi:"+Thread.currentThread().getName());
		System.out.println("hi:"+Thread.currentThread().getName());
		
	}

	public static void main(String[] args) {
		

	}

}
class Emplyee extends Thread{
	static Syncroni b;
	int seats;
	public void run() {
		b.emp(seats);
		
	}
	public static void main(String args[]) {
		b=new Syncroni();
		Emplyee ep=new Emplyee();
		Emplyee ed=new Emplyee();
		ep.seats=7;
		ep.start();
		ed.seats=3;
		ed.start();
	}
}
