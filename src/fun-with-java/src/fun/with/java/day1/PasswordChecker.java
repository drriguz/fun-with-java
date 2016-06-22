package fun.with.java.day1;

/**
 * 1.实现一个简单的密码强度检测：
 * 强：长度在10位以上，同时包含大小写字母和数字
 * 中：长度为6-10位，包含字母和数字
 * 弱：其他情况的密码都是弱密码
 * @author riguz
 *
 */
public class PasswordChecker {
	public static void main(String[] args) {
		//这是一个示例密码
		String password = "123456Abcdef";

		boolean hasNumber = false,      //是否包含数字
				hasUpper = false,       //是否包含大写字母
				hasLower = false;       //是否包含小写字母
		
		int length = password.length(); //密码长度

		//判断密码中是否含有数字和字母
		for(int i = 0; i < password.length(); i++){
			char c = password.charAt(i);
			if(c >= '0' && c <= '9')
				hasNumber = true;
			if(c >= 'a' && c <= 'z')
				hasLower = true;
			if(c >= 'A' && c <= 'Z')
				hasUpper = true;
		}

		//定义密码强度级别：1弱，2中，3强
		int passwordLevel = 0;

		if(length > 10 && hasNumber && hasUpper && hasLower)
			passwordLevel = 3;
		else if(length >=6 && length <=10 && hasNumber && (hasUpper || hasLower))
			passwordLevel = 2;
		else
			passwordLevel = 1;

		
		//根据级别输出密码强度
		switch(passwordLevel){
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

}
