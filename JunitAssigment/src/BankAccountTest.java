import static org.junit.Assert.assertThrows;

//import org.junit.jupiter.api.Test;
import org.junit.*;
import org.junit.Test;

public class BankAccountTest {
    @Test
    public void testWithdraw() {
        BankAccount bank = new BankAccount(20000);

        //bank.withdraw(21000);

        assertThrows(InsufficientFundsException.class, () -> {
            System.out.println("Please Provide Valid withdrawal amount");
            bank.withdraw(20000);
        });
    }
}
