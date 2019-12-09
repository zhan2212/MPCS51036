package _03objects.P8_5;

public class Driver {
    public static void main(String[] args) {
        double height = 1.5;
        double radius = 3;
        SodaCan can = new SodaCan(height,radius);
        double area = can.getSurfaceArea();
        double vol = can.getVolume();

        System.out.println("The surface area of a can with height " + height+" and radius " +radius+ " is: " +area);
        System.out.println("The volume of a can with height " + height+" and radius " +radius+ " is: " +vol);
    }
}
