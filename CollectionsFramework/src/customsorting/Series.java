package customsorting;

public class Series implements Comparable<Series>{
	
	String seriesName;
	Double rating;
	
	public Series(String seriesName,Double rating) {
		this.seriesName = seriesName;
		this.rating = rating;
	}
	
	@Override
	public int compareTo(Series s) {
		if(this.rating == s.rating) {
			return this.seriesName.compareTo(s.seriesName);
		}
		return s.rating.compareTo(this.rating);
	}
	
}
