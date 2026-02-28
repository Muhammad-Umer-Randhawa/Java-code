import java.util.ArrayList;
public class Country {
    private String name;
    private Continent continent;
    private ArrayList<City> cities;

    public Country(String name, Continent continent){
        this.name = name;
        this.continent = continent;
        this.cities = new ArrayList<>();
    }
    public void addCity(City c){
        cities.add(c);
    }
    public String getName(){
        return name;
    }
    public Continent getContinent(){
        return continent;
    }
}
