package rmi;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * 客户端测试，在客户端调用远程对象上的远程方法，并返回结果。 
 * @author Administrator
 *
 */

public class HelloClient { 
    public static void main(String args[]){ 
        try { 
            //在RMI服务注册表中查找名称为RHello的对象，并调用其上的方法 
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