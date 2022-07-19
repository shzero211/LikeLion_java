package ch33;

public class HashMap_2 {
    private static class HashMap{
        Object[] keys;
        Object[] values;
        HashMap(){
            keys=new Object[100];
            values=new Object[100];
        }
        int idx=-1;
        void put(Object key,Object value){
           keys[++idx]=key;
           values[idx]=value;
        }
        Object get(Object key){
           for(int i=0;i<keys.length;i++){
               if(keys[i].equals(key)){
                   return values[i];
               }
           }
           return null;
        }
    }

    public static void main(String[] args) {
        HashMap aMap=new HashMap();
        aMap.put(1,"안녕");
        aMap.put("A",false);

        System.out.println(aMap.get(1));
    }
}
