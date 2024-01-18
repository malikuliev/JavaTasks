package p19;

import java.util.Iterator;

public class Main_19_2 {
	// main thread
	public static void main(String[] args) throws InterruptedException {
		System.out.println("main basladi");
		// multitreadig WEB
		MyThread myThread = new MyThread();
		myThread.start();
Thread.sleep(1000);
		System.out.println("main bitdi");

	}

	// 1 like emeliyyati 3 saniye cekerse
	// onda 10 000 emeliyyat sira ile icra olnarsa
	// 30 000 saniye lazimdir

}
