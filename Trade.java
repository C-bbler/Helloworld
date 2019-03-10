package xxgcxy.wlw.ll32;

public class Trade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank.bankName = "人民银行";
		Bank.welcome();
		Bank bank = new Bank("崔松","123456",700);
		bank.CunKuan(500);
		bank.QuKuan("55555", 300);
		bank.QuKuan("123456", 9000);
		bank.QuKuan("123456", 90);
		Bank.welcomeNext();
	}

}
