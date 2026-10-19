package espol.mavenproject1;
import java.util.List;
/*
DIP, OCP, Liskov
*/

public class ShoppingCart {
    private List<Item> items;
    public void addPorduct(Item item){
        items.add(item);
    }
    public void removePorduct(Item item){
        items.add(item);
    }
    public double calculateTotalPrice() {
        double total=0;
        return total;
    }
    public void sendReceipt() {
        System.out.println("Sending receipt by email...");
    }
}

interface Item{
    String getName();
    double getPrice();
    double calculateIva();
}

class PhysicalProduct implements Item{
    private String name;
    private double price;
    private double iva;
    private double weight;
    private String type;
    
    public PhysicalProduct(String name, double price, double Iva, double weight, String type){
        //Constructor
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public double getPrice(){
        return price;
    }
    public double getWeight(){
        return weight;
    }
    public String getType(){
        return type;
    }
    public double getIva(){
        return iva;
    }

    @Override
    public double calculateIva() {
        return price=price*iva;
    }
}

class DigitalProduct implements Item{
    private String name;
    private double price;
    private double iva;
    
    public DigitalProduct(String name, double price){
        //Constructor
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public double getPrice(){
        return price;
    }
    public double getIva(){
        return iva;
    }

    @Override
    public double calculateIva() {
        return price=price*iva;
    }
}

