package hw6;

import java.util.Comparator;

public class MovieComparator_List implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		
		//first compare by year
		
		if(o1.getReleaseYear() < o2.getReleaseYear()) {
			return -1;
		}
		//if the years are equal
		else if(o1.getReleaseYear() == o2.getReleaseYear()) {
			//then compare by rating
			
			if(o1.getRating() < o2.getRating()) {
				return -1;
			}
			else if(o1.getRating() == o2.getRating()) {
				return 0;
			}
			else {
				return 1;
			}
			
		}
		else {
			return 1;
		}
		
		
	}

	
	
}
