package cn.cxx.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMParser {
	DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();

	// Load and parse XML file into DOM
	public Document parse(String filePath) {
		Document document = null;
		try {
			// DOM parser instance
			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			// parse an XML file into a DOM tree
			document = builder.parse(new File(filePath));
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return document;
	}

	public static void main(String[] args) {
		DOMParser parser = new DOMParser();
		Document document = parser.parse("books.xml");
		// get root element
		Element rootElement = document.getDocumentElement();

		// traverse child elements
		NodeList nodes = rootElement.getChildNodes();
		for (int i = 0; i < nodes.getLength(); i++) {
			Node node = nodes.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element child = (Element) node;
				// process child element
			}
		}

		NodeList nodeList = rootElement.getElementsByTagName("book");
		if (nodeList != null) {
			for (int i = 0; i < nodeList.getLength(); i++) {
				Element element = (Element) nodeList.item(i);
				String id = element.getAttribute("id");
				String title = element.getAttribute("title");
				String author = element.getAttribute("author");
				String elementtitle = element.getElementsByTagName("title").item(0).getFirstChild().getNodeValue();
				String elementauthor = element.getElementsByTagName("author").item(0).getFirstChild().getNodeValue();
				System.out.println("id:" + id);
				System.out.println("title:" + title + elementtitle);
				System.out.println("author:" + author + elementauthor);
			}
		}
	}
}
// public class DOMParser {
// DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
// //Load and parse XML file into DOM
// public Document parse(String filePath) {
// Document document = null;
// try {
// //DOM parser instance
// DocumentBuilder builder = builderFactory.newDocumentBuilder();
// //parse an XML file into a DOM tree
// document = builder.parse(new File(filePath));
// } catch (ParserConfigurationException e) {
// e.printStackTrace();
// } catch (SAXException e) {
// e.printStackTrace();
// } catch (IOException e) {
// e.printStackTrace();
// }
// return document;
// }
//
// public static void main(String[] args) {
// DOMParser parser = new DOMParser();
// Document document = parser.parse("books.xml");
// //get root element
// Element rootElement = document.getDocumentElement();
//
// //traverse child elements
// NodeList nodes = rootElement.getChildNodes();
//
//
//
//
// for (int i=0; i < nodes.getLength(); i++)
// {
// Node node = nodes.item(i);
// if (node.getNodeType() == Node.ELEMENT_NODE) {
// Element child = (Element) node;
// //process child element
//
//// System.out.println("id:"+child.getAttribute("id")+"//////////////");
//// System.out.println("title:"+child.getElementsByTagName("title").item(0).getNodeType()+"-------");
// }
// }
//
// NodeList nodeList = rootElement.getElementsByTagName("book");
// if(nodeList != null)
// {
// for (int i = 0 ; i < nodeList.getLength(); i++)
// {
// Element element = (Element)nodeList.item(i);
// String id = element.getAttribute("id");
// String nodename = element.getNodeName();
// String cn = element.getTagName();
//// String str = element.getTextContent();
//// System.out.println("str:"+str);
//// String attributeName=element.getNodeName();
//// System.out.println("attributeName:"+attributeName);
// System.out.println("id:"+id);
// System.out.println("nodename:"+nodename);
// System.out.println("tagname:"+cn);
// }
// }
// }
// }
