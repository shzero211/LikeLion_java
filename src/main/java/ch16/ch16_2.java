package ch16;

public class ch16_2 {
    private static class 전사{
        무기 a무기;
        전사(){
            a무기=new 칼();
        }
        void 공격(){
            System.out.println(a무기.무기이름+"(으)로 공격합니다.");
            System.out.println("데미지:"+a무기.데미지);
        }
        void 창_모드로_변경(){
        a무기=new 창();
        }  void 지팡이_모드로_변경(){
        a무기=new 지팡이();
        }

    }
    private static class 무기{
        String 무기이름;
        int 데미지;
    }
    private static class 창 extends 무기{
    창(){
        무기이름="창";
        데미지=80;
    }
    }
    private static class 칼 extends 무기{
        칼(){
            무기이름="칼";
            데미지=78;
        }
    }
    private static class 지팡이 extends 무기{
        지팡이(){
            무기이름="지팡이";
            데미지=12;
        }
    }

    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.공격();
        // 칼(으)로 공격합니다.
        // 데미지 : 78

        a전사.창_모드로_변경();

        a전사.공격();
        // 창(으)로 공격합니다.
        // 데미지 : 80

        a전사.지팡이_모드로_변경();

        a전사.공격();
        // 지팡이(으)로 공격합니다.
        // 데미지 : 12
    }
}
