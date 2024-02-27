public class BoxOffice {

    private int boxOfficeID;
    private Movie [] movies = new Movie[20];
    private int numberOfMovies;
    private int numberOfTickets;

    public BoxOffice(int ID) {

        this.boxOfficeID = boxOfficeID;
    }

    public int getBoxOfficeID() {

        return boxOfficeID;
    }

    public Movie[] getMovies() {

        return movies;
    }

    public boolean addMovie(Movie movie){
     if(numberOfMovies < movies.length && searchMovie(movie.getMovieName())){
         movies[numberOfMovies] = movie;
         System.out.println("movie has been added");
         numberOfMovies++;
         return true;
     }
     else {
         System.out.println("we are full ");
     return false;
     }

    }

    public boolean removeMovie(Movie movie){
     for(int i = 0 ; i < numberOfMovies ; i++) {
         if (movies[i].getMovieName().equals(movie) && searchMovie(movie.getMovieName())) {
             movies[i] = movies[numberOfMovies - 1];
             movies[numberOfMovies - 1] = null;
             numberOfMovies--;
             System.out.println(" the movie has been removed");
             return true;
         }
     }
        System.out.println("the movie is not here");
        return false;
    }

    public boolean Booking(String n) {
        if (searchMovie(n)) {
            System.out.println(" the movie has been booked");
            numberOfTickets--;
            return true;
        }
        else{
            System.out.println(" the movie is not here");
            return false;
        }
    }
    public boolean cancleBooking(String n){
        if (searchMovie(n)) {
            System.out.println(" the booking has been cancled");
            numberOfTickets++;
            return true;
        }
        else{
            System.out.println(" the movie is not here");
            return false;
        }
    }

    public boolean searchMovie (String name){
      for (int i = 0 ; i < numberOfMovies ; i++){
          if (movies[i].getMovieName().equals(name))
              System.out.println(" we have the movie ");
          return true;
      }
        System.out.println(" the movie is not here ");
      return false;
    }

    public void display(){
      for (int i = 0 ; i < numberOfMovies ; i++){
          System.out.println("Number of movies: " + numberOfMovies);
          System.out.print(i + ":");
          movies[i].display();
      }
    }
}
