/*
7. Method Overloading: Create a class Calculator with overloaded methods add() to handle the addition of two integers, two floats, and two doubles. Test each overloaded method by passing appropriate values.
 */
class Calculator{
    public int add(int a, int b){
        return a+b;
    }
    public float add(float c, float d){
        return c+d;
    }
    public double add(double e, double f){
        return e+f;
    }
}


public class PolyAdd {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println("Int Add : "+c.add(2,5));
        System.out.println("Float Add : "+c.add(2.5,2.5));
        System.out.println("Double Add : "+c.add(250.40,150.50));

    }
}
