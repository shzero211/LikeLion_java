package Test;

public class t4 {
    public static void main(String[] args) {
        int llen=0;
        int rlen=0;
        int max=0;
    for(int i=1000;i<=9999;i++){
        for(int j=1000;j<=9999;j++){
            String str=String.valueOf(i*j);
            if(str.charAt(0)==str.charAt(str.length()-1)){
                int pl=str.length()-1;
                if(str.length()%2==0){
                    llen=str.length()/2-1;
                    rlen=str.length()/2+1;
                }else{
                    llen=str.length()/2;
                    rlen=str.length()/2;
                }
                for(int k=0;k<=llen;k++){
                    if(str.charAt(k)==str.charAt(pl)){
                        pl--;
                    }else{
                        break;
                    }
                }
                if(pl==llen){
                    max= (max<Integer.valueOf(str)?Integer.parseInt(str):max);
                }
            }

        }
    }
        System.out.println(max);
    }
}
