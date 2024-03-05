package ch05.sltn;

import java.util.Scanner;

public class Subject1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[][] contents = new String[100][4];
		boolean loopFlag = true;
		int finalNum = 0;
		String searchNum = "";
		
		while (loopFlag) {
			System.out.println("--------------------------------------------------------");
			System.out.println("번호\t제목\t\t\t\t글쓴이");
			System.out.println("--------------------------------------------------------");
			
			//게시글 출력 하는 구문
			for(int i = 0; i < contents.length; i++) {
				if(contents[i][0] != null) {
					System.out.println(contents[i][0]+"\t"+contents[i][1]+"\t\t\t\t"+contents[i][2]);
				}
			}
			
			System.out.println("--------------------------------------------------------");
			System.out.println("메뉴 : 1. 생성 | 2. 보기 | 3. 수정 | 4. 삭제 | 5. 종료");
			System.out.print("선택: ");
			String inputMenuCode = sc.nextLine(); //메뉴번호입력
			
			
			switch(inputMenuCode) {
				case "1":
					String inputContent = "";
					
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
					
					
				case "2":
					System.out.print("\n게시물번호 : ");
					searchNum = sc.nextLine();
					for(int i = 0; i < contents.length; i++) {
						if(contents[i][0].equals(searchNum)) {
							System.out.println("[글 보기]");
							System.out.println("제목 : " + contents[i][1]);
							System.out.println("글쓴이 : " + contents[i][2]);
							System.out.println("내용 : " + contents[i][3]);
							i = contents.length; //for 루프 탈출
						} else { 
							System.out.println("존재하지 않는 게시물 번호입니다.");
							i = contents.length;
						}
					}
					break;
					
					
					
				case "3":
					System.out.print("\n게시물번호 : ");
					searchNum = sc.nextLine();
					for(int i = 0; i < contents.length; i++) {
						if(contents[i][0].equals(searchNum)) {
							System.out.println("[글 수정]");
							System.out.print("수정할 제목 : ");
							contents[i][1] = sc.nextLine();							
							System.out.print("수정할 내용 : ");
							contents[i][3] = sc.nextLine();		
							i = contents.length; //for 루프 탈출
						} else { 
							System.out.println("존재하지 않는 게시물 번호입니다.");
							i = contents.length;
						}
					}
					break;
					
					
					
				case "4":
					System.out.print("\n게시물번호 : ");
					searchNum = sc.nextLine();
					for(int i = 0; i < contents.length; i++) {
						if(contents[i][0].equals(searchNum)) {
							for(int j = 0; j < contents[i].length; j++) {
								contents[i][j] = null;
							}
							i = contents.length; //for 루프 탈출
						} else { 
							System.out.println("존재하지 않는 게시물 번호입니다.");
							i = contents.length;
						}
					}
					break;
					
					
					
				case "5":
					loopFlag = false;
					break;
					
					
					
				default:
					System.out.println("잘못된 메뉴번호입니다. 다시 입력해주십시오. (1 ~ 5)");
					break;
			}
		}

	}

}
