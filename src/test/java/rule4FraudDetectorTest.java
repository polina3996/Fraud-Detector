import org.example.Trader;
import org.example.Transaction;
import org.example.rule1FraudDetector;
import org.example.rule4FraudDetector;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class rule4FraudDetectorTest {
    private rule4FraudDetector fraudDetector = new rule4FraudDetector();
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
    public void givenCountry_whenIsFraud_thenFalse(){
        //given
        Trader trader = new Trader("Aksk", "Minsk", "Belarus");
        Transaction transaction = new Transaction(trader, 3);
        //when
        boolean result = fraudDetector.isFraud(transaction);
        //then
        assertFalse(result);
    }
}
