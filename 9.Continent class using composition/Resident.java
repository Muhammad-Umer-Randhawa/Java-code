public class Resident {
    private String name;
    private City city;

    public Resident(String name, City city){
        this.name = name;
        this.city = city;
    }
    public String getName(){
        return name;
    }
    public City getCity(){
        return city;
    }
    public void setCity(City city){
        this.city = city;
    }
}
