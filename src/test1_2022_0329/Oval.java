package test1_2022_0329;

public class Oval implements Shape{
	
	private int width, height;
	
	public Oval(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(width + "X" + height + "�� �����ϴ� Ÿ���Դϴ�.");
	}

	@Override
	public double getArea() {
		
		double area = width * height *PI; //Ÿ�� ���� ����
		
		return area;
	}
}
