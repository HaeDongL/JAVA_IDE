package Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;



public class VectorTest extends Vector {
	
	public VectorTest() {
		
	}
	public VectorTest(int i, int y) {
		super(i,y);
	}
	
	public static void main(String[] args) {
		VectorTest v = new VectorTest(10,10);
		
		Stack s = new Stack();
		s.add(1);
		v.insertElementAt(1, 0);
		v.insertElementAt("2", 1);
		
		v.insertElementAt("3", 0);
		v.insertElementAt("1", 0);
		v.setElementAt("4", 1);
		System.out.println(v);
		
		
		
		
		
		
	}
}
