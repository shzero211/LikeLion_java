import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class C1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int m= Integer.parseInt(br.readLine());
       int[][] arr=new int[m][2];
       for(int i=0;i<m;i++){
           StringTokenizer st=new StringTokenizer(br.readLine());
           int n1=Integer.parseInt(st.nextToken());
           int n2=Integer.parseInt(st.nextToken());
           arr[i][0]=n1;
           arr[i][1]=n2;
       }
       Arrays.sort(arr, new Comparator<int[]>() {
           @Override
           public int compare(int[] o1, int[] o2) {
               if(o1[1]==o2[1]){
                   return o1[0]-o2[0];
               }else{
                   return o1[1]-o2[1];
               }
           }
       });
       Arrays.stream(arr).forEach(a->System.out.println(a[0]+" "+a[1]));
    }
}
