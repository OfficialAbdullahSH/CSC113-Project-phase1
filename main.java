import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Cinema c1 = new Cinema("VOX CINEMA", "Riadh-park mall");
        Room room1 = new Room(1, 600);
        Room room2 = new Room(2, 300);
        Room room3 = new Room(3, 400);
        Room room4 = new Room(4, 300);
        Room room5 = new Room(5, 300);
        Room room6 = new Room(6, 500);
        Room room7 = new Room(7, 300);
        Room room8 = new Room(8, 300);
        Room room9 = new Room(9, 300);
        Room room10 = new Room(10, 1000);

        c1.bOffice.addRoom(room1);
        c1.bOffice.addRoom(room2);
        c1.bOffice.addRoom(room3);
        c1.bOffice.addRoom(room4);
        c1.bOffice.addRoom(room5);
        c1.bOffice.addRoom(room6);
        c1.bOffice.addRoom(room7);
        c1.bOffice.addRoom(room8);
        c1.bOffice.addRoom(room9);
        c1.bOffice.addRoom(room10);


        c1.bOffice.addMovie("Joker", 122, 2019, 1);
        c1.bOffice.removeMovie(room1);
        c1.bOffice.addMovie("Avengers: Endgame", 182, 2019, 2);
        c1.bOffice.addMovie("The Dark Knight", 153, 2008, 3);
        c1.bOffice.addMovie("Top Gun: Maverick", 130, 2022, 4);
        c1.bOffice.addMovie("Spider-Man: No Way Home", 148, 2021, 5);
        System.out.println("--------------------------------------------");
        c1.bOffice.display();



    }
}