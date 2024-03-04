package ch05.sltn;

import java.util.Scanner;

public class Sltn9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); //키보드 입력을 위한 Scanner 참조 타입 객체 생성
		boolean nonInputData = true; //점수가 입력되었는지 아직 입력되지않았는지 확인하기 위한 상태 저장값
		boolean loopFlag = true; //while문 조건식에 들어갈 논리타입 변수 (종료)
		int[] scores = new int[0]; //int형식 값이 들어가는 배열을 참조하는 scores 변수를 생성
		
		while (loopFlag) {
			String input = "";
			int studentCnt = 0;
			
			System.out.println("--------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택 > ");
			input = scanner.nextLine();
			switch(input) {
				case "1":
					System.out.print("학생수>");
					studentCnt = Integer.parseInt(scanner.nextLine());
					
					scores = new int[studentCnt];
					break;
				case "2":
					if(scores.length != 0) {
						for(int i = 0; i < scores.length; i++) {
							System.out.print("scores["+i+"]");
							scores[i] = Integer.parseInt(scanner.nextLine());
						}
						nonInputData = false;
						break;						
					} else if(scores.length == 0){						
						System.out.println("점수를 입력하기 전 메인메뉴에서 학생 수를 입력해주세요(메뉴1)");
						break;
					}
					
				case "3":
					if(scores.length == 0) {
						System.out.println("점수를 확인하기 전 메인메뉴에서 학생 수부터 입력해주세요(메뉴1)");
						break;
					} else if(nonInputData) {
						System.out.println("점수를 확인하기 전 메인메뉴에서 학생들의 점수를 입력해주세요(메뉴2)");
						break;
					} else {
						for(int i = 0; i < scores.length; i++) {
							System.out.println("scores[" + i + "] : " + scores[i]);
						}
						break;
					}
				case "4":
					if(scores.length == 0) {
						System.out.println("점수를 확인하기 전 메인메뉴에서 학생 수부터 입력해주세요(메뉴1)");
						break;
					} else if(nonInputData) {
						System.out.println("점수를 확인하기 전 메인메뉴에서 학생들의 점수를 입력해주세요(메뉴2)");
						break;
					}
					int max = 0;
					int sum = 0;
					for(int i = 0; i < scores.length; i++) {
						if(max < scores[i]) {
							max = scores[i];
						}
						sum += scores[i];
					}
					double avg = (double)sum / scores.length;
					
					System.out.println("최고 점수 : " + max);
					System.out.println("평균 점수 : " + avg);
					break;
				case "5":
					System.out.println("프로그램을 종료합니다.");
					loopFlag = false;
					break;
				default:
					System.out.println("비정상적인 입력입니다. 주어진 번호(1~5)에 대해서 입력하세요.");
					System.out.println("입력하신 번호 : " + input);
					break;
			}
			
		}
		scanner.close();
	}

}
