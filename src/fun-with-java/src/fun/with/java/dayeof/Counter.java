package fun.with.java.dayeof;

public class Counter {
	private static int count = 0;

	private static Counter counter = new Counter();

	public static Counter getInstance(){
		return counter;
	}

	public synchronized int count(){
		count = count + 1;
		return count;
	}

	public int getCount(){
		return count;
	}
}
