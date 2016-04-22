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
       
        //�� XML �ĵ���ȡ DOM �ĵ�ʵ����ʹ�ô��࣬Ӧ�ó���Ա���Դ� XML ��ȡһ��Document
	 	//������������ָ��DocumentBuilder  
        DocumentBuilder db=DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document document=db.parse(new File("E:\\eclipse\\test\\test.xml"));//���ļ�������DOCUMENT����
       
        System.out.println("*****�������XMLԪ��*****");  
        Element root=document.getDocumentElement() ;
        String rootName=root.getNodeName();
        System.out.println("XML�ļ����ڵ�����֣�"+rootName); 
        NodeList list=root.getElementsByTagName("dbstore");//���pageԪ��
        
        showElem(list);       
       
    }
 
 public static void showElem(NodeList nl){
   for(int i=0;i<nl.getLength();i++){
             Node n=nl.item(i);//�õ����ڵ�
             if(n.hasChildNodes())
             {
             NamedNodeMap attributes=n.getAttributes(); //�����ڵ�����������<dbstore single="false" att="tta">
            // System.out.println(attributes.getLength()); 
             for(int j=0;j<attributes.getLength();j++)
             {
              Node attribute=attributes.item(j);
               //�õ�������
              String attributeName=attribute.getNodeName();
              System.out.println("������:"+attributeName);
              //�õ�����ֵ
              String attributeValue=attribute.getNodeValue();
              System.out.println("����ֵ:"+attributeValue);
          }//��ӡ�����������:att����ֵ:tta������:single����ֵ:false
            
            
             }
             //�ӽڵ�
          NodeList childList=n.getChildNodes();
          for(int x=0;x<childList.getLength();x++)
          {
            Node childNode=childList.item(x);
            //�ж�ȡ����ֵ�Ƿ�����ElementԪ��,Ŀ���ǹ��˵�
            if(childNode instanceof Element)
               {
                   //�õ��ӽڵ������
                   String childNodeName=childNode.getNodeName();
                   System.out.println("�ӽڵ���:"+childNodeName);
                   //�õ��ӽڵ��ֵ
                   String childNodeValue=childNode.getTextContent();
                   System.out.println("�ӽڵ�ֵ:"+childNodeValue);
               }
          } showElem(n.getChildNodes());//�ݹ�
              
             }
  
            
            
   }
  
 }
