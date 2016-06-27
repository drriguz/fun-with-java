package fun.with.java.day3.t1;

public abstract class AbstractFileReader {
	protected String fileName;
	
	public AbstractFileReader(String fileName){
		this.fileName = fileName;
	}
	
	public abstract String readFile();
}
