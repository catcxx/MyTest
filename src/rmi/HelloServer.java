package rmi;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * ����RMIע�������RMI���񣬲���Զ�̶���ע�ᵽRMIע����С�
 */
public class HelloServer {
	public static void main(String args[]) {

		try {
			// ����һ��Զ�̶���
			IHello rhello = new HelloImpl();
			// ���������ϵ�Զ�̶���ע���Registry��ʵ������ָ���˿�Ϊ8888����һ���ز����٣�JavaĬ�϶˿���1099�����ز���ȱ��һ����ȱ��ע����������޷��󶨶���Զ��ע�����
			LocateRegistry.createRegistry(8889);

			// ��Զ�̶���ע�ᵽRMIע��������ϣ�������ΪRHello
			// �󶨵�URL��׼��ʽΪ��rmi://host:port/name
			Naming.bind("rmi://localhost:8889/RHello", rhello);

			// long remotetime= rhello.gettime();

			System.out.println(">>>>>INFO:Զ��IHello����󶨳ɹ���");
		} catch (RemoteException e) {
			System.out.println("����Զ�̶������쳣��");
			e.printStackTrace();
		} catch (AlreadyBoundException e) {
			System.out.println("�����ظ��󶨶����쳣��");
			e.printStackTrace();
		} catch (MalformedURLException e) {
			System.out.println("����URL�����쳣��");
			e.printStackTrace();
		}
	}
}
