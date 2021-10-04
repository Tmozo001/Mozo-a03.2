package baseline;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.jupiter.api.Test;
import java.util.*;

public class EmployeeTest {
    @Test
    public void TestEmployeeMap() throws ParseException{
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        solution40.employees.put(101, new solution40("John","Johnson","Manager",s.parse("2016-12-31")));
        solution40.employees.put(102, new solution40("Tou","Xiong","Software Engineer",s.parse("2016-10-05")));
        solution40.employees.put(103, new solution40("Michaela","Michaelson","District Manager",s.parse("2015-12-19")));
        solution40.employees.put(104, new solution40("Jake","Jacobson","Programmer", null));
        solution40.employees.put(105, new solution40("Jacquelyn","Jackson","DBA", null));
        solution40.employees.put(106, new solution40("Sally","Webber","Web Developer",s.parse("2015-12-18")));

        Assert.assertTrue(solution40.employees.size() == 6);
        Assert.assertTrue(solution40.search("John") == 1);
    }

    @Test
    public void TestEmployeeMap2() throws ParseException{
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        solution40.employees.put(101, new solution40("John","Johnson","Manager",s.parse("2016-12-31")));
        solution40.employees.put(102, new solution40("Tou","Xiong","Software Engineer",s.parse("2016-10-05")));
        solution40.employees.put(103, new solution40("Michaela","Johnson","District Manager",s.parse("2015-12-19")));
        solution40.employees.put(104, new solution40("Johnson","Jacobson","Programmer", null));

        Assert.assertTrue(solution40.employees.size() == 4);
        Assert.assertTrue(solution40.search("Johnson") == 3);
    }
}}