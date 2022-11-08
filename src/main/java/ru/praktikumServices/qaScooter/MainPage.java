package ru.praktikumServices.qaScooter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainPage extends BaseSettings {

    private final String url = "https://qa-scooter.praktikum-services.ru/";

    private final By acceptCookiesButton = By.xpath("//*[@id=\"rcc-confirm-button\"]");
    //кнопка заказать в вверху стр
    private final By orderButtonInHeader = By.xpath("//*[@id=\"root\"]/div/div/div[1]/div[2]/button[1]");
    //кнопка заказать в контекте
    private final By orderButtonInContent = By.cssSelector("#root > div > div > div.Home_ThirdPart__LSTEE > div.Home_RoadMap__2tal_ > div.Home_FinishButton__1_cWm > button");
    //блок с вопросами
    private final By questionsBlock = By.className("Home_FourPart__1uthg");
    //первый вопрос
    private final By firstQuestion = By.xpath("//*[@id=\"accordion__heading-0\"]");

    //ответ на первый вопрос
    private final By answerOfFirstQuestion = By.xpath("//*[@id=\"accordion__panel-0\"]/p");
    //второй вопрос
    private final By secondQuestion = By.xpath("//*[@id=\"accordion__heading-1\"]");
    //ответ на второй вопрос
    private final By answerOfSecondQuestion = By.xpath("//*[@id=\"accordion__panel-1\"]/p");
    //третий вопрос
    private final By thirdQuestion = By.xpath("//*[@id=\"accordion__heading-2\"]");
    //ответ на третий вопрос
    private final By answerOfThirdQuestion = By.xpath("//*[@id=\"accordion__panel-2\"]/p");
    //четвертый вопрос
    private final By fourthQuestion = By.xpath("//*[@id=\"accordion__heading-3\"]");
    //ответ на четвертый вопрос
    private final By answerOfFourthQuestion = By.xpath("//*[@id=\"accordion__panel-3\"]/p");
    //пятый вопрос
    private final By fifthQuestion = By.xpath("//*[@id=\"accordion__heading-4\"]");
    //ответ на пятый вопрос
    private final By answerOfFifthQuestion = By.xpath("//*[@id=\"accordion__panel-4\"]/p");
    //шестой вопрос
    private final By sixthQuestion = By.xpath("//*[@id=\"accordion__heading-5\"]");
    //ответ на шестой вопрос
    private final By answerOfSixthQuestion = By.xpath("//*[@id=\"accordion__panel-5\"]/p");
    //седьмой вопрос
    private final By seventhQuestion = By.xpath("//*[@id=\"accordion__heading-6\"]");
    //ответ на седьмой вопрос
    private final By answerOfSeventhQuestion = By.xpath("//*[@id=\"accordion__panel-6\"]/p");
    //восьмой вопрос
    private final By eighthQuestion = By.xpath("//*[@id=\"accordion__heading-7\"]");
    //ответ на восьмой вопрос
    private final By answerOfEighthQuestion = By.xpath("//*[@id=\"accordion__panel-7\"]/p");
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void acceptCookies()
    {
        driver.findElement(acceptCookiesButton).click();
    }
    public void clickClickCreateOrderButtonInHeader() {
        driver.findElement(orderButtonInHeader).click();
    }
    public void clickClickCreateOrderButtonInContext() {
        driver.findElement(orderButtonInContent).click();

    }

    public void scrollToOrderButtonInContext()
    {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(orderButtonInContent));
    }
    public void scrollToQuestionBlock()
    {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(questionsBlock));
    }

    public void clickOnFirstQuestion()
    {
        driver.findElement(firstQuestion).click();
    }

    public String getFirstQuestion()
    {
        return driver.findElement(firstQuestion).getText();
    }
    public String getAnswerOfFirstQuestion()
    {
        return driver.findElement(answerOfFirstQuestion).getText();
    }
    public void clickOnSecondQuestion()
    {
        driver.findElement(secondQuestion).click();
    }

    public String getSecondQuestion()
    {
        return driver.findElement(secondQuestion).getText();
    }
    public String getAnswerOfSecondQuestion()
    {
        return driver.findElement(answerOfSecondQuestion).getText();
    }
    public void clickOnThirdQuestion()
    {
        driver.findElement(thirdQuestion).click();
    }
    public String getThirdQuestion()
    {
        return driver.findElement(thirdQuestion).getText();
    }
    public String getAnswerOfThirdQuestion()
    {
        return driver.findElement(answerOfThirdQuestion).getText();
    }
    public void clickOnFourthQuestion()
    {
        driver.findElement(fourthQuestion).click();
    }
    public String getFourthQuestion()
    {
        return driver.findElement(fourthQuestion).getText();
    }
    public String getAnswerOfFourthQuestion()
    {
        return driver.findElement(answerOfFourthQuestion).getText();
    }
    public void clickOnFifthQuestion()
    {
        driver.findElement(fifthQuestion).click();
    }
    public String getFifthQuestion()
    {
        return driver.findElement(fifthQuestion).getText();
    }
    public String getAnswerOfFifthQuestion()
    {
        return driver.findElement(answerOfFifthQuestion).getText();
    }
    public void clickOnSixthQuestion()
    {
        driver.findElement(sixthQuestion).click();
    }
    public String getSixthQuestion()
    {
        return driver.findElement(sixthQuestion).getText();
    }
    public String getAnswerOfSixthQuestion()
    {
        return driver.findElement(answerOfSixthQuestion).getText();
    }
    public void clickOnSeventhQuestion()
    {
        driver.findElement(seventhQuestion).click();
    }
    public String getSeventhQuestion()
    {
        return driver.findElement(seventhQuestion).getText();
    }
    public String getAnswerOfSeventhQuestion()
    {
        return driver.findElement(answerOfSeventhQuestion).getText();
    }
    public void clickOnEighthQuestion()
    {
        driver.findElement(eighthQuestion).click();
    }
    public String getEighthQuestion()
    {
        return driver.findElement(eighthQuestion).getText();
    }
    public String getAnswerOfEighthQuestion()
    {
        return driver.findElement(answerOfEighthQuestion).getText();
    }

}

