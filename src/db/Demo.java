package db;

/**
 * ִ����ز�ѯ����
 */
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo {

	static String sql = null;
	static DBHelper db1 = null;
	static ResultSet ret = null;

	public static void main(String[] args) {
		sql = "Select * from gps limit 30;";//SQL���
		db1 = new DBHelper(sql);//����DBHelper����

		try {
			ret = db1.pst.executeQuery();//ִ����䣬�õ������
			while (ret.next()) {
				String no = ret.getString(1);
				String id = ret.getString(2);
				
				System.out.println(no + "\t" + id + "\t");
			}//��ʾ����
			ret.close();
			db1.close();//�ر�����
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

