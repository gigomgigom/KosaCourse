package ch02.sec06;

public class TextBlockExample {
	
	/*
	{
		"id": "윈터",
		"name": "눈송이"
	}
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//우리가 일전에 배웠던 방식대로 한번 작성해보자 본 소감은...? 어우 어지러
		String str1 = "" + "{\n" + "\t\"id\": \"윈터\"\n" + "\t\"name\": \"눈송이\"\n" + "}";
		
		System.out.println(str1);
		
		String str2 = """
	{
		"id": "윈터",
		"name": "눈송이"
	}
				""";
		System.out.println(str2);
	}

}
