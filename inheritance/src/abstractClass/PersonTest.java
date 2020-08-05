package abstractClass;

/**
 * This program demonstrates abstract classes
 * @version
 * @author
 */

public class PersonTest {
    public static void main(String[] args){
        Person[] people=new Person[2];

        people[0]=new Employee("HH",50000,1989,10,1);
        people[1]=new Student("MM","Computer science");

        for (Person p:people){
            System.out.println(p.getName()+','+p.getDescription());
        }
    }
}
