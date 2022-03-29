package test1_2022_0329;

public class Km2Mile extends Converter{
	
	
	public Km2Mile (double ratio) { // 외부에서 객체생성될때 인수로 들어온 값으로 ratio를 초기화
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
