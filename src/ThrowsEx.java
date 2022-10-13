public class ThrowsEx {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

//        throws 장점 : 예외처리 부분을 별도로 만들 수 있음
        try {
            cal.sum("10a", "20");
            cal.sub("10a", "20");
        }
        catch (Exception e) {
            System.out.println("실행 시 오류가 발생했습니다.");
        }

    }
}
