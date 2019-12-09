package _04interfaces.E9_13;

import java.awt.*;

public class betterRectangle extends Rectangle {
    public betterRectangle(int x, int y){
        super.setLocation(0,0);
        super.setSize(x,y);
    }

    public int getPerimeter(){
        return 2*(super.height+super.width);
    }
    public int getArea(){
        return super.height * super.width;
    }
}
