package _04interfaces.E9_11;

public class Student extends Person{
    public void setSmajor(String smajor) {
        this.smajor = smajor;
    }

    private String smajor;
    public Student(String name, int year, String major){
        super(name,year);
        smajor = major;
    }
    public String toString(){
        return super.toString()+"; Major: " + smajor;
    }

    public String getSmajor() {
        return smajor;
    }
}
