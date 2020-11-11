// تم إنشاء هذا الكلاس عشان نجمع المتغيرين بمتغير واحد عشان return لازم نرجع متغير واحد
// طبعا نقدر نرجع مصفوفة بس أنا رأيت نرجعها بهذه الطريقة
public class Result {
double salaryAfterTax;
double taxAmount;

    //Getter
    public double getSalaryAfterTax(){return salaryAfterTax;}
    public double getTaxAmount(){return taxAmount;}

    //Setter
    public void setSalaryAfterTax(double salaryAfterTax){
    this.salaryAfterTax = salaryAfterTax;
    }
    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }
}
