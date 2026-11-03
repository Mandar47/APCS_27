package pkg;
import java.util.Scanner;
import java.util.Random;
public class Movie{
    // Global Variables //
    String movieName = "";
    double rating = 0;
    int numRatings = 0;
    int revenue = 0;
    // Constructors //
    public Movie(){
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    public Movie(String name){
        movieName = name;
        rating = 0.0;
        numRatings = 0;
        revenue = 0;
    }
    public Movie(String name, double rate){
        movieName = name;
        rating = rate;
        numRatings = 0;
        revenue = 0;
    }
    public Movie(String name, double rate, int ratings){
        movieName = name;
        rating = rate;
        numRatings = ratings;
        revenue = 0;
    }
    public Movie(String name, double rate, int ratings,int rev){
        movieName = name;
        rating = rate;
        numRatings = ratings;
        revenue = rev;
    }
    // Methods //
    public void movieToString(){
        System.out.println("Movie: " + movieName);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        System.out.println();
    }
    public String getMovieName(){
        return movieName;
    }
    public double getRating(){
        return rating;
    }
    public int getRevenue(){
        return revenue;
    }
    public void addRating(double rate){
        double newrating = (((rating*numRatings)+rate)/(numRatings + 1));
        rating = newrating;
    }
    public boolean compareRatings(Movie Mb){
        if (rating > Mb.getRating()){
            return true;
        } else {
            return false;
        }

    }

}