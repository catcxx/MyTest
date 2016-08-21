package cn.cxx.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * java obeject to xml
 * 
 * @author Administrator
 *
 */
public class JAXBDemo1 {

	public static void main(String[] args) {
		// 创建xml文档对象，其保存在E盘的根目录下的test.xml文件
		File xmlFile = new File("testjaxb.xml");
		// 声明JAXBContext上下文对象
		JAXBContext context;
		try {
			// 通过指定映射的类创建上下文
			context = JAXBContext.newInstance(Article.class);// step 1
			// 通过上下文创建java转化xml的对象Marshaller
			Marshaller m = context.createMarshaller();// step 2
			// 创建xml中的数据
			Article article = new Article();
			article.setAuthor("Janet");
			article.setDate("20080801");
			article.setEmail("janetvsfei@yahoo.com.cn");
			article.setTitle("XML");
			// 将java对象转化到xml
			m.marshal(article, xmlFile);// step 3

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
