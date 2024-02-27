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

    public boolean addMovie(Movie r){
     if(numberOfTickets < movies.length){
         movies[numberOfMovies] = r;
         system.out.println("movie has been added");
         numberOfMovies++;
         return true;
     }
     else {
         system.out.println("we are full ");
     return false;
     }

    }

    public boolean removeMovie(String m){
     for(int i = 0 ; i < numberOfTickets ; i++){
         if(movies[i].getMovieName.equals(m)){
             movies[i]=null;
             movies[i]=movies[numberOfMovies-1];
             numberOfMovies--;
             system.out.println(" the movie has been removed");
         }
         else
             system.out.println("the movie is not here");
     }
    }

    public boolean Booking(String n) {
        if (searchMovie(n)) {
            system.out.println(" the movie has been booked");
            numberOfTickets--;
            return true;
        }
        else{
            system.out.println(" the movie is not here");
            return false;
        }
    }
    public boolean cancleBooking(){
        if (searchMovie(n)) {
            system.out.println(" the booking has been cancled");
            numberOfTickets++;
            return true;
        }
        else{
            system.out.println(" the movie is not here");
            return false;
        }
    }

    public boolean searchMovie (String name){
      for (int i = 0 ; i < numberOfTickets ; i++){
          if (movies[i].getMovieName().equals(name))
              system.out.println(" we have the movie ");
          return true;
      }
      system.out.println(" the movie is not here ");
      return false;
    }

    public void display(){
      for (int i = 0 ; i < numberOfTickets ; i++){
          system.out.println(movies[i].display());
          system.out.println(numberOfMovies);
          system.out.println(numberOfTickets);
      }
    }
}
