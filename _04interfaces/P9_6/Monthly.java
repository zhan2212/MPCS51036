package _04interfaces.P9_6;

public class Monthly extends Appointment {
    public Monthly(String description, int year, int month, int day){
        super(description,year,month,day);
    }
    @Override
    public boolean occursOn(int year, int month, int day){
        // the same day of month after today
        return (year == this.getAyear() && month >= this.getAmonth() && day == this.getAday())
                || (year > this.getAyear() && day == this.getAday());
    }

}
