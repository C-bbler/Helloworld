package xxgcxy.wlw.ll31;

public class Person {
	private String name;//�˿�����

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//ǰ���Ǹ����н��й���
	Product shopping(Market market,String name){//ȥ�ĳ������͹������Ʒ��
		return market.sell(name);
	}
}
