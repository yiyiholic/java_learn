package abstractClass;

import java.time.LocalDate;

public class Employee extends Person {
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day){
        super(name);
        this.salary=salary;
        hireDay=LocalDate.of(year,month,day);
    }


    public String toString(){
        return getClass().getName()
                + "[name=" + super.getName()
                + ",salary=" + salary
                + ",hireDay=" + hireDay
                + "]";
    }

    public static void main(String[] args){
        System.out.println(new Employee("TT",5,1990,1,1).toString());
    }
    public double getSalary(){
        return salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise=salary*byPercent/100;
        salary+=raise;
    }

    public String getDescription(){
        return String.format("an employee with a salary 0f $%.2f",salary);
    }
}
