package _03objects.P8_19;

public class Cannonball {
    public void setxP(double xP) {
        this.xP = xP;
    }

    public void setyP(double yP) {
        this.yP = yP;
    }

    public void setxV(double xV) {
        this.xV = xV;
    }

    public void setyV(double yV) {
        this.yV = yV;
    }

    public double getxP() {
        return xP;
    }

    public double getyP() {
        return yP;
    }

    public double getxV() {
        return xV;
    }

    public double getyV() {
        return yV;
    }

    private double xP;
    private double yP;
    private double xV;
    private double yV;

    public Cannonball(double x_position){
        xP = x_position;
        yP = 0;

    }

    public void move(double sec){
        xP = xP + sec*xV;
        yP = yP + sec*yV;
        yV -= 9.81 * sec;
    }

    public double getX(){
        return xP;
    }

    public double getY(){
        return yP;
    }

    public void shoot(double alpha, double velocity){
        xV = velocity * Math.cos(alpha);
        yV = velocity * Math.sin(alpha); // initial x and y velocity

        move(0.1); // move for 0.1 sec

        System.out.println("The x position is "+this.getX()+" and the y position is "+this.getY()+".");
        //System.out.println("The x velocity is "+xV+" and the y velocity is "+yV+".");
        while(yP>0){
            move(0.1);
            System.out.println("The x position is "+this.getX()+" and the y position is "+this.getY()+".");
            //System.out.println("The x velocity is "+xV+" and the y velocity is "+yV+".");
        }

    }
}
