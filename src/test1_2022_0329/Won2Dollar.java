package test1_2022_0329;

public class Won2Dollar extends Converter{
	
	

	public Won2Dollar(double ratio) { // 외부에서 객체생성될때 인수로 들어온 값으로 ratio를 초기화
		this.ratio = ratio;
	}
		

	@Override
	protected double convert(double src) {
		double won_dollar = src / ratio;
		return won_dollar;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}



}
// val 값이 스켄받은 원 값  res 가 원을 달러로 바꾼값<-출력  src가 나누기?   ratio는 비울 