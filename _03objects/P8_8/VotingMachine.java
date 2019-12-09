package _03objects.P8_8;

public class VotingMachine {
    public int getNumDemocrat() {
        return numDemocrat;
    }

    public int getNumRepublican() {
        return numRepublican;
    }

    public void setNumDemocrat(int numDemocrat) {
        this.numDemocrat = numDemocrat;
    }

    public void setNumRepublican(int numRepublican) {
        this.numRepublican = numRepublican;
    }

    private int numDemocrat;
    private int numRepublican;

    public VotingMachine(){
        numDemocrat = 0;
        numRepublican = 0;
    }

    public void voteDemocrat(int votes){
        numDemocrat += votes; //record the votes for democrat
    }

    public void voteRepublican(int votes){
        numRepublican += votes; //record the votes for republican
    }

    public int[] getTallies(){
        int[] tallies = new int[]{numDemocrat,numRepublican};
        return tallies;
    }
}
