package cn.cxx.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * xml to java obeject
 * 
 * @author Administrator
 *
 */
public class JAXBDemo2 {

	public static void main(String[] args) {
		// 创建xml文档对象，其保存在E盘的根目录下的test.xml文件
		File xmlFile = new File("testjaxb.xml");
		// 声明JAXBContext上下文对象
		JAXBContext context;
		try {
			// 通过指定映射的类创建上下文
			context = JAXBContext.newInstance(Article.class);// step 1
			// 通过上下文创建java转化xml的对象Marshaller

			// 通过上下文创建xml转化java的对象Unmarshaller
			Unmarshaller u = context.createUnmarshaller();// step 2
			Article article = (Article) u.unmarshal(xmlFile);// step 3
			System.out.println(article.getAuthor());
			System.out.println(article.getDate());
			System.out.println(article.getEmail());
			System.out.println(article.getTitle());
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
