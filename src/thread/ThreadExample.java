package thread;

public class ThreadExample implements Runnable{
	@Override
	public void run() {
		System.out.println("Hello Threads");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExample threadEx = new ThreadExample();
		Thread thread1 = new Thread(threadEx);
		Thread thread2 = new Thread(threadEx);
		Thread thread3 = new Thread(threadEx);
		Thread thread4 = new Thread(threadEx);
		Thread thread5 = new Thread(threadEx);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();

	}

}
