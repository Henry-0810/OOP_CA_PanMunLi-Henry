package assessment;

import java.util.Arrays;

public class Country {
    private String name;
    private String capital;
    private int population;
    private int area;
    private City[] cities;
    private String currency;
    private String language;

    public Country(String name, String capital, int population, int area, City[] cities, String currency, String language) {
        setName(name);
        setCapital(capital);
        setPopulation(population);
        setArea(area);
        setCities(cities);
        setCurrency(currency);
        setLanguage(language);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < getCities().length; i++) {
            output += getCities()[i] + "\n";
        }
        return "Name: " + getName() +"\nCapital: " + getCapital() + "\nPopulation: " + getPopulation() + "\nArea: "
                + getArea() + "\nCities: \n\n" + output + "\n\n\nCurrency: " + getCurrency() + "\nLanguage: "
                + getLanguage();
    }

    public City getMostPopulousCity() {
        int maxPop = 0;
        for (int i = 0; i < getCities().length; i++) {
            if (getCities()[i].getPopulation() > maxPop) {
                maxPop = getCities()[i].getPopulation();
                return getCities()[i];
            }
        }
        return null;
    }

    public void sortCitiesByName() {
        for (int i = 0; i < getCities().length - 1; i++) {
            int minIdx = i;
            City city = getCities()[i];
            for (int j = i + 1; j < getCities().length; j++) {
                if (getCities()[j].getName().compareToIgnoreCase(getCities()[minIdx].getName()) < 0) {
                    minIdx = j;
                    city = getCities()[j];
                }
            }
            if (minIdx != i) {
                City temp = getCities()[minIdx];
                getCities()[minIdx] = getCities()[i];
                getCities()[i] = temp;
            }
        }
    }
}
