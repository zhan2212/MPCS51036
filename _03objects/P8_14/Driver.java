package _03objects.P8_14;

public class Driver {
    public static void main(String[] args) {
        Country country1 = new Country("A",200,53240);
        Country country2 = new Country("B",2300,4310);
        Country country3 = new Country("C",450,420);
        Country country4 = new Country("D",900,4310);
        Country country5  = new Country("E",1220,410);
        Country country6 = new Country("F",20,2410);
        Country country7 = new Country("G",5600,6750);
        Country country8 = new Country("H",120,5240);
        Country country9 = new Country("I",200,80);
        Country country10 = new Country("J",560,5340);



        System.out.println("The country with largest area is "+Country.maxAreaCountry +" with area of "+Country.maxArea+".");
        System.out.println("The country with largest population is "+Country.maxPopuCountry+" with population of "+Country.maxPopu+".");
        System.out.println("The country with largest density is "+Country.maxDensCountry +" with density of "+Country.maxDens+".");

    }
}
