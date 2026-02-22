package day922022026;

import java.io.Closeable;
import java.io.IOException;

public class TH implements Closeable{

	public void work()
	{}
	@Override
	public void close() {
		System.out.println("Cloture de TH");
		
	}

}
