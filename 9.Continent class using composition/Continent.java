import java.util.ArrayList;
public class Continent {
    private String name;
    private ArrayList<Country> countries;

    public Continent(String name) {
        this.name = name;
        this.countries = new ArrayList<>();
    }
    public void addCountry(Country c) {
        countries.add(c);
    }
    public String getName() {
        return name;
    }
}
