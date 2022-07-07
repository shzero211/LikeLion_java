package ch16;

public class ch16_3 {
    private static class 전사{
        무기 a무기;
        void 공격(){
        a무기.사용();
        }
    }
    private static abstract class 무기{
        String 무기이름;
        int 데미지;
        void 사용(){
            System.out.println(무기이름+"(으)로 공격합니다.");
            System.out.println("데미지 : "+데미지);
        }
    }
    private static class 칼 extends 무기{
        칼(){
            무기이름="칼";
            데미지=78;
        }

    }
    private static class 창 extends 무기{
        창(){
            무기이름="창";
            데미지=80;
        }

    }
    private static class 지팡이 extends 무기{
        지팡이(){
            무기이름="지팡이";
            데미지=12;
        }

    }
    private static class 전설의_지팡이 extends 무기{
        전설의_지팡이(){
            무기이름="전설의지팡이";
            데미지=120;
        }

    }

    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.a무기 = new 칼();
        a전사.공격();

        a전사.a무기 = new 창();
        a전사.공격();

        a전사.a무기 = new 지팡이();
        a전사.공격();

        a전사.a무기 = new 전설의_지팡이();
        a전사.공격();
    }
}

