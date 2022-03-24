package Tugas;

public class Main {
    public static void main(String[] args) {
        // Admin
        Admin admin1 = new Admin();
        admin1.setName("Melkan");
        admin1.setUsername("melkan123");
        admin1.setPassword("melkanuhuy");
        
//        System.out.println("Admin : " + admin1.getName());
        
        // Car
        Car car1 = new Car();
        car1.setBrand("Avanza");
        car1.setColor("Ijo Butek");
        car1.setLicenseNumber("L 3 MU");
        car1.setPriceDay(5000);
        car1.setPriceHour(500);
        car1.setSeat(4);
        car1.setYear(2012);
        
//        System.out.println("Car : " + car1.getBrand());
        
        // Customer
        Customer customer1 = new Customer();
        customer1.setName("Ronaldowati");
        customer1.setUsername("ronaldo123");
        customer1.setPassword("ronaldo123");
        customer1.setAddress("Ds. Palang");
        customer1.setPhone("081331414555");
        
//        System.out.println("Customer : " + customer1.getName());
        
        // Driver
        Driver driver1 = new Driver();
        driver1.setName("Santoso");
        driver1.setPhone("084661313455");
        driver1.setAddress("Ds. Panyuran");
        
//        System.out.println("Driver : " + driver1.getName());

        // Transaksi
        Transaction transaction = new Transaction(0, car1, customer1, driver1);
        transaction.reportTransaction();
        
    }
}
