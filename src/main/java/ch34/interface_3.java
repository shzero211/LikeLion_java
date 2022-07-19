package ch34;

public class interface_3 {
    private static class 사람 extends 변호사 implements 의사{
        @Override
        void 변호하다() {
            System.out.println("사람이 변호 합니다.");
        }

        @Override
        public void 진찰하다() {
            System.out.println("사람이 진찰 하다.");
        }
    }
    private static class 오랑우탄 extends  변호사 implements 의사{
        void 변호하다(){
            System.out.println("오랑우탄이 변호 합니다.");
        }

        @Override
        public void 진찰하다() {
            System.out.println("오랑우탄이 진찰 합니다.");
        }
    }
    private static class 변호사{
        void 변호하다(){
        }
    }
    private interface 의사{
        void 진찰하다();
    }
    public static void main(String[] args) {
        사람 a사람 = new 사람();

        변호사 a변호사 = a사람;
        a변호사.변호하다();
        // 출력 : 사람이 변호 합니다.

        변호사 a변호사2 = new 오랑우탄();
        a변호사2.변호하다();
        // 출력 : 오랑우탄이 변호 합니다.

        의사 a의사 = new 오랑우탄();
        a의사.진찰하다();
        // 출력 : 오랑우탄이 진찰 합니다.

        의사 a의사2 = new 사람();
        a의사2.진찰하다();
        // 출력 : 사람이 진찰 합니다.
    }
}
