package fun.with.java.day6;

public class EatApp {

	public static void main(String[] args) {
		String config = "fun.with.java.day6.ChenzhuoEat";
		try {
			Class c = Class.forName(config);
			Object inst = c.newInstance();
			IEat e = (IEat)inst;
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}

		//eat.eatSomething("xx");
	}

}
