package Tugas;

import java.util.Scanner;

public class Main {

    private Customer customer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int menu;

        do {
            System.out.println("MENU");
            System.out.println("1. Registrasi Pengguna");
            System.out.println("2. List Mobil");
            System.out.println("3. List Driver");
            System.out.println("4. Transaksi Rental");
            System.out.println("5. Keluar");

            System.out.print("Masukan menu : ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    showListCar();
                    break;
                case 3:
                    showListDriver();
                    break;
                case 4:
                    System.out.println("ini bagian transaksi rental");
                    break;
                case 5:
                    System.out.println("Selamat tinggal");
                    break;
                default:
                    System.out.println("Salah input");
                    break;
            }
        } while (menu != 5);

//        // Admin
//        Admin admin1 = new Admin();
//        admin1.setName("Melkan");
//        admin1.setUsername("melkan123");
//        admin1.setPassword("melkanuhuy");
//        
////        System.out.println("Admin : " + admin1.getName());
//        
//        // Car
//        Car car1 = new Car();
//        car1.setBrand("Avanza");
//        car1.setColor("Ijo Butek");
//        car1.setLicenseNumber("L 3 MU");
//        car1.setPriceDay(5000);
//        car1.setPriceHour(500);
//        car1.setSeat(4);
//        car1.setYear(2012);
//        
//        Car car2 = new Car();
//        car2.setBrand("Ferarri");
//        car2.setColor("Abang");
//        car2.setLicenseNumber("L 3 STI");
//        car2.setPriceDay(100000);
//        car2.setPriceHour(5000);
//        car2.setSeat(2);
//        car2.setYear(2018);
//        
//        Car a[] = new Car[100];
//        
//        a[0] = car1;
//        a[1] = car2;
//        
//        System.out.println(a[0].getBrand());
//        
////        System.out.println("Car : " + car1.getBrand());
//        
//        // Customer
//        Customer customer1 = new Customer();
//        customer1.setName("Ronaldowati");
//        customer1.setUsername("ronaldo123");
//        customer1.setPassword("ronaldo123");
//        customer1.setAddress("Ds. Palang");
//        customer1.setPhone("081331414555");
//        
////        System.out.println("Customer : " + customer1.getName());
//        
//        // Driver
//        Driver driver1 = new Driver();
//        driver1.setName("Santoso");
//        driver1.setPhone("084661313455");
//        driver1.setAddress("Ds. Panyuran");
//        
//        Driver driver2 = new Driver();
//        driver1.setName("Yusuf");
//        driver1.setPhone("0873136668");
//        driver1.setAddress("Ds. Palang");
//        
////        System.out.println("Driver : " + driver1.getName());
//
//        // Transaksi
//        Transaction transaction1 = new Transaction(1, car1, customer1, driver1);
//        Transaction transaction2 = new Transaction(2, car2, customer1, driver2);
//        transaction1.reportTransaction();       
    }

    private static void registerUser() {

        Scanner sc2 = new Scanner(System.in);
        String name, username, password, address, phone;

        System.out.println("-- CUSTOMER --");
        System.out.print("Nama : ");
        name = sc2.nextLine();
        System.out.print("Alamat : ");
        address = sc2.nextLine();
        System.out.print("Telepon : ");
        phone = sc2.nextLine();
        System.out.print("Username : ");
        username = sc2.nextLine();
        System.out.print("Password : ");
        password = sc2.nextLine();

        Customer customer = new Customer(address, phone);
        customer.setName(name);
        customer.setUsername(username);
        customer.setPassword(password);

        System.out.println("Halooo [ " + customer.getName() + " ]");
    }

    private static void showListCar() {
        System.out.println("-- DRIVER --");
        for (int i = 0; i < addListCar().length; i++) {
            System.out.println("Brand : " + addListCar()[i].getBrand());
            System.out.println("Color : " + addListCar()[i].getColor());
            System.out.println("License Number : " + addListCar()[i].getLicenseNumber());
            System.out.println("Price day : Rp. " + addListCar()[i].getPriceDay());
            System.out.println("Price hour : Rp. " + addListCar()[i].getPriceHour());
            System.out.println("Seat : Rp. " + addListCar()[i].getSeat());
            System.out.println("Year : Rp. " + addListCar()[i].getYear());
            System.out.println("");
        }
    }

    private static void showListDriver() {
        System.out.println("-- DRIVER --");
        for (int i = 0; i < addListDriver().length; i++) {
            System.out.println("Name : " + addListDriver()[i].getName());
            System.out.println("Phone Number : " + addListDriver()[i].getPhone());
            System.out.println("");
        }
    }

    private static Car[] addListCar() {
        Car car1 = new Car();
        car1.setBrand("Avanza");
        car1.setColor("Ijo Butek");
        car1.setLicenseNumber("L 3 MU");
        car1.setPriceDay(5000);
        car1.setPriceHour(500);
        car1.setSeat(4);
        car1.setYear(2012);

        Car car2 = new Car();
        car2.setBrand("Ferarri");
        car2.setColor("Abang");
        car2.setLicenseNumber("L 3 STI");
        car2.setPriceDay(100000);
        car2.setPriceHour(5000);
        car2.setSeat(2);
        car2.setYear(2018);

        Car list[] = new Car[2];
        list[0] = car1;
        list[1] = car2;

        return list;
    }

    private static Driver[] addListDriver() {
        Driver driver1 = new Driver();
        driver1.setName("Santoso");
        driver1.setPhone("084661313455");
        driver1.setAddress("Ds. Panyuran");

        Driver driver2 = new Driver();
        driver2.setName("Yusuf");
        driver2.setPhone("0873136668");
        driver2.setAddress("Ds. Palang");

        Driver list[] = new Driver[2];
        list[0] = driver1;
        list[1] = driver2;

        return list;
    }

}
