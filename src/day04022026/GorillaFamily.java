package day04022026;

public class GorillaFamily {
	String walk = "walk";

	void everyonePlay(boolean baby) {
		//baby=false;
		String approach = "amble";
		//approach = "ok";
		// approach = "run";
		play(() -> walk);
		play(() -> baby ? "hitch a ride" : "run");
		play(() -> approach);
	}

	void play(Gorilla g) {
		System.out.println(g.move());
	}
}
