package suanfa;

//�򵥱�������-�ݹ�ʵ��-
//����ͬ��������������뱳���У���ʹ���������
//-----------�ﵽָ����������-------------
public class Pairing {
	private int weight = 20; // �������ܵ�����
	private int target;
	private int[] items = { 11, 8, 7, 6, 5 };// ��ѡ������������
	private int size; // ��ѡ�������Ŀ
	private int j = 0;

	// ------------���캯��----------------
	public Pairing() {
		this.size = items.length;
	}

	// -------------������----------------
	public String pairing() {
		target = weight;
		String result = "";
		for (int i = j; i < size; i++) {

			if (target > items[i]) { // Ŀ����������ѡ��������
				result = result + " " + String.valueOf(items[i]);
				System.out.println(result + " --target is " + target + "--" + items[i] + " is too small");

				target = target - items[i];

			} else if (target < items[i]) { // Ŀ������С��ѡ���������
				 System.out.println(result + " --target is " + target + "--"
				 + items[i] + " is too big");

			} else { // Ŀ����������ѡ���������
				result = result + " " + String.valueOf(items[i]);
				System.err.println(result + " --target is " + target + "--" + items[i] + " is success");
				return "success";
			}

		}
		// ����items[j]Ϊ�׸�ƥ�����ƥ�䲻�����ǣ��ݹ鴦���j+1��size��Χ�ڵ���
		j = j + 1;
		pairing();
		// û��ǡ�õ���Ŀ���ƥ�����
		return "fail";

	}// end pairing

}// end
