package _03objects.P8_8;

public class Driver {
    public static void main(String[] args) {
        VotingMachine machine = new VotingMachine();
        machine.voteDemocrat(5);
        machine.voteRepublican(10);
        System.out.println("The votes for Democrat is: " + machine.getTallies()[0]);
        System.out.println("The votes for Republican is: " + machine.getTallies()[1]);
    }
}
