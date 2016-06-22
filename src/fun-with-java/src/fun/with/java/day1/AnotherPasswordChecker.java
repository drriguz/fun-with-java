package fun.with.java.day1;

/**
 * 2.实现一个简单的密码强度检测：
 * 强：长度在10位以上，同时包含大小写字母和数字
 * 中：长度为6-10位，包含字母和数字
 * 弱：其他情况的密码都是弱密码
 * 
 * 要求将功能拆分成函数，简化main代码
 * @author riguz
 *
 */
public class AnotherPasswordChecker {
	private boolean between(char from, char to, String source){
		for(int i = 0; i < source.length(); i++){
			char c = source.charAt(i);
			if(c >= from && c <= to)
				return true;
		}
		return false;
	}

	public boolean hasUpper(String source){
		return this.between('A', 'Z', source);
	}

	public boolean hasLower(String source){
		return this.between('a', 'z', source);
	}

	public boolean hasNumber(String source){
		return this.between('0', '9', source);
	}

	public int getPasswordLevel(String source){
		boolean hasNumber = this.hasNumber(source),      //是否包含数字
				hasUpper = this.hasUpper(source),       //是否包含大写字母
				hasLower = this.hasLower(source);       //是否包含小写字母

		int length = source.length(); //密码长度
		//定义密码强度级别：1弱，2中，3强
		int passwordLevel = 0;

		if(length > 10 && hasNumber && hasUpper && hasLower)
			passwordLevel = 3;
		else if(length >=6 && length <=10 && hasNumber && (hasUpper || hasLower))
			passwordLevel = 2;
		else
			passwordLevel = 1;
		return passwordLevel;
	}

	public void printLevel(int level){
		switch(level){
		case 1:
			System.out.println("弱");
			break;
		case 2:
			System.out.println("中");
			break;
		case 3:
			System.out.println("强");
			break;
		default:
			break;
		}		
	}

	public static void main(String[] args) {
		//这是一个示例密码
		String [] passwords = {"123456Abcdef", "123", "00000000", "12345678Nb"};
		AnotherPasswordChecker checker = new AnotherPasswordChecker();
		for(String password:passwords){
			int level = checker.getPasswordLevel(password);
			checker.printLevel(level);
		}
	}

}
