package _05dice.pig;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Pig extends JFrame implements ActionListener{
    private JButton hold;
    private JButton roll;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JTextArea field;
    private int userScore = 0;
    private int compScore = 0;
    private int currScore;

    public Pig(){
        createTextLabel(); // add text labels
        createButton(); // add buttons
        //createTextField(); // add text field to show the result

        setSize(1000, 1000); // set up the frame size
        setLayout(null); // no layout

    }

    private void createButton() {
        // add buttons
        roll = new JButton("Roll");
        roll.setActionCommand("roll");
        roll.addActionListener(this);
        roll.setBounds(100, 100, 100, 50);
        add(roll);

        hold = new JButton("hold");
        hold.setActionCommand("hold");
        hold.addActionListener(this);
        hold.setBounds(400, 100, 100, 50);
        add(hold);
    }

    private void createTextLabel() {
        // add labels
        label1 = new JLabel("Dice:");
        label1.setBounds(250, 300, 100, 50);
        label2 = new JLabel("User Score: 0");
        label2.setBounds(150, 200, 150, 50);
        label3 = new JLabel("Computer Score: 0");
        label3.setBounds(350, 200, 150, 50);
        add(label1);
        add(label2);
        add(label3);

        field = new JTextArea("User's turn.");
        field.setBounds(250,400,200,50);
        add(field);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // process the action
        String name = e.getActionCommand();
        if(name.equals("roll")){
            Random rand = new Random();
            int diceNumber = rand.nextInt(6) + 1;
            label1.setText("Dice: " + diceNumber);
            if(diceNumber != 1){
                currScore += diceNumber;
                field.setText("Current Score: " + currScore);
            } else{
                currScore = 0;
                computerTurn();
            }

        }else if(name.equals("hold")){
            userScore += currScore;
            field.setText("Total Score: " + userScore);
            label2.setText("User Score: " + userScore);
            currScore = 0;
            if(userScore >= 100){
                field.setText(" Computer wins!!!\n" + "User Score: " + userScore +"\nComputer Score: " + compScore);
                userScore = 0;
                compScore = 0;
                label2.setText("User Score: 0");
                label3.setText("Computer Score: 0");
            }
            else {
                computerTurn();
            }
        }
    }
    private void computerTurn(){
        boolean flag = true;
        Random rand = new Random();
        int times = rand.nextInt(6)+1;
        int[] scores = new int[times];
        String res = "";
        int totalScore = 0;
        for(int i = 0; i < times; i ++){
            scores[i] = rand.nextInt(6)+1;
            res += scores[i]+" ";
            totalScore += scores[i];
            if(scores[i] == 1){
                flag = false;
            }
        }
        field.setText("Computer's turn.\n"+"Result: "+res);
        if(flag){
            compScore += totalScore;
        }
        label3.setText("Computer Score: " + compScore);
        if(compScore >= 100){
            field.setText(" Computer wins!!!\n" + "User Score: " + userScore +"\nComputer Score: " + compScore);
            userScore = 0;
            compScore = 0;
            label2.setText("User Score: 0");
            label3.setText("Computer Score: 0");
        }
    }
}
