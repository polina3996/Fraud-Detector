import org.example.Trader;
import org.example.Transaction;
import org.example.rule1FraudDetector;
import org.example.rule2FraudDetector;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class rule2FraudDetectorTest {
    private rule2FraudDetector fraudDetector = new rule2FraudDetector();
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
    public void givenAmount_whenIsFraud_thenFalse(){
        //given
        Trader trader = new Trader("Aksk", "Minsk", "Belarus");
        Transaction transaction = new Transaction(trader, 3);
        //when
        boolean result = fraudDetector.isFraud(transaction);
        //then
        assertFalse(result);
    }
}
