package ch33;

import java.util.Arrays;

public class HashMap_4 {
    private static class HashMap<T,V>{
        private Object[] keys;
        private Object[] values;
        HashMap(){
            keys=new Object[100];
            values=new Object[100];
        }
        int size=0;
        void put(T key,V value){
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
        V get(T key){
            for(int i=0;i<size;i++){
                if(keys[i].equals(key)){
                    return (V)values[i];
                }
            }
            return null;
        }
        void remove(T key){
            for(int i=0;i<size;i++){
                if(keys[i].equals(key)){
                    for(int j=i+1;j<size;j++){
                        keys[j-1]=keys[j];
                        values[j-1]=values[j];
                    }
                    size--;
                    break;
                }
            }
        }
        String[] keySet(){
            String[] arr=new String[size];
          for(int i=0;i<size;i++){
              arr[i]=(String)keys[i];
          }
          return arr;
        }
    }
    private static class 사람{
        void 말하다(){
            System.out.println("사람이 말합니다.");
        }
    }
    private static class 원숭이{
    void 묘기를_부리다(){
        System.out.println("원수이가 묘기를 부립니다.");
    }
    }

    public static void main(String[] args)  {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("영희", 22);
        ages.put("철수", 23);
        ages.put("민서", 25);
        ages.put("철수", 27);
        ages.remove("영희");
        ages.put("광수", 27);
        for ( String name : ages.keySet() ) {
            System.out.println("이름 : " + name + ", 나이 : " + ages.get(name));
        }
        /* 출력결과 */
        // 이름 : 철수, 나이 : 27
        // 이름 : 민서, 나이 : 25
        // 이름 : 광수, 나이 : 27
        HashMap<String, Object> everyone = new HashMap<>();
        everyone.put("사람", new 사람());
        everyone.put("원숭이", new 원숭이());
        ((사람)everyone.get("사람")).말하다();
        // 출력 => 사람이 말합니다.
        ((원숭이)everyone.get("원숭이")).묘기를_부리다();
        // 출력 => 원숭이가 묘기를 부립니다.

    }
}
