public class oldMovie extends Movie {
    public oldMovie(String movieName, int movieDuration, int releaseDate) {
        super(movieName, movieDuration, releaseDate);
    }
    public void dispalyInfo(){
        System.out.println(getMovieName() + getMovieDuration() + getReleaseDate());
    }



}