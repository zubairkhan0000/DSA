import java.util.Arrays;

class HashTable2{
    private int [] data;
    public static final int c1=1;
    public static final int c2=1;
    public HashTable2(int size){
        data=new int[size];
        Arrays.fill(data,-1);

    }
    private int hash(int key){
        return key%data.length;
    }
    public void put(int key){
        int hashKey=hash(key);
        int index=hashKey;
        int i=1;
        while(data[index]!=-1){
            index=(hashKey+c1*i+c2*i*i)%data.length;
            if(i==data.length){
                System.out.println("hash table is full");
                return;
            }
            i++;
        }
        data[index]=key;
    }
    public void display(){
        for(int i=0;i<data.length;i++){
            System.out.println("index:"+i+"-> "+data[i]);
        }

    }
    
    
}


public class Sample1 {
    public static void main(String[] args) {
        HashTable2 h1=new HashTable2(10);
        h1.put(5);
        h1.put(10);
        h1.put(15);
        h1.put(100);
        h1.display();
        
    }
    
}
