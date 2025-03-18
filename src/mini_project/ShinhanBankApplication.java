package mini_project;

import java.util.*;

public class ShinhanBankApplication {
  public static void main(String[] args) {
    Map<String, Account> accountMap = new HashMap<>();
    Map<Account,  List<Transaction>> transactionMap = new HashMap<>();
    Map<String, BankClerk> clerkMap = new HashMap<>();
    Map<String, Client> clientMap = new HashMap<>();

    BankClerk bankClerk = new BankClerk(BankCode.신한, "240101", "이신한");
    clerkMap.put("240101", bankClerk);
    Client client = null;
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    String randomAccNo = "";
    String clientNo = "";
    String clientName = "";
    String passwd1 = "";
    String passwd2 = "";
    long balance = 0L;
    Account account = null;
    Transaction transaction = null;

    String monitor = """
        -------------------------------------------
        1.계좌개설 2.입금 3.출금 4.조회 5.계좌해지 0.종료
        -------------------------------------------
        """;
    System.out.print("원하시는 업무를 선택해 주세요");
    System.out.println(monitor);
    String menu = in.nextLine();
    if (menu.equals("1")) {
      //입력 > 계좌개설
      System.out.println("고객정보를 입력하세요");
      System.out.print("\n 고객번호 입력 (생년월일) : ");
      clientNo = in.nextLine();
      if (clientNo != null && clientNo.length() == 6 && clientNo.chars().allMatch(Character::isDigit)) {
        client = clientMap.get(clientNo);
        if (client == null) { //신규고객
          System.out.print("고객명 입력 : ");
          clientName = in.nextLine();
          client = new Client(BankCode.신한, clientNo, clientName); //고객 생성
          clientMap.put(clientNo, client);
        } else { //기존고객

        }

        while (true) {
          //계좌번호는 랜덤하게 생성 기존에 없는 코드임을 확인하고 계좌생성하기
          //기존에 존재하는 코드이면 다시 랜덤하게 생성하기
          randomAccNo = String.valueOf(random.nextInt(5) + 1);
          if (accountMap.get(randomAccNo) == null) {
            break;
          } else {
            continue;
          }
        }
      }
      //입력 > 고객 정보
      //처리 > 계좌 개설   Account 생성, Client 생성
      System.out.print("계좌개설시 입금하실 금액을 입력하세요 > ");
      balance = Long.parseLong(in.nextLine());
      account = new Account(BankCode.신한, randomAccNo, client, balance);
      accountMap.put(randomAccNo, account);
      while (true) { // 비밀번호 입력을 정상적으로 했을 때 빠져나오게 하기, 오류 있으면 다시 입력받기
        System.out.print("사용하실 비밀번호를 숫자 4자리로 입력해주세요 > ");
        passwd1 = in.nextLine();// 입력 --> 비밀 번호
        System.out.print("비밀번호 확인 (숫자 4자리) > ");
        passwd2 = in.nextLine();
        if (passwd1 != null && passwd2 != null &&
            passwd1.length() == 4 && passwd2.length() == 4 &&
            passwd1.chars().allMatch(Character::isDigit) && passwd2.chars().allMatch(Character::isDigit) &&
            passwd1.equals(passwd2)) {
          account.password  = passwd1;
          break;
        } else {
          System.out.println("입력된 암호가 바르지 않습니다. 다시 입력해주세요.");
          continue;
        }
      }
      // 처리 --> 계좌 개설 완료 / Transaction , Account
      transaction = new Transaction(BankCode.신한, account, TransactionCode.개설, balance, bankClerk);
      transaction.trStatus = TransactionStatus.정상;
      List<Transaction> trList = new LinkedList<>();
      trList.add(transaction);
      transactionMap.put(account, trList);
      System.out.println("계좌개설이 완료되었습니다.");
      System.out.println(client);
      System.out.println(account);
      System.out.println(bankClerk);
      System.out.println(trList.get(0));
    } else if (menu.equals("0")) {
      System.out.println("은행 업무를 종료합니다.");
      return;
    } // end of menu select
  } // end of method (main)
} // end of class