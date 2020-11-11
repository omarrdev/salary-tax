public class TaxCalculator {

    Result result = new Result();

    public Result calc(SalarysFromMoreJobs salarys){
        double salary = salarys.salObj.salaryAmount;//مجموع الرواتب
        //استدعينا set للضريبة ومررنا داخلها معادلة توجد مقدار الضريبة
        //تم افتراض ان الضريبة 25%
        result.setTaxAmount(salary*0.25);
        //استدعينا set للراتب بعد الضريبة ومررنا داخلها الراتب ناقص مقدار الضريبة
        result.setSalaryAfterTax(salary-result.getTaxAmount());

        return result;
   }
}
