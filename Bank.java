package xxgcxy.wlw.ll32;

public class Bank {
	static String bankName;//银行名称 
	private String name;//用户姓名
	private String password;//用户密码
	private double turnover;//交易额
	private double balance;//余额
	static void welcome(){
		System.out.println("欢迎来到"+bankName);
	}
	static void welcomeNext(){
		System.out.println("请您携带好随身物品，欢迎下次光临！");
	}
	//开户
	public  Bank(String name,String password,double turnover) {
		this.name=name;
		this.password = password;
		this.turnover = turnover;
		this.balance = turnover - 10;//开卡费用
		System.out.println(name+"开卡成功，账户余额为"+balance);
	}
	//存款
	public void  CunKuan(double turnover) {
		balance = balance + turnover;
		System.out.println("尊敬的"+name+"先生/女士,您的账户存款"
		                   +turnover+"元，当前余额为"
				           +balance+"元");
	}
	//取款
	public void  QuKuan(String password,double turnover) {
		if (this.password != password) {
			System.out.println("您输入的密码错误，请重新输入");
			return ;
		}
		if (balance - turnover <0) {
			System.out.println("您的账户余额不足，为"+balance+"元");
		}
		else{
			balance = balance - turnover;
			System.out.println("取款成功，当前账户余额为"+balance+"元");
		}
	}
}
