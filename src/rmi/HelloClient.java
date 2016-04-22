package rmi;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * �ͻ��˲��ԣ��ڿͻ��˵���Զ�̶����ϵ�Զ�̷����������ؽ���� 
 * @author Administrator
 *
 */

public class HelloClient { 
    public static void main(String args[]){ 
        try { 
            //��RMI����ע����в�������ΪRHello�Ķ��󣬲��������ϵķ��� 
            IHello rhello =(IHello) Naming.lookup("rmi://localhost:8889/RHello"); 
            System.out.println(rhello.helloWorld()); 
            //System.out.println(rhello.sayHelloToSomeBody("cxx")); 
           //long localtime= rhello.getlocaltime();
           long localtime=System.currentTimeMillis();
           long remotetime= rhello.gettime();
           System.out.println("l: "+localtime);
           System.out.println("r: "+remotetime);
           
           System.out.println(localtime+(remotetime-localtime)/2);
        } catch (NotBoundException e) { 
            e.printStackTrace(); 
        } catch (MalformedURLException e) { 
            e.printStackTrace(); 
        } catch (RemoteException e) { 
            e.printStackTrace();   
        } 
    } 
}