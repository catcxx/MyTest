package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/** 
* ����һ��Զ�̽ӿڣ�����̳�Remote�ӿڣ�������ҪԶ�̵��õķ��������׳�RemoteException�쳣 
*/ 
public interface IHello extends Remote { 

    /** 
     * �򵥵ķ��ء�Hello World��"���� 
     * @return ���ء�Hello World��"���� 
     * @throws java.rmi.RemoteException 
     */ 
    public String helloWorld() throws RemoteException; 
    long t0=0;
    long t1=0;
   
   
 //  public long getlocaltime();
//    public long setlocaltime();
    public long gettime() throws RemoteException;
}