package ch36;

public class ch36_1 {
    private static class 계산기 {
        static int 나누다(int a, int b) {
            int rs = 0;
            rs=a/b;
            return rs;
        }
    }
    public static void main(String[] args) {
       try {
           int rs = 계산기.나누다(10, 0);
       }catch (ArithmeticException e){
           System.out.println("0으로 나눌수는 없습니다. ㅠㅠ");
       }catch (Exception e){
           System.out.println(e.getMessage());
           System.out.println("알수없는 에러가 발생하였습니다.");
       }

    }
}
