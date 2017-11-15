// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.
package app12;

import java.security.SecureRandom;

public class PayrollSystemTest 
{
   public static void main(String[] args) 
   {
	   int currentMonth = new SecureRandom().nextInt(12) + 1;
      // create subclass objects
      SalariedEmployee salariedEmployee = 
         new SalariedEmployee("John", "Smith", "111-11-1111",new Date(11, 14, 1987), 800.00);
      HourlyEmployee hourlyEmployee = 
         new HourlyEmployee("Karen", "Price", "222-22-2222",new Date(6, 3, 1985) , 16.75, 40);
      CommissionEmployee commissionEmployee = 
         new CommissionEmployee(
         "Sue", "Jones", "333-33-3333",new Date(2, 27, 1993), 10000, .06);
      BasePlusCommissionEmployee basePlusCommissionEmployee = 
         new BasePlusCommissionEmployee(
         "Bob", "Lewis", "444-44-4444",new Date(4, 11, 1989), 5000, .04, 300);

      System.out.println("Current Month: " + currentMonth);
      
      Employee[] employees = new Employee[4]; 

      // initialize array with Employees
      employees[0] = salariedEmployee;
      employees[1] = hourlyEmployee;
      employees[2] = commissionEmployee; 
      employees[3] = basePlusCommissionEmployee;

      System.out.printf("Employees processed polymorphically:%n%n");
      
      // generically process each element in array employees
      for (Employee currentEmployee : employees) 
      {
         System.out.println(currentEmployee); // invokes toString

         // determine whether element is a BasePlusCommissionEmployee
         if (currentEmployee instanceof BasePlusCommissionEmployee) 
         {
            // downcast Employee reference to 
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee employee = 
               (BasePlusCommissionEmployee) currentEmployee;

            employee.setBaseSalary(1.10 * employee.getBaseSalary());

            System.out.printf(
               "new base salary with 10%% increase is: $%,.2f%n",
               employee.getBaseSalary());
         } 
         
         if(currentMonth == currentEmployee.getBirthDate().getMonth()) {
             System.out.printf(
                     "earned $%,.2f + 100$ bonus = $%,.2f%n%n",currentEmployee.earnings() ,currentEmployee.earnings() + 100);
         } else {
             System.out.printf(
                     "earned $%,.2f%n%n", currentEmployee.earnings());
         }
      } 
   } // end main
} // end class PayrollSystemTest
