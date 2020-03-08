package pl.sda.mocking;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MarijuanaGoldWorthCalculatorTest {

    @Test
    void should() {
        //given
        GoldPriceRetriever goldPriceRetriever = () -> new BigDecimal("205.32");
        MarijuanaGoldWorthCalculator marijuanaGoldWorthCalculator = new MarijuanaGoldWorthCalculator(goldPriceRetriever);
        //when
        BigDecimal actual = marijuanaGoldWorthCalculator.ouncesPerKgOfGold();
        BigDecimal expected = new BigDecimal("0.83");
        //then
        assertEquals(expected,actual);
    }

    /*class FakeGoldPriceRetriever implements GoldPriceRetriever {

        @Override
        public BigDecimal fetchGoldPrice() {
            return new BigDecimal("205.32");
        }
    }*/

}
