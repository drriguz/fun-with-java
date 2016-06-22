package fun.with.java.day2;

/**
 * 1.解析CSV文件中的一行，输出人员姓名(first_Name last_Name)
 * @author riguz
 *
 */
public class LineParser {
	/**
	 * 第一种办法：先按逗号切分，然后替换掉引号
	 * @param line
	 * @return
	 */
	public String parseName1(String line){
		String [] arr = line.split(",");
		String firstName = arr[0].replaceAll("'", "");
		String lastName = arr[1].replaceAll("'", "");
		return firstName + " " + lastName;
	}
	
	/**
	 * 第二种办法：先替换掉单引号，然后按单引号切分
	 * @param line
	 * @return
	 */
	public String parseName2(String line){
		String [] arr = line.replaceAll("'", "").split(",");
		return arr[0] + " " + arr[1];
	}
	
	/**
	 * 第三种办法：使用substring方法代替replace方法
	 * @param line
	 * @return
	 */
	public String parseName3(String line){
		String [] arr = line.split(",");
		String firstName = arr[0], lastName = arr[1];
		firstName = firstName.substring(1,  firstName.length() - 1);
		lastName = lastName.substring(1, lastName.length() - 1);
		return firstName + " " + lastName;
	}
	
	/**
	 * 第四种方法：根据逗号找到索引位置，然后截取字符串（不推荐）
	 * @param line
	 * @return
	 */
	public String parseName4(String line){
		int p1 = line.indexOf(',', 0);
		int p2 = line.indexOf(',', p1 + 1);
		String firstName = line.substring(1, p1 - 1);
		String lastName = line.substring(p1 + 2, p2 -1);
		return firstName + " " + lastName;
	}
	
	public static void main(String[] args){
		String line = "'Aleshia','Tomkiewicz','Alan D Rosenburg Cpa Pc','14 Taylor St','St. Stephens Ward','Kent','CT2 7PP','01835-703597','01944-369967','atomkiewicz@hotmail.com','http://www.alandrosenburgcpapc.co.uk'";
		LineParser parser = new LineParser();
		System.out.println(parser.parseName1(line));
		System.out.println(parser.parseName2(line));
		System.out.println(parser.parseName3(line));
		System.out.println(parser.parseName4(line));
	}
}
