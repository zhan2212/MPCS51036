package _03objects.P8_7;

public class ComboLock {
    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    private int num1;
    private int num2;
    private int num3;
    boolean flag1;
    boolean flag2;
    boolean flag3;
    public int currNum;
    String turn;

    public ComboLock(int secret1, int secret2, int secret3) {
        num1 = secret1;
        num2 = secret2;
        num3 = secret3;
        flag1 = false;
        flag2 = false;
        flag3 = false;
        currNum = 0;
        turn = "";
    }
    public void reset() {
        currNum = 0;
    }
    public void turnLeft(int ticks) {
        currNum = (currNum + ticks) % 40; // compute the number that the pointer points to
        if(flag1 && !flag2 && !flag3){
            if(currNum == num2){
                flag2 = true; //if it is left turn and meet the second number
            }
        }
    }
    public void turnRight(int ticks) {
        currNum = (currNum - ticks) % 40; // compute the number that the pointer points to
        if(currNum < 0){
            currNum += 40; // the current number must be positive
        }
        if(!flag1 && !flag2 && !flag3){
            if(currNum == num1){
                flag1 = true; // if it is right turn and meet the first number
            }
        }
        else if(flag1 && flag2 && !flag3){
            if(currNum == num3){
                flag3 = true; // if it is right turn and meet the third number
            }
        }

    }
    public boolean open() {
        if(flag1 && flag2 && flag3){
            return true;
        }
        else{
            return false;
        }
    }
}
