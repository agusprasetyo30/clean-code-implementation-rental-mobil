package Tugas;

public class Transaction {
    private int id;
    private Car car;
    private Customer customer;
    private Driver driver;

    public void downloadReceipt(Car car, Customer customer, Driver driver){
        this.car = car;
        this.customer = customer;
        this.driver = driver;
    }
}
