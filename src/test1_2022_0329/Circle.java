package test1_2022_0329;

public class Circle implements Shape{

	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("�������� " + radius + "�� ���Դϴ�.");
	}

	@Override
	public double getArea() {
		
		double area = radius * radius *PI;
		
		return area;
	}
	
	

}
