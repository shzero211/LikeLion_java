package ch15;

public class ch15_7 {
    private static abstract class 전사{
        String name;
    abstract void 공격();
    }
    private static class 홍길동 extends 전사{
        홍길동(){
            name="홍길동";
        }

        void 공격(){
            System.out.println(name+"이(가) 공격합니다.");
        }
    }
    private static class 홍길순 extends 전사{
        홍길순(){
            name="홍길순";
        }
        void 공격(){
            System.out.println(name+"이(가) 공격합니다.");
        }
    }
    public static void main(String[] args) {
        전사 a전사 = new 홍길동();

        a전사.공격();
        // 출력 => 홍길동이(가) 공격합니다.

        a전사 = new 홍길순();

        a전사.공격();
        // 출력 => 홍길순이(가) 공격합니다.
    }
}
