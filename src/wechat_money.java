/**
 * ΢�ź�������㷨
 * 
 * @author Michael282694
 */
public class wechat_money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double total_money; // ����ܽ��
		int total_people; // �����������
		double min_money; // ÿ�����������յ�0.01Ԫ

		total_money = 10.0;
		total_people = 8;
		min_money = 0.01;

		for (int i = 0; i < total_people - 1; i++) {
			int j = i + 1;
			double safe_money = (total_money - (total_people - j) * min_money) / (total_people - j);
			double tmp_money = (Math.random() * (safe_money * 100 - min_money * 100) + min_money * 100) / 100;
			total_money = total_money - tmp_money;
			System.out.format("�� %d ������� %.2f Ԫ��ʣ�£� %.2f Ԫ\n", j, tmp_money, total_money);
		}
		System.out.format("�� %d ������� %.2f Ԫ��ʣ�£� 0 Ԫ\n", total_people, total_money);
	}
}
