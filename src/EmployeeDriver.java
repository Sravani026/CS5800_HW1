//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Employee {
    private String firstName;
    private String lastName;
    private String ssn;

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }
}

class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, double weeklySalary) {
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }
}

class HourlyEmployee extends Employee {
    private double wage;
    private int hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String ssn, double wage, int hoursWorked) {
        super(firstName, lastName, ssn);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public double getWage() {
        return wage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
}

class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(String firstName, String lastName, String ssn, double commissionRate, double grossSales) {
        super(firstName, lastName, ssn);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }
}

class BaseEmployee extends Employee {
    private double baseSalary;

    public BaseEmployee(String firstName, String lastName, String ssn, double baseSalary) {
        super(firstName, lastName, ssn);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }
}

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500),
                new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32),
                new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47),
                new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000),
                new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700),
                new BaseEmployee("Mike", "Davenport", "666-66-6666",95000),
                new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000)
        };

        for (Employee employee : employees) {
            System.out.println("First name: " + employee.getFirstName() +
                    ", Last name: " + employee.getLastName() +
                    ", SSN: " + employee.getSsn());

            if (employee instanceof SalariedEmployee) {
                System.out.println("Weekly Salary: $" + ((SalariedEmployee) employee).getWeeklySalary());
            } else if (employee instanceof HourlyEmployee) {
                System.out.println("Wage: $" + ((HourlyEmployee) employee).getWage() +
                        ", Hours Worked: " + ((HourlyEmployee) employee).getHoursWorked());
            } else if (employee instanceof CommissionEmployee) {
                System.out.println("Commission Rate: " + ((CommissionEmployee) employee).getCommissionRate() +
                        ", Gross Sales: $" + ((CommissionEmployee) employee).getGrossSales());
            } else if (employee instanceof BaseEmployee) {
                System.out.println("Base Salary: $" + ((BaseEmployee) employee).getBaseSalary());
            }

            System.out.println("\n");
        }
    }
}
