package test1_2022_0329;

public interface Shape {
	
	final double PI = 3.14;
	
	void draw();
	
	double getArea();
	
	default public void redraw() {
		System.out.print("=== �ٽ� �׸��ϴ�.");
		draw();
	}
	
	
	
	
	
	
	
	
	
}
