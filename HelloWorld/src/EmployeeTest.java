import java.time.LocalDate;
import java.util.Random;


class Employee {
    private static int nextId;

    private int id;
    private String name="";
    private double salary;

    static {
        Random generator=new Random();
        nextId=generator.nextInt(10000);
    }

    public Employee(String n,double s){
        name=n;
        salary=s;
    }
    public Employee(double s) {
        this("Employee #"+nextId,s);
    }

    public Employee(){

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }

    public static int getNextId(){
        return nextId;
    }

    public static void main(String[] args){
        Employee e=new Employee("Harry",50000);
        System.out.println(e.getName()+" "+e.getSalary());
    }

    public void raiseSalary(double byPercent){
        double raise=this.salary*byPercent/100;
        this.salary+=raise;
    }
}


public class EmployeeTest {
    public static void main(String[] args){
        Employee[] staff=new Employee[3];

        staff[0]=new Employee("CC",75000);
        staff[1]=new Employee("HH",50000);
        staff[2]=new Employee("TT",40000);

        for(Employee e:staff){
            e.raiseSalary(5);
        }

        for(Employee e:staff){
            e.setId();
            System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
        }

        int n=Employee.getNextId();
        System.out.println("Next available id="+n);
    }

}
