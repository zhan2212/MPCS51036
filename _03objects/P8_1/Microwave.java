package _03objects.P8_1;

public class Microwave {
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    private int level;
    private int time;

    public Microwave(){
        level = 1;
        time = 0;
    }
    public void increase(){
        time += 30;
    }

    public void switchMode(){
        // switch mode
        if(level == 1){
            level = 2;
        }
        else{
            level = 1;
        }
    }

    public void reset(){
        level = 1;
        time = 0;
    }

    public void start(){
        System.out.println("Cooking for "+ time + " seconds at level "+ level +".");
    }
}
