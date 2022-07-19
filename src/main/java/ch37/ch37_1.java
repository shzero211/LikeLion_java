package ch37;

public class ch37_1{
    private static class 사람 {
        // private => 외부로 공개되지 않는다., 리모콘에 노출되지 않는다.
        int id;
    }
    public static void main(String[] args) {
        사람 a사람 = new 사람();
        a사람.id = 20;

        System.out.println("제 번호는 " + a사람.id + " 입니다.");
        // 출력 : 제 번호는 20 입니다.
    }
}

