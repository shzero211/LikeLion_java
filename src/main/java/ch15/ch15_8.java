package ch15;

public class ch15_8 {
    private static abstract class 전사{
    String 이름;
        무기 a무기;
    abstract void 공격();
    }
    private static  class 홍길동 extends 전사{
        홍길동(){
            이름="홍길동";
            a무기=new 칼();
        }

        @Override
        void 공격() {
            System.out.println(이름+"이(가)"+a무기.무기종류+"(으)로 공격합니다.");
        }
    }
    private static  class 홍길순 extends 전사 {
        홍길순(){
            이름="홍길순";
            a무기=new 칼();
        }

        @Override
        void 공격() {
            System.out.println(이름+"이(가)"+a무기.무기종류+"(으)로 공격합니다.");
        }
    }
    private static  abstract class 무기  {
    String 무기종류;
    }
    private static class 칼 extends 무기 {
        칼() {
            무기종류 = "칼";
        }
    }
        private static class 활 extends 무기 {
            활() {
                무기종류 = "활";
            }
        }

        private static class 창 extends 무기 {
            창() {
                무기종류 = "창";
            }
        }

        public static void main(String[] args) {
            전사 a전사 = new 홍길동();
            a전사.a무기 = new 활();

            a전사.공격();
            // 출력 => 홍길동이(가) 활(으)로 공격합니다.

            a전사 = new 홍길순();

            a전사.공격();
            // 출력 => 홍길순이(가) 칼(으)로 공격합니다.

            a전사.a무기 = new 창();
            a전사.공격();
            // 출력 => 홍길순이(가) 창(으)로 공격합니다.
        }
    }