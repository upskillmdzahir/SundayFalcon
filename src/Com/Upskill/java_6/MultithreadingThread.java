package Com.Upskill.java_6;

public class MultithreadingThread extends Thread{
	public void run() {
		try{
			System.out.println("Thread Number #" + Thread.currentThread().getId());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
