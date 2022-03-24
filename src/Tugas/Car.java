package Tugas;

public class Car {
    private String brand;
    private String color;
    private int year;
    private int seat;
    private String license_number;
    private int price_hour;
    private int price_day;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getSeat() {
        return seat;
    }

    public void setLicenseNumber(String license_number) {
        this.license_number = license_number;
    }

    public String getLicenseNumber() {
        return license_number;
    }

    public void setPriceHour(int price_hour) {
        this.price_hour = price_hour;
    }

    public int getPriceHour() {
        return price_hour;
    }

    public void setPriceDay(int price_day) {
        this.price_day = price_day;
    }

    public int getPriceDay() {
        return price_day;
    }
}
