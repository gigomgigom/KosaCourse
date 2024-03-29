package ch05.sltn;

import java.util.Scanner;

public class Sltn9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 추가적으로 해야할 것들 메뉴 번호 선택 후 진입할 시 -> 스캐너 입력값이 숫자인지 문자인지 구분(이건 아직 교육진도에 맞지 않아 불가능) -> 숫자가 맞다 할지라도 음수 양수 구분
		
		Scanner scanner = new Scanner(System.in); //키보드 입력을 위한 Scanner 참조 타입 객체 생성
		boolean nonInputData = true; //점수가 입력되었는지 아직 입력되지않았는지 확인하기 위한 상태 저장값
		boolean loopFlag = true; //while문 조건식에 들어갈 논리타입 변수 (5. 종료시 사용함)
		int[] scores = new int[0]; //int형식 값이 들어가고 길이 0인 배열을 생성하고 이를 참조하는 scores 변수를 선언
		//0의 길이를 갖는 배열을 참조하는지에 대해서는 오류해결 조건문에 알려줌.
		
		while (loopFlag) { //loopFlag값이 true라면 while문 계속 반복
			int studentCnt = 0; //학생수를 저장받을 studentCnt 변수를 선언 및 초기화
			String input = "";
			
			System.out.println("--------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택 > ");
			
			input = scanner.nextLine(); //굳이 input변수를 선언해가면서 할 필요가 있나 아니다 switch문 조건문에 들어가는 값이 변하게 되면 안된다.
			
			switch(input) { //스캐너객체를 참조하는 변수를 통해 키보드 입력 대기 메소드를 호출한다. 그리고 입력한 값을 switch 조건문에 넣고 case 문자열들과 비교한다.
				case "1":
					System.out.print("학생수>");
					studentCnt = Integer.parseInt(scanner.nextLine()); //입력받은 문자열을 정수형으로 변환시키고 studentCnt 변수의 값에 저장한다.
					if(studentCnt > 0) { //학생수 입력할때 음수 또는 0이 나오지 않게끔 하는 조건문을 작성
						scores = new int[studentCnt]; //studentCnt만큼의 길이를 갖는 배열 객체를 새로 만들어 scores 변수가 이를 참조함.
						break;
					} else {
						System.out.println("비정상적인 입력입니다. 1이상의 값을 입력해주세요.");
						break;
					}
					
				case "2":
					if(scores.length != 0) { //학생수가 입력되지않았을 경우 배열 객체의 초기 길이값인 0이 유지될것이다.(학생수가 0명일 수는 없기 때문에) 이를 이용해서 배열 길이가 0이 아닐경우 점수 입력 기능을 정상 수행하도록함.
						for(int i = 0; i < scores.length; i++) { //인덱스 0번부터 (배열길이-1)번까지 반복
							System.out.print("scores["+i+"] : "); //입력안내문을 출력하는 코드
							int inputNum = Integer.parseInt(scanner.nextLine());
							if(inputNum >= 0 && inputNum <= 100) {
								scores[i] = inputNum; //입력받은 점수를 배열의 i번째 인덱스에 저장한다.
							} else {
								System.out.println("비정상적인 입력입니다. 0 ~ 100 사이의 점수를 입력해주세요.");
								i--; //i번째 학생의 점수를 다시 입력할 수 있도록 카운트를 1을 낮춰 다시 되돌림.
							}
						}
						nonInputData = false; //for문이 종료가 되고 점수입력단계가 완료가 되면 입력이 완료되었다는 상태를 알려주는 nonInputData를 false로 변경한다.
						break;						
					} else if(scores.length == 0){ //학생수가 입력되지않았을경우 기능 수행 불가 안내문 출력						
						System.out.println("점수를 입력하기 전 메인메뉴에서 학생 수를 입력해주세요(메뉴1)");
						break;
					}
					
				case "3":
					if(scores.length == 0) { //위 기능수행불가안내문과 동일한 내용
						System.out.println("점수를 확인하기 전 메인메뉴에서 학생 수부터 입력해주세요(메뉴1)");
						break;
					} else if(nonInputData) { //만약 학생수가 입력되고 점수값이 입력이 되질않았다면 기능수행불가안내문 출력
						System.out.println("점수를 확인하기 전 메인메뉴에서 학생들의 점수를 입력해주세요(메뉴2)");
						break;
					} else { //1번 2번 단계가 완료되었을 경우
						for(int i = 0; i < scores.length; i++) { //2번 문제와 동일함.
							System.out.println("scores[" + i + "] : " + scores[i]);
						}
						break;
					}
					
				case "4":
					if(scores.length == 0) { //위 스위치 기능수행불가안내문과 동일한 내용
						System.out.println("점수를 확인하기 전 메인메뉴에서 학생 수부터 입력해주세요(메뉴1)");
						break;
					} else if(nonInputData) {//위 스위치 기능수행불가안내문과 동일한 내용
						System.out.println("점수를 확인하기 전 메인메뉴에서 학생들의 점수를 입력해주세요(메뉴2)");
						break;
					}
					
					
					int max = 0; //최댓값을 담을 변수 선언 및 초기화
					int sum = 0; //전체 성적 합을 저장할 변수 선언 및 초기화
					
					
					for(int i = 0; i < scores.length; i++) { //i값을 0에서 (scores 배열의 길이-1)만큼 증가하면서 반복
						if(max < scores[i]) { //최댓값을 비교하고 변수에 저장하는 코드
							max = scores[i];
						}
						sum += scores[i]; //for문 돌리면서 겸사겸사 합의 값을 증감연산자를 통해 전체 성적의 합도 구한다.
					}
					
					
					double avg = (double)sum / scores.length; //그렇게 구해진 성적의 합에 학생 인원 수를 나누어 평균값을 구한다.
					//허나 학생수에 studentCnt 사용하면 안된다. case문에서 break해서 빠져나온후 다시 들어오게 되면 studentCnt값은 0으로 다시 초기화가 된다. (Inifinity예외 발생)
					
					System.out.println("최고 점수 : " + max);
					System.out.println("평균 점수 : " + avg);
					
					break;
					
					
				case "5":
					System.out.println("프로그램을 종료합니다.");
					loopFlag = false; //while루프를 끊을 수 있게 loopFlag를 false로 변경한다.
					break;
					
					
				default: //1~5 범위의 값을 벗어난 값을 입력하게 되면 오류 안내문을 출력
					System.out.println("비정상적인 입력입니다. 주어진 번호(1~5)에 대해서 입력하세요.");
					System.out.println("입력하신 번호 : " + input);
					break;
			}
			
		}
		scanner.close(); //스캐너 객체 닫기.
	}

}
