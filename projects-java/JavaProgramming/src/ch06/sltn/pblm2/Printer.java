package ch06.sltn.pblm2;

public class Printer {
	void println(int number) {
		this.println(number, true, 5.7, "홍길동");
	}
	
	void println(int number, boolean bl) {
		this.println(number, bl, 5.7, "홍길동");
	}
	
	void println(int number, boolean bl, double db) {
		this.println(number, bl, db, "홍길동");
	}
	
	/*
	void println(int number, boolean bl, double db, String name) {
		System.out.println(number);
		System.out.println(bl);
		System.out.println(db);
		System.out.println(name);
	}
	*/
	static void println(int number, boolean bl, double db, String name) {
		System.out.println(number);
		System.out.println(bl);
		System.out.println(db);
		System.out.println(name);
	}
}
