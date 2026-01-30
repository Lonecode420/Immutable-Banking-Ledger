import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

public final class Account {

    private final String accountNumber;
    private final BigDecimal balance;
    private final List<Transaction> transactions;

    public Account(String accountNumber,
                   BigDecimal balance,
                   List<Transaction> transactions) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactions = List.copyOf(transactions);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return Collections.unmodifiableList(transactions);
    }
}
