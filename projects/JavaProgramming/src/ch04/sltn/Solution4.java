package ch04.sltn;

public class Solution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		while (flag) {
			int num = (int)(Math.random()*6) + 1;
			int num1 = (int)(Math.random()*6) + 1;
			
			if(num+num1 == 5) {
				System.out.printf("(%d, %d) ", num, num1);
				flag = false;
			} else {
				System.out.printf("(%d, %d) ", num, num1);
			}
		}
	}

}
