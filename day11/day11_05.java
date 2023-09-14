package day11;

public class day11_05 {
    public static void main(String[] args) {

        //BankAccount 클래스를 정의하세요. 이 클래스는 다음 속성을 가지고 있어야 합니다.

        // 계좌 번호 (accountNumber)
        // 예금주 이름 (ownerName)
        // 현재 잔액 (balance)

        // BankAccount 클래스에 다음과 같은 메서드를 추가하세요.

        // 1. deposit(double amount): 예금을 추가하는 메서드. 잔액에 지정된 양을 추가합니다.
        // 2. withdraw(double amount): 출금을 수행하는 메서드. 출금할 금액이 잔액보다 작거나 같아야 합니다.
        // 3. getBalance(): 현재 잔액을 반환하는 메서드.
        // 4. printInfo(): 계좌 정보를 출력하는 메서드.

        // 프로그램에서 적어도 두 개의 계좌 객체를 생성하고, 각 계좌에 예금 및 출금을 수행한 후
        // printInfo() 메서드를 사용하여 계좌 정보를 출력하세요.

        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();

        b1.accountNumber = "302-123-456";
        b1.ownerName = "정다희";
        b1.balance = 30000;

        b2.accountNumber = "302-321-654";
        b2.ownerName = "김주현";
        b2.balance = 50000;

        b1.printInfo();
        b1.deposit(5000);
        b1.withdraw(3000);

        b2.printInfo();
        b2.deposit(10000);
        b2.withdraw(5000);
    }
}

class BankAccount {

    String accountNumber;
    String ownerName;
    int balance;

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(ownerName + "님 계좌에 " + amount + "원을 입금했습니다.");
        }
        else {
            System.out.println("입금 금액이 유효하지 않습니다.");
        }
    }

    void withdraw(double amount) {
        if (amount < 0) {
            balance -= amount;
            System.out.println(ownerName + "님의 계좌에서 " + amount + "원을 출금했습니다.");
        }
        else {
            System.out.println("출금 금액이 유효하지 않거나 잔액이 부족합니다.");
        }
    }

    double getBalance() {
        return balance;
    }

    void printInfo() {
        System.out.println("계좌번호 : " + accountNumber + ", 예금주 : " + ownerName + ", 잔액 : " + balance);
    }
}

// 1. deposit(double amount): 예금을 추가하는 메서드. 잔액에 지정된 양을 추가합니다.
// 2. withdraw(double amount): 출금을 수행하는 메서드. 출금할 금액이 잔액보다 작거나 같아야 합니다.
// 3. getBalance(): 현재 잔액을 반환하는 메서드.
// 4. printInfo(): 계좌 정보를 출력하는 메서드.