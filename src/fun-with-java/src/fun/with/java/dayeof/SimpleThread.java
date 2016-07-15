package fun.with.java.dayeof;

public class SimpleThread {

	public static void main(String[] args) {
		Thread t = new Thread(new SomeTask(1));
		t.start();

		for(int i = 0; i < 5000; i++){
			Thread tt = new Thread(new SomeTask(i));
			tt.start();
		}
		System.out.println("EOF");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		int count = Counter.getInstance().getCount();
		System.out.println(count);
	}
}
