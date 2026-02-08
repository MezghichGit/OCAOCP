package day08022026.bound;

import java.util.ArrayList;
import java.util.List;

public class Test_Bounds {

	public static void main(String[] args) {
		
		
		ArrayList<O> lo = new ArrayList<>();
		ArrayList<A> la = new ArrayList<>();
		ArrayList<B> lb = new ArrayList<>();
		ArrayList<C> lc = new ArrayList<>();
		List<? extends A> l;  // upper-bound :  Borne Sup
		
		l = lb;
		l = la;
		l = lc;
		l = lo;
		
		List<? super B> ls;  // lower-bound : Borne inf
		ls = lb;
		ls = la;
		ls = lo;
		ls = lc;
		
		List<?> lu;  // unbounded
		lu = la;
		lu = lo;
		lu = lc;

	}

}
