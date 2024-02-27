public class Movie {
    private String movieName;
    private int movieDuration;
    private int releaseDate;

    public Movie(String movieName, int movieDuration, int releaseDate) {
        this.movieName = movieName;
        this.movieDuration = movieDuration;
        this.releaseDate = releaseDate;
    }
    public String getMovieName(){
        return movieName;
    }
    public int getmovieDuration(){
        return movieDuration;
    }
    public int getreleaseDate(){
        return releaseDate;
    }
    public void display(){
        System.out.println("Movie:"+ movieName+" Duration:"+ movieDuration+"min");
        System.out.println("Release date:"+ releaseDate);
    }

//    public void displayOldNew(){
//        if(releaseDate<2020){
//
//        }
//
//    }






}
