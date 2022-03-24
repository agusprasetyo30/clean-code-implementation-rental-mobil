package Tugas;

public class Transaction {
    private int id;
    private Car car;
    private Customer customer;
    private Driver driver;

    public Transaction(int id, Car car, Customer customer, Driver driver) {
        this.id = id;
        this.car = car;
        this.customer = customer;
        this.driver = driver;
    }

    public void reportTransaction() {
        System.out.println("== Report Transaction ==");
        System.out.println("Transaction ID : " + this.id);
        
        // show detail report
        this.showCarReport(this.car);
        this.showCustomerReport(customer);
        this.showDriverReport(driver);
    }
    
    public void downloadReceipt(){
        System.out.println("Proses download car : " + this.car.getBrand());
        System.out.println("Proses download customer : " + this.customer.getName());
        System.out.println("Proses download driver : " + this.driver.getName());
    }
    
    private void showCarReport(Car car) {
        System.out.println("\nCar : ");
        System.out.println("Brand : " + car.getBrand());
        System.out.println("Color : " + car.getColor());
        System.out.println("License Number : " + car.getLicenseNumber());
        System.out.println("Price day : Rp. " + car.getPriceDay());
        System.out.println("Price hour : Rp. " + car.getPriceHour());
        System.out.println("Seat : Rp. " + car.getSeat());
        System.out.println("Year : Rp. " + car.getYear());
    }
    
    private void showCustomerReport(Customer customer) {
        System.out.println("\nCustomer : ");
        System.out.println("Name : " + customer.getName());
        System.out.println("Phone Number : " + customer.getPhone());
    }
    
    private void showDriverReport(Driver driver) {
        System.out.println("\nDriver : ");
        System.out.println("Name : " + driver.getName());
        System.out.println("Phone Number : " + driver.getPhone());
    }
}
