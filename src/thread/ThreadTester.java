package thread;

class UploadResult extends Thread {
	@Override
	public void run() {
		System.out.println("Inside run");
	}
}
public class ThreadTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UploadResult uploadThread = new UploadResult();
		uploadThread.start();
//		uploadThread.stop();
	}

}
