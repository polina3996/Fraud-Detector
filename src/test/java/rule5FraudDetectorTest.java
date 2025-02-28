import org.example.Trader;
import org.example.Transaction;
import org.example.rule1FraudDetector;
import org.example.rule5FraudDetector;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class rule5FraudDetectorTest {
    private rule5FraudDetector fraudDetector = new rule5FraudDetector();
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

    @Test
    public void givenCountryAndName_whenIsFraud_thenFalse(){
        //given
        Trader trader = new Trader("Aksk", "Minsk", "Belarus");
        Transaction transaction = new Transaction(trader, 3);
        //when
        boolean result = fraudDetector.isFraud(transaction);
        //then
        assertFalse(result);
    }
}
