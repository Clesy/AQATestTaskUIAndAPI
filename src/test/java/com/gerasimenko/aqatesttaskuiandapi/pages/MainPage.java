package com.gerasimenko.aqatesttaskuiandapi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = https://www.xm.com/
public class MainPage {

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "link")
    private WebElement riskDisclosure;

    @FindBy(xpath = "//a[@role='button'][normalize-space()='Research & Education']")
    private WebElement researchAndEducation800600; // 800x600

    @FindBy(xpath = "(//li[@class='main_nav_research']//a)[1]")
    private WebElement researchAndEducation;

    @FindBy(xpath = "//button[@class='toggleLeftNav']//i[1]")
    private WebElement toggleNav;

    @FindBy(xpath = "//button[@id='js-riskCloseButton']//i[@class='fa fa-times']")
    private WebElement riskCloseBtn;

    public void getResearchAndEducation() {
        researchAndEducation.click();
    }
}
