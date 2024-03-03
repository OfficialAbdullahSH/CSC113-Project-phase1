public class BoxOffice {

    private Room [] arrRooms = new Room[10];
    private int numberOfRooms;
    private Movie movie;
    private Movie [] movies;
    private int numberOfMovies;


    public boolean addRoom (Room room){
        if ((numberOfRooms < arrRooms.length) && (searchRoom(room) != -1)) {
            arrRooms[numberOfRooms++] = room;
            return true;
        }return false;
    }

    public boolean removeRoom (Room room){
        if (searchRoom(room) != -1){
            int index = searchRoom(room);
            arrRooms[index] = arrRooms[numberOfRooms-1];
            arrRooms[numberOfRooms-1] = null;
            numberOfRooms--;
            return true;
        }return false;
    }

    public int searchRoom(Room room){

        for (int i = 0; i < arrRooms.length; i++)
            if(arrRooms[i]!=null) {
                if (room.getRoomNumber() == arrRooms[i].getRoomNumber()) {
                    return i; // returning index of room
                }
            }
        return -1;
    }

    public void addMovie(String nameM, int durationM, int releasedateM, int roomNumber) {
        movie = new Movie(nameM, durationM, releasedateM);
        if (numberOfRooms < arrRooms.length && roomNumber > 0) {
            arrRooms[numberOfRooms] = new Room(roomNumber, 15);
            arrRooms[numberOfRooms++].SignMovieRoom(movie);
            System.out.println(nameM + " movie added!");
        } else {
            System.out.println("Invalid room number. BoxOffice is full of movies.");
        }
    }


    public void removeMovie(Room room){
        int r = searchRoom(room);
        if (r!=-1) {
            System.out.println(arrRooms[r].getMovieName()+" movie removed!");
            arrRooms[r] = null;
        }
        else
            System.out.println("Wrong room number");
    }

    public void BookingMovie(String nameM){
        int index = searchMovie(nameM);
        if(index!=-1)
            arrRooms[index].addTicket();
    }

    public void cancelBooking(String nameM){
        int index = searchMovie(nameM);
        if(index>-1)
            arrRooms[index].removeTicket();
    }

    public int searchMovie (String nameM ){
        for (int i=0; i<arrRooms.length;i++) {
            if (arrRooms[i].getMovieName().equalsIgnoreCase(nameM))
                return i;
            else {
                System.out.println("Sorry, we don't have that movie");
            }
        }
        return -1;
    }

    public void display(){
        for (int i = 0; i < arrRooms.length; i++) {
            if(arrRooms[i]!=null)
                System.out.println(arrRooms[i].getMovieName()+" "+arrRooms[i].getReleaseDate());
        }
    }


    public void displayMovieInfo() {                //polymorphic method
        for (int i = 0; i < numberOfMovies; i++) {
            if (movies[i] instanceof newMovie)
                ((newMovie) movies [i]).dispalyInfo();
            else
                ((oldMovie) movies[i]).dispalyInfo();
        }
    }




}