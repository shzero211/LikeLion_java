package ch13;

import java.util.LinkedList;

public class ch13_사람_link {
    private static class 사람인력관리소{
        LinkedList<사람> 사람들=new LinkedList<>();
        void add사람(String name,int age){
            사람들.add(new 사람(name,age));
            System.out.println("나이가"+ age+"살인"+ 사람들.size()+"번째 사람("+name+")이 추가되었습니다.");
        }
        사람 get사람(int idx){
            사람들.get(idx-1).idx=idx-1;
            return 사람들.get(idx-1);
        }
    }
    private static class 사람{
        String name;
        int age;

        int idx;
        사람(String name,int age){
            this.name=name;
            this.age=age;
        }
        void 자기소개(){
            System.out.println("저는"+ (idx+1)+"번,"+name+","+ age+"살 입니다.");
        }
    }

    public static void main(String[] args) {
        사람인력관리소 a사람인력관리소 = new 사람인력관리소();

        a사람인력관리소.add사람("홍길순", 33);
        // 나이가 33살인 1번째 v2.사람(홍길순)이 추가되었습니다.
        a사람인력관리소.add사람("홍길동", 20);
        // 나이가 20살인 2번째 v2.사람(홍길동)이 추가되었습니다.
        a사람인력관리소.add사람("임꺽정", 30);
        a사람인력관리소.add사람("ee", 30);
        a사람인력관리소.add사람("ee", 30);
        a사람인력관리소.add사람("ee", 30);
        a사람인력관리소.add사람("ee", 30);


        // 나이가 30살인 3번째 v2.사람(임꺽정)이 추가되었습니다.

        사람 a사람1 = a사람인력관리소.get사람(1);
        a사람1.자기소개();
        // 저는 1번, 홍길순, 33살 입니다.

        사람 a사람2 = a사람인력관리소.get사람(2);
        a사람2.자기소개();
        // 저는 2번, 홍길동, 20살 입니다.

        사람 a사람3 = a사람인력관리소.get사람(3);
        a사람3.자기소개();

        사람 a사람4 = a사람인력관리소.get사람(4);
        a사람4.자기소개();
        // 저는 1번, 홍길순, 33살 입니다.

        사람 a사람5 = a사람인력관리소.get사람(5);
        a사람5.자기소개();
        // 저는 2번, 홍길동, 20살 입니다.

        사람 a사람6 = a사람인력관리소.get사람(6);
        a사람6.자기소개();
        사람 a사람7 = a사람인력관리소.get사람(7);
        a사람7.자기소개();
        // 저는 3번, 임꺽정, 30살 입니다.
    }
}
