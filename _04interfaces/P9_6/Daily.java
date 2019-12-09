package _04interfaces.P9_6;

public class Daily extends Appointment{
    public Daily(String description, int year, int month, int day){
        super(description,year,month,day);
    }
    @Override
    public boolean occursOn(int year, int month, int day){
        // everyday after the current day
        return (year == this.getAyear() && month == this.getAmonth() && day >= this.getAday())
                || (year == this.getAyear() && month > this.getAmonth())
                || (year > this.getAyear());
    }
}
