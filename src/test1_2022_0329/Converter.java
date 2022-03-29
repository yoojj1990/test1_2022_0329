package test1_2022_0329;

import java.util.Scanner;

abstract class Converter {
	
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	
	public void run() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(getSrcString() + "�� " + getDestString() +"�� �ٲߴϴ�.");
		
		System.out.println(getSrcString() + "�� �Է��ϼ���:");
		
		double val = scanner.nextDouble();
		
		double res = convert(val);
		
		System.out.println("��ȯ ��� : "+ res + getDestString() +"�Դϴ�.");
		
		scanner.close();
	}
	
}
