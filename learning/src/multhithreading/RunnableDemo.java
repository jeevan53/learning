package multhithreading;

public class RunnableDemo implements Runnable {


	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Thread "+Thread.currentThread().getId()+" is running");
			
		}
		catch(Exception e) {
			System.out.println("Exception Caught");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 8;
		for(int i=0;i<x;i++) {
			Thread r = new Thread(new RunnableDemo());
			r.start();
		}
	}



}
