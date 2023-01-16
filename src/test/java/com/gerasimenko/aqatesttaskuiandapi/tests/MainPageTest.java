package com.gerasimenko.aqatesttaskuiandapi.tests;

import com.gerasimenko.aqatesttaskuiandapi.base.BaseDriver;
import com.gerasimenko.aqatesttaskuiandapi.pages.MainPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPageTest extends BaseDriver {
    private MainPage mainPage;

    @BeforeMethod
    public void initializePage() {
        mainPage = new MainPage(getDriver());
    }

    @Test
    public void test() {
        mainPage.getResearchAndEducation();
    }
}
