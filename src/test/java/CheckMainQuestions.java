import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckMainQuestions extends BaseUISettings {

    @Before
    public void scrollToQuestion()
    {
        mainPage.scrollToQuestionBlock();
    }

    @Test
    public void checkFirstAnswerExpectedAnswerIsCorrect()
    {
        mainPage.clickOnFirstQuestion();
        Assert.assertEquals("Сколько это стоит? И как оплатить?",mainPage.getFirstQuestion());
        Assert.assertEquals("Сутки — 400 рублей. Оплата курьеру — наличными или картой.",mainPage.getAnswerOfFirstQuestion());
    }
    @Test
    public void checkSecondAnswerExpectedAnswerIsCorrect()
    {
        mainPage.clickOnSecondQuestion();
        Assert.assertEquals("Хочу сразу несколько самокатов! Так можно?",mainPage.getSecondQuestion());
        Assert.assertEquals("Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",mainPage.getAnswerOfSecondQuestion());
    }
    @Test
    public void checkThirdAnswerExpectedAnswerIsCorrect()
    {
        mainPage.clickOnThirdQuestion();
        Assert.assertEquals("Как рассчитывается время аренды?",mainPage.getThirdQuestion());
        Assert.assertEquals("Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",mainPage.getAnswerOfThirdQuestion());
    }
    @Test
    public void checkFourthAnswerExpectedAnswerIsCorrect()
    {
        mainPage.clickOnFourthQuestion();
        Assert.assertEquals("Можно ли заказать самокат прямо на сегодня?",mainPage.getFourthQuestion());
        Assert.assertEquals("Только начиная с завтрашнего дня. Но скоро станем расторопнее.",mainPage.getAnswerOfFourthQuestion());
    }
    @Test
    public void checkFifthAnswerExpectedAnswerIsCorrect()
    {
        mainPage.clickOnFifthQuestion();
        Assert.assertEquals("Можно ли продлить заказ или вернуть самокат раньше?",mainPage.getFifthQuestion());
        Assert.assertEquals("Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",mainPage.getAnswerOfFifthQuestion());
    }
    @Test
    public void checkSixthAnswerExpectedAnswerIsCorrect()
    {
        mainPage.clickOnSixthQuestion();
        Assert.assertEquals("Вы привозите зарядку вместе с самокатом?",mainPage.getSixthQuestion());
        Assert.assertEquals("Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",mainPage.getAnswerOfSixthQuestion());
    }
    @Test
    public void checkSeventhAnswerExpectedAnswerIsCorrect()
    {
        mainPage.clickOnSeventhQuestion();
        Assert.assertEquals("Можно ли отменить заказ?",mainPage.getSeventhQuestion());
        Assert.assertEquals("Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",mainPage.getAnswerOfSeventhQuestion());
    }
    @Test
    public void checkEighthAnswerExpectedAnswerIsCorrect()
    {
        mainPage.clickOnEighthQuestion();
        Assert.assertEquals("Я жизу за МКАДом, привезёте?",mainPage.getEighthQuestion());
        Assert.assertEquals("Да, обязательно. Всем самокатов! И Москве, и Московской области.",mainPage.getAnswerOfEighthQuestion());
    }

}