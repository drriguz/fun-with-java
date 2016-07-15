package fun.with.java.dayeof;

public class SomeTask implements Runnable{
	int taskId;

	public SomeTask(int taskId){
		this.taskId = taskId;
	}

	@Override
	public void run() {
		System.out.println(String.format("=>Thread [%d] startted", this.taskId));
		try {
			for(int i = 0; i < 100; i++)
				Counter.getInstance().count();
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(String.format("=:Thread [%d] stopped", this.taskId));
	}

}
