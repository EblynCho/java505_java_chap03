public class Account {
    private long balance;

    public Account() {}

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) throws BalanceInsufficientException {
        if (balance < money) {
//            예외 처리가 없을 경우
//            System.out.println("출금 금액이 총 예금 금액보다 큽니다.");

//            사용자 정의 예외를 사용함
            throw new BalanceInsufficientException("잔고 부족 : " + (money - balance) + " 모자람");  // 강제 예외 발생
        }
        balance -= money;
    }

//    throws 하지 않으면 try ~ catch
//    public void withdraw(int money) {
//        try {
//            if (balance < money) {
//                throw new BalanceInsufficientException("잔고 부족 : " + (money - balance) + " 모자람");  // 강제 예외 발생
//            }
//        }
//        catch (Exception e) {
//
//        }
//        balance -= money;
//    }
}
