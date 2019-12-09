package _06design.P12_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendingMachine {
    HashMap<Integer,Integer> coins; // indicates the stock of coins
    HashMap<String, List<Integer>> products; // indicates the stock of products

    public VendingMachine(){
        coins = new HashMap<Integer,Integer>();
        products =new HashMap<String, List<Integer>>();
    }

    public void addCoins(Coin coin, int number){
        if(coins.containsKey(coin.getCvalue())){
            coins.put(coin.getCvalue(), coins.get(coin.getCvalue()) + number);
        }
        else{
            coins.put(coin.getCvalue(), number);
        }
    }

    public void removeCoins(Coin coin, int number){
        if(coins.containsKey(coin.getCvalue())){
            coins.put(coin.getCvalue(), coins.get(coin.getCvalue()) - number);
        }
        if(coins.get(coin.getCvalue()) == 0){
            // if the number is 0, remove that coin
            coins.remove(coin.getCvalue());
        }
    }

    public void addProducts(Product product, int number){
        List<Integer> price_num =  new ArrayList<Integer>();
        price_num.add(product.getPprice());
        price_num.add(number);
        if(products.containsKey(product.getPname())){
            products.put(product.getPname(), price_num);
        }
        else{
            products.put(product.getPname(), price_num);
        }
    }

    public void removeProducts(String product, int number){
        if(products.containsKey(product)){
            List<Integer> price_num = products.get(product);
            price_num.set(1,price_num.get(1)-number);
            products.put(product, price_num);
        }
        if(products.get(product).get(1) == 0){
            // if the number is 0, remove that product
            products.remove(product);
        }
    }
    public boolean hasCoin(Coin cn){
        // if machine have such coin
        return coins.containsKey(cn.getCvalue());
    }

    public boolean hasProduct(String pt){
        // if machine have such product
        return products.containsKey(pt);
    }

    public int getNumCoin(Coin cn){
        // return the number of coins
        return coins.get(cn.getCvalue());
    }

    public int getNumProduct(String pt){
        // return the number products
        return products.get(pt).get(1);
    }

    public int getPriceProduct(String pt){
        // return the price of that product
        return products.get(pt).get(0);
    }
    @Override

    public String toString(){
        // create the string for vending machine information
        String s = "";
        for (Map.Entry<Integer, Integer> pair: coins.entrySet()) {
            s += "coin " + pair.getKey() +": " + pair.getValue() + "\n";
        }

        for (Map.Entry<String, List<Integer>> pair: products.entrySet()) {
            s += "product " + pair.getKey() +" of $" + pair.getValue().get(0) +": " + pair.getValue().get(1) + "\n";
        }
        return s;
    }
}
