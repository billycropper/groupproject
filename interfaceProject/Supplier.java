package day08.interfaceProject;

public class Supplier extends Employee {

    private String name;
    private int quantity;
    private double price;

    public Supplier(String firstName, String lastName, int social, String name, int quantity, double price) {
        super(firstName, lastName, social);
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public double calculatePay(){
        double pay;
        pay = quantity * price;
        return pay;
    }

//    public String supplyRequest(){
//        return "The company " + name + " is paying: " + pay;
//    }
}
