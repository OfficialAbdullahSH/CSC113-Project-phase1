public class Room {

    private int roomNumber;
    private int capacity;

    public Room(int roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
    }

    public Room(Room room) { // copy constructor
        this.roomNumber = room.roomNumber;
        this.capacity = room.capacity;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void display(){
        System.out.println("Room number:"+ getRoomNumber()+" Room capacity"+getCapacity());
    }
}
