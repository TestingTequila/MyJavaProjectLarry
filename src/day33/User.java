package day33;

public class User {
    private String name;
    private int age;
    private String city;

    public User(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
        this("London");
    }

    public User(String city) {
        this.city = city;
    }

    public User(String city, int age) {
        this.age = age;
        this.city = city;
    }

    public User(String name, String city) {
        this.name = name;
        this.city = city;
    }


    public User(int age, String name) {
        this.age = age;
        this.city = city;
    }

    public User(int age) {
        this("Larry", "New Mexico");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}
