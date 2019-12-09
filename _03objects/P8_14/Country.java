package _03objects.P8_14;

public class Country {
    public String getcName() {
        return cName;
    }

    public int getcPopulation() {
        return cPopulation;
    }

    public int getcArea() {
        return cArea;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setcPopulation(int cPopulation) {
        this.cPopulation = cPopulation;
    }

    public void setcArea(int cArea) {
        this.cArea = cArea;
    }

    private String cName;
    private int cPopulation;
    private int cArea;
    public static int maxArea;
    public static int maxPopu;
    public static double maxDens;
    public static String maxAreaCountry;
    public static String maxPopuCountry;
    public static String maxDensCountry;

    public Country(String name, int population, int area) {
        cName = name;
        cPopulation = population;
        cArea = area;
        if(cArea>maxArea){
            maxArea = cArea;
            maxAreaCountry = cName;
        }
        if(cPopulation>maxPopu){
            maxPopu = cPopulation;
            maxPopuCountry = cName;
        }
        if((double) cPopulation/(double) cArea>maxDens){
            maxDens = (double) cPopulation/(double) cArea;
            maxDensCountry = cName;
        }
    }
}
