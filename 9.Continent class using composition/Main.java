// import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        Continent asia = new Continent("Asia");
        Continent europe = new Continent("Europe");

        Country pakistan = new Country("Pakistan", asia);
        Country india = new Country("India", asia);
        Country uk = new Country("United Kingdom", europe);
        Country france = new Country("France", europe);

        asia.addCountry(pakistan);
        asia.addCountry(india);
        europe.addCountry(uk);
        europe.addCountry(france);

        City karachi = new City("Karachi", pakistan);
        City hyderabad = new City("Hyderabad", pakistan);
        City bengaluru = new City("Bengaluru", india);
        City delhi = new City("Delhi", india);
        City london = new City("London", uk);
        City birmingham = new City("Birmingham", uk);
        City paris = new City("Paris", france);
        City toulouse = new City("Toulouse", france);

        pakistan.addCity(karachi);
        pakistan.addCity(hyderabad);
        india.addCity(bengaluru);
        india.addCity(delhi);
        uk.addCity(london);
        uk.addCity(birmingham);
        france.addCity(paris);
        france.addCity(toulouse);

        Resident r1 = new Resident("Ali", karachi);
        Resident r2 = new Resident("Ahmed", hyderabad);

        karachi.addResident(r1);
        hyderabad.addResident(r2);

        r1.setCity(toulouse);
        r2.setCity(birmingham);

        printResidentInfo(r1);
        printResidentInfo(r2);

        // Residents can also be displayed using a loop.
        // ArrayList<Resident> residents = new ArrayList<>();
        // residents.add(r1);
        // residents.add(r2);

        // for (Resident r : residents) {
        //     printResidentInfo(r);
        //     System.out.println("-----"); // separator between residents
        // }
        
    }
    public static void printResidentInfo(Resident r) {

        String residentName = r.getName();
        City city = r.getCity();
        Country country = city.getCountry();
        Continent continent = country.getContinent();

        System.out.println("Name: " + residentName);
        System.out.println("City: " + city.getName());
        System.out.println("Country: " + country.getName());
        System.out.println("Continent: " + continent.getName());
    }
}