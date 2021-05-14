package Collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class Movie_Details {
     String mov_Name;
     String lead_Actor;
     String lead_Actories;
     String Genre;
	public Movie_Details(String mov_Name, String lead_Actor, String lead_Actories,String Genre) {

		this.mov_Name = mov_Name;
		this.lead_Actor = lead_Actor;
		this.lead_Actories = lead_Actories;
		this.Genre=Genre;
	}

	public String toString()
	 {
		 
		 return  mov_Name+"="+lead_Actor+"|"+lead_Actories+"|"+Genre+"|";
	 }
	
	
	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public String getMov_Name() {
		return mov_Name;
	}
	public void setMov_Name(String mov_Name) {
		this.mov_Name = mov_Name;
	}
	public String getLead_Actor() {
		return lead_Actor;
	}
	public void setLead_Actor(String lead_Actor) {
		this.lead_Actor = lead_Actor;
	}
	public String getLead_Actories() {
		return lead_Actories;
	}
	public void setLead_Actories(String lead_Actories) {
		this.lead_Actories = lead_Actories;
	}
     
     
     
}



class Movie_dataList{
	
	public static void main(String[] args) {
		
	
		List<Movie_Details> movie=Arrays.asList(
		new Movie_Details("Avtar","salman","katrina","Action"),
		  new Movie_Details("DDLG","sharuk","kajal","Family"),
		 new Movie_Details("Krish","hrithik","alia","Horror")
	);
		Collections.sort(movie,new Comparator<Movie_Details>()
				{

					@Override
					public int compare(Movie_Details o1, Movie_Details o2) {
						return o1.mov_Name.compareTo(o2.mov_Name);
						
					}
			
			
			
			
				});
		
		
		printallmovie(movie);
		remove_movie(movie, "Avatar");

	}
		
		
	private static void printallmovie(List<Movie_Details> movie) {
		for(Movie_Details p:movie)
		System.out.println(p);
	}


	public static void remove_movie(List<Movie_Details> movie,String name)
	{
	movie.remove(name);
	}

}
