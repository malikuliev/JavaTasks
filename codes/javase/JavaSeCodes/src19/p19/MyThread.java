package p19;

public class MyThread extends Thread{
@Override
public void run() {
	 // burda uzun ceken islerin kodlarini yazmaq olar
	
	for (int i = 0; i < 8; i++) {
		doIt();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

public static void doIt() {
	System.out.println("do it");
}
}
