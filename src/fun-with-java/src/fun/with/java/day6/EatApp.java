package fun.with.java.day6;

public class EatApp {

	public static void main(String[] args) {
		String config = "zhangyi";
		IEat eat = null;
		try{
			eat.eatSomething("xx");
		}
		catch(NullPointerException e){
			System.out.println("______");
			e.printStackTrace();
		}
		try {
			Class c = Class.forName("fun.with.java.day6.ZhangyiEat");
			c.newInstance();

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}

		Class c1 = MyClass.forName("fun.with.java.day6.ZhangyiEat"); 
	}

}
