package test1_2022_0329;

public class Won2Dollar extends Converter{
	
	

	public Won2Dollar(double ratio) { // �ܺο��� ��ü�����ɶ� �μ��� ���� ������ ratio�� �ʱ�ȭ
		this.ratio = ratio;
	}
		

	@Override
	protected double convert(double src) {
		double won_dollar = src / ratio;
		return won_dollar;
	}

	@Override
	protected String getSrcString() {
		return "��";
	}

	@Override
	protected String getDestString() {
		return "�޷�";
	}



}
// val ���� ���˹��� �� ��  res �� ���� �޷��� �ٲ۰�<-���  src�� ������?   ratio�� ��� 