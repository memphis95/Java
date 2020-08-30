package thread;

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("Inside run");
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside the main thread");
		MyThread t = new MyThread();
		t.start();
		System.out.println(t.isAlive());
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t.isAlive());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main thread ends");
		
	}

}
