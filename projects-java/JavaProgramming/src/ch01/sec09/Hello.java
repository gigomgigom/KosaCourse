package ch01.sec09;

public class Hello {
	
	public static void main(String[] args) {
		int var1;
		boolean flag = true;
		
		if(flag) {
			int var2;
			//var1, flag, var2 사용가능
			//str 사용불가
		}
		
		while(flag) {
			String str;
			//var1, flag, str 사용가능
			//var2 사용불가
		}
		//var1, flag 사용가능
		//var2, str 사용불가
	}
}