package xxgcxy.wlw.ll31;

public class Market {
	private String marketName;//������
	
	private Product[] productsArr;//�ֿ�����Ʒ
	
	
    public Product[] getProductsArr() {
		return productsArr;
	}

	public void setProductsArr(Product[] productsArr) {
		this.productsArr = productsArr;
	}

	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}
 
    public String getMarketName() {
		return marketName;
	}
    
    Product sell(String name){//����
    	for (int i = 0; i < productsArr.length; i++) {
			if (productsArr[i].getProname()==name) {//�ҵ���Ʒ
				return productsArr[i];
			}
		}
    	return null;//�ֿ���û�д���Ʒ
    }
}
