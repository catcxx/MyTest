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
		// ����xml�ĵ������䱣����E�̵ĸ�Ŀ¼�µ�test.xml�ļ�
		File xmlFile = new File("testjaxb.xml");
		// ����JAXBContext�����Ķ���
		JAXBContext context;
		try {
			// ͨ��ָ��ӳ����ഴ��������
			context = JAXBContext.newInstance(Article.class);// step 1
			// ͨ�������Ĵ���javaת��xml�Ķ���Marshaller
			Marshaller m = context.createMarshaller();// step 2
			// ����xml�е�����
			Article article = new Article();
			article.setAuthor("Janet");
			article.setDate("20080801");
			article.setEmail("janetvsfei@yahoo.com.cn");
			article.setTitle("XML");
			// ��java����ת����xml
			m.marshal(article, xmlFile);// step 3

		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}
