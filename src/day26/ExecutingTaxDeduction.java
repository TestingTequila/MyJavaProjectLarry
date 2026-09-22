package day26;

public class ExecutingTaxDeduction
{
    static void main() {
       TaxDeduction emp1Tax = new TaxDeduction();
       emp1Tax.empDept = "HR";
       emp1Tax.calculateTax("Larry", 10000);
       emp1Tax.empDetails("Kerrie", 6000);
       emp1Tax.showDepartment();
    }
}
