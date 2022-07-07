package ch15;

public class ch15_5 {

    private static class 계산기{
        static int sum=0;
        static int get_n부터_m까지의_수_중에서_3의배수의_합(int a,int b){
        for(int i=a;i<=b;i++){
            if(i%3==0){
                sum+=i;
            }
        }
            return sum;
        }
    }
    public static void main(String[] args) {
        int 결과 = 계산기.get_n부터_m까지의_수_중에서_3의배수의_합(30, 400);

        System.out.println(결과);
        // 출력 => ???
    }
}
