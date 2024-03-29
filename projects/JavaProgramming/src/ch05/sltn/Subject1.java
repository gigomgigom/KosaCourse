package ch05.sltn;

import java.util.Scanner;

public class Subject1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[][] contents = new String[4][4]; //문제에서 주어진 조건에 맞는 2차원 배열 생성
		boolean loopFlag = true; //반복문 작동상태를 나타내는 변수

		int finalNum = 0; //새로 생성할때 사용할 차기 게시글 번호를 저장하는 변수
		
		while (loopFlag) {

			//유현주 < Null값을 가지지 않는 갯수를 계산하는 코드를 만들었었네요 이 변수를 contents배열의 길이와 비교해서 저장공간 초과여부를 결정해보도록 하죠.
            int notNullCnt = 0; //content가 참조하는 배열객체 요소들중에 참조하는 값이 Null이 아닌 요소들의 갯수를 저장할 변수 선언, 초기값 0세팅 
            
            for(int i = 0; i < contents.length; i++) { //Null 값이 아닌 배열객체의 갯수를 계산하는 코드
                if(contents[i][0] != null) {
                    notNullCnt++;
                }
            }
            
			int[] valueNumberArray = new int[notNullCnt]; //notNullCnt만큼 길이를 가지면서 게시글 번호들을 저장할 배열객체 생성
            int[] originalIndexArray = new int[notNullCnt]; //NotNullCnt만큼 길이를 가지면서 인덱스 번호들을 저장할 배열객체 생성

            int additionalArrayIndex = 0; //게시글 번호와 해당 번호의 인덱스 값을 두 배열의 몇번 인덱스에 저장할것인지 지정하는 정수형 변수 선언
            for(int i = 0; i < contents.length; i++) {                
                if(contents[i][0] != null) { //비어있지않은 배열객체를 찾았으면
                    valueNumberArray[additionalArrayIndex] = Integer.parseInt(contents[i][0]); //해당 배열객체의 0번 인덱스가 참조하는 문자열 값을 valueNumberArray에 저장
                    originalIndexArray[additionalArrayIndex] = i; //해당 배열객체의 인덱스를 originalIndexArray에 저장
                    additionalArrayIndex++; //비어있지않은 객체를 찾고 게시글번호, 인덱스를 저장할 배열에 값 저장이 완료되었다면 인덱스 번호 변수를 1 증가 시킴.
                }
            }
            
            //선택정렬 https://velog.io/@roro/%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EC%84%A0%ED%83%9D%EC%A0%95%EB%A0%AC
            //배열에서 반복적으로 비교연산을 하며 요소들중에 최대값을 찾아서 i번째 값에 저장 
            for (int i = 0; i < valueNumberArray.length - 1; i++) {
                for (int j = i + 1; j < valueNumberArray.length; j++) {
                    if (valueNumberArray[i] < valueNumberArray[j]) { //i인덱스가 갖는 값 그리고 따라오는 [인덱스(i+1) ~ (배열의길이-1)]가 표현하는 값과 하나하나 비교함.
                        //그러다 만약 i번째 값보다 큰 값을 찾았다면
                        // 번호 집합 배열에서 두 값의 위치를 바꿈
                        int valueTemp = valueNumberArray[i]; //두 값을 바꾸기 전 그 중 한 값을 임시저장용 변수에 저장
                        valueNumberArray[i] = valueNumberArray[j];
                        valueNumberArray[j] = valueTemp;
                        // 인덱스 집합 배열에서 두값의 위치를 바꿈
                        int indexTemp = originalIndexArray[i];
                        originalIndexArray[i] = originalIndexArray[j];
                        originalIndexArray[j] = indexTemp;
                    }
                }
            }

            //계속 새로운 배열 객체를 생성하는 이유 -> 생성 or 삭제를 하게 되면 게시글수 바뀜 그러나 배열은 길이가 고정되어있어서 매번 다른 길이의

            System.out.println("--------------------------------------------------------");
            System.out.println("\t게시글 번호와 인덱스 순서 확인");
            System.out.println("--------------------------------------------------------");
            System.out.print("게시글 번호 : ");
            for(int num : valueNumberArray) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.print("인덱스 번호 : ");
            for(int num : originalIndexArray) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("--------------------------------------------------------");

			System.out.println("--------------------------------------------------------");
			System.out.println("번호\t제목\t\t\t\t글쓴이");
			System.out.println("--------------------------------------------------------");
			
			//게시글 출력 하는 구문
			for(int i = 0; i < originalIndexArray.length; i++) {
                int index = originalIndexArray[i];
				System.out.println(contents[index][0]+"\t"+contents[index][1]+"\t\t\t\t"+contents[index][2]);
			}
			
			System.out.println("--------------------------------------------------------");
			System.out.println("메뉴 : 1. 생성 | 2. 보기 | 3. 수정 | 4. 삭제 | 5. 종료");
			System.out.print("선택: ");
			
			String inputMenuCode = sc.nextLine(); //메뉴번호입력
			
			switch(inputMenuCode) {
				case "1":
					if(notNullCnt < contents.length) { //유현주 < 게시글의 갯수가 배열의 저장공간보다 적다면. 생성 작업 실행
						int lowestEmptyIndex = 0; //자리가 있는 최소인덱스번호찾기
						for(int i = 0; i < contents.length; i++) {
							if(contents[i][0] == null) {
								lowestEmptyIndex = i;
								i = contents.length;
							}
						}
						System.out.println("[새글쓰기]");
						System.out.print("제목 : ");
						contents[lowestEmptyIndex][1] = sc.nextLine();
						System.out.print("글쓴이 : ");
						contents[lowestEmptyIndex][2] = sc.nextLine();
						System.out.print("내용 : ");
						contents[lowestEmptyIndex][3] = sc.nextLine();
						
						finalNum++; //1
						contents[lowestEmptyIndex][0] = String.valueOf(finalNum);
						break;
					} else { //유현주 < 게시글의 갯수가 배열의 저장공간보다 같거나 커진다면. 생성 작업 취소 후 메뉴로 되돌아감.
						System.out.println("게시글 저장할 수 있는 저장공간 초과! 게시글을 삭제해주세요!");
						break;
					}
					
					
					
					//System.out.println(lowestEmptyIndex);  //어디에 저장되었는지 확인
					
					//----------------------------------------------
					
					//-----------------------------------------------
					
					
				case "2":
					System.out.print("\n게시물번호 : ");
					String searchNum = sc.nextLine();
					for(int i = 0; i < contents.length; i++) {
						if(contents[i][0] != null) { //nullpointer 예외 발생 이 문장 꼭 넣어야함.
							if(contents[i][0].equals(searchNum)) {
								System.out.println("[글 보기]");
								System.out.println("제목 : " + contents[i][1]);
								System.out.println("글쓴이 : " + contents[i][2]);
								System.out.println("내용 : " + contents[i][3]);
								i = contents.length; //for 루프 탈출
							}
						}
					}
					break;
					
					
					
				case "3":
					System.out.print("\n게시물번호 : ");
					String editNum = sc.nextLine();
					for(int i = 0; i < contents.length; i++) {
						if(contents[i][0] != null) {
							if(contents[i][0].equals(editNum)) {
								System.out.println("[글 수정]");
								System.out.print("수정할 제목 : ");
								contents[i][1] = sc.nextLine();							
								System.out.print("수정할 내용 : ");
								contents[i][3] = sc.nextLine();		
								i = contents.length; //for 루프 탈출
							} else {
								
							}
						}
					}
					break;
					
					
					
				case "4":
					System.out.print("\n게시물번호 : ");
					String deleteNum = sc.nextLine();
					for(int i = 0; i < contents.length; i++) {
						if(contents[i][0] != null) { 
							if(contents[i][0].equals(deleteNum)) {									
								
								for(int j = 0; j < contents[i].length; j++) {
									contents[i][j] = null;
								}
								i = contents.length;
							}
						}
						
						
					}
					break;
					
					
					
				case "5":
					loopFlag = false;
                    System.out.println("Terminate program");
					break;
					
					
					
				default:
					System.out.println("잘못된 메뉴번호입니다. 다시 입력해주십시오. (1 ~ 5)");
					break;
			}
		}

	}

}
