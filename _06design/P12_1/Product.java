package _06design.P12_1;

public class Product {
    public int getPprice() {
        return pprice;
    }

    public String getPname() {
        return pname;
    }

    private int pprice;

    public void setPprice(int pprice) {
        this.pprice = pprice;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    private String pname;
    public Product(String name, int price){
        pname = name;
        pprice = price;
    }
}
