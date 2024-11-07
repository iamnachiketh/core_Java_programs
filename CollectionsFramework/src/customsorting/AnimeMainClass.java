package customsorting;

import java.util.TreeSet;

public class AnimeMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Anime> ts = new TreeSet<Anime>(new AnimeRatingComparator());
		
		ts.add(new Anime("Bleach", 8.9));
		ts.add(new Anime("Demon Slayer", 9.5));
		ts.add(new Anime("JJK", 8.5));
		ts.add(new Anime("Kaiju No 8", 8.2));
		ts.add(new Anime("solo leveling", 8.6));
		
		for(Anime m:ts) {
			System.out.println("Anime Name: "+m.animeName+" Rating: "+m.rating);
		}
		
	}

}
