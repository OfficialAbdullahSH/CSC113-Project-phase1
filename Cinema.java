public class Cinema extends Company {

    private String address;

    public BoxOffice bOffice = new BoxOffice();

    public Cinema(String name, String address) {
        super(name);
        this.address = address;
    }


    @Override
    public String getName(){
        return name;
    }

    public void display(){
        System.out.println("Cinema name: " + name);
        System.out.print(", Cinema address: " + address);

        System.out.println();
    }
}