package cn.cxx.xml;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlRootElement;

//��Ԫ�صı�ǩ��Ϊarticles
@XmlRootElement(name = "articles")
public class ArticleData {

	// articlesԪ�����ж��articleԪ��
	List<Article> article = new ArrayList<Article>();

	public List<Article> getArticle() {
		return article;
	}

	public void setArticle(List<Article> article) {
		this.article = article;
	}

	public static void main(String[] args) {

		// ����xml�ĵ������䱣���ڸ�Ŀ¼�µ�article.xml�ļ�
		File xmlFile = new File("article.xml");
		// ����JAXBContext�����Ķ���
		JAXBContext context;
		try {
			// ͨ��ָ��ӳ����ഴ��������
			context = JAXBContext.newInstance(ArticleData.class);
			// ͨ�������Ĵ���xmlת��java�Ķ���Unmarshaller
			Unmarshaller u = context.createUnmarshaller();
			// ��xml����ת����java����
			ArticleData data = (ArticleData) u.unmarshal(xmlFile);
			// ������е�article����
			List<Article> articles = data.getArticle();
			for (Article a : articles) {
				System.out.println("-------------------------");
				System.out.println(a.getAuthor());
				System.out.println(a.getDate());
				System.out.println(a.getEmail());
				System.out.println(a.getTitle());
			}
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
