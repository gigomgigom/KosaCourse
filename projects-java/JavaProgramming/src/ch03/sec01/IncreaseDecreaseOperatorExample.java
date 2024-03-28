package ch03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10; //변수 초기화
		int y = 10; //변수 초기화
		int z; //변수 선언만 함(초기화 X)
		
		x++; //x에 1더하기 (1트) x값은 11
		++x; //x에 1더하기 (2트) x값은 12
		System.out.println("x = " + x); //x에 1을 두번 더했으니 12가 된다.
		
		System.out.println("---------------------------------------");
		
		y--; //y에 1빼기 (1트) y값은 9
		--y; //y에 1빼기 (2트) y값은 8
		System.out.println("y = " + y); //y에 1을 두번 뺐으니 8이 된다.
		
		System.out.println("---------------------------------------");
		
		z = x++; //z값에 x값을 넣은 후 x값을 1 증가시킴. z:12 x:13
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		System.out.println("---------------------------------------");
		
		z = ++x; //x값 1증가, z값 x값 대입 z: 14 x: 14
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		System.out.println("---------------------------------------");
		
		z = ++x + y++; //우선 x값을 1 증가시키고 y값을 더한 값을 z에 대입한다. 그 후 y값을 1증가시킨다. x:15 z :23 y:9
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("y= " + y);
	}
}
