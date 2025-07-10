import java.util.*;

public class EmployeeTest {

    static class Employee {
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

        // Getter for annual salary (for sorting)
        public double getAnnualSalary() {
            return calculateAnnualSalary();
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
            System.out.println();
        }
    }

    // Main Method 
    public static void main(String[] args) {
        // 1. Use ArrayList instead of array
        List<Employee> employees = new ArrayList<>();

        // 2. Create Employees
        employees.add(new Employee(101, "Aman", 25000, "HR"));
        employees.add(new Employee(102, "Priya", 30000, "IT"));
        employees.add(new Employee(103, "Rahul", 28000, "Finance"));
        employees.add(new Employee(104, "Sneha", 32000, "Marketing"));
        employees.add(new Employee(105, "Vikram", 27000, "Support"));
        employees.add(new Employee(106, "Anjali", 35000, "Sales"));
        employees.add(new Employee(107, "Raj", 26000, "Admin"));

        // Apply 10% bonus to all
        for (Employee emp : employees) {
            emp.applyBonus(10);
        }

        // Sort by annual salary in DESCENDING order
        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.getAnnualSalary(), e1.getAnnualSalary());
            }
        });

        // top 3 earners
        System.out.println("Top 3 Earners After 10% Bonus:\n");

        for (int i = 0; i < 3 && i < employees.size(); i++) {
            employees.get(i).displayEmployee();
        }
    }
}
