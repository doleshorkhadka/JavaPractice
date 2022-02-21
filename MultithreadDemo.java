
public class MultithreadDemo {
	public static void main(String[] args){
		Multithread m1 = new Multithread("One");
		Thread t1 = new Thread(m1);
		t1.start();
		Multithread m2 = new Multithread("Two");
		Thread t2 = new Thread(m2);
		t2.start();
	}
	}
class Multithread implements Runnable{
	String name;
	
	Multithread(String n){
		name = n;
		System.out.println("Creating : "+ name);
		}
	public void run(){
		System.out.println("Runnning : "+name);
		try{
			for(int i = 1;i<=5 ;i++){
				System.out.println("Thread "+ name + " Printing" + i);
				Thread.sleep(500);
			}
		}
		catch (InterruptedException e){
			System.out.println("Thread "+ name +" interrupted");
			}
		System.out.println("Thread "+ name +" Exiting.");
		}	
	}

