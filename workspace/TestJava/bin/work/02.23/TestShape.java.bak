abstract class Shape
{
	///Field
	protected double area;
	private String name;
	
	///Constructor
	public Shape(){
	}
	public Shape(String name){
		this.name = name;
	}
	
	///Method
	
	public void print(){
		System.out.println(name+"의 면적은 "+area);
	}

	///abatract Method
	public abstract void calculationArea();
}

class Circle extends Shape
{
	///Field
	private double radius;
	///Constructor
	public Circle(){
	}

	public Circle(String name, double radius){
		super(name);
		this.radius = radius;
	}
	///Method
	public void calculationArea(){
		area = radius * radius * 3.141592653589793; //Math.PI쓰면됨
	}

	///getterMethod
	public double getRadius(){
		return radius;
	}

	///setterMethod
	public void setRadius(double radius){
		this.radius = radius;
	}
}

class Rectangular extends Shape
{
	///Field
	private double width;
	private double hight;
	///Constructor
	public Rectangular(){
	}
	public Rectangular(String name, double width, double hight){
		super(name);
		this.width = width;
		this.hight = hight;
	}
	///Method
	public void calculationArea(){
		area = this.width * this.hight;
	}
	///getterMethod
	public double getWidth(){
		return this.width;
	}
	public double getHight(){
		return this.hight;
	}

	///setterMethod

	public void setWidth(double width){
		this.width = width;
	}
	public void setHight(double hight){
		this.hight = hight;
	}
	
}



public class TestShape 
{		
	///Main Method
	public static void main(String[] args) 
	{
		Shape[] shape = new Shape[2];

		shape[0] = new Circle("원",10);
		shape[1] = new Rectangular("직사각형",10,20);

		for(int i=0; i<shape.length; i++){
			shape[i].calculationArea();
			shape[i].print();
		}//for
	}//main
}//class
