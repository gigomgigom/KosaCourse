package sltn.ytalgorithm.algo1;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

	private boolean addFlag = true;
	private boolean searchFlag = true;
	
	ArrayList <Student> studentList = new ArrayList<>(1); //크기 10인 배열 생성
	Scanner sc = new Scanner(System.in);

	public int askYesOrNo() {
		
		int result;
		System.out.print("계속해서 입력하시겠습니까? (Y or N) > ");
		String yesOrNo = sc.nextLine();
		switch (yesOrNo) {
		case "Y": 
		case "y": 
			result = 1;
			return result;
		case "N": 
		case "n": 
			result = 0;
			return result;
		default : 
			return -1;
		}
		
	}
	
	public void addStudent() {
		
		while(addFlag) {
			
			String name;
			String no;
			int yesOrNo;
			
			System.out.print("추가할 학생 이름 입력 : ");
			name = sc.nextLine();
			System.out.println();
			System.out.print("해당 학생의 학번을 입력 : ");
			no = sc.nextLine();
			System.out.println();
			
			Student newStudent = new Student(name, no);
			studentList.add(newStudent);
			
			System.out.printf("studentList에 %s, %s 정보가 저장되었습니다.\n", newStudent.getName(), newStudent.getNo());
			
			while(true) {
				yesOrNo = askYesOrNo();
				if(yesOrNo == -1) {
					System.out.println("다시 입력해주세요.");
				} else if(yesOrNo == 1) {
					break;
				} else if(yesOrNo == 0) {
					addFlag = false;
					break;
				}
			}
		}
	}
	
	public void searchStudent() {
		String inputName;
		
		while (searchFlag) {
			boolean resultNotFound = true;
			System.out.print("검색할 학생 이름을 입력해주세요. > ");
			inputName = sc.nextLine();
			
			for(Student student : studentList) {
				if(student.getName().equals(inputName)) {
					System.out.printf("%s학생의 학번은 %s입니다.\n", student.getName(), student.getNo());
					resultNotFound = false;
					break;
				}
			}
			
			if(resultNotFound) {
				System.out.printf("검색하신 %s학생의 정보는 데이터에 존재하지않습니다.", inputName);
			}
			
			while(true) {
				int ask = askYesOrNo();
				if(ask == 0) {
					searchFlag = false;
					break;
				} else if(ask == -1) {
					System.out.println("유효하지않은 입력입니다.");
				} else if(ask == 1) {
					break;
				}
			}
			
		}
		
	}
	
}
