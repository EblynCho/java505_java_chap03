public class TryWithResourceEx {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("file.txt")) {  // try 구문 안에서만 사용되는 객체
            fis.read();
            throw new Exception();  // 예외 강제 발생  // 이후 close() 자동 실행됨; AutoCloseable
        }
        catch (Exception e) {
            System.out.println("예외 처리 코드가 실행되었습니다.");
        }
    }
}
