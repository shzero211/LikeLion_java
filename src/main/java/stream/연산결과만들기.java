package stream;

import java.util.Arrays;

public class 연산결과만들기 {
    public static void main(String[] args) {
        String s = "30 + 40 + 20 + 40 + 20 + 50 + 11 + -6 + -100";

        int sum=Arrays
                .stream(s.split(" \\+ ")).mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }
}
