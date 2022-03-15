import java.util.Scanner;

public class TestRectangle 
{
		///Field
		private String color;
		private int width;
		private int length;
		///Constructor
		public TestRectangle(){
		}
		///Method
		/// setter
		public void setColor(String color){
			this.color = color;
		}
		public void setWidth(int width){
			this.width = width;
		}
		public void setLength(int length){
			this.length = length;
		}
	
		
		///getter
		public String getColor(){
			return color;
		}
		
		public int getWidth(){
			return width;
		}
		public int getLength(){
			return length;
		}
		
		public int area(){
			int area = width * length;
			return area;
		}

		public int perimeter(){
			int perimeter = (width+length)*2;
			return perimeter;
		}


		//main method
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);

		TestRectangle rec1 = new TestRectangle();
		System.out.print("ù��° ��������� ����: ");
		rec1.setColor(keyboard.next());

		System.out.print("ù��° ��������� ����: ");
		rec1.setWidth(keyboard.nextInt());

		System.out.print("ù��° ���簢���� ����: ");
		rec1.setLength(keyboard.nextInt());

		

		TestRectangle rec2 = new TestRectangle();
		System.out.print("�ι�° ��������� ����: ");
		rec2.setColor(keyboard.next());

		System.out.print("�ι�° ��������� ����: ");
		rec2.setWidth(keyboard.nextInt());

		System.out.print("�ι�° ���簢���� ����: ");
		rec2.setLength(keyboard.nextInt());



		System.out.println(rec1.getColor()+" ���簢���� ���̴� "
		+rec1.area()+"�̰� �ѷ��� "+
			rec1.perimeter()+" �Դϴ�.");

		System.out.println(rec2.getColor()+" ���簢���� ���̴� "
		+rec2.area()+"�̰� �ѷ��� "+
			rec2.perimeter()+" �Դϴ�.");

		//TODO 1) �� ���簢���� ���̸� ���Ͻʽÿ�.
	
		if(rec1.area() > rec2.area()){
			System.out.println("���̴� "+rec1.getColor()+" ���簢���� �� Ů�ϴ�.");
		}else if(rec1.area() < rec2.area()) {
			System.out.println("���̴� "+rec2.getColor()+" ���簢���� �� Ů�ϴ�.");
		}else {
			System.out.println("���̴� �����ϴ�.");
		}

		if(rec1.perimeter() > rec2.perimeter()){
			System.out.println("�ѷ��� "+rec1.getColor()+" ���簢���� �� Ů�ϴ�.");
		}else if(rec1.perimeter() < rec2.perimeter()) {
			System.out.println("�ѷ��� "+rec2.getColor()+" ���簢���� �� Ů�ϴ�.");
		}else {
			System.out.println("�ѷ��� �����ϴ�.");
		}


	}//main
}//class