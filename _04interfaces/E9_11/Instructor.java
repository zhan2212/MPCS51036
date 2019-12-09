package _04interfaces.E9_11;

public class Instructor extends Person{
    public void setIsalary(int isalary) {
        this.isalary = isalary;
    }

    private int isalary;
    public Instructor(String name, int year, int salary){
        super(name,year);
        isalary = salary;
    }
    public String toString(){
        return super.toString()+"; Salary: " + isalary;
    }

    public int getIsalary() {
        return isalary;
    }
}
