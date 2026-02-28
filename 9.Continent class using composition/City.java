import java.util.ArrayList;
public class City {
    private String name;
    private Country country; //this is because each city belongs to a specific country and each cty knows its country
    private ArrayList<Resident> residents;

    public City(String name, Country country){
        this.name = name;
        this.country = country;
        this.residents = new ArrayList<>();
    }
    public void addResident(Resident resident){
        residents.add(resident);
    }
    public String getName(){
        return name;
    }
    public Country getCountry(){
        return country;
    }
    public ArrayList<Resident> getResidents() {
        return residents;
    }
}
