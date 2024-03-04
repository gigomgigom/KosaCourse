package ch05.sec06;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores;
		scores = new int[] {83, 90, 87};
		//또는 int[] scores = new int[] {83, 90, 87};
		int sum = 0;
		for(int i = 0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("종합: "+sum);
		
		printItem(new int[] { 83, 90, 87} );
		
		System.out.println("Exit Program");
	}
	
	public static void printItem(int[] args) {
		for(int i = 0; i<args.length; i++) {
			System.out.println("args["+i+"]: " + args[i]);
		}
	}

}
