package ch15;

public class ch15_6 {
    private static abstract class 전사{

    }
    private static class 홍길동 extends  전사{

    }
    private static class 홍길순 extends  전사{

    }
    public static void main(String[] args) {
        전사 a전사 = new 홍길동();
        a전사 = new 홍길순();
    }
}
