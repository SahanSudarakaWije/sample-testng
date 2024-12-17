package com.ucsc.day8;

import net.bytebuddy.build.Plugin;
import org.testng.annotations.*;

public class TestPack01 {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("TestPack01 - beforeSuite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("TestPack01 - beforeTest");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("TestPack01 - beforeMethod");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("TestPack01 - beforeClass");
    }

    @Test(priority = 0)
    public void testCase01() {
        System.out.println("TestPack01 - testCase01");
    }

    @Test(priority = 1, timeOut = 5000, dependsOnMethods = "testCase01")
    public void testCase02() {
        System.out.println("TestPack01 - testCase02");
    }

    @Test(enabled = true)
    public void testCase03() {
        System.out.println("TestPack01 - testCase03");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("TestPack01 - afterMethod");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("TestPack01 - afterClass");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("TestPack01 - afterTest");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("TestPack01 - afterSuite");
    }

}
