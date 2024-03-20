package ch15.sec05.exam01;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		//TreeSet클래스가 갖고있는 메소드를 사용하기 위해 Set 타입 변수를 만들지않음.
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
				
		//Treeset이 가지는 메소드
		
		//최대값, 최소값 찾기
		System.out.println("가장 낮은 점수 : " + scores.first());
		System.out.println("가장 높은 점수 : " + scores.last());
		//주어진 값보다 크거나 작은 값 찾기
		System.out.println("95점 아래 점수 : " + scores.lower(95));
		System.out.println("95점 위의 점수 : " + scores.higher(95));
		//주어진값을 찾거나 없다면 그보다 바로 위 아래 값을 찾기
		System.out.println("95점이거나 바로 아래 점수 : " + scores.floor(95));
		System.out.println("85점이거나 바로 위의 점수 : " + scores.ceiling(85));
		
		System.out.println();
		
		//하나씩 객체를 올림차순으로 가져오기
		System.out.print("올림차순나열 : ");
		for(int score : scores) {
			System.out.print(score + " ");
		}
		
		System.out.println();
		
		//하나씩 객체를 내림차순으로 가져오기
		System.out.print("내림차순나열 : ");
		for(int score : scores.descendingSet()) {
			System.out.print(score + " ");
		}
		
		System.out.println();
		
		//범위 검색(80 이상의 경우)
		System.out.print("80이상인 요소들 : ");
		for(int score : scores.tailSet(80, true)) {
			System.out.print(score + " ");
		}
		
		System.out.println();
		
		//범위 검색 ( 80 <= E < 90)
		System.out.print("80 <= E < 90를 만족하는 요소 : ");
		for(int score : scores.subSet(80, true, 90, false)) {
			System.out.print(score + " ");
		}

	}

}
