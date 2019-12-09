package _04interfaces.E9_13;

public class Driver {
    public static void main(String[] args) {
        betterRectangle rect = new betterRectangle(5,10); // set height and width
        System.out.println("The perimeter is :" + rect.getPerimeter());
        System.out.println("The area is: " + rect.getArea());
    }
}
