package com.vytrack.pages;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
    PageFactory.initElements(Driver.getDriver(),this);


}

    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    public WebElement nameOfTheEmployee;

    @FindBy(css = ".oro-subtitle")
    public WebElement pageName;

    @FindBy(className = "dropdown-toggle")
    public WebElement logOutDropDownMenu;

    @FindBy(xpath = "//a[@class='no-hash']")
    public WebElement logOutDropDownMenuLogOutSelection;

    @FindBy(xpath = "//*[@id='main-menu']/ul/li[2]")
    public WebElement fleetDropDownMenu;


    @FindBy(xpath = "//span[@class='title title-level-1'][contains(text(),'Customers')]")
    public WebElement customersDropDownMenu;


    @FindBy(xpath = "//span[contains(text(),'Accounts')]")
    public WebElement customersDropDownMenuAccountsSelection;

    @FindBy(xpath = "//span[contains(text(),'Contacts')]")
    public WebElement customersDropDownMenuContactsSelection;



    @FindBy(xpath = "//span[@class='title title-level-1'][contains(text(),'Fleet')]")
    public WebElement fleetDropDownMenuTruckDriver;


    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement fleetDropDownMenuVehiclesSelection;


    //
    @FindBy(xpath = "//span[contains(text(),'Vehicle Contracts')]")
    public WebElement vehicleContracts;




    @FindBy(xpath = "//span[@class='title title-level-1'][contains(text(),'Activities')]")
    public WebElement activitiesDropDownMenu;

    @FindBy(xpath = "//span[contains(text(),'Calendar Events')]")
    public WebElement activitiesDropDownMenuCalendarEventsSelection;

    @FindBy(xpath = " //span[contains(text(),'Calls')]")
    public WebElement activitiesDropDownMenuCallsSelection;


    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1 first']")
    public WebElement dashboardsDropDownMenu;

    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboardsDropDownMenuDashboardSelection;



    @FindBy(xpath = "//span[contains(.,'Sales')][@class='title title-level-1']")
    public WebElement salesDropDownMenu;


    @FindBy(xpath = "//span[@class='title title-level-2'][contains(text(),'Opportunities')]")
    public WebElement salesDropDownMenuOpportunities;


    @FindBy(xpath = "//div[contains(text(),'You do not have permission to perform this action.')]")
    public WebElement warningMessage;



}
