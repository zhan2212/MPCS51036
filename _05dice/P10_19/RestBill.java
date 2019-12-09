package _05dice.P10_19;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RestBill extends JFrame implements ActionListener
{
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JLabel rateLabel1;
    private JLabel rateLabel2;
    private JLabel rateLabel3;
    private JLabel rateLabel4;
    private JLabel rateLabel5;
    private JLabel rateLabel6;
    private JLabel rateLabel7;
    private JLabel rateLabel8;
    private JLabel rateLabel9;
    private JLabel rateLabel10;
    private JLabel rateLabel11;
    private JLabel rateLabel12;
    private JTextArea resultLabel;
    private JTextField field1;
    private JTextField field2;
    private float totalPrice;

    public RestBill() {
        createTextLabel(); // add text labels
        createButton(); // add buttons
        createTextField(); // add text field to show the result

        setSize(1000, 1000); // set up the frame size
        setLayout(null); // no layout
    }
    private void createTextField() {
        // add text field
        field1 = new JTextField("");
        field1.setBounds(140,600,50,50);
        field1.setActionCommand("textField1");
        add(field1);

        field2 = new JTextField("");
        field2.setBounds(250,600,50,50);
        field2.setActionCommand("textField2");
        add(field2);
    }
    private void createTextLabel() {
        // add labels
        rateLabel1 = new JLabel("Piazza ------------ $10");
        rateLabel1.setBounds(100,100, 300, 50);
        rateLabel2 = new JLabel("Pasta ------------ $9");
        rateLabel2.setBounds(100,150, 300, 50);
        rateLabel3 = new JLabel("Steak ------------ $15");
        rateLabel3.setBounds(100,200, 300, 50);
        rateLabel4 = new JLabel("Rib ------------ $17");
        rateLabel4.setBounds(100,250, 300, 50);
        rateLabel5 = new JLabel("Fish ------------ $13");
        rateLabel5.setBounds(100,300, 300, 50);
        rateLabel6 = new JLabel("Fries ------------ $6");
        rateLabel6.setBounds(100,350, 300, 50);
        rateLabel7 = new JLabel("Chicken Wings ------------ $8");
        rateLabel7.setBounds(100,400, 300, 50);
        rateLabel8 = new JLabel("Chicken Breast ------------ $14");
        rateLabel8.setBounds(100,450, 300, 50);
        rateLabel9 = new JLabel("Curry ------------ $11");
        rateLabel9.setBounds(100,500, 300, 50);
        rateLabel10 = new JLabel("Coke ------------ $2");
        rateLabel10.setBounds(100,550, 300, 50);
        add(rateLabel1);
        add(rateLabel2);
        add(rateLabel3);
        add(rateLabel4);
        add(rateLabel5);
        add(rateLabel6);
        add(rateLabel7);
        add(rateLabel8);
        add(rateLabel9);
        add(rateLabel10);

        rateLabel11 = new JLabel("Food:");
        rateLabel11.setBounds(100,600, 40, 50);
        rateLabel12 = new JLabel("Price($):");
        rateLabel12.setBounds(190,600, 60, 50);
        add(rateLabel11);
        add(rateLabel12);

        resultLabel = new JTextArea("Total: $ \n Tax: $ \n Suggested Tip: $");
        resultLabel.setBounds(100,650,300,50);
        add(resultLabel);
    }

    private void createButton()
    {
        // add buttons
        button1 = new JButton("Add");
        button1.setActionCommand("button1");
        button1.addActionListener(this);
        button1.setBounds(300, 100, 100, 50);
        add(button1);

        button2 = new JButton("Add");
        button2.setActionCommand("button2");
        button2.addActionListener(this);
        button2.setBounds(300, 150, 100, 50);
        add(button2);

        button3 = new JButton("Add");
        button3.setActionCommand("button3");
        button3.addActionListener(this);
        button3.setBounds(300, 200, 100, 50);
        add(button3);

        button4 = new JButton("Add");
        button4.setActionCommand("button4");
        button4.addActionListener(this);
        button4.setBounds(300, 250, 100, 50);
        add(button4);

        button5 = new JButton("Add");
        button5.setActionCommand("button5");
        button5.addActionListener(this);
        button5.setBounds(300, 300, 100, 50);
        add(button5);

        button6 = new JButton("Add");
        button6.setActionCommand("button6");
        button6.addActionListener(this);
        button6.setBounds(300, 350, 100, 50);
        add(button6);

        button7 = new JButton("Add");
        button7.setActionCommand("button7");
        button7.addActionListener(this);
        button7.setBounds(300, 400, 100, 50);
        add(button7);

        button8 = new JButton("Add");
        button8.setActionCommand("button8");
        button8.addActionListener(this);
        button8.setBounds(300, 450, 100, 50);
        add(button8);

        button9 = new JButton("Add");
        button9.setActionCommand("button9");
        button9.addActionListener(this);
        button9.setBounds(300, 500, 100, 50);
        add(button9);

        button10 = new JButton("Add");
        button10.setActionCommand("button10");
        button10.addActionListener(this);
        button10.setBounds(300, 550, 100, 50);
        add(button10);

        button11 = new JButton("Add");
        button11.setActionCommand("button11");
        button11.addActionListener(this);
        button11.setBounds(300, 600, 100, 50);
        add(button11);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // process the action
        String name = e.getActionCommand();

        if(name.equals("button1")){
            totalPrice += 10;
        } else if (name.equals("button2")){
            totalPrice += 9;
        } else if (name.equals("button3")){
            totalPrice += 15;
        } else if (name.equals("button4")){
            totalPrice += 17;
        } else if (name.equals("button5")){
            totalPrice += 13;
        } else if (name.equals("button6")){
            totalPrice += 6;
        } else if (name.equals("button7")){
            totalPrice += 8;
        } else if (name.equals("button8")){
            totalPrice += 14;
        } else if (name.equals("button9")){
            totalPrice += 11;
        } else if (name.equals("button10")){
            totalPrice += 2;
        } else if (name.equals("button11")){
            String data = field2.getText();
            double price = Double.parseDouble(data);
            totalPrice += price;
        }

        resultLabel.setText("Total: $" + totalPrice + "\n Tax: $" + totalPrice * 0.0625 + "\n Suggested Tip: $" + totalPrice * 1.0625*0.15);


    }
}
