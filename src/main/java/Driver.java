import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Current count:" + counter.getCount());

		counter.increaseBy(5);

		system.out.println("Current count:" + counter.getCount());
		
		counter.increaseBy(2);

		system.out.println("Current count:" + counter.getCount());
		
		counter.increaseBy(8);

		system.out.println("Current count:" + counter.getCount());
		
	}

}
