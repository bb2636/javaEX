package mini_project;

import java.time.LocalDate;

public class Client {
  BankCode bankCode;
  String clientNo;
  String clientName;
  LocalDate openDate;
  LocalDate closeDate;

  public Client(BankCode bankCode, String clientNo, String clientName) {
    this.bankCode = bankCode;
    this.clientName = clientName;
    this.clientNo = clientNo;
  }
}
