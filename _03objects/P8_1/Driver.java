package _03objects.P8_1;

public class Driver {
    public static void main(String[] args) {
        Microwave mw = new Microwave();
        mw.increase(); // add 30 sec
        mw.switchMode();
        mw.start();
        mw.reset();
        mw.start();

    }
}
