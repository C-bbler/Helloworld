package xxgcxy.wlw.ll32;

public class Bank {
	static String bankName;//�������� 
	private String name;//�û�����
	private String password;//�û�����
	private double turnover;//���׶�
	private double balance;//���
	static void welcome(){
		System.out.println("��ӭ����"+bankName);
	}
	static void welcomeNext(){
		System.out.println("����Я����������Ʒ����ӭ�´ι��٣�");
	}
	//����
	public  Bank(String name,String password,double turnover) {
		this.name=name;
		this.password = password;
		this.turnover = turnover;
		this.balance = turnover - 10;//��������
		System.out.println(name+"�����ɹ����˻����Ϊ"+balance);
	}
	//���
	public void  CunKuan(double turnover) {
		balance = balance + turnover;
		System.out.println("�𾴵�"+name+"����/Ůʿ,�����˻����"
		                   +turnover+"Ԫ����ǰ���Ϊ"
				           +balance+"Ԫ");
	}
	//ȡ��
	public void  QuKuan(String password,double turnover) {
		if (this.password != password) {
			System.out.println("������������������������");
			return ;
		}
		if (balance - turnover <0) {
			System.out.println("�����˻����㣬Ϊ"+balance+"Ԫ");
		}
		else{
			balance = balance - turnover;
			System.out.println("ȡ��ɹ�����ǰ�˻����Ϊ"+balance+"Ԫ");
		}
	}
}
