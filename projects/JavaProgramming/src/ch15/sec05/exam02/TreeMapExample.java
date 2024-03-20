package ch15.sec05.exam02;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		
		//TreeMap에 Entry객체 추가
		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("description", 40);
		treeMap.put("ever", 50);
		treeMap.put("zoo", 80);
		treeMap.put("base", 20);
		treeMap.put("guess", 70);
		treeMap.put("cherry", 30);
		
		//treeMap 내부에 정렬된 데이터들을 하나씩 가져오겠습니다.
		Set<Entry<String, Integer>> entrySet = treeMap.entrySet();
		for(Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println();
		
		Entry<String, Integer> entry = null;
		
		//첫번째 엔트리(최솟값) 찾기
		entry = treeMap.firstEntry();
		System.out.println("TreeMap의 첫번째 엔트리(최소값) : " + entry.getKey() + "-" + entry.getValue());
		
		//마지막 엔트리(최대값) 찾기
		entry = treeMap.lastEntry();
		System.out.println("TreeMap의 마지막 엔트리(최댓값) : " + entry.getKey() + "-" + entry.getValue());
		
		//주어진 엔트리 키값보다 앞의 엔트리 찾기
		entry = treeMap.lowerEntry("ever");
		System.out.println("ever 키값보다 앞의 엔트리 : " + entry.getKey() + "-" + entry.getValue());
		
		System.out.println();
		
		//내림차순으로 정렬하기
		NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
		Set<Entry<String, Integer>> descendingEntrySet = descendingMap.entrySet();
		//treeMap.descendingMap().entrySet()
		for(Entry<String, Integer> e : descendingEntrySet) {
			System.out.println(e.getKey() + " - " + e.getValue());
		}
		
		System.out.println();
		
		//Map에서 문자열값이 들어오게되면 사전 순으로 정렬이 되므로 첫번째 글자 기준으로 검색을 한다.
		System.out.println("[c~h]사이의 단어 검색");
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "h", false);
		//treeMap.subMap("c", true, "h", false).entrySet()1
		for(Entry<String, Integer> e : rangeMap.entrySet()) {
			System.out.println(e.getKey() + "-" + e.getValue());
		}
		
	}

}
