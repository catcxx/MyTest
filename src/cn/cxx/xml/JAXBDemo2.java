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
		// ����xml�ĵ������䱣����E�̵ĸ�Ŀ¼�µ�test.xml�ļ�
		File xmlFile = new File("testjaxb.xml");
		// ����JAXBContext�����Ķ���
		JAXBContext context;
		try {
			// ͨ��ָ��ӳ����ഴ��������
			context = JAXBContext.newInstance(Article.class);// step 1
			// ͨ�������Ĵ���javaת��xml�Ķ���Marshaller

			// ͨ�������Ĵ���xmlת��java�Ķ���Unmarshaller
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
