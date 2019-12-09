package _06design.P12_1;

public class Coin {
    public int getCvalue() {
        return cvalue;
    }

    public void setCvalue(int cvalue) {
        this.cvalue = cvalue;
    }

    private int cvalue;
    public Coin(int value){
        cvalue = value;
    }
}
