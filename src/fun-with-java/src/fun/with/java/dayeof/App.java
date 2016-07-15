package fun.with.java.dayeof;

public final class App {
	public void cook(){
		System.out.println("Started");
		//...
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Finished");
	}

	public static void main(String[] args){
		Counter c = Counter.getInstance();
		for(int i = 0; i < 1000; i++){
			Thread t = new Thread(new Runnable(){
				@Override
				public void run() {
					for(int j = 0; j < 100; j++)
						c.count();
				}
			});
			t.start();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(c.getCount());
	}
}
