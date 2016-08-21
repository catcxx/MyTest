package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.text.SimpleDateFormat;

public class HelloImpl extends UnicastRemoteObject implements IHello {
	/**
	 * ��ΪUnicastRemoteObject�Ĺ��췽���׳���RemoteException�쳣���������Ĭ�ϵĹ��췽������д��
	 * ���������׳�RemoteException�쳣
	 * 
	 * @throws RemoteException
	 */
	public HelloImpl() throws RemoteException {
	}

	/**
	 * �򵥵ķ��ء�Hello World��"����
	 * 
	 * @return ���ء�Hello World��"����
	 * @throws java.rmi.RemoteException
	 */
	public String helloWorld() throws RemoteException {
		return "Hello World!";
	}

	public long gettime() throws RemoteException {
		long t1 = System.currentTimeMillis();
		return t1;
	}

	// public long setlocaltime(long t0,long t1){
	// long ts=t0+(t1-t0)/2;
	// return ts;
	// }
}