package _04interfaces.P9_6;

import java.util.Date;

public class OneTime extends Appointment {
    public OneTime(String description, int year, int month, int day){
        super(description,year,month,day);
    }
    @Override
    public boolean occursOn(int year, int month, int day){
        // if the date is exactly the same
        return year==this.getAyear() && month == this.getAmonth() && day == this.getAday();
    }
}
