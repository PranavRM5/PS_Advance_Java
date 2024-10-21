import java.util.ArrayList;
import java.util.List;

/*

5. Shopping Cart System
Problem:
Create an abstract class Item with methods getPrice() and getName(). Create subclasses Electronics and Clothes that implement the abstract methods and provide a price and name for each item. Finally, create a shopping cart where you can add different items and calculate the total price.

 */
abstract class Item{
    public abstract double getPrice();
    public abstract String getName();
}

class Electronic extends Item{
    private String name;
    private double price;

    public Electronic(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

class Clothes extends Item{
    private String name;
    private double price;

    public Clothes(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}


class ShoppingCart {                         //extends Electronic, Clothes
    private List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
        System.out.println(item.getName()+" added to the cart. ");
    }

    public void CalculatePrice(){
        double total = 0 ;
        for (Item item : items)
        {
            total += item.getPrice();
        }
        System.out.println("Total Price: $" + total);
    }

    public void display(){
        System.out.println("Item in your cart : ");
        for (Item item : items)
        {
            System.out.println(" - "+item.getName()+" : $"+item.getPrice());
        }
    }

}


public class ShoppingSystem {
    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart();

        Item laptop = new Electronic("Dell", 10500);
        Item phone = new Electronic("Iphone",2020);
        Item tshirt = new Clothes("T-Shirt",500.0);
        Item jeans = new Clothes("Jeans",600.50);

        System.out.println("**********************************************************");

        sc.addItem(laptop);
        sc.addItem(phone);
        sc.addItem(tshirt);
        sc.addItem(jeans);

        System.out.println("**********************************************************");

        sc.display();

        System.out.println("**********************************************************");

        sc.CalculatePrice();

        System.out.println("**********************************************************");

    }
}
