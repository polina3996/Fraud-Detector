import org.example.FraudDetector;
import org.example.Trader;
import org.example.Transaction;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class FraudDetectorTest {
    private FraudDetector fraudDetector = new FraudDetector();

    @Test
    public void givenNameAndCityAndAmountAndCountry_whenIsFraud_thenFalse(){
        //given
        Trader trader = new Trader("Aksk", "Minsk", "Belarus");
        Transaction transaction = new Transaction(trader, 3);
        //when
        boolean result = fraudDetector.isFraud(transaction);
        //then
        assertFalse(result);
    }

    @Test
    public void givenWrongName_whenIsFraud_thenTrue(){
        //given
        Trader trader = new Trader("Pokemon", "Minsk", "Belarus");
        Transaction transaction = new Transaction(trader, 3);
        //when
        boolean result = fraudDetector.isFraud(transaction);
        //then
        assertTrue(result);
    }


    @Test
    public void givenWrongAmount_whenIsFraud_thenTrue(){
        //given
        Trader trader = new Trader("Aksk", "Minsk", "Belarus");
        Transaction transaction = new Transaction(trader, 1000002);
        //when
        boolean result = fraudDetector.isFraud(transaction);
        //then
        assertTrue(result);
    }

    @Test
    public void givenWrongCity_whenIsFraud_thenTrue(){
        //given
        Trader trader = new Trader("Aksk", "Synney", "Belarus");
        Transaction transaction = new Transaction(trader, 3);
        //when
        boolean result = fraudDetector.isFraud(transaction);
        //then
        assertTrue(result);
    }

    @Test
    public void givenWrongCountry_whenIsFraud_thenTrue(){
        //given
        Trader trader = new Trader("Aksk", "Minsk", "Jamaica");
        Transaction transaction = new Transaction(trader, 3);
        //when
        boolean result = fraudDetector.isFraud(transaction);
        //then
        assertTrue(result);
    }

    @Test
    public void givenWrongCountryCorrectAmount_whenIsFraud_thenFalse(){
        //given
        Trader trader = new Trader("Aksk", "Minsk", "Germany");
        Transaction transaction = new Transaction(trader, 3);
        //when
        boolean result = fraudDetector.isFraud(transaction);
        //then
        assertFalse(result);
    }

    @Test
    public void givenWrongAmountCorrectCountry_whenIsFraud_thenFalse(){
        //given
        Trader trader = new Trader("Aksk", "Minsk", "Belarus");
        Transaction transaction = new Transaction(trader, 1001);
        //when
        boolean result = fraudDetector.isFraud(transaction);
        //then
        assertFalse(result);
    }

    @Test
    public void givenWrongCountryAndAmount_whenIsFraud_thenTrue(){
        //given
        Trader trader = new Trader("Pokemon", "Minsk", "Germany");
        Transaction transaction = new Transaction(trader, 1001);
        //when
        boolean result = fraudDetector.isFraud(transaction);
        //then
        assertTrue(result);
    }




}
