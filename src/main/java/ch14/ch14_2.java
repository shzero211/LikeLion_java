package ch14;

public class ch14_2 {
    private static class 전사{
        int 나이;
        String 이름;
        String 성격;
        활 a무기;
       전사(){
           이름="no name";
       }
    }
    private static class 활 {
    }
    public static void main(String[] args) {
        전사 a전사0 = new 전사();
        a전사0.나이 = 20;
        a전사0.이름 = "칸";
        a전사0.성격 = "차가움";
        a전사0.a무기 = new 활();

        전사 a전사1 = new 전사();
        전사 a전사2 = new 전사();
        전사 a전사3 = new 전사();
        전사 a전사4 = new 전사();
        전사 a전사5 = new 전사();

        System.out.println(a전사0.이름);
        // 출력 : 칸
        System.out.println(a전사1.이름);
        // 출력 : No Name
        System.out.println(a전사2.이름);
        // 출력 : No Name
        System.out.println(a전사3.이름);
        // 출력 : No Name
        System.out.println(a전사4.이름);
        // 출력 : No Name
        System.out.println(a전사5.이름);
        // 출력 : No Name
    }


}
