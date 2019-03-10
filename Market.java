package xxgcxy.wlw.ll31;

public class Market {
	private String marketName;//超市名
	
	private Product[] productsArr;//仓库存放商品
	
	
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
    
    Product sell(String name){//卖货
    	for (int i = 0; i < productsArr.length; i++) {
			if (productsArr[i].getProname()==name) {//找到商品
				return productsArr[i];
			}
		}
    	return null;//仓库中没有此商品
    }
}
