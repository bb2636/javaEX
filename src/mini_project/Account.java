package mini_project;

import java.time.LocalDate;


public class Account {
  BankCode bankCode; //은행코드
  String accountNo; //계좌번호
  Client client; //고객번호
  String password; //비밀번호
  LocalDate openDate; //계좌개설일자
  LocalDate cancelDate; //계좌해지일자
  boolean dorment;  //휴면계좌여부
  long balance; //잔고

  public Account(BankCode bankCode, String accountNo,
                 Client client, long balance) {
    this.bankCode = bankCode; this.accountNo = accountNo;
    this.client = client; this.balance = balance;
    this.openDate = LocalDate.now();
  }

  public void deposit(long money) { //입금

  }
  public void withdraw(long money) { //출금

  }
  public long inquiry() { //잔고조회
      return balance;
  }
  public void cancel() { //계좌해지

  }

  @Override
  public String toString() {
    return "Account{" +
        "bankCode=" + bankCode +
        ", accountNo='" + accountNo + '\'' +
        ", clientName=" + client.clientName +
        ", openDate=" + openDate +
        '}';
  }
}
