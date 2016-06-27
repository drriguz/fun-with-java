package fun.with.java.day5;

public final class Utils {
	public static boolean isNullOrEmpty(String str){
		return str == null || str.length() == 0;
	}
	
	public static String padding(String str, int totalLength){
		for(int i = 0; i < totalLength - str.length(); i++){
			str += "..";
		}
		return str;
	}
}
