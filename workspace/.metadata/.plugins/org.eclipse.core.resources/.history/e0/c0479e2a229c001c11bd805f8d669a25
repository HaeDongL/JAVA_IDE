package t03_07;

import java.util.List;
import java.util.Vector;


public class Prob {
	
	
	private static Book makeBook(String bookData) throws DataFormatException {
		Book bInstance = new Book();
		String[] strSplit = bookData.split(":");
		if(!(strSplit.length < 3)) {
			bInstance.setTitle(strSplit[0]);
			bInstance.setKind(strSplit[1]);
			bInstance.setRentalPrice(Integer.parseInt(strSplit[2]));
			
		}else {
			throw new DataFormatException(strSplit[0]+" 기초책 정보는 변환할 수 없는 데이터 포맷 입니다.");
		}
		
		return bInstance;
	}
	
	private static void printBookList(Vector bookList) {
		for(int i=0; i<bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}
	
	
	
	public static void main(String[] args) {
		
		Vector bookList = new Vector();
		
		try {
			
			bookList.add(Prob.makeBook("Java Programming 기초:컴퓨터:35000"));
			bookList.add(Prob.makeBook("초보자를 위한 SQL:컴퓨터:35000"));
			bookList.add(Prob.makeBook("HTML5 API 소개:컴퓨터:35000"));
			//case1
			bookList.add(Prob.makeBook("JDBC Programming 기초:컴퓨터:35000"));
			//case2
			//BooList.add(makeBook("JDBC Programming 기초:컴퓨터"));
			bookList.add(Prob.makeBook("Java Programming 기초:컴퓨터:35000"));
			Prob.printBookList(bookList);
			
		}catch(DataFormatException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
