




public class Cinema extends Company {

    private String address;

    private Room [] arrRooms = new Room[15];
    private int roomsCounter;
    private BoxOffice [] arrBoxOffice = new BoxOffice[3];
    private int boxOfficeCounter;

    public Cinema(String name, String address) {
        super(name);

        this.address = address;
    }

    public Cinema(Cinema c) { // Copy constructor
        super(c.name);

        this.address = c.address;
    }


    @Override
    public String getName(){
        return name;
    }

    public boolean addRoom (Room room){

    }

    public boolean removeRoom (Room room){

    }

    public Room[] getRooms() {

        return arrRooms;
    }

    public void display(){

    }
}


