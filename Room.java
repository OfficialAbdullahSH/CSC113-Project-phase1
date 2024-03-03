public class Room {

    private int roomNumber;
    private int capacity;
    private Movie movie;
    private int numberOfTicketsLeft;

    public String getMovieName(){
        return movie.getMovieName();
    }
    public int getDuration(){
        return movie.getMovieDuration();
    }
    public int getReleaseDate(){
        return movie.getReleaseDate();
    }
    public void SignMovieRoom(Movie m){
        movie = m;
    }
    public Room(int roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.numberOfTicketsLeft = capacity;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void addTicket(){
        if(numberOfTicketsLeft>0)
            numberOfTicketsLeft--;
        else
            System.out.println("Sorry, no tickets left");
    }
    public void removeTicket(){
        if(numberOfTicketsLeft<capacity)
            numberOfTicketsLeft++;
        else
            System.out.println("Sorry, there is no booking for this movie");
    }

    public void display(){
        System.out.println("Room number:"+ getRoomNumber()+", Room capacity:"+getCapacity()+ ", Number of tickets left:"+numberOfTicketsLeft);
    }









}