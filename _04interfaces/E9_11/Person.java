package _04interfaces.E9_11;

public class Person {
    public String getPname() {
        return pname;
    }

    public int getPyear() {
        return pyear;
    }

    private String pname;

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPyear(int pyear) {
        this.pyear = pyear;
    }

    private int pyear;
    public Person(String name, int year) {
        pname = name;
        pyear = year;
    }

    @Override
    public String toString(){
        return "Name: " + pname +"; Year: " + pyear;
    }
}
