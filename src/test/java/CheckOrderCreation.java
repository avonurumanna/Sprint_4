import org.hamcrest.MatcherAssert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.praktikumServices.qaScooter.OrderPage;

import static org.hamcrest.CoreMatchers.containsString;
@RunWith(Parameterized.class)
public class CheckOrderCreation extends BaseUISettings {

    private final String name;
    private final String surname;
    private final String address;
    private final String phoneNumber;
    private final String expectedResult;

    public CheckOrderCreation(String name, String surname, String address, String phoneNumber, String expectedResult) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getOrderData() {
        return new Object[][] {
                { "Алексей", "Петров", "Москва ул. Октябрьская д.15 кв. 16","89675054123","Заказ оформлен" },
                { "Иван", "Иванов", "Саратов ул. Октябрьская д.15 кв. 16","89675050023","Заказ оформлен" },
        };
    }

    @Test
    public void createOrderOnlyMandatoryParametersExpectedOrderCreated()
    {
        mainPage.clickClickCreateOrderButtonInHeader();
        OrderPage orderPage = new OrderPage(driver);
        orderPage.fillName(name);
        orderPage.fillSurname(surname);
        orderPage.fillAddress(address);
        orderPage.setStation();
        orderPage.fillPhoneNumber(phoneNumber);
        orderPage.clickNextButton();
        orderPage.pickDateIsTomorrow();
        orderPage.selectRentalPeriod();
        orderPage.clickOrderButton();
        orderPage.confirmOrder();
        MatcherAssert.assertThat(orderPage.getOrderStatusHeader(), containsString(expectedResult));
    }
    @Test
    public void createOrderWithOptionalParametersExpectedOrderCreated()
    {
        mainPage.clickClickCreateOrderButtonInContext();
        OrderPage orderPage = new OrderPage(driver);
        orderPage.fillName(name);
        orderPage.fillSurname(surname);
        orderPage.fillAddress(address);
        orderPage.setStation();
        orderPage.fillPhoneNumber(phoneNumber);
        orderPage.clickNextButton();
        orderPage.pickDateIsTomorrow();
        orderPage.selectRentalPeriod();
        orderPage.setBlackColour();
        orderPage.setGrayColour();
        orderPage.fillComment("Test");
        orderPage.clickOrderButton();
        orderPage.confirmOrder();
        MatcherAssert.assertThat(orderPage.getOrderStatusHeader(), containsString(expectedResult));
    }

}