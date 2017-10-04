
public class WorkerThread implements Runnable{

	private String message;
		
	WorkerThread(String s){
		this.message = s;
	}
	
	public void run(){
		
		System.out.println(Thread.currentThread().getName() + " start message :" +message);
		processMessage(message);
		
		System.out.println(Thread.currentThread().getName() + " End message )");
		
	
	
	}

	private void processMessage(String message2) {
		// TODO Auto-generated method stub
		
		try{
		Thread.sleep(500);;
		}
		
		catch(InterruptedException e){
			System.out.println(e);
		}
	}
	
	
}
