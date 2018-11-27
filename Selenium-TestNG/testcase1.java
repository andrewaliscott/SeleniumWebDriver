package com.andrewaliscott;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class testcase1 {

    @Parameters({"URL"})
    @Test
    public void demo(String urlName)
    {
        System.out.println("Hello World!");
        System.out.println(urlName);
    }



}
