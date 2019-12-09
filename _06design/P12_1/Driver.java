package _06design.P12_1;

import java.util.*;

public class Driver {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(); // initialize the vending machine
        // add some coins into vending machine in advance
        machine.addCoins(new Coin(1),10);
        machine.addCoins(new Coin(2),10);
        machine.addCoins(new Coin(5),10);
        machine.addCoins(new Coin(10),10);
        // add some products into vending machine in advance
        machine.addProducts(new Product("A",5),5);
        machine.addProducts(new Product("B",8),5);
        machine.addProducts(new Product("C",10),5);
        machine.addProducts(new Product("D",12),5);

        while (true) {
            // print the selection panel
            System.out.println("Please take action:");
            System.out.println("1. Add coins to machine; 2. Add products (restock); 3. Remove coins from machine");
            System.out.println("4. Remove products from machine; 5. Purchase product; 6. Get vending machine info");
            System.out.println("0. Exit");
            System.out.println("Please Enter (0~6):");
            Scanner sc = new Scanner(System.in);
            int step = sc.nextInt();
            if (step == 0){
                break;
            }
            else if (step == 1){
                // add coins
                boolean flag1 = true;
                while(flag1) {
                    System.out.println("Coin Value? ");
                    int value = sc.nextInt();
                    Coin cn = new Coin(value);
                    System.out.println("How many? ");
                    int number = sc.nextInt();
                    machine.addCoins(cn, number);
                    System.out.println("Continue? (y/n)");
                    String s = sc.next();
                    if(s.equals("n")){
                        flag1 = false;
                    }
                }

            }
            else if (step == 2){
                // add products
                boolean flag2 = true;
                while(flag2) {
                    System.out.println("Product Name?");
                    String name = sc.next();
                    System.out.println("Product price?");
                    int price = sc.nextInt();
                    Product p = new Product(name,price);
                    System.out.println("How many? ");
                    int number = sc.nextInt();
                    machine.addProducts(p, number);
                    System.out.println("Continue? (y/n)");
                    String s = sc.next();
                    if(s.equals("n")){
                        flag2 = false;
                    }
                }
            }
            else if (step == 3) {
                // remove coins
                boolean flag3 = true;
                while (flag3) {
                    String info = machine.toString();
                    System.out.println(info);
                    System.out.println("Coin value?");
                    int value = sc.nextInt();
                    Coin cn = new Coin(value);
                    if (!machine.hasCoin(cn)){
                        // if do not have such coin
                        System.out.println("Do not have such coin.");
                        continue;
                    }
                    System.out.println("How many? ");
                    int number = sc.nextInt();
                    if (machine.getNumCoin(cn) < number){
                        // if do not have enough coins
                        System.out.println("Do not have so many coins.");
                        continue;
                    }
                    machine.removeCoins(cn,number);
                    System.out.println("Continue? (y/n)");
                    String s = sc.next();
                    if (s.equals("n")) {
                        flag3 = false;
                    }
                }
            }
            else if (step == 4) {
                // remove products
                boolean flag4 = true;
                while (flag4) {
                    // show the vending machine coin and product stock
                    String info = machine.toString();
                    System.out.println(info);
                    System.out.println("Product name?");
                    String name = sc.next();
                    if (!machine.hasProduct(name)){
                        // if do not have such product
                        System.out.println("Do not have such product.");
                        continue;
                    }
                    System.out.println("How many? ");
                    int number = sc.nextInt();
                    if (machine.getNumProduct(name) < number){
                        // if do not have enough products
                        System.out.println("Do not have so many products.");
                        continue;
                    }
                    machine.removeProducts(name,number);
                    System.out.println("Continue? (y/n)");
                    String s = sc.next();
                    if (s.equals("n")) {
                        flag4 = false;
                    }
                }
            }
            else if (step == 5) {
                // make purchase

                // show the vending machine coin and product stock
                String info = machine.toString();
                System.out.println(info);
                System.out.println("Which product?");
                String pname = sc.next();
                if(!machine.hasProduct(pname)){
                    System.out.println("Do not have such product.");
                    continue;
                }
                int totalMoneyNeed = machine.getPriceProduct(pname);
                System.out.println("Total money needed: " + totalMoneyNeed);
                System.out.println("Please insert coins: ");
                System.out.println("(Note the machine can only change for at most coin)");
                HashMap<Integer,Integer> currCoins = new HashMap<Integer, Integer>(); // save the coins inserted
                int currValue = 0; // record the value of current inserted coins
                boolean flag5 = true;
                while(flag5){
                    // keep inserting coins
                    System.out.println("Coin value?");
                    int value = sc.nextInt();
                    currValue += value;
                    Coin cn = new Coin(value);

                    if(currCoins.containsKey(cn.getCvalue())){
                        currCoins.put(cn.getCvalue(), currCoins.get(cn.getCvalue())+1);
                    }
                    else{
                        currCoins.put(cn.getCvalue(), 1);
                    }
                    System.out.println("Current value: " + currValue);
                    System.out.println("Continue? (y/n)");
                    String s = sc.next();
                    if (s.equals("n")) {
                        flag5 = false;
                    }
                }
                Coin change = new Coin(currValue - totalMoneyNeed);
                if (currValue < totalMoneyNeed){
                    System.out.println("Money not enough!");
                }
                else if (machine.hasCoin(change) || totalMoneyNeed-currValue == 0){
                    // successful purchase
                    System.out.println("Successful purchase!");
                    if (currValue - totalMoneyNeed> 0) {
                        System.out.println("The change is:" + (currValue - totalMoneyNeed));
                        machine.removeCoins(change,1); // remove coin for change
                    }
                    machine.removeProducts(pname,1); // remove purchased product
                    for (Map.Entry<Integer,Integer> pair: currCoins.entrySet()) {
                        machine.addCoins(new Coin(pair.getKey()),pair.getValue());// add coins to machine
                    }
                }
                else{
                    System.out.println("Cannot give change!");
                }

            }
            else if (step == 6){
                // show the vending machine info
                String info = machine.toString();
                System.out.println(info);
            }

        }

    }
}
