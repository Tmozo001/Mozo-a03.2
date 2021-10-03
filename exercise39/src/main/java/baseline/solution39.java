/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Tyler Mozo
 */
package baseline;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;




class Employee {
    //create attributes for the input array
    private String firstName;
    private String lastName;

    private String position;
    private String separationDate;

    //create Employee object that takes in the attributes
    public Employee(String firstName, String lastName, String position,String separationDate) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.position = position;
        this.separationDate=separationDate;
    }

    //takes first name from input
    public String getFirstName() {

        return firstName;
    }

    //takes last name from input
    public String getLastName() {

        return lastName;
    }
    //takes position from input
    public String getPosition() {

        return position;
    }
    //takes SeparationDate
    public String getSeparationDate() {

        return separationDate;
    }

    @Override
    //use an override to create the string format using the get functions
    public String toString()
    {
        return String.format("%s %s|%s| \t%s", getFirstName(), getLastName(), getPosition(),getSeparationDate());
    }

}
public class solution39 {
    public static void main(String[] args) {
        //declare the input in an array object
        //can be anything really
        Employee[] employees = {
                new Employee("\tJohn", "Johnson        ", "\tManager               ", "2016-12-31"),
                new Employee("\tTou", "Xiong           ", "\tSoftware Engineer     ", "2016-10-05"),
                new Employee("\tMichaela", "Michaelson ", "\tDistrict Manager      ", "2015-12-19"),
                new Employee("\tJake", "Jacobson       ", "\tProgrammer            ", ""),
                new Employee("\tJackquelyn", "Jackson  ", "\tDBA                   ", ""),
                new Employee("\tSally", "Webber        ", "\tWeb Developer         ", "2015-12-18")
        };
        //initialize the list of the employees
        List<Employee> list = Arrays.asList(employees);

        //create the table
        System.out.println("Name" + "                    |  " + "Position"+"               |  " + "Separation Date");
        System.out.println("------------------------|-------------------------|---------------------");

        //find how to filter by last name instead of first
        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;


        Comparator<Employee> lastThenFirst =
                Comparator.comparing(byLastName).thenComparing(byFirstName);

        //print out the sorted list
        list.stream().sorted(lastThenFirst).forEach(System.out::println);
    }
}
