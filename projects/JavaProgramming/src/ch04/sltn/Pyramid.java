package ch04.sltn;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 5; i <10 ; i++) {
			for(int j = 1; j < 10-i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k < i-3; k++) {
				if(k==1) {
					System.out.print("*");
				} else {
					System.out.print("**");
				}
			}
			System.out.println();
		}
	}

}
