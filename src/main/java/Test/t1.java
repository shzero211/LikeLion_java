package Test;

public class t1 {
    public static void main(String[] args) {
        Long sum=0L;
        for(int i=0;i<100000;i++){
            if(i%3==0||i%5==0){
                System.out.printf("i:%d \n",i);
                sum+=i;
            }
        }
        System.out.println("sum: "+sum);
    }
}
