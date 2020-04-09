package com.cybertek.pages;

import com.cybertek.Utilities.Driver;
import com.cybertek.base.VytrackPageBase;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends VytrackPageBase {
    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}