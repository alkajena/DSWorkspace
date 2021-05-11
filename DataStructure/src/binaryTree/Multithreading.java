package binaryTree;

public class Multithreading {

	public static void main(String[] args) throws InterruptedException {
		/* MyThread t = new MyThread(); 
	        t.start(); 
	  
	        for (int i=0; i<5; i++) 
	        { 
	        	 
	            // Control passes to child thread 
	            Thread.yield(); 
	  
	            // After execution of child Thread 
	            // main thread takes over 
	            System.out.println(Thread.currentThread().getName() 
	                                + " in control"); 
		
	        } */
	
		
	/*	Thread t = new Thread(new SleepDemo()); 
		  
        // call run() function 
        t.start(); 
  
        Thread t2 = new Thread(new SleepDemo()); 
  
        // call run() function 
        t2.start(); */
		
		final PC pc = new PC(); 
		  
        // Create a thread object that calls pc.produce() 
        Thread t1 = new Thread(new Runnable() 
        { 
            @Override
            public void run() 
            { 
                try
                { 
                    pc.produce(); 
                } 
                catch(InterruptedException e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
        }); 
  
        // Create another thread object that calls 
        // pc.consume() 
        Thread t2 = new Thread(new Runnable() 
        { 
            @Override
            public void run() 
            { 
                try
                { 
                    pc.consume(); 
                } 
                catch(InterruptedException e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
        }); 
  
        // Start both threads 
        t1.start(); 
        t2.start(); 
  
        // t1 finishes before t2 
        t1.join(); 
        t2.join(); 

	}

}
class PC{
	public  void produce() throws InterruptedException{
		synchronized(this){
			int i=0;
			while(i<6){
				System.out.println(i);
			/*	System.out.println("neha");
				wait();
				System.out.println(i);
				System.out.println("jena");*/
				i+=2;
			}
		}
		
	}
	

	public synchronized void consume() throws InterruptedException{
		synchronized(this){
			int i=1;
			while(i<6){
				System.out.println(i);
				i+=2;
			}
		/*	notify();
			System.out.println("alka");*/
		}
	}
}
class MyThread extends Thread 
{ 
    public void run() 
    { 
        for (int i=0; i<5 ; i++) 
            System.out.println(Thread.currentThread().getName() 
                                + " in control"); 
    } 
} 

 class SleepDemo implements Runnable 
{ 
    Thread t; 
    public void run() 
    { 
        for (int i = 0; i < 4; i++) 
        { 
           
            try
            { 
                // thread to sleep for 1000 milliseconds 
                Thread.sleep(1000); 
                System.out.println(Thread.currentThread().getName() 
                        + "  " + i); 
            } 
  
            catch (Exception e) 
            { 
                System.out.println(e); 
            } 
        } 
    }
    
}