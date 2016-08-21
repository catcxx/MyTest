package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.text.SimpleDateFormat;

public class HelloImpl extends UnicastRemoteObject implements IHello {
	/**
	 * 因为UnicastRemoteObject的构造方法抛出了RemoteException异常，因此这里默认的构造方法必须写，
	 * 必须声明抛出RemoteException异常
	 * 
	 * @throws RemoteException
	 */
	public HelloImpl() throws RemoteException {
	}

	/**
	 * 简单的返回“Hello World！"字样
	 * 
	 * @return 返回“Hello World！"字样
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