package sltn.subject1;

import java.util.Scanner;

public class NoticeBoard {
	
	Contents contents = new Contents();
	String[][] contentArr = contents.boardContents;
	int[] valueNumber = contents.valueNumberArray;
	int[] originalIndex = contents.originalIndexArray;
	
	Scanner sc = new Scanner(System.in);
	String inputContentNum;
	boolean loopFlag = true;
	int finalNum = 0;
	int notNullCnt = 0;


	
	
	public void showBoard() {
		while (loopFlag) {
			getNotNullCnt();
			createArr();
			sortArray();
			showIndex();
			showContents();
			System.out.println("--------------------------------------------------------");
			String input = showMenu();
			boardManager(input);
		}
	}
	
	public void showIndex() {
		System.out.println("--------------------------------------------------------");
        System.out.println("\t게시글 번호와 인덱스 순서 확인");
        System.out.println("--------------------------------------------------------");
        System.out.print("게시글 번호 : ");
        for(int num : valueNumber) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("인덱스 번호 : ");
        for(int num : originalIndex) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("--------------------------------------------------------");
	}
	
	public void showContents() {
		System.out.println("--------------------------------------------------------");
		System.out.println("번호\t제목\t\t\t\t글쓴이");
		System.out.println("--------------------------------------------------------");
		
		//게시글 출력 하는 구문
		for(int i = 0; i < originalIndex.length; i++) {
            int index = originalIndex[i];
			System.out.println(contentArr[index][0]+"\t"+contentArr[index][1]+"\t\t\t\t"+contentArr[index][2]);
			//System.out.println("--------------------------------------------------------");
		}
	}
	
	public String showMenu() {		
		System.out.println("메뉴 : 1. 생성 | 2. 보기 | 3. 수정 | 4. 삭제 | 5. 종료");
		System.out.print("선택: ");
		
		String inputMenuCode = sc.nextLine(); //메뉴번호입력
		return inputMenuCode;
	}
	
	public void boardManager(String menuCode) {
		switch(menuCode) {
			case "1":
				if(notNullCnt < contentArr.length) {
					createContent();
					break;
				} else {
					System.out.println("게시글 저장할 수 있는 저장공간 초과! 게시글을 삭제해주세요!");
					break;
				}
			case "2":
				inputContentNum = searchContent();
				lookUpContent(inputContentNum);
				break;
			case "3":
				inputContentNum = searchContent();
				editContent(inputContentNum);
				break;
			case "4":
				inputContentNum = searchContent();
				deleteContent(inputContentNum);
				break;
			case "5":
				terminateProgram();
				break;
		}
	}
	
	public void createContent() {
		int lowestEmptyIndex = 0; //자리가 있는 최소인덱스번호찾기
		for(int i = 0; i < contentArr.length; i++) {
			if(contentArr[i][0] == null) {
				lowestEmptyIndex = i;
				i = contentArr.length;
			}
		}
		System.out.println("[새글쓰기]");
		System.out.print("제목 : ");
		contentArr[lowestEmptyIndex][1] = sc.nextLine();
		System.out.print("글쓴이 : ");
		contentArr[lowestEmptyIndex][2] = sc.nextLine();
		System.out.print("내용 : ");
		contentArr[lowestEmptyIndex][3] = sc.nextLine();
		
		finalNum++; //1
		contentArr[lowestEmptyIndex][0] = String.valueOf(finalNum);
	}

	public void lookUpContent(String searchNum) {
		for(int i = 0; i < contentArr.length; i++) {
			if(contentArr[i][0] != null) { //nullpointer 예외 발생 이 문장 꼭 넣어야함.
				if(contentArr[i][0].equals(searchNum)) {
					System.out.println("[글 보기]");
					System.out.println("제목 : " + contentArr[i][1]);
					System.out.println("글쓴이 : " + contentArr[i][2]);
					System.out.println("내용 : " + contentArr[i][3]);
					i = contentArr.length; //for 루프 탈출
				}
			}
		}
	}
	
	public void editContent(String searchNum) {
		for(int i = 0; i < contentArr.length; i++) {
			if(contentArr[i][0] != null) {
				if(contentArr[i][0].equals(searchNum)) {
					System.out.println("[글 수정]");
					System.out.print("수정할 제목 : ");
					contentArr[i][1] = sc.nextLine();							
					System.out.print("수정할 내용 : ");
					contentArr[i][3] = sc.nextLine();		
					i = contentArr.length; //for 루프 탈출
				} else {
					
				}
			}
		}
	}
	
	public void deleteContent(String searchNum) {
		for(int i = 0; i < contentArr.length; i++) {
			if(contentArr[i][0] != null) { 
				if(contentArr[i][0].equals(searchNum)) {									
					
					for(int j = 0; j < contentArr[i].length; j++) {
						contentArr[i][j] = null;
					}
					i = contentArr.length;
				}
			}
			
			
		}
	}
	
	public void terminateProgram() {
		loopFlag = false;
	}
	
	public int getNotNullCnt() {
		int notNullCnt = 0;
		
		for(int i = 0; i < contentArr.length; i++) {
			if(contentArr[i][0] != null) {
				notNullCnt++;
			}
		}
		return notNullCnt;
	}
	
	public void sortArray() {
		for (int i = 0; i < valueNumber.length - 1; i++) {
            for (int j = i + 1; j < valueNumber.length; j++) {
                if (valueNumber[i] < valueNumber[j]) { //i인덱스가 갖는 값 그리고 따라오는 [인덱스(i+1) ~ (배열의길이-1)]가 표현하는 값과 하나하나 비교함.
                    //그러다 만약 i번째 값보다 큰 값을 찾았다면
                    // 번호 집합 배열에서 두 값의 위치를 바꿈
                    int valueTemp = valueNumber[i]; //두 값을 바꾸기 전 그 중 한 값을 임시저장용 변수에 저장
                    valueNumber[i] = valueNumber[j];
                    valueNumber[j] = valueTemp;
                    // 인덱스 집합 배열에서 두값의 위치를 바꿈
                    int indexTemp = originalIndex[i];
                    originalIndex[i] = originalIndex[j];
                    originalIndex[j] = indexTemp;
                }
            }
        }
	}
	
	public void createArr() {
		int cnt = getNotNullCnt();
		valueNumber = new int[cnt];
		originalIndex = new int[cnt];
		
		int additionalArrayIndex = 0; //게시글 번호와 해당 번호의 인덱스 값을 두 배열의 몇번 인덱스에 저장할것인지 지정하는 정수형 변수 선언
        for(int i = 0; i < contentArr.length; i++) {                
            if(contentArr[i][0] != null) { //비어있지않은 배열객체를 찾았으면
                valueNumber[additionalArrayIndex] = Integer.parseInt(contentArr[i][0]); //해당 배열객체의 0번 인덱스가 참조하는 문자열 값을 valueNumberArray에 저장
                originalIndex[additionalArrayIndex] = i; //해당 배열객체의 인덱스를 originalIndexArray에 저장
                additionalArrayIndex++; //비어있지않은 객체를 찾고 게시글번호, 인덱스를 저장할 배열에 값 저장이 완료되었다면 인덱스 번호 변수를 1 증가 시킴.
            }
        }
	}
	
	public String searchContent() {
		System.out.print("\n게시물번호 : ");
		String searchNum = sc.nextLine();
		return searchNum;
	}
}
