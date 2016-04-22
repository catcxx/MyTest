package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/** 
* 定义一个远程接口，必须继承Remote接口，其中需要远程调用的方法必须抛出RemoteException异常 
*/ 
public interface IHello extends Remote { 

    /** 
     * 简单的返回“Hello World！"字样 
     * @return 返回“Hello World！"字样 
     * @throws java.rmi.RemoteException 
     */ 
    public String helloWorld() throws RemoteException; 
    long t0=0;
    long t1=0;
   
   
 //  public long getlocaltime();
//    public long setlocaltime();
    public long gettime() throws RemoteException;
}