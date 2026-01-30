import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankService {

    public Account deposit(Account account, BigDecimal amount) {
        List<Transaction> newTransactions = new ArrayList<>(account.getTransactions());
        newTransactions.add(new Transaction(TransactionType.DEPOSIT, amount));

        return new Account(
                account.getAccountNumber(),
                account.getBalance().add(amount),
                newTransactions
        );
    }

    public Account withdraw(Account account, BigDecimal amount) {
        if (account.getBalance().compareTo(amount) < 0) {
            throw new IllegalStateException("Insufficient funds");
        }

        List<Transaction> newTransactions = new ArrayList<>(account.getTransactions());
        newTransactions.add(new Transaction(TransactionType.WITHDRAWAL, amount));

        return new Account(
                account.getAccountNumber(),
                account.getBalance().subtract(amount),
                newTransactions
        );
    }
}
