package levelthree.lesson6_7.tests;

import levelthree.lesson6_7.annotation.AfterSuite;
import levelthree.lesson6_7.annotation.BeforeSuite;
import levelthree.lesson6_7.annotation.Test;

public class TestClassOne {
    @BeforeSuite
    public void prepareTesting() {
        System.out.println("preparing for testing...");
    }

    @Test(priority = 3)
    public void Test1() {
        System.out.println("Test №1");
    }

    @Test(priority = 6)
    public void Test2() {
        System.out.println("Test №2");
    }

    @Test(priority = 6)
    public void Test3() {
        System.out.println("Test №3");
    }

    @Test(priority = 10)
    public void Test4() {
        System.out.println("Test №4");
    }

    @Test(priority = 9)
    public void Test5() {
        System.out.println("Test №5");
    }

    @AfterSuite
    public void completeTesting() {
        System.out.println("testing completed successfully");
    }

}
