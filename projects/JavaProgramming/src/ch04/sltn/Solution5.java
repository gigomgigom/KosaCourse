package ch04.sltn;

public class Solution5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//중첩 for 문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력하는 코드를 작성해보세요.
		//10 4, 5 8
		int x = 1; //4의 해
		
		for(int y = 1; y <= 10; y++) {
			
			int num = 60 - (5*y);
			
			for(int i = 1; i <= 10; i++) {
				
				if(num == 4*i) {
					
					x = i;
					System.out.printf("(%d, %d) ", x, y);
					
				}
				
			}	
		}	
	}
}
