package ch15;

public class ch15_2 {
    private static class 전사{
        String 무기;
        전사(){
            무기="칼";
        }
        void 공격(){
            System.out.println(무기+"(으)로 공격합니다.");
        }
        void 창_모드로_변경(){
            무기="창";
        }
        void 지팡이_모드로_변경(){
            무기="지팡이";
        }
    }
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.공격();
        // 칼로 공격합니다.

        a전사.창_모드로_변경();

        a전사.공격();
        // 창으로 공격합니다.

        a전사.지팡이_모드로_변경();

        a전사.공격();
        // 지팡이로 공격합니다.
    }
}
