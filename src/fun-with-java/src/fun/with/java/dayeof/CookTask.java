package fun.with.java.dayeof;

public class CookTask implements Runnable{
	String name;

	public CookTask(String name){
		this.name = name;
	}

	@Override
	public void run() {
		//System.out.println("Started:" + this.name);
		Connection c = Connection.getInstance();
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		//System.out.println("Finished:" + this.name);
	}

}
