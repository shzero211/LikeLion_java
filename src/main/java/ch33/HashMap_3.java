package ch33;

public class HashMap_3 {
    private static class HashMap{
        private Object[] keys;
        private Object[] values;
        HashMap(){
            keys=new Object[100];
            values=new Object[100];
        }
        int size=0;
        void put(Object key,Object value){
            for(int i=0;i<size;i++){
                if(keys[i].equals(key)){
                    values[i]=value;
                    return;
                }
            }
            keys[size]=key;
            values[size]=value;
            size++;
        }
        Object get(Object key){
            for(int i=0;i<size;i++){
                if(keys[i].equals(key)){
                    return values[i];
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        HashMap aMap=new HashMap();
        aMap.put(1, "안녕");
        aMap.put("A", false);
        aMap.put("A", true);

        System.out.println(aMap.get("A"));//true
    }
}
