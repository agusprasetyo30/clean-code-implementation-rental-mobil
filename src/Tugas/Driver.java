package Tugas;

public class Driver {
    private String name;
    private String phone;
    private String address;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    public void driving(){
        System.out.println("Mengemudikan Mobil");
    }
}
