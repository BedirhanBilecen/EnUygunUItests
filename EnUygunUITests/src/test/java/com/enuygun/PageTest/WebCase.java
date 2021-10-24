package com.enuygun.PageTest;

import com.enuygun.PageModel.PageModel;
import com.enuygun.TestBase.BaseDriver;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;

public class WebCase extends BaseDriver {
    PageModel pageModel = new PageModel(getWebDriver());

    @Step({"EnUygun sayfasi acilir"})
    public void navigateToEnUygun() {
        driver.navigate().to("https://www.enuygun.com/");
    }
    @Step({"Nereden kismina tiklanir"})
    public void clickFromButton1() {
        pageModel.clickFromButton();}

    @Step({"Populer sehirlerden Istanbul secilir"})
    public void clickIstanbulButton() {
        pageModel.clickIstanbulButton();}

    @Step({"Nereye kismina tiklanir"})
    public void clickToButton() {
        pageModel.clickToButton();}

    @Step({"Populer sehirlerden Bodrum secilir"})
    public void clickBodrumButton() {
        pageModel.clickBodrumButton();}

    @Step({"Gidis tarihi kismina tiklanir"})
    public void clickDepartureDateButton() {
        pageModel.clickDepartureDateButton();}

    @Step({"Acilan takvimde gidis tarihi secilir"})
    public void clickCalendarButton() {
        pageModel.clickCalendarButton();}

    @Step({"Bilet bul butonuna tiklanir"})
    public void clickSearchFlightButton() {
        pageModel.clickSearchFlightButton();}

    @Step({"Sec butonuna tiklanir"})
    public void clickChooseButton() {
        pageModel.clickChooseButton();}

    @Step({"E posta adresi <email> yazılır"})
    public void setEmail(String email) {
        pageModel.setEmail(email);}

    @Step({"Cep telefonunuz <gsm> yazılır"})
    public void setGSM(String gsm) {
        pageModel.setGSM(gsm);}

    @Step({"Ad <name> doldurulur"})
    public void setName(String name) {
        pageModel.setName(name);}

    @Step({"Soyad <lastname> doldurulur"})
    public void setLastName(String lastName) {
        pageModel.setLastName(lastName);}

    @Step({"Doğum tarihi <day> <month> <year> girilir"})
    public void setBirthDate(String day, String month, String year) {
        pageModel.setBirthDateDay(day);
        pageModel.setBirthDateMonth(month);
        pageModel.setBirthDateYear(year);}

    @Step({"Tc Kimlik No <tckn> girilir"})
    public void setTckn(String tckn) {
        pageModel.setTckn(tckn);}

    @Step({"Cinsiyet erkek seçilir"})
    public void clickGenderButton() {
        pageModel.clickGenderButton();}

    @Step({"HES Kodu <health> girilir"})
    public void setHealth(String health) {
        pageModel.setHealth(health);}

    @Step({"Standart destek butonuna tıklanır"})
    public void clickStandartButton() {
        pageModel.clickStandartButton();}

    @Step({"Ödeme butonuna tıklanır"})
    public void clickPaymentButton() {
        pageModel.clickPaymentButton();}

    @Step({"Ad alanı kontrol edilir"})
    public void checkRezName() {
       String rezName = pageModel.getRezName();
        Assert.assertEquals(rezName , "Bedirhan");
    }


}



