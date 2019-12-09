package _04interfaces.P9_6;

import java.util.Date;

public class Appointment {
    public void setAdescription(String adescription) {
        this.adescription = adescription;
    }

    public void setAyear(int ayear) {
        this.ayear = ayear;
    }

    public void setAmonth(int amonth) {
        this.amonth = amonth;
    }

    public void setAday(int aday) {
        this.aday = aday;
    }

    private String adescription;
    private int ayear;
    private int amonth;
    private int aday;

    public Appointment(String description,int year, int month,int day){
         adescription = description;
         ayear = year;
         amonth = month;
         aday = day;
    }
    public boolean occursOn(int year, int month,int day){
        return ayear==year && amonth==month && aday==day;
    }

    public int getAday() {
        return aday;
    }

    public int getAyear() {
        return ayear;
    }

    public int getAmonth() {
        return amonth;
    }

    public String getAdescription(){
        return adescription;
    }
}
