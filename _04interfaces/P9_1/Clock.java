package _04interfaces.P9_1;

public class Clock {
    public String[] getTimes() {
        return times;
    }

    public void setTimes(String[] times) {
        this.times = times;
    }

    private String[] times;
    public Clock(){
        String time = java.time.LocalTime.now().toString(); // get time
        times = time.split(":"); // split in to hour, minute and second
    }
    public String getHours(){
        return times[0];
    }
    public String getMinutes(){
        return times[1];
    }
    public String getTime(){
        return this.getHours() + ":" + this.getMinutes();
    }
}
