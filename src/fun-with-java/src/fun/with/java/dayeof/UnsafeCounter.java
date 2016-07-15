package fun.with.java.dayeof;

public class UnsafeCounter {
	private static int count = 0;

	private static UnsafeCounter instance = null;

	private UnsafeCounter(){
		System.out.println("Constructed");
	}

	public static UnsafeCounter getInstance(){
		if(instance == null){
			instance = new UnsafeCounter();
		}
		return instance;
	}
}
