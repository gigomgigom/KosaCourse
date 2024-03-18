package ch05.sec09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldArray = {"자바", "배열", "복사"};
		String[] newArray = new String[5];
		
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		
		for(int i = 0; i < newArray.length; i++) {
			System.out.println("newArray["+i+"] = " + newArray[i]);
		}
	}
}
