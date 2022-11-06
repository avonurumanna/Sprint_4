import org.hamcrest.MatcherAssert;
import org.junit.Test;
import ru.praktikumServices.qaScooter.OrderPage;

import static org.hamcrest.CoreMatchers.containsString;

public class CheckOrderCreation extends BaseUISettings {

    @Test
    public void CreateOrderWithoutOptionalParametersExpectedOrderCreated()
    {
        mainPage.clickClickCreateOrderButtonInHeader();
        OrderPage orderPage = new OrderPage(driver);
        orderPage.fillName("Алексей");
        orderPage.fillSurname("Петров");
        orderPage.fillAddress("Москва ул. Октябрьская д.15 кв. 16");
        orderPage.setStation();
        orderPage.fillPhoneNumber("89675054123");
        orderPage.clickNextButton();
        orderPage.pickDateIsTomorrow();
        orderPage.selectRentalPeriod();
        orderPage.clickOrderButton();
        orderPage.confirmOrder();
        MatcherAssert.assertThat(orderPage.getOrderStatusHeader(), containsString("Заказ оформлен"));
    }
    @Test
    public void CreateOrderOnlyMandatoryParametersExpectedOrderCreated1()
    {
        mainPage.clickClickCreateOrderButtonInHeader();
        OrderPage orderPage = new OrderPage(driver);
        orderPage.fillName("Иван");
        orderPage.fillSurname("Иванов");
        orderPage.fillAddress("Саратов ул. Октябрьская д.15 кв. 16");
        orderPage.setStation();
        orderPage.fillPhoneNumber("89675050023");
        orderPage.clickNextButton();
        orderPage.pickDateIsTomorrow();
        orderPage.selectRentalPeriod();
        orderPage.setBlackColour();
        orderPage.setGrayColour();
        orderPage.fillComment("Test");
        orderPage.clickOrderButton();
        orderPage.confirmOrder();
        MatcherAssert.assertThat(orderPage.getOrderStatusHeader(), containsString("Заказ оформлен"));
    }

    @Test
    public void CreateOrderByButtonInContentExpectedOrderCreated()
    {
        mainPage.scrollToOrderButtonInContext();
        mainPage.clickClickCreateOrderButtonInContext();
        OrderPage orderPage = new OrderPage(driver);
        orderPage.fillName("Петр");
        orderPage.fillSurname("Алексеев");
        orderPage.fillAddress("Псков ул. Октябрьская д.15 кв. 16");
        orderPage.setStation();
        orderPage.fillPhoneNumber("89674444123");
        orderPage.clickNextButton();
        orderPage.pickDateIsAfterTomorrow();
        orderPage.selectRentalPeriod();
        orderPage.clickOrderButton();
        orderPage.confirmOrder();
        MatcherAssert.assertThat(orderPage.getOrderStatusHeader(), containsString("Заказ оформлен"));


    }



}