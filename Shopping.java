package xxgcxy.wlw.ll31;

public class Shopping {

	/**
	 * ������Ʒ����Ϊ��Ʒ�ֿ⸳ֵ������������󣬹�����Ʒ�Լ��̳�����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		Product p5 = new Product();
		p1.setProname("������");
		p2.setProname("ϴ�»�");
		p3.setProname("������");
		p4.setProname("�յ���");
		p5.setProname("�����");//��Ʒ�ֿ����Ѿ��л���
		Market m = new Market();//��������
		m.setMarketName("���ָ�");
		//����Ʒ����ֿ�
		m.setProductsArr(new Product[]{p1,p2,p3,p4,p5});
		Person p = new Person();//����������
		p.setName("����");
		//��ĳ���й�����ʲô��Ʒ
		Product result = p.shopping(m, "������");
		if (result != null) {//��Ʒ����
			System.out.println(p.getName()
					+"��"+m.getMarketName()
					+"����"
					+result.getProname());
		} else {
			System.out.println(p.getName()+"����һ��,��"+m.getMarketName()+"ʲôҲû���򵽣�");

		}
		
		

	}

}
