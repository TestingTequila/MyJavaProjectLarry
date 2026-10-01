package day33;

public class Country {
    private String countryName;
    private int medalsInOlympic;

    //Assign value to them
    //1. We can assign value using setter method
    //2. We can assign value using Constructors

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public  void setMedalsInOlympic(int medalsInOlympic)
    {
        this.medalsInOlympic= medalsInOlympic;
    }
}
