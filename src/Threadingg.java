public class Threadingg implements PI1, PI2 {
	public void show()
    {
        // use super keyword to call the show
        // method of PI1 interface
        PI1.super.show();
  
        // use super keyword to call the show
        // method of PI2 interface
        PI2.super.show();
    }

	public static void main(String[] args) {
		
		Runnable obj2 = new B();
		Thread t1 = new Thread(() -> System.out.println("shubham"));
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();
		Threadingg t = new Threadingg();
		t.show();
		
	}
}

class A implements Runnable{
	 public void run() {
		try {
			Thread.sleep(2000);
			System.out.println("aa");
		} catch (Exception e) {}
	}
}


class B implements Runnable{
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("bb");
		} catch (Exception e) {}

	}
}

interface PI1
{
    // default method
    default void show()
    {
        System.out.println("Default PI1");
    }
}
interface PI2
{
    // Default method
    default void show()
    {
        System.out.println("Default PI2");
    }
}
