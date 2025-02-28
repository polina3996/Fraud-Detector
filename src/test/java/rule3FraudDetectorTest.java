import org.example.Trader;
import org.example.Transaction;
import org.example.rule3FraudDetector;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class rule3FraudDetectorTest {
    private rule3FraudDetector fraudDetector = new rule3FraudDetector();
    @Test
    public void givenWrongCity_whenIsFraud_thenTrue(){
        //given
        Trader trader = new Trader("Aksk", "Sydney", "Belarus");
        Transaction transaction = new Transaction(trader, 3);
        //when
        boolean result = fraudDetector.isFraud(transaction);
        //then
        assertTrue(result);
    }

    @Test
    public void givenWrong2City_whenIsFraud_thenTrue(){
        //given
        Trader trader = new Trader("Aksk", "Milan", "Belarus");
        Transaction transaction = new Transaction(trader, 3);
        //when
        boolean result = fraudDetector.isFraud(transaction);
        //then
        assertTrue(result);
    }

    @Test
    public void givenCity_whenIsFraud_thenFalse(){
        //given
        Trader trader = new Trader("Aksk", "Minsk", "Belarus");
        Transaction transaction = new Transaction(trader, 3);
        //when
        boolean result = fraudDetector.isFraud(transaction);
        //then
        assertFalse(result);
    }
}
