package thread;

public class Store {
	private final int MaX_SIZE;
	private int count;
	public Store(int n){
		MaX_SIZE = n;
		count=0;
	}
	
	public synchronized void add(){
		while(count>=MaX_SIZE){
			System.out.println("filled");
			try{
				this.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		count++;
		System.out.println(Thread.currentThread().toString()+" put "+count);
		this.notify();
	}
	
	public synchronized void remove(){
		while(count<=0){
			System.out.println("empty");
			try{
				this.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().toString()+" put "+count);
		count--;
		this.notify();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store s = new Store(5);
		Thread pro = new Producer(s);
		Thread con = new Consumer(s);
		Thread pro2 = new Producer(s);
		Thread con2 = new Consumer(s);
		pro.setName("Producer");
		con.setName("Consumer");
		pro2.setName("Producer2");
		con2.setName("Consumer2");
		pro.start();
		pro2.start();
		con.start();
		con2.start();
	}
}

class Producer extends Thread{
	private Store s;
	public Producer(Store s){
		this.s=s;
	}
	public void run(){
		while(true){
			s.add();
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class Consumer extends Thread{
	private Store s;
	public Consumer(Store s){
		this.s=s;
	}
	public void run(){
		while(true){
			s.remove();
			try{
				Thread.sleep(1500);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
