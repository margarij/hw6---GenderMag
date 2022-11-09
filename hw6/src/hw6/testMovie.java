package hw6;
import java.io.FileNotFoundException;
import java.util.ArrayList;


public class testMovie {

	public static void main(String [] args) throws FileNotFoundException {
		
		Movie BabyDriver = new Movie(300, 100.2, 9.50, 2017, "Baby Driver");
		
		System.out.println(BabyDriver);
		System.out.println();
		
		
		java.io.File file = new java.io.File("C:\\Users\\soari\\Desktop\\list.txt");
		
		Movie test = new Movie();
		
		Movie[] movieArray = test.readData_Array(file, 100);
		
		System.out.println("Number 50 in Movie Array: " + movieArray[50]);
		
		ArrayList<Movie> movieList = test.readData_List(file, 100);

		System.out.println("Number 50 in Movie List: " + movieList.get(50));
		System.out.println();
		
		Movie[] movies_42 = test.ratingSearch_Array(movieArray, 0.42);
		
		System.out.println("Movies in Movie Array with rating 0.42: ");
		for(int i = 0; i < movies_42.length; i++) {
			System.out.println(movies_42[i]);
		}
		System.out.println("Time complexity for this method: O(n)");
		System.out.println();
		
		
		ArrayList<Movie> movies_1994_549 = test.ratingSearch_List(movieList, 1994, 5.49);
		
		System.out.println("Movies in Movie List from the year 1994 with rating 5.49: ");
		System.out.println(movies_1994_549);
		System.out.println("Time complexity for this method: O(n)");
		System.out.println();
		
		Movie movie1 = new Movie(500, 500.4, 5.24, 1900, "Movie One");
		
		Movie movie2 = new Movie(501, 400.5, 4.25, 1950, "Movie Two");
		
		Movie[] movieArray2 = new Movie[2];
		movieArray2[0] = movie1;
		movieArray2[1] = movie2;
		
		MovieComparator_Array comparator1 = new MovieComparator_Array();
		
		System.out.println("Array comparison:");
		if(comparator1.compare(movieArray2[0], movieArray2[1]) == -1) {
			System.out.println("Movie one is less than movie two");
		}
		
		else if(comparator1.compare(movieArray2[0], movieArray2[1]) == 0) {
			System.out.println("Movie one is equal to movie two");
		}
		
		else if(comparator1.compare(movieArray2[0], movieArray2[1]) == 1) {
			System.out.println("Movie one is greater than movie two");
		}
		System.out.println("Time complexity of this method: O(1)");
		System.out.println();
		
		
		
		ArrayList<Movie> movieList2 = new ArrayList<>();
		
		movieList2.add(movie1);
		movieList2.add(movie2);
		
		MovieComparator_List comparator2 = new MovieComparator_List();
		
		System.out.println("List comparison:");
		if(comparator2.compare(movieList2.get(0), movieList2.get(1)) == -1) {
			System.out.println("Movie one is less than movie two");
		}
		
		else if(comparator2.compare(movieList2.get(0), movieList2.get(1)) == 0) {
			System.out.println("Movie one is equal to movie two");
		}
		
		else if(comparator2.compare(movieList2.get(0), movieList2.get(1)) == 1) {
			System.out.println("Movie one is greater than movie two");
		}
		System.out.println("Time complexity of this method: O(1)");
		
	}
}
