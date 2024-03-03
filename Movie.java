import org.w3c.dom.ls.LSOutput;

public class Movie {
    private String movieName;
    private int movieDuration;
    private int releaseDate;

    public int getReleaseDate(){
        return releaseDate;
    }
    public String getMovieName(){
        return movieName;
    }
    public int getMovieDuration(){
        return movieDuration;
    }
    public Movie(String movieName, int movieDuration, int releaseDate) {
        this.movieName = movieName;
        this.movieDuration = movieDuration;
        this.releaseDate = releaseDate;

    }
    public void display(){
        System.out.println("Movie:" + movieName + " Duration:" + movieDuration + "min");
        System.out.println("Release date:" + releaseDate);
    }



}