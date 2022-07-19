package ch28;

public class ch28_1 {
   private static  class 학생{
       int 나이;
       String 이름;
       학생 (int 나이,String 이름){
           this.나이=나이;
           this.이름=이름;
       }
       public boolean equals(학생 other){
           if(other instanceof  학생==false){
               return false;
           }
           if(other.이름!=this.이름)
               return false;
           if(other.나이!=this.나이)
               return false;
           return true;
       }
   }

    public static void main(String[] args) {
        학생 학생1=new 학생(1,"나");
        학생 학생2=new 학생(1,"나");
        System.out.println(학생1.equals(학생2));
        String str1="abc";
        str1+="!";
        String str2="abc!";
        System.out.println(str1==str2);//false


    }
}
