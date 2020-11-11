import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) throws IOException {
        //إنشاء List من نوع salary لتخزين الرواتب
        List<Salary>  salary = new ArrayList<Salary>();
        Salary salary1 = new Salary(30000.);//أوبجكت الراتب الأول
        salary.add(salary1);//إضافته للـ List
        Salary salary2 = new Salary(1200.);//أوبجكت الراتب الثاني
        salary.add(salary2);//إضافته للـ List

        //اوبجكت من كلاس SalarysFromMoreJobs
        SalarysFromMoreJobs salarys = new SalarysFromMoreJobs();
        //نمرر الـ List عبر الدالة وراح يخزن المجموع في المتغير salObj الموجود بالكلاس
        salarys.setSalarys(salary);

        /*
        هنا ننشئ أوبجكت ونستدعي الدالة ونمرر داخلها متغير salarys
        من خلاله نستطيع نوصل للـ salObj اللي هو يعتبر مجموع الرواتب
        وخزنا الناتج من الدالة في متغير من نوع Result لأن الدالة ترجع هذا النوع كنتيجة
        استخدمناه طبعا عشان يكون يحتوي على متغير الراتب بعد الضريبة ومقدار الضريبة المخصوم
         */
        TaxCalculator calculator = new TaxCalculator();
        Result result = calculator.calc(salarys);

        //هنا فقط استداعاء للقيم من الأوبجكت وطباعتها
        double salaryAfterTax = result.getSalaryAfterTax();
        double tax = result.getTaxAmount();

        System.out.println("Salary after tax= "+salaryAfterTax);
        System.out.println("Tax amount= "+tax);

        //نقدر نستخدم طريقة أبسط للطباعة بدل ما نخزن متغيرين
        System.out.println("Salary after tax= "+result.getSalaryAfterTax());
        System.out.println("Tax amount= "+result.getTaxAmount());
    }

}


