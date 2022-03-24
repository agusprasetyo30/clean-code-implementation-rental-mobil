package Tugas;

public class Admin extends User{
    private Report report;
    
    public void manageFinancial(){
//        System.out.println(report.FinancialReport());
    }
    
    public void report(Report report){
        this.report = new Report();
    }
}
