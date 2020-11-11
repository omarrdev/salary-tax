import java.util.List;

public class SalarysFromMoreJobs {
    // المتغير اللي راح يخزن فيه مجموع الرواتب
    Salary salObj= new Salary(0);
    //دالة تستقبل متغير من نوع list وتمررها على forloop عشان يجمع الرواتب
     public void setSalarys(List<Salary> salaryList){
         for (Salary salary : salaryList) {
             salObj.salaryAmount += salary.getSalaryAmount();
         }
    }
}
