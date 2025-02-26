import org.example.FraudDetector;
import org.example.Trader;
import org.example.Transaction;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class FraudDetectorTest {
    private FraudDetector fraudDetector;
    @BeforeEach
    void setUp(){
        fraudDetector = new FraudDetector();
    }
    @Test
    public void givenName_whenIsFraud_thenTrue(){
        //given
        Trader trader = new Trader("Pokemon", "Minsk");
        Transaction transaction = new Transaction(trader, 3);
        //when
        boolean result = fraudDetector.isFraud(transaction);
        //then
        assertTrue(result);
    }

    @Test
    public void givenName_whenIsFraud_thenFalse(){
        //given
        Trader trader = new Trader("Aksk", "Minsk");
        Transaction transaction = new Transaction(trader, 3);
        //when
        boolean result = fraudDetector.isFraud(transaction);
        //then
        assertFalse(result);
    }

}
