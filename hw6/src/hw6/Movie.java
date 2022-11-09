package hw6;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Movie {

	private int ID;
	private double viewers;
	private double rating;
	private int releaseYear;
	private String name;
	
	
	public Movie(int ID, double viewers, double rating, int releaseYear, String name) {
		this.ID = ID;
		this.viewers = viewers;
		this.rating = rating;
		this.releaseYear = releaseYear;
		this.name = name;
	}
	
	public Movie() {
		ID = 0;
		viewers = 0;
		rating = 0;
		releaseYear = 0001;
		name = "movie";
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getViewers() {
		return viewers;
	}

	public void setViewers(double viewers) {
		this.viewers = viewers;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Movie [ID=" + ID + ", viewers=" + viewers + ", rating=" + rating + ", releaseYear=" + releaseYear
				+ ", name=" + name + "]";
	}
	
	public Movie[] readData_Array(java.io.File list, int length) throws FileNotFoundException {
		
		//create an array of declared length (length = number of movies)
		Movie[] movieArray = new Movie[length];
		//initialize scanner on file
		Scanner input = new Scanner(list);
		
		//scan through the txt
		for(int i = 0; i < length; i++){
			int ID = input.nextInt();
			double viewers = input.nextDouble();
			double rating = input.nextDouble();
			int releaseYear = input.nextInt();
			//nextLine() catches the entire name since it is the last entry in a given line
			String name = input.nextLine();
			
			Movie currentMovie = new Movie(ID, viewers, rating, releaseYear, name);
			
			movieArray[i] = currentMovie;
			
			
		}
		
		input.close();
		
		return movieArray;
	}
	
	public ArrayList<Movie> readData_List(java.io.File list, int length) throws FileNotFoundException{
		
		ArrayList<Movie> movieList = new ArrayList<>();
		
		Scanner input = new Scanner(list);
		
		//scan through the txt
		for(int i = 0; i < length; i++){
			int ID = input.nextInt();
			double viewers = input.nextDouble();
			double rating = input.nextDouble();
			int releaseYear = input.nextInt();
			//nextLine() catches the entire name since it is the last entry in a given line
			String name = input.nextLine();
			
			Movie currentMovie = new Movie(ID, viewers, rating, releaseYear, name);
			
			movieList.add(currentMovie);
			
			
		}
		
		input.close();
		
		return movieList;
	}

	
	//search for a movie by its rating
	public Movie[] ratingSearch_Array(Movie[] list, double rating) {
		
		
		//holding array
		Movie[] foundMovies = new Movie[100];
		int index = 0;
		
		
		for(int i = 0; i < list.length; i++) {
			
			if(list[i].getRating() == rating) {
				foundMovies[index] = list[i];
				index++;
			}
			
		}
		
		//copy holding array to return array
		Movie[] found = new Movie[index]; 
		
		for(int i = 0; i < index; i++) {
			found[i] = foundMovies[i];
		}
		
		return found;
		
	}
	
	public ArrayList<Movie> ratingSearch_List(ArrayList<Movie> list, int year, double rating) {
		
		ArrayList<Movie> foundMovies = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++) {
			
			if(list.get(i).getReleaseYear() == year) {
				if(list.get(i).getRating() == rating) {
					foundMovies.add(list.get(i));
				}
			}
			
		}
		
		return foundMovies;
		
	}
	
	
}
