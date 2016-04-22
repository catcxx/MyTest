package cn.cxx.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;


public class Xmltest {
 public static void main(String[] args) throws Exception{
       
        //从 XML 文档获取 DOM 文档实例。使用此类，应用程序员可以从 XML 获取一个Document
	 	//创建解析工厂指定DocumentBuilder  
        DocumentBuilder db=DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document document=db.parse(new File("E:\\eclipse\\test\\test.xml"));//把文件解析成DOCUMENT类型
       
        System.out.println("*****下面遍历XML元素*****");  
        Element root=document.getDocumentElement() ;
        String rootName=root.getNodeName();
        System.out.println("XML文件根节点的名字："+rootName); 
        NodeList list=root.getElementsByTagName("dbstore");//获得page元素
        
        showElem(list);       
       
    }
 
 public static void showElem(NodeList nl){
   for(int i=0;i<nl.getLength();i++){
             Node n=nl.item(i);//得到父节点
             if(n.hasChildNodes())
             {
             NamedNodeMap attributes=n.getAttributes(); //遍历节点所有属性如<dbstore single="false" att="tta">
            // System.out.println(attributes.getLength()); 
             for(int j=0;j<attributes.getLength();j++)
             {
              Node attribute=attributes.item(j);
               //得到属性名
              String attributeName=attribute.getNodeName();
              System.out.println("属性名:"+attributeName);
              //得到属性值
              String attributeValue=attribute.getNodeValue();
              System.out.println("属性值:"+attributeValue);
          }//打印出结果属性名:att属性值:tta属性名:single属性值:false
            
            
             }
             //子节点
          NodeList childList=n.getChildNodes();
          for(int x=0;x<childList.getLength();x++)
          {
            Node childNode=childList.item(x);
            //判断取出的值是否属于Element元素,目的是过滤掉
            if(childNode instanceof Element)
               {
                   //得到子节点的名字
                   String childNodeName=childNode.getNodeName();
                   System.out.println("子节点名:"+childNodeName);
                   //得到子节点的值
                   String childNodeValue=childNode.getTextContent();
                   System.out.println("子节点值:"+childNodeValue);
               }
          } showElem(n.getChildNodes());//递归
              
             }
  
            
            
   }
  
 }
