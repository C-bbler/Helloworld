package xxgcxy.wlw.ll31;

public class Shopping {

	/**
	 * 创建商品对象，为商品仓库赋值，创建购买对象，购买商品以及商场名称
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		Product p5 = new Product();
		p1.setProname("豆浆机");
		p2.setProname("洗衣机");
		p3.setProname("豆浆机");
		p4.setProname("空调机");
		p5.setProname("吹风机");//商品仓库中已经有货物
		Market m = new Market();//创建对象
		m.setMarketName("家乐福");
		//将商品存入仓库
		m.setProductsArr(new Product[]{p1,p2,p3,p4,p5});
		Person p = new Person();//创建购买者
		p.setName("崔松");
		//在某超市购买了什么物品
		Product result = p.shopping(m, "豆浆机");
		if (result != null) {//商品存在
			System.out.println(p.getName()
					+"在"+m.getMarketName()
					+"买到了"
					+result.getProname());
		} else {
			System.out.println(p.getName()+"白跑一趟,在"+m.getMarketName()+"什么也没有买到！");

		}
		
		

	}

}
