package xxgcxy.wlw.ll31;

public class Person {
	private String name;//顾客姓名

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//前往那个超市进行购物
	Product shopping(Market market,String name){//去的超市名和购买的商品名
		return market.sell(name);
	}
}
