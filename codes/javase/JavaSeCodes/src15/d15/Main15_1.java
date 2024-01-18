package d15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main15_1 {

	public static void main(String[] args) throws IOException   {

		// runtime exception

		int[] a = {};
		System.out.println(a[9]);

		Files.copy(null, null);
		 
	}

}
