package ch16;

// 문제 : 구성(전사는 무기로 구성된다.)을 사용하여 중복을 제거해주세요.

class ch16_4 {
    private static abstract class 전사{
        String 무기;
        void 공격(){
            System.out.println(무기+"로 공격");
        };
    }
    private static class 전사타입A extends 전사 {
        전사타입A(){
           무기="칼";
       }

    }
    private static class 전사타입B extends 전사 {
        전사타입B(){
            무기="칼";
        }
    }
    private static class 전사타입C extends 전사 {
        전사타입C(){
            무기="활";
        }
    }
    private static class 전사타입D extends 전사 {
        전사타입D(){
            무기="활";
        }
    }

    public static void main(String[] args) {
        전사타입A a전사타입A = new 전사타입A();
        a전사타입A.공격();

        전사타입B a전사타입B = new 전사타입B();
        a전사타입B.공격();

        전사타입C a전사타입C = new 전사타입C();
        a전사타입C.공격();

        전사타입D a전사타입D = new 전사타입D();
        a전사타입D.공격();
    }
}

