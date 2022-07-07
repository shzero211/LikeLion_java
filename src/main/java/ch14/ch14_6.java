package ch14;

public class ch14_6 {
    private static class 사람{
        팔 a왼팔;
        사람(){
            a왼팔=new 팔();
            a왼팔.a손=new 손();
            a왼팔.a손.a엄지손가락=new 손가락();
            a왼팔.a손.a엄지손가락.길이=5;
        }
    }
    private static class 팔{
        손 a손;
    }
    private static class 손{
        손가락 a엄지손가락;
    }
    private static class 손가락{
        int 길이;
    }
    public static void main(String[] args) {
        int 엄지손가락_길이 = new 사람().a왼팔.a손.a엄지손가락.길이;

        System.out.println(엄지손가락_길이 + "cm");
        // 출력 : 5cm
    }
}
