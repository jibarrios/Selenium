package com.cybertek.pages;

import com.cybertek.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCalendarEventsPage {
    public CreateCalendarEventsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "oro_calendar_event_form[allDay]")
    public WebElement allDayEventCheckbox;

    @FindBy(xpath = "//input[@name='oro_calendar_event_form[allDay]']")
    public WebElement repeatCheckbox;

}