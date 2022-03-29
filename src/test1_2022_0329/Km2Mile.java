package test1_2022_0329;

public class Km2Mile extends Converter{
	
	
	public Km2Mile (double ratio) { // �ܺο��� ��ü�����ɶ� �μ��� ���� ������ ratio�� �ʱ�ȭ
		this.ratio = ratio;
	}
		

	@Override
	protected double convert(double src) {
		double km_mile = src / ratio;
		return km_mile;
	}

	@Override
	protected String getSrcString() {
		return "km";
	}

	@Override
	protected String getDestString() {
		return "mile";
	}



}
