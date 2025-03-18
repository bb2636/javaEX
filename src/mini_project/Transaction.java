package mini_project;


import java.time.LocalDateTime;

public class Transaction {
  BankCode bankCode;
  Account account;
  TransactionCode trCode;
  LocalDateTime transactionDate;
  long transactionAmount;
  BankClerk clerk;
  TransactionStatus trStatus;

  public Transaction(BankCode bankCode, Account account, TransactionCode trCode, long transactionAmount, BankClerk clerk) {
    this.bankCode = bankCode;
    this.account = account;
    this.trCode = trCode;
    this.transactionAmount = transactionAmount;
    this.clerk = clerk;
  }

  @Override
  public String toString() {
    return "Transaction{" +
        "trCode=" + trCode +
        ", transactionDate=" + transactionDate +
        ", transactionAmount=" + transactionAmount +
        ", trStatus=" + trStatus +
        '}';
  }
}
