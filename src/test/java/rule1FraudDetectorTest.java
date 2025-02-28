import org.example.rule1FraudDetector;
import org.example.Trader;
import org.example.Transaction;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class rule1FraudDetectorTest {
    private rule1FraudDetector fraudDetector = new rule1FraudDetector();

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
    public void givenName_whenIsFraud_thenFalse(){
        //given
        Trader trader = new Trader("Aksk", "Minsk", "Belarus");
        Transaction transaction = new Transaction(trader, 3);
        //when
        boolean result = fraudDetector.isFraud(transaction);
        //then
        assertFalse(result);
    }
}
