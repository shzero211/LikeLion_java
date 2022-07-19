package ch30;

// 문제 : 아래가 실행되도록 해주세요.
// 조건 : ArrayList 객체에서 내부적으로 Object 배열을 사용해서 데이터를 저장해야 합니다.
// 조건 : Object 배열의 초기 길이는 2 입니다.
// 조건 : 상황에 따라 배열의 길이는 자동으로 증가해야 합니다.
// 조건 : 엘리먼트(구성요소)를 하나 삭제하면 해당 요소 뒤의 요소들이 전부 앞으로 한칸씩 움직여야 합니다.
// 조건 : ArrayList의 인스턴스 변수는 2개만 사용할 수 있습니다.
// 조건 : 외부에서 호출하지 않는 속성은 private 키워드를 붙여주세요.
// 조건 : 중복을 최대한 제거해주세요.
// 조건 : 사용하는 변수와 if문, for문의 개수를 가독성을 떨어뜨리지 않는 선에서 최대한 줄여주세요.

class Main {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        System.out.println("al.size() : " + al.size());
        // 출력 => al.size() : 0

        al.add(100);

        System.out.println("al.get(0) : " + al.get(0));
        // 출력 => al.get(0) : 100

        al.add(200);
        al.add(300);
        // 출력 => 배열의 크기가 증가되었습니다. 2 => 4

        System.out.println("al.size() : " + al.size());
        // 출력 => al.size() : 3

        System.out.println("al.get(1) : " + al.get(1));
        // 출력 => al.get(1) : 200

        al.removeAt(1);

        System.out.println("al.size() : " + al.size());
        // 출력 => al.size() : 2

        System.out.println("al.get(1) : " + al.get(1));
        // 출력 => al.get(1) : 300

        al.add(400);
        al.add(500);
        al.add(600);
        // 출력 => 배열의 크기가 증가되었습니다. 4 => 8

        System.out.println("al.get(3) + al.get(4) : " + (al.get(3) + al.get(4)));
        // 출력 => al.get(3) + al.get(4) : 1100

        System.out.println("al.get(3).intValue() + al.get(4).intValue() : " + (al.get(3).intValue() + al.get(4).intValue()));
        // 출력 => al.get(3) + al.get(4) : 1100

        al.showAllValues();
        // 출력 =>
		/*
		== 전체 데이터 출력 ==
		0 : 100
		1 : 300
		2 : 400
		3 : 500
		4 : 600
		*/

        al.add(700, 1);
        al.add(750, 1);

        al.showAllValues();
        // 출력 =>
		/*
		== 전체 데이터 출력 ==
		0 : 100
		1 : 750
		2 : 700
		3 : 300
		4 : 400
		5 : 500
		6 : 600
		*/
    }
}
class ArrayList{
    Object[] arr;
    private int lastIdx;
    ArrayList(){
        arr=new Object[2];
        lastIdx=-1;
    }


    public int size() {
        return lastIdx+1;
    }

    public Integer get(int i) {
        return (Integer)arr[i];
    }

    private void extendArr() {
        if(lastIdx+1>=arr.length){
            Object[] temp=new Object[arr.length*2];
            for(int i=0;i<=lastIdx;i++){
                temp[i]=arr[i];
            }
            arr=temp;
            System.out.printf("배열의 크기가 증가되었습니다. %d => %d\n",lastIdx+1,arr.length);
        }
    }

    public void add(int data) {
        extendArr();
        lastIdx++;
        arr[lastIdx]=data;
    }
    public void add(int data,int idx) {
        extendArr();
        for(int i=lastIdx;i>=idx;i--){
            arr[i+1]=arr[i];
        }
        arr[idx]=data;
        lastIdx++;
    }


    public void removeAt(int idx) {
        for(int i=idx;i<=lastIdx;i++){
            arr[i]=arr[i+1];
        }
        lastIdx--;
    }

    public void showAllValues() {
        System.out.println(" == 전체 데이터 출력 == ");
        for(int i=0;i<=lastIdx;i++){
            System.out.println(i+" : "+arr[i]);
        }
    }
}