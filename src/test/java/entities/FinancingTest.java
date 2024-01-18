package entities;

import br.com.application.entities.Financing;
import factories.FinancingFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FinancingTest {
    @Test
    void shouldCreateFinancingWithCorrectData(){
        Financing financing = FinancingFactory.makeFinancing();
        Assertions.assertEquals(100000.00, financing.getTotalAmount());
        Assertions.assertEquals(2000.00, financing.getIncome());
        Assertions.assertEquals(80, financing.getMonths());
    }
    @Test
    void shouldThrowAnExceptionIfInvalidDataIsProvided(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = FinancingFactory.makeFinancingWithParams(100000.00, 2000.00, 20);
        });
    }
    @Test
     void shouldSetTotalAmountUpdateAmountWhenAValidAmountIsProvided(){
        double expectedTotalAmount = 100000.00;
        Financing financing = FinancingFactory.makeFinancing();
        financing.setTotalAmount(100000.00);
        Assertions.assertEquals(expectedTotalAmount, financing.getTotalAmount());
    }

    @Test
    void shouldSetAmountThrowExceptionWhenAnInvalidDataIsProvided(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = FinancingFactory.makeFinancing();
            financing.setTotalAmount(10000000.00);
        });
    }
    @Test
    void shouldSetIncomeUpdateIncomeWhenAValidIncomeIsProvided(){
        double expectedIncome = 40000.00;
        Financing financing = FinancingFactory.makeFinancing();
        financing.setIncome(40000.00);
        Assertions.assertEquals(expectedIncome, financing.getIncome());
    }

    @Test
    void shouldThrowsAnExceptionWhenAInvalidIncomeIsProvided(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = FinancingFactory.makeFinancing();
            financing.setIncome(1000.00);
        });
    }
    @Test
    void shouldSetMonthsWhenAValidMonthIsProvided(){
        int expectedMonth = 180;
        Financing financing = FinancingFactory.makeFinancing();
        financing.setMonths(180);
        Assertions.assertEquals(expectedMonth, financing.getMonths());
    }
    @Test
    void shouldSetMonthThrowAnExceptionWhenAnInvalidValueIsProvided(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Financing financing = FinancingFactory.makeFinancing();
            financing.setMonths(4);
        });
    }
    @Test
    void shouldEntryReturnAValidValueWhenIsCalled(){
        double expectedValue = 20000.0;
        Financing financing = FinancingFactory.makeFinancing();
        Assertions.assertEquals(expectedValue, financing.entry());
    }

    @Test
    void shouldQuotaReturnAValidValueWhenIsCalled(){
        double expectedValue = 1000.00;
        Financing financing = FinancingFactory.makeFinancing();
        Assertions.assertEquals(expectedValue, financing.quota());
    }


}
