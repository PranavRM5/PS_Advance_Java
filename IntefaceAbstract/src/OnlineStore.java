/*

3. Online Store Order Processing
Problem:
Design an abstract class Order with an abstract method processOrder().Create two subclasses: OnlineOrder and InStoreOrder, where each subclass prints different steps to process the respective orders. For example, an online order might involve shipping, while an in-store order might involve pick-up.

 */
abstract class Order{
    public abstract void processOrder();
}

class OnlineOrder extends Order{
    @Override
    public void processOrder() {
        System.out.println("******************************************");
        System.out.println("Processing Online Order:");
        System.out.println("1. Add items to the cart.");
        System.out.println("2. Make an online payment.");
        System.out.println("3. Package the items.");
        System.out.println("4. Ship the items to the delivery address.");
        System.out.println("5. Send delivery confirmation email.");
    }
}

class InStoreOrder extends Order{
    @Override
    public void processOrder() {
        System.out.println("******************************************");
        System.out.println("Processing In-Store Order:");
        System.out.println("1. Select items in the store.");
        System.out.println("2. Proceed to checkout.");
        System.out.println("3. Make payment at the counter.");
        System.out.println("4. Pack the items.");
        System.out.println("5. Collect the items for immediate pick-up.");
    }
}



public class OnlineStore {
    public static void main(String[] args) {
        OnlineOrder o = new OnlineOrder();
        InStoreOrder i = new InStoreOrder();

        o.processOrder();
        i.processOrder();
    }
}
