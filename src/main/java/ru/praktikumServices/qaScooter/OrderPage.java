package ru.praktikumServices.qaScooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage extends BaseSettings {

    //заголовок

    //имя
    private final By nameInput = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input");
    //фамилия
    private final By surnameInput = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input");
    //адрес
    private final By addressInput = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input");
    //станция метро
    private final By stationInput = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div/input"); //перепроверить
    //доступные станции
    private final By stationElement = By.xpath("//div[@class='select-search__select']/ul/li/button/div[2]");
    //телефон
    private final By phoneNumberInput = By.cssSelector("#root > div > div.Order_Content__bmtHS > div.Order_Form__17u6u > div:nth-child(5) > input");
    //кнопка далее
    private final By nextButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button");
    //дата
    private final By dateInput = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/input");
    private final By dateIsTomorrow = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[1]");
    private final By dateIsAfterTomorrow = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[2]");
    //срок аренды
    private final By rentalPeriodInput = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]");
    //срок аренды - сутки
    private final By rentalPeriodItem = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]");
    //цвет черный жемчуг
    private final By blackColourCheckbox = By.xpath("//*[@id=\"black\"]");
    //цвет серая безысходность
    private final By grayColourCheckbox = By.xpath("//*[@id=\"grey\"]");
    //комментарий
    private final By commentInput = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/input");
    //поп-ап подтверждения заказа
    private final By confirmationPopUp = By.xpath("//*[@id=\"root\"]/div/div[2]/div[5]");
    // кнопка "да"
    private final By yesButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[5]/div[2]/button[2]");
    //заказать
    private final By orderButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button[2]");
    //заголовок
    private final By orderStatusHeader = By.className("Order_ModalHeader__3FDaJ");
    //данные по заказу
    private final By orderStatusInformation = By.xpath("/html/body/div/div/div[2]/div[5]/div[1]/div");

    public OrderPage(WebDriver driver) {
        super(driver);
    }

    public void fillName(String name) {
        driver.findElement(nameInput).sendKeys(name);
    }

    public void fillSurname(String surname) {
        driver.findElement(surnameInput).sendKeys(surname);
    }

    public void fillAddress(String address) {
        driver.findElement(addressInput).sendKeys(address);
    }

    public void setStation() {
        driver.findElement(stationInput).click();
        driver.findElement(stationElement).click();

    }

    public void fillPhoneNumber(String phoneNumber) {
        driver.findElement(phoneNumberInput).sendKeys(phoneNumber);
    }

    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }

    public void pickDateIsTomorrow() {
        driver.findElement(dateInput).click();
        driver.findElement(dateIsTomorrow).click();
    }

    public void pickDateIsAfterTomorrow() {
        driver.findElement(dateInput).click();
        driver.findElement(dateIsAfterTomorrow).click();
    }

    public void selectRentalPeriod() {
        driver.findElement(rentalPeriodInput).click();
        driver.findElement(rentalPeriodItem).click();
    }

    public void clickOrderButton() {
        driver.findElement(orderButton).click();
    }

    public void confirmOrder() {
        driver.findElement(yesButton).click();
    }

    public void setBlackColour() {
        driver.findElement(blackColourCheckbox).click();
    }

    public void setGrayColour() {
        driver.findElement(grayColourCheckbox).click();
    }

    public void fillComment(String comment) {
        driver.findElement(commentInput).sendKeys(comment);
    }

    public String getOrderStatusHeader()
    {
        return driver.findElement(orderStatusHeader).getText();
    }

}
