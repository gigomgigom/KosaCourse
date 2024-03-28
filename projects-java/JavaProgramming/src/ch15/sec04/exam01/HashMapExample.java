package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public 	class HashMapExample {

	public static void main(String[] args) {
		// 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();

		//엔트리 저장
		map.put("홍길동", 85); //컬렉션에는 객체만 저장될 수 있으므로 기본타입들은 자동 박싱되어 컬렉션에 저장된다.
		map.put("감자바", 90);
		map.put("동장군", 80);
		map.put("홍길동", 70); //문자열 리터럴이 같으면 동일 문자열 객체를 참조한다. 동등객체이므로 HashMap내부에 존재하는 홍길동 정보를 대체한다.
		map.put(new String("홍길동"), 95); //hashCode()값이 같고 equals()가 true가 나오기때문에 동등객체 취급한다. 동등객체이므로 HashMap내부에 존재하는 홍길동 정보를 대체한다.

		
		//저장된 엔트리 갯수(키 수)
		System.out.println("총 Entry 수: " + map.size());
		
		//키로 값을 얻기
		String key = "홍길동";
		int value = map.get(key); //get()메소드로 받아온 데이터는 Integer타입이다. 이를 int기본타입 변수에 저장해야하므로 자동 언박싱이 이루어진다.
		System.out.println(key + "키의 값은 : " + value);
		
		//엔트리를 하나씩 가져와서 키와 값을 출력
		//방법 1
		for(Entry<String, Integer> entry : map.entrySet()) {
			String k = entry.getKey();
			int v = entry.getValue();
			System.out.println(k + " : " + v);
		}
		System.out.println();
		//방법 2
		for(String k : map.keySet()) {
			int v = map.get(k);
		}
		System.out.println();
		//세트 콜렉션의 객체 수에 변화가 생긴다면?
		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			String k = entry.getKey();
			int v = entry.getValue();
			
			if(k.equals("홍길동")) {
				iterator.remove();
			} else {
				System.out.println(k + " : " + v);
			}
		}
	}

}
