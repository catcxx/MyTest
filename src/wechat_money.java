/**
 * 微信红包分配算法
 * 
 * @author Michael282694
 */
public class wechat_money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double total_money; // 红包总金额
		int total_people; // 抢红包总人数
		double min_money; // 每个人最少能收到0.01元

		total_money = 10.0;
		total_people = 8;
		min_money = 0.01;

		for (int i = 0; i < total_people - 1; i++) {
			int j = i + 1;
			double safe_money = (total_money - (total_people - j) * min_money) / (total_people - j);
			double tmp_money = (Math.random() * (safe_money * 100 - min_money * 100) + min_money * 100) / 100;
			total_money = total_money - tmp_money;
			System.out.format("第 %d 个红包： %.2f 元，剩下： %.2f 元\n", j, tmp_money, total_money);
		}
		System.out.format("第 %d 个红包： %.2f 元，剩下： 0 元\n", total_people, total_money);
	}
}
