package com.enuygun.PageModel;

import com.enuygun.TestBase.BasePage;
import org.openqa.selenium.WebDriver;

import static com.enuygun.PageModel.Constants.*;

public class PageModel extends BasePage {
    protected static WebDriver driver;

    public PageModel(WebDriver driver) {
        super(driver);
    }

    public PageModel() {
        super();
    }

    public void clickFromButton() {
        boolean a =isVisible(FROM_BUTTON);
        click(FROM_BUTTON);

    }

    public void clickIstanbulButton() {
        click(ISTANBUL_BUTTON);
    }

    public void clickToButton() {
        click(TO_BUTTON);
    }
    public void clickBodrumButton(){
        click(BODRUM_BUTTON);}

    public void clickDepartureDateButton(){
        click(DEPARTURE_DATE_BUTTON);}

    public void clickCalendarButton(){
        click(CALENDAR_BUTTON);}

    public void clickSearchFlightButton(){
        click(SEARCH_FLIGHT_BUTTON);}

    public void clickChooseButton(){
        click(CHOOSE_BUTTON);}

    public void setEmail(String email){
         sendKeys(CONTACT_EMAIL , email);}

    public void setGSM(String gsm){
        sendKeys(CONTACT_CELLPHONE , gsm);}

    public void setName(String name){
        sendKeys(NAME , name);}

    public void setLastName(String lastName){
        sendKeys(LAST_NAME , lastName);}

    public void setBirthDateDay(String birthDateDay){
        selectByValue(BIRTH_DATE_DAY , birthDateDay);}

    public void setBirthDateMonth(String birthDateMonth){
        selectByValue(BIRTH_DATE_MONTH , birthDateMonth);}

    public void setBirthDateYear(String birthDateYear){
        selectByValue(BIRTH_DATE_YEAR , birthDateYear);}

    public void setTckn(String tckn){
        sendKeys(TCKN , tckn);}

    public void clickGenderButton(){
        click(GENDER_BUTTON);}

    public void setHealth(String health){
        sendKeys(HEALTH_CODE , health);}

    public void clickStandartButton(){
        click(STANDART_BUTTON);}

    public void clickPaymentButton(){
        click(PAYMENT_BUTTON);}

    public String getRezName(){
        waitForSeconds(REZ_NAME);
        return getAttributeValue(REZ_NAME);}
}