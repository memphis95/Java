package thread;

class UploadResult1 implements Runnable {
	@Override
	public void run() {
		System.out.println("Inside Run");
	}
}
public class ThreadRunnableTestet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UploadResult1 uploadRunnable = new UploadResult1();
		Thread threadObj = new Thread(uploadRunnable);
		threadObj.start();
		threadObj.run();

	}

}
