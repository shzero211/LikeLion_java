package ch20;

public class ch20_1 {
    public static void main(String[] args) {
        사람 a사람 = new 사람();

        동물 a동물 = a사람;
        a동물.이름 = "홍길순"; // 동물 이름

        a사람.이름 = "홍길동"; // 사람 이름
        System.out.println(a동물.이름);
        System.out.println(a동물.test());
        System.out.println("==");
        System.out.println(a사람.이름);
        System.out.println(a사람.test());
    }
}
class 동물 {
    String 이름;
    String test() {
        return 이름;
    }
}
class 사람 extends 동물 {
    String 이름;
    String test() {
        return 이름;
    }
}