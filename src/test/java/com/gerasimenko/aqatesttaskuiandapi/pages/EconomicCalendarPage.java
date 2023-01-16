package com.gerasimenko.aqatesttaskuiandapi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

// page_url = about:blank
public class EconomicCalendarPage {

    public EconomicCalendarPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}