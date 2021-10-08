package multhithreading;

public class ThreadDemo extends Thread {

	public void run()
	{
		try {
			//Display the thread that is running
			System.out.println("Thread "+Thread.currentThread().getId()+" is running");
			
		}
		catch(Exception e) {
			//Throwing an Exception
			System.out.println("Exception is caught");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		for(int i= 0;i<n;i++) {
			ThreadDemo th = new ThreadDemo();
			th.start();
		}
	}

}
