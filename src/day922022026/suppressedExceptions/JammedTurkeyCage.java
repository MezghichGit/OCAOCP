package day922022026.suppressedExceptions;

public class JammedTurkeyCage implements AutoCloseable {
	
	static int nb=0;
	int num;
	JammedTurkeyCage(){
		nb++;
		num=nb;
	}
	public void close() throws IllegalStateException {
		throw new IllegalStateException("Cage door does not close : "+ num);
	}
}
