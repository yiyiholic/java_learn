package abstractClass;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee extends Person implements Comparable<Employee>,Cloneable{
    private double salary;
    private LocalDate hireDay;
    private Date hireDayClone;

    public Employee(String name, double salary, int year, int month, int day){
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year,month,day);
        hireDayClone = new Date();
    }

    public Employee(String name,double salary){
        super(name);
        this.salary = salary;
        hireDayClone = new Date();
    }

    //可变变量深拷贝（重新拷贝一份）
    public Employee clone() throws CloneNotSupportedException{
        //call Object.clone()
        Employee cloned = (Employee) super.clone();

        //clone mutable fields
        cloned.hireDayClone = (Date)hireDayClone.clone();
        return cloned;
    }

    public void setHireDayClone(int year, int month, int day){
        Date newHireDayClone = new GregorianCalendar(year, month-1, day).getTime();

        //example of instance field mutation
        hireDayClone.setTime(newHireDayClone.getTime());
    }

    public String toString(){
        return getClass().getName()
                + "[name=" + super.getName()
                + ",salary=" + salary
                + ",hireDay=" + hireDay
                + ",hireDayClone=" + hireDayClone
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

    /**
     * Compares employees by salary
     * @param other another Employee object
     * @return a negative value if this employee has a lower salary than
     * otherObject,0 if the salaries are the same, a positive value otherwise
     */
    @Override
    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }
}
