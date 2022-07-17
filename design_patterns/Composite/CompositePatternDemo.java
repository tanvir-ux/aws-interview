public class CompositePatternDemo {
    public static void main(String[] args) {
        Employee e1 = new Cashier(001, "Jamal Khan", 20000);
        Employee e2 = new Cashier(002, "Kamal Khan", 20000);
        Employee e3 = new Accountant(003, "Reza Khan", 25000);
        Employee manager1 = new BankManager(004, "Tanvir Alam", 50000);
        manager1.add(e1);
        manager1.add(e2);
        manager1.add(e3);
        manager1.print();        
    }
}