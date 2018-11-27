package com.andrewaliscott;

import org.testng.annotations.Test;

public class testcase4 {

    @Test
    public void webLoginHomeLoan()
    {

        System.out.println("WebLoginHome");
    }

    @Test(groups ={"smoke"})
    public void MobileLoginHomeLoan()
    {
        System.out.println("MobileLoginHome");


    }

    @Test(groups ={"smoke"})
    public void APILoginHomeLoan()
    {
        System.out.println("APILoginHome");
    }
}
