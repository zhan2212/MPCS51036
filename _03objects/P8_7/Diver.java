package _03objects.P8_7;

public class Diver {
    public static void main(String[] args) {
        ComboLock lock = new ComboLock(25,11,30);
        lock.turnRight(15);
        System.out.println("The pointer points " + lock.currNum + ".");
        lock.turnLeft(26);
        System.out.println("The pointer points " + lock.currNum + ".");
        lock.turnRight(21);
        System.out.println("The pointer points " + lock.currNum + ".");
        if(lock.open()){
            System.out.println("The lock is open!");
        }
        else{
            System.out.println("Fail to open!");
        }
        lock.reset();
        System.out.println("The pointer points " + lock.currNum + ".");

    }

}
