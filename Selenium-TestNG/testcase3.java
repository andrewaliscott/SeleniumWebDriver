package com.andrewaliscott;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcase3 {


    @AfterTest
    public void webLoginCarLoan()
    {

        System.out.println("WebLoginCar");

    }

    @Test(groups ={"smoke"})
    public void MobileLoginCarLoan()
    {

        System.out.println("MobileLoginCar");

    }

    @BeforeTest
    public void APILoginCarLoan()
    {
        System.out.println("APILoginCar");
    }


}
