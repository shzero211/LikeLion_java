package ch33;

public class HashMap_1 {
    private static class HashMap{
        Object key;
        Object value;
        void put(Object key,Object value){
            this.key=key;
            this.value=value;
        }
    }

    public static void main(String[] args) {
        HashMap aMap=new HashMap();
        aMap.put(1,"안녕");
        aMap.put("A",false);
    }
}
