public class Employee {
    private int employeeId;
    private String employeeName;
    private double employeeSalary;
    private String departmentName;

    // Constructor
    public Employee(int employeeId, String employeeName, double employeeSalary, String departmentName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        this.departmentName = departmentName;
    }

    // Method to calculate annual salary
    public double calculateAnnualSalary() {
        return employeeSalary * 12;
    }


    // Method to apply bonus
    public void applyBonus(double bonusPercent) {
        employeeSalary += employeeSalary * (bonusPercent / 100);
    }

    // Method to display employee details
    public void displayEmployee() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Department: " + departmentName);
        System.out.printf("Salary After Applying Bonus: %.2f\n", employeeSalary);
        System.out.printf("Annual Salary After Bonus: %.2f\n", calculateAnnualSalary());
        
    }

    // Main method
    public static void main(String[] args) {
        //  You create 5 Employee objects using your constructor:
        Employee[] empList = new Employee[5];

        empList[0] = new Employee(101, "Aman", 25000, "HR");
        empList[1] = new Employee(102, "Priya", 30000, "IT");
        empList[2] = new Employee(103, "Rahul", 28000, "Finance");
        empList[3] = new Employee(104, "Sneha", 32000, "Marketing");
        empList[4] = new Employee(105, "Vikram", 27000, "Support");

        System.out.println("Employee Annual Salaries after 10% Bonus:\n");
         // Standard for-loop.
         // i from 0 to 4.
         // Iterates through all 5 employees in the array.
        for (int i = 0; i < empList.length; i++) {
            empList[i].applyBonus(10);
            empList[i].displayEmployee();
        }
    }
}

/*
  Extended version : 

 * Now we will exteend the employee class model after creating multiple employee and and applying a 10per bonus . Sort the employee by annual salary in desecding order.and  print the top three earner with thier details.
   1. use the previous employeee class.
   2.add a method to get annual salary 
   3. use an arrayList instead of an array(for flexiibiltity)
   4. sort the arrayList using collection.sort() and custom compators

 */