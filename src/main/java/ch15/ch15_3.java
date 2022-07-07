package ch15;

public class ch15_3 {
    private static class 병사{
        String 이름;
        String 계급;
        병사(){
            계급="이병";
        }
        void 자기소개(){
            System.out.println("안녕하세요.저는 "+이름+계급+"입니다.");
        }
        void 진급(){
            if(계급=="이병"){
                계급="일병";
            }else if(계급=="일병"){
                계급="상병";
            }
        }
    }
    public static void main(String[] args) {
        병사 a병사 = new 병사();
        a병사.이름 = "홍길동";

        a병사.자기소개();
        // 안녕하세요. 저는 홍길동 이병 입니다.

        a병사.진급();

        a병사.자기소개();
        // 안녕하세요. 저는 홍길동 일병 입니다.

        a병사.진급();

        a병사.자기소개();
        // 안녕하세요. 저는 홍길동 상병 입니다.
    }
}
