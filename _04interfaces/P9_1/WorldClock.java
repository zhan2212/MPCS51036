package _04interfaces.P9_1;

public class WorldClock extends Clock {
    public int getTimeDiff() {
        return timeDiff;
    }

    public void setTimeDiff(int timeDiff) {
        this.timeDiff = timeDiff;
    }

    private int timeDiff;

    public WorldClock(int numZone){
        timeDiff = numZone; // numer of zones ahead
    }
    public String getHours(){
        int newHour = Integer.parseInt(super.getHours()) - timeDiff;
        if(newHour < 0){
            newHour += 24; // make sure hour is always positive
        }
        return Integer.toString(newHour);
    }
}
