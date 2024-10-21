/*
9. Polymorphic Behavior: Create a base class Employee with a method work(). Create subclasses Engineer, Manager, and Technician, each overriding the work() method. Demonstrate polymorphic behavior by creating an array of Employee objects and calling work() on each.
 */

class EmployeeW{
    public void work(){
        System.out.println("Employee is working...");
    }
}
class Engineer extends EmployeeW{
    @Override
    public void work() {
        System.out.println("Engineer is working...");
    }
}
class ManagerW extends EmployeeW{
    @Override
    public void work() {
        System.out.println("Manager is working...");
    }
}
class Technician extends EmployeeW{
    @Override
    public void work() {
        System.out.println("Technician is working...");
    }
}

public class EmployeeWork {
    public static void main(String[] args) {
        System.out.println("************* Employee ************");
        EmployeeW ew = new EmployeeW();
        ew.work();

        System.out.println("************* Employee ************");
        Engineer eng = new Engineer();
        eng.work();

        EmployeeW en = new Engineer();
        en.work();

        System.out.println("************* Manager ************");
        ManagerW mw  = new ManagerW();
        mw.work();

        EmployeeW me = new ManagerW();
        me.work();

        System.out.println("************* Technician ************");
        Technician tech = new Technician();
        tech.work();

        EmployeeW te = new Technician();
        te.work();
    }
}
