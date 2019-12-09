package _03objects.P8_5;

public class SodaCan {
    public double getMheight() {
        return mheight;
    }

    public void setMheight(double mheight) {
        this.mheight = mheight;
    }

    public void setMradius(double mradius) {
        this.mradius = mradius;
    }

    public double getMradius() {
        return mradius;
    }

    private double mheight;
    private double mradius;

    public SodaCan(double height, double radius){
        mheight = height;
        mradius = radius;
    }

    public double getSurfaceArea(){
        return 2*Math.PI*(mradius*mradius) + 2*Math.PI*mradius*mheight; //compute surface area
    }
    public double getVolume(){
        return Math.PI*(mradius*mradius)*mheight; // compute volume
    }
}
