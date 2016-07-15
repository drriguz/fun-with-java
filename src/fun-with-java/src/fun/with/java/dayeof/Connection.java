package fun.with.java.dayeof;

public class Connection {
	private static Connection connection = null;

	private Connection(){
		System.out.println("Created connection");
	}

	public synchronized static Connection getInstance(){
		if(connection == null)
			connection = new Connection();
		return connection;
	}
}
