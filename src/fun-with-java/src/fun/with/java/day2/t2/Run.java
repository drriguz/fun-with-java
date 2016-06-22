package fun.with.java.day2.t2;

/**
 * 2.用面向对象的方法来实现题目一
 * @author riguz
 *
 */
public class Run {
	public static void main(String[] args){
		String line = "'Aleshia','Tomkiewicz','Alan D Rosenburg Cpa Pc','14 Taylor St','St. Stephens Ward','Kent','CT2 7PP','01835-703597','01944-369967','atomkiewicz@hotmail.com','http://www.alandrosenburgcpapc.co.uk'";
		
		//这里申明一个接口，并new了一个具体的实现
		GetPerson g = new LineParser();
		Person person = g.parse(line);
		
		//注意这里重载了toString()方法
		System.out.println(person);
	}
}
