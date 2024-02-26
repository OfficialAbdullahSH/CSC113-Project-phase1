public class Customer {

    private String name;
    private String email;
    private int age;

    public Customer(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display(){
        System.out.println("Name: " + name + ", Email: " + email + ", Age: " + age);
    }
}
