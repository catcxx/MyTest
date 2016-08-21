package testfile;

import java.io.File;
import java.io.IOException;

public class Admin {

	public static void main(String... args) {
		String path0 = "D:/a/";
		String path1 = "D:/a/test.txt";

		File f = new File(path0);

		// 创建文件夹
		if (!f.exists()) {
			f.mkdirs();
		}

		f = new File(path1);

		// 创建文件
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		String tmp = "aa" + 1;
		System.out.println((String) tmp);
	}
}