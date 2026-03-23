package TestngNewBasics;

import org.testng.annotations.*;

public class AnnotationBasics {
    @BeforeSuite
    public void sample(){
        System.out.println("before suite");
    }
    @AfterSuite
    public void sample5(){
        System.out.println("after suite");
    }
    @AfterClass
    public void sample6(){
        System.out.println("after class");
    }
    //now running ,But if no test belongs to a group, so TestNG skips it
    @BeforeGroups("smoke")
    public void sample9(){
        System.out.println("before groups");
    }
    @AfterMethod
    public void sample7(){
        System.out.println("after method");
    }
    @AfterTest
    public void sample8(){
        System.out.println("after test");
    }
    @BeforeClass
    public void sample1(){
        System.out.println("before class");
    }
    @BeforeMethod
    public void sample2(){
        System.out.println("before method");
    }
    @BeforeTest
    public void sample3(){
        System.out.println("before test");
    }
    @Test(groups ="smoke")
    public void sample4(){
        System.out.println("test");
    }
    @Test
    public void test1(){
        System.out.println("test1 is executed");
    }
    @Test
    public void test2(){
        System.out.println("test2 is executed");
    }
}
