//2. The class Movie is started below. An instance of class Movie represents a film.
//This classhas the following three class variables:
//● title, which is a String representing the title of the movie
//● studio, which is a String representing the studio that made the movie
//● rating, which is a String representing the rating of the movie (i.e. PG-13, R, etc)
//a) Write a constructor for the class Movie, which takes a String representing the title of
//themovie, a String representing the studio, and a String representing the rating as its
//arguments, and sets the respective class variables to these values.
//b) Write a second constructor for the class Movie, which takes a String representing the
//titleof the movie and a String representing the studio as its arguments, and sets the
//respective class variables to these values, while the class variable rating is set to "PG".
//c) Write a piece of code that creates an instance of the class Movie with the title
//“Casino Royale”, the studio “Eon Productions”, and the rating “PG­13”.public class Movie
{
	String Title;
	String Studio;
	String Rating;
	
	public Movie(String Title,String Studio,String Rating)
	{
		this.Title=Title;
		this.Studio=Studio;
		this.Rating=Rating;
	}	
        public void display1()
	{
		 System.out.println("Title:"+Title);
		System.out.println(" Studio:"+Studio);
		System.out.println(" Rating:"+Rating);
	}
	public Movie(String Title,String Studio)
	{
		
		this.Title=Title;
		this.Studio=Studio;		
		this.Rating="PG";
    }
 public void display2()
	{
		 System.out.println("Title:"+Title);
		System.out.println(" Studio:"+Studio);
}
 
    public static void main(String args[])
    {

      	 Movie M1 = new Movie("Casino Royal","Eon Productions","PG-13");
	 Movie M2 = new Movie("Casino Royal","Eon Productions");
        	 M1.display1();
	 M2.display2();
    }
}
