package com.andrewaliscott;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testcase2 {
    @Test(dataProvider = "getData")
    public void demo(String first, String second) {
        System.out.println(first +" "+ second);
    }

    @BeforeTest
    public void preCondition() {

        System.out.println("I will execute first");
    }

    @DataProvider
    public Object[][] getData() {

        Object[][] data = new Object[3][2];
        data[0][0] = "firstSetUserName";
        data[0][1] = "password";

        data[1][0] = "SecondSetUserName";
        data[1][1] = "password";

        data[2][0] = "ThirdSetUserName";
        data[2][1] = "password";

        return data;

    }

}
