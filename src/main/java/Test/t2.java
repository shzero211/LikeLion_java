package Test;

public class t2 {

    public static void main(String[] args) {
        int[] arr=new int[100];
        Long sum=2L;
        int i=2;
        arr[0]=1;
        arr[1]=2;
        while(true) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.printf("arr[%d]:%d\n", i, arr[i]);

            if(arr[i]%2==0){
                sum+=arr[i];
            }
            if (arr[i] > 50000000) {
               if(arr[i]%2==0){
                   sum-=arr[i];
               }
                System.out.println("sum :"+sum);
                break;
            }
            i++;
        }

    }
}
