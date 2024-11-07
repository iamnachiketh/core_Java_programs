package customsorting;

import java.util.Comparator;

public class AnimeRatingComparator implements Comparator<Anime>{
		
	@Override
	public int compare(Anime m1,Anime m2) {
		return m2.rating.compareTo(m1.rating);
	}
}
