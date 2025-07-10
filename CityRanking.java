import java.util.*;

public class CityRanking {

    // City CLASS
    static class City {
        private String cityName;
        private double literacyRate;
        private int population;
        private int numberOfEngineeringColleges;

        // Constructor
        public City(String cityName, double literacyRate, int population, int numberOfEngineeringColleges) {
            this.cityName = cityName;
            this.literacyRate = literacyRate;
            this.population = population;
            this.numberOfEngineeringColleges = numberOfEngineeringColleges;
        }

        // Method to calculate city score for ranking
        public double getScore() {
            // Example scoring formula
            return literacyRate + (population / 100000.0) + (numberOfEngineeringColleges * 5);
        }

        // Method to display city details
        public void displayCity() {
            System.out.println("City Name: " + cityName);
            System.out.printf("Literacy Rate: %.2f%%\n", literacyRate);
            System.out.println("Population: " + population);
            System.out.println("Number of Engineering Colleges: " + numberOfEngineeringColleges);
            System.out.printf("Computed Score: %.2f\n", getScore());
            System.out.println();
        }
    }
    // MAIN METHOD
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        cities.add(new City("AlphaCity", 85.5, 1500000, 5));
        cities.add(new City("BetaTown", 78.0, 1200000, 4));
        cities.add(new City("GammaVille", 90.0, 1800000, 6));
        cities.add(new City("DeltaCity", 88.5, 1700000, 7));
        cities.add(new City("Epsilon", 92.0, 1400000, 3));
        cities.add(new City("ZetaCity", 80.0, 1300000, 5));
        cities.add(new City("EtaTown", 87.5, 1600000, 4));
        cities.add(new City("ThetaVille", 89.0, 1750000, 6));
        cities.add(new City("IotaCity", 91.0, 1550000, 5));
        cities.add(new City("KappaTown", 86.0, 1450000, 4));

        cities.sort((c1, c2) -> Double.compare(c2.getScore(), c1.getScore()));

        System.out.println("Top 2 Cities Based on Literacy Rate, Population, and Engineering Colleges:\n");
        for (int i = 0; i < 2 && i < cities.size(); i++) {
            cities.get(i).displayCity();
        }
    }
}
