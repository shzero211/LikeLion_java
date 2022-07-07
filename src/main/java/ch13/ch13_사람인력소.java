package ch13;// 문제 : 아래가 실행되도록 해주세요.
// 조건 : 배열을 사용할 수 없습니다.

public class ch13_사람인력소 {
   private static class 사람인력관리소{
        int idx=1;
        사람 첫사람=new 사람();
        void add사람(String name,int age){
            if(idx==1){
                첫사람.name=name;
                첫사람.age=age;
                첫사람.idx=idx;
                첫사람.다음사람=new 사람();

            }else if(idx==2){
                첫사람.다음사람.name=name;
                첫사람.다음사람.age=age;
                첫사람.다음사람.idx=idx;
                첫사람.다음사람.다음사람=new 사람();
            }else if(idx==3){
                첫사람.다음사람.다음사람.name=name;
                첫사람.다음사람.다음사람.age=age;
                첫사람.다음사람.다음사람.idx=idx;
                첫사람.다음사람.다음사람.다음사람=new 사람();
            }
            System.out.println("나이가"+age+"살인"+ idx+"번째 v2.사람("+name+")이 추가되었습니다.");
            idx++;
        }
        사람 get사람(int idx){
            if(idx==1){
                return 첫사람;
            }else if(idx==2){
                return  첫사람.다음사람;
            }else if(idx==3){
                return 첫사람.다음사람.다음사람;
            }
            return null;
        }
    }
    private static class 사람{
        String name;
        int age;
        int idx;
        사람 다음사람;
        void 자기소개(){
            System.out.println("저는 "+idx+"번,"+name+","+age+"살 입니다.");
        }
    }
    public static void main(String[] args) {
        사람인력관리소 a사람인력관리소 = new 사람인력관리소();

        a사람인력관리소.add사람("홍길순", 33);
        // 나이가 33살인 1번째 v2.사람(홍길순)이 추가되었습니다.
        a사람인력관리소.add사람("홍길동", 20);
        // 나이가 20살인 2번째 v2.사람(홍길동)이 추가되었습니다.
        a사람인력관리소.add사람("임꺽정", 30);
        // 나이가 30살인 3번째 v2.사람(임꺽정)이 추가되었습니다.

        사람 a사람1 = a사람인력관리소.get사람(1);
        a사람1.자기소개();
        // 저는 1번, 홍길순, 33살 입니다.

        사람 a사람2 = a사람인력관리소.get사람(2);
        a사람2.자기소개();
        // 저는 2번, 홍길동, 20살 입니다.

        사람 a사람3 = a사람인력관리소.get사람(3);
        a사람3.자기소개();
        // 저는 3번, 임꺽정, 30살 입니다.
    }
}
