package t03_04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

public class Prob3 {

	
	


	public Vector getList()  {
		
		BufferedReader br = null;
		Vector vc = new Vector();
		String read = "";
		String sName = "";
		String temp = "";
		int sScore = 0;
		String[] strSplit;
		try {
		br = new BufferedReader(new FileReader("list.txt"));
		while(true) {
			read = br.readLine();
			if(read == null) {
				break;
			}
			strSplit = read.split("/");
			sName = strSplit[1];
			sScore = Integer.parseInt(strSplit[2]);
			String result = "미수료";
			if("java".equalsIgnoreCase(sName) && sScore >= 80) {
				result = "수료";
			}
			
			if("SQL".equalsIgnoreCase(sName) && sScore >= 80) {
				result = "수료";
			}
			temp += "["+strSplit[0]+","+strSplit[1]+","+strSplit[2]+","+result+"]";
			vc.add(temp);
			temp = "";
		}
		}catch(Exception e) {
			
		}finally {
			if(br != null) {
				try { br.close();} catch(Exception e) {}
			}
		}
		return vc;
}
	
	
	public static void main(String[] args)  {
		
		Prob3 e = new Prob3();
		Vector scores = e.getList();
		for(int i=0; i<scores.size(); i++) {
			System.out.println(scores.get(i));
		}
		
	}

}
