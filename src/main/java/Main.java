public class Main {
    static class 자동차{
        public int 최고속력;
        void 달리다(){
            System.out.println("자동차가 최고속력 "+this.최고속력+"km로 달립니다.");
        }
    }
    public static void main(String[] args){
        자동차 a자동차=new 자동차();
        자동차 b자동차=new 자동차();
        a자동차.최고속력=230;
        b자동차.최고속력=240;
        a자동차.달리다();
        b자동차.달리다();
    }
}
