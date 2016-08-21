package rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * 创建RMI注册表，启动RMI服务，并将远程对象注册到RMI注册表中。
 */
public class HelloServer {
	public static void main(String args[]) {

		try {
			// 创建一个远程对象
			IHello rhello = new HelloImpl();
			// 本地主机上的远程对象注册表Registry的实例，并指定端口为8888，这一步必不可少（Java默认端口是1099），必不可缺的一步，缺少注册表创建，则无法绑定对象到远程注册表上
			LocateRegistry.createRegistry(8889);

			// 把远程对象注册到RMI注册服务器上，并命名为RHello
			// 绑定的URL标准格式为：rmi://host:port/name
			Naming.bind("rmi://localhost:8889/RHello", rhello);

			// long remotetime= rhello.gettime();

			System.out.println(">>>>>INFO:远程IHello对象绑定成功！");
		} catch (RemoteException e) {
			System.out.println("创建远程对象发生异常！");
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			System.out.println("发生重复绑定对象异常！");
			e.printStackTrace();
		} catch (MalformedURLException e) {
			System.out.println("发生URL畸形异常！");
			e.printStackTrace();
		}
	}
}
