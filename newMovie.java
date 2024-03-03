public class newMovie extends Movie {
    public newMovie(String movieName, int movieDuration, int releaseDate) {
        super(movieName, movieDuration, releaseDate);
    }
    public void dispalyInfo(){
        System.out.println(getMovieName() + getMovieDuration() + getReleaseDate());
    }


}