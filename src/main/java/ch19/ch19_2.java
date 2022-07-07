package ch19;

public class ch19_2 {
    private static class 계산기{
        int 더하기(int a,int b){

            return a+b;
        }
        int 더하기(int a,int b,int c){
           return a+b+c;
        }
        double 더하기(double a,int b,int c){
            return a+b+c;
        }
    }
    public static void main(String[] args) {
        계산기 a계산기 = new 계산기();

        System.out.println(a계산기.더하기(10, 20));
        // 출력 : 30

        System.out.println(a계산기.더하기(10, 20, 30));
        // 출력 : 60

        System.out.println(a계산기.더하기(10.5, 20, 30));
        // 출력 : 60.5
    }
}
