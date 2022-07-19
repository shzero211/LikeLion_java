package ch24;

//code.oa.gg/java8/940
// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요.

class ch24_3{
    public static void main(String[] args) {
        자동차.달리다();
    }
}

class 자동차 {
    static void 달리다() {
        System.out.println("자동차가 달립니다.");
    }
}