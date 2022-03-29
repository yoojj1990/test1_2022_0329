package test1_2022_0329;

public class Oval implements Shape{
	
	private int width, height;
	
	public Oval(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println(width + "X" + height + "에 내접하는 타원입니다.");
	}

	@Override
	public double getArea() {
		
		double area = width * height *PI; //타원 넓이 공식
		
		return area;
	}
}
