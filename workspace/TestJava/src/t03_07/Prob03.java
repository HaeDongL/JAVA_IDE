package t03_07;

import java.util.Vector;

public class Prob03 {

	public static void main(String[] args) throws Exception{
		//고객(유저)정보를 갖는 FileName 선언
		String pathName = "./src/data.txt";
		
		
		//data.txt 내용 출력
		FileUtil.fileToPrint(pathName);
		
		System.out.println("==================");
		//data.txt 내용중 서울 거주자 검색, 결과를 담은 Vector 인스턴스 받기
		System.out.println("화일 내용중 서울 정보 검색");
		Vector<User> vector = FileUtil.fileFindAddress(pathName, "서울");
		for(int i=0; i<vector.size(); i++) {
			/////////////////아래에 구현하세요.////////////////////
			System.out.println(vector.get(i)); 
		}
		
		System.out.println("==================");
		//data.txt 내용중 서울 거주자 검색, 결과를 담은 Vector 인스턴스 받기
		System.out.println("화일 내용중 서울 정보 검색");
		vector = FileUtil.fileFindAddress(pathName, "경주");
		for(int i=0; i<vector.size(); i++) {
			/////////////////아래에 구현하세요.////////////////////
			System.out.println(vector.get(i));
		}
		
		System.out.println("==================");
		//data.txt 내용중 서울 거주자 검색, 결과를 담은 Vector 인스턴스 받기
		System.out.println("화일 내용중 서울 정보 검색");
		vector = FileUtil.fileFindAddress(pathName, "경기도");
		for(int i=0; i<vector.size(); i++) {
			/////////////////아래에 구현하세요.////////////////////
			System.out.println(vector.get(i));
		}
	}

}
