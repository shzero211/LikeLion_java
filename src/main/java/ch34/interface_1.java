package ch34;

public class interface_1 {
    private static class 사람 {

    }
    private static class 홍길동 extends 사람 implements 변호사{

    }
    private interface 변호사{

    }
    public static void main(String[] args) {
        사람 a사람 =new 홍길동();
        변호사 a변호사 =(변호사)a사람;
    }
}
