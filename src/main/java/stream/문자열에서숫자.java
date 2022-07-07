package stream;

import java.util.Arrays;

public class 문자열에서숫자 {
    static String line = "Test 15 lqlq 35 bad 99999 guess 34";
    public static void main(String[] args) {
        String[] strs=line.split(" ");
        System.out.println(Arrays.toString(strs));
        int sum=0;

        for(int i=0;i<strs.length;i++){
            if(strs[i].matches("\\d+")){
                sum+=Integer.parseInt(strs[i]);
            }
        }
        System.out.println(sum);
    }
}
