package assessment;

public class City {
    private String name;
    private int population;
    private Location location;

    public City(String name, int population, Location location) {
        setName(name);
        setPopulation(population);
        setLocation(location);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Location getLocation() {
        return new Location(location.getLatitude(), location.getLongitude());
    }

    public void setLocation(Location location) {
        this.location = new Location(location.getLatitude(), location.getLongitude());
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "  Population: " + getPopulation() + "  Location: " + getLocation();
    }

    public static double getDistanceBetween(City city1,City city2){
        double lat1 = city1.getLocation().getLatitude();
        double lat2 = city2.getLocation().getLatitude();
        double long1 = city1.getLocation().getLongitude();
        double long2 = city2.getLocation().getLongitude();
        double latInRadCity2 = (Math.PI*(city2.getLocation().getLatitude()))/180;
        return 110.25*Math.sqrt(Math.pow(lat1-lat2,2)+Math.pow(((long1-long2)*Math.cos(latInRadCity2)),2));
    }
}
