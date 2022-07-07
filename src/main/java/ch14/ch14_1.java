package ch14;

public class ch14_1 {
    private static abstract class 캐릭터{
        abstract void 공격();
    }
    private static class 전사 extends 캐릭터 {
        void 공격(){
            System.out.println("전사가 대검으로 공격합니다");
        }
    }
    private static class 마법사 extends 캐릭터{
        void 공격(){
            System.out.println("마법사가 파이어볼로 공격합니다");
        }
    }
    public static void main(String[] args) {
        캐릭터 a플레이어_캐릭터;

        a플레이어_캐릭터 = new 전사();
        a플레이어_캐릭터.공격();
        // 출력 : 전사가 대검으로 공격합니다.

        a플레이어_캐릭터 = new 마법사();
        a플레이어_캐릭터.공격();
        // 출력 : 마법사가 파이어볼로 공격합니다.
    }

}
