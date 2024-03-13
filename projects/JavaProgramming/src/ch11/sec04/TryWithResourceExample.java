package ch11.sec04;

public class TryWithResourceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(MyResource rs = new MyResource("A")) { //AutoCloseable로 사용 가능한 클래스 타입으로 객체가 생성되어야함.
			String data = rs.read1();
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("예외처리: " + e.getMessage());
		}
		
		System.out.println();
		
		try (MyResource res = new MyResource("A")) {
			String data = res.read2();
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("예외처리: " + e.getMessage());
		}
		
		System.out.println();
		
		MyResource res1 = new MyResource("A");
		MyResource res2 = new MyResource("B");
		
		try (res1; res2) {
			String data1 = res1.read1();
			String data2 = res2.read1();
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
	}
}
