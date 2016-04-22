package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MysqlDemo {
    public static void main(String[] args) throws Exception {
       
        try {
            
            Class.forName("com.mysql.jdbc.Driver");// 1.加载驱动
 
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");//2.数据库连接
            
            Statement stmt = conn.createStatement();//3.创建语句
            
            String sql = "Select * from gps limit 10;";
            ResultSet ret = stmt.executeQuery(sql);// 4.执行语句
            
            
            while (ret.next()) {
				String no = ret.getString(1);
				String id = ret.getString(2);
				System.out.println(no + "\t" + id + "\t");
			}//5.处理数据
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
 
}
