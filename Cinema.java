
public class Cinema extends Company {

    private String address;

    private Room [] arrRooms = new Room[15];
    private int numberOfRooms;
    private BoxOffice [] arrBoxOffice = new BoxOffice[3];
    private int numberOfBoxOffices;

    public Cinema(String name, String address) {
        super(name);
        this.address = address;
        this.numberOfRooms = 0 ;
        this.numberOfBoxOffices = 0;
    }


    @Override
    public String getName(){
        return name;
    }

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

        for (int i = 0; i < numberOfRooms; i++)
            if (room.getRoomNumber() == arrRooms[i].getRoomNumber()) {
                return i; // returning index of room
            }
        return -1;
    }

    public boolean addBoxOffice (BoxOffice boxOffice){
        if ((numberOfBoxOffices < arrBoxOffice.length) && (searchBoxOffice(boxOffice) != -1)) {
            arrBoxOffice[numberOfBoxOffices++] = boxOffice;
            return true;
        }return false;
    }

    public boolean removeBoxOffice (BoxOffice boxOffice){
        if (searchBoxOffice(boxOffice) != -1){
            int index = searchBoxOffice(boxOffice);
            arrBoxOffice[index] = arrBoxOffice[numberOfBoxOffices-1];
            arrBoxOffice[numberOfBoxOffices-1] = null;
            numberOfBoxOffices--;
            return true;
        }return false;
    }

    public int searchBoxOffice(BoxOffice boxOffice){

        for (int i = 0; i < numberOfBoxOffices; i++)
            if (boxOffice.getBoxOfficeID() == arrBoxOffice[i].getBoxOfficeID()) {
                return i; // returning index of room
            }
        return -1;
    }

    public void display(){
        System.out.println("Cinema name: " + name);
        System.out.print(", Cinema addreass: " + address);

        System.out.println("Number of room/s: " + numberOfRooms);
        System.out.print(", number of box office/s: " + numberOfBoxOffices);

        System.out.println("");
    }
}


