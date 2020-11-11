//كان ممكن نستغني برقم int كراتب في كلاس main
//بس استخدمنا هذه الطريقة لو اردنا نضيف بدالات ونسبة وغيرها
public class Salary {
    double salaryAmount ;

    //Getter
    public double getSalaryAmount(){
        return salaryAmount;
    }
    //Setter
    public void setSalaryAmount(double newSalary){
       salaryAmount = newSalary;
    }
    //Constructor
    public Salary(double salaryAmount) {
        this.salaryAmount = salaryAmount;
    }
}
