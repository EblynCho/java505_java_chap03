public class BalanceInsufficientException extends Exception {
    public BalanceInsufficientException() {}

    public BalanceInsufficientException(String message) {
        super(message);  // 부모 클래스의 생성자 호출
    }
}
