package hw6;

import java.util.Comparator;

public class MovieComparator_Array implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		
		return Double.compare(o1.getRating(), o2.getRating());
		
		
	}

}
