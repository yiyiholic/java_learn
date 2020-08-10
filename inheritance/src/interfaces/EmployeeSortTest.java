package interfaces;


import abstractClass.Employee;

import java.util.Arrays;

/**
 * This program demonstrates the use of Comparable interface
 */
public class EmployeeSortTest {
    public static void main(String[] args){
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("HH",3500);
        staff[1] = new Employee("CC",75000);
        staff[2] = new Employee("TT",38000);

        Arrays.sort(staff);

        Employee a = new Employee("xx",700);
        System.out.println(a.compareTo(staff[0]));
        //print out information about all Employee objects
        for (Employee e : staff){
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }
    }
}
