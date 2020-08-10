package interfaces.clone;

import abstractClass.Employee;

/**
 * This program demonstrates cloning.
 */
public class CloneTest {
    public static void main(String[] args){
        try {
            Employee original = new Employee("John Q. Public",5000);
            original.setHireDayClone(2000,1,1);
            Employee copy = original.clone();
            copy.raiseSalary(10);
            copy.setHireDayClone(2002,12,31);
            System.out.println("original=" + original);
            System.out.println("copy=" + copy);
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}
