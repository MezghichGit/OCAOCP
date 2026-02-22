package day922022026;

import java.io.BufferedReader;

public class ExempleTryWithRessources {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try(RS rs = new RS(); TH th = new TH())   // try-with-ressources
		{
			rs.processing();
			th.work();
		}
		
		/*
		try(TH th = new TH())
		{
			th.work();
		}*/

	}

}
