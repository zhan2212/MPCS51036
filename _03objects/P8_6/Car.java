package _03objects.P8_6;

public class Car {
    public double getCefficiency() {
        return cefficiency;
    }

    public void setCefficiency(double cefficiency) {
        this.cefficiency = cefficiency;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    private double cefficiency;
    private double gas;

    public Car(double efficiency){
        cefficiency = efficiency;
        gas = 0;
    }
    public void addGas(double g){
        gas += g;
    }
    public void drive(double distance){
        gas -= distance/cefficiency;
    }
    public double getGasLevel(){
        return gas;
    }
}
