package com.cybertek.pages;

import com.cybertek.Utilities.Driver;
import com.cybertek.base.VytrackPageBase;
import org.openqa.selenium.support.PageFactory;

public class VehiclesPage extends VytrackPageBase {
    public VehiclesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

}