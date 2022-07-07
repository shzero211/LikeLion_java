package ch14;

public class ch14_4 {
    private static class 사람 {
        팔 a왼팔;
        사람(){
            a왼팔=new 팔(100);
        }
        void 걷다() {
            System.out.println("사람 걷는다.");
        }
    }
    private static  class  팔{
        int 길이;
        팔(int a){
            길이=a;
        }

    }
    public static void main(String[] args) {
        new 사람().걷다();

        System.out.println(new 사람().a왼팔.길이 + "cm");
        // 출력 : 100cm
    }
}

