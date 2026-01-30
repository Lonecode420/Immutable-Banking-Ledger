# 🏦 Immutable Banking Ledger (Java)

A simple **Java project demonstrating immutability** using a banking ledger system.
Every account and transaction is **immutable**, meaning once created, its state cannot be changed. This approach ensures **thread safety**, **predictable behavior**, and aligns with **enterprise design principles**.

---

## 🌟 Features

* **Immutable Account Objects** – Account balances and transactions are never modified in place.
* **Immutable Transactions** – Each transaction object is final and timestamped.
* **Thread-safe by design** – No synchronization needed. Immutable objects can safely be shared across threads.
* **Functional-style state transitions** – Deposits and withdrawals create **new account snapshots**.
* Demonstrates **defensive copying** for collections.

---

## 🛠 Technologies Used

* Java 17
* BigDecimal for precise financial calculations
* Standard Java Collections (`List`)
* Object-oriented principles & immutability

---

## 📁 Project Structure

```
projectA/
 ├── Account.java
 ├── BankService.java
 ├── Transaction.java
 ├── TransactionType.java
 └── Main.java
```

---

## 💡 How It Works

1. **Create an Account**

```java
Account account = new Account("ACC-001", BigDecimal.ZERO, List.of());
```

2. **Deposit**

```java
BankService bankService = new BankService();
Account afterDeposit = bankService.deposit(account, BigDecimal.valueOf(1000));
```

3. **Withdraw**

```java
Account afterWithdrawal = bankService.withdraw(afterDeposit, BigDecimal.valueOf(300));
```

4. **Original account remains unchanged**

```java
System.out.println(account.getBalance()); // 0
System.out.println(afterDeposit.getBalance()); // 1000
System.out.println(afterWithdrawal.getBalance()); // 700
```

> Every operation returns a **new Account object**, demonstrating immutability.

---

## ✅ Benefits of Immutability

* **Thread safety**: Safe to share objects across multiple threads.
* **Predictable behavior**: Functions are pure; same input always produces same output.
* **Safer collections**: Immutable objects can be safely used as keys in maps or elements in sets.
* **Functional programming friendly**: Easy to reason about and debug.

---

## 🚀 How to Run

1. Clone or download the project.
2. Open a terminal in the project folder.
3. Compile all files:

```bash
javac *.java
```

4. Run the main program:

```bash
java Main
```

5. You should see output like:

```
Original balance: 0
After deposit: 1000
After withdrawal: 700
```

---

## 📝 License

This project is open-source and free to use for learning purposes.

