import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Account account = new Account(
                "ACC-001",
                BigDecimal.ZERO,
                List.of()
        );

        BankService bankService = new BankService();

        Account afterDeposit = bankService.deposit(account, BigDecimal.valueOf(1000));
        Account afterWithdrawal = bankService.withdraw(afterDeposit, BigDecimal.valueOf(300));

        System.out.println("Original balance: " + account.getBalance());
        System.out.println("After deposit: " + afterDeposit.getBalance());
        System.out.println("After withdrawal: " + afterWithdrawal.getBalance());
    }
}
