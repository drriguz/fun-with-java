package fun.with.java.day2.t2;

/**
 * 这个类是接口的具体实现
 * @author riguz
 *
 */
public class LineParser implements GetPerson{
	public Person parse(String source){
		String [] arr = source.replaceAll("'", "").split(",");
		Person person = new Person();
		person.setName(arr[0] + " " + arr[1]);
		person.setAddress(arr[2]);
		person.setWebsite(arr[10]);
		return person;
	}
}
