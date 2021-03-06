package t02_28;

import java.util.Vector;
import java.util.List;

public class Prob21 {

	///Field
	
	///Constructor
	
	///Method
	public List<String> dataChange(String[] strData){
//    public Vector<String> dataChange(String[] strData){
			Vector<String> vec = new Vector<String>(strData.length,strData.length);
			
			StringBuffer sb = new StringBuffer();
			for(int i=strData.length-1; i>=0; i--) {
				sb.append(strData[i]);//배열의 첫번째 값 StringBuffer에 저장
				sb.reverse();			// 값 반전
				vec.add(sb.substring(0)); // 뒤집힌 값은 여기에 저장
				sb.delete(0,sb.capacity()); // StringBuffer 값 삭제
			}
			
			
			return vec;
	}
	
	
	public static void main(String[] args) {
		
		Prob21 st = new Prob21();
		String[] strData = {"Java Programming","JDBC","Oracle10g","JSP/Servlet"};
		
		//Vector<String> v = st.dataChange(strData);
		List<String> v = st.dataChange(strData);
		
//		for(int i=0; i<v.size(); i++) {
//			System.out.println(v.elementAt(i));
//		}
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		
		
	}
	
}
