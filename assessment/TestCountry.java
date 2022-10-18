package assessment;

import javax.swing.*;

public class TestCountry {
    public static void main(String[] args) {
        //creating city objs
        City city1 = new City("Cork", 124391, new Location(51.8985, 8.4756));
        City city2 = new City("Galway", 79934, new Location(53.2707, 9.0568));
        City city3 = new City("Dublin", 544107, new Location(53.3498, 6.2603));
        City city4 = new City("Limerick", 194899, new Location(52.6638, 8.6267));
        City city5 = new City("Waterford", 53504, new Location(52.2593, 7.1101));

        //cities array
        City[] cities = {city1,city2,city3,city4,city5};

        //creating country obj
        Country country = new Country("Ireland","Dublin",4904000,70273, cities,
                "euro", "English");

        //country details output
        JOptionPane.showMessageDialog(null,country,"Country Details",1);

        //distance between Limerick and Dublin output
        JOptionPane.showMessageDialog(null,"The distance between Limerick and Dublin is: "
                + String.format("%.2f",City.getDistanceBetween(city4,city3)) + "km","Distance between Limerick and Dublin"
                ,1);

        //find max Population output
        JOptionPane.showMessageDialog(null,"The details of the most populous city are: \n\n" +
                country.getMostPopulousCity(),"Details of the Most Populous City",1);

        //selection sort output
        country.sortCitiesByName();
        String output = "";
        for (City city: country.getCities())
            output += city + "\n";

        JOptionPane.showMessageDialog(null,"The cities sorted by name are: \n\n" + output,
                "Cities Sorted By Name",1);


    }
}
