package DAY26;
class ThreadClass1 extends Thread{
	public void run() {
		for(int i = 0; i<10 ; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread class 1");
		}
	}
}

class ThreadClass2 extends Thread{
	public void run() {
		for(int i = 0; i<10 ; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread class 2");
		}
	}
}
public class Multithreading {

	public static void main(String[] args) {
		ThreadClass1 th1 = new ThreadClass1();
		ThreadClass2 th2 = new ThreadClass2();
		
		System.out.println(th1.getState());
		System.out.println(th2.getState());
		
		th1.start();
		th2.start();
		
		
		System.out.println(th1.getState());
		System.out.println(th2.getState());
		
		try {
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(th1.getState());
		System.out.println(th2.getState());

	}

}

