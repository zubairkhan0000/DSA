import java.util.Arrays;

class HashTable1{
    private int [] data;
    public HashTable1(int size){
        data=new int[size];
        Arrays.fill(data,-1);
    }
    private int hash(int key){
        return key%data.length;
    }
    public void put(int key){
        int hashKey=hash(key);
        int index=hashKey;
        while(data[index]!=-1){
            index=(index+1)%data.length;
            if(index==hashKey){
                System.out.println("hash table is full.");
                return;
            }
        }
        data[index]=key;
    }
    public void display(){
        for(int i=0;i<data.length;i++){
            System.out.println("index:"+i+"-> "+data[i]);
        }

    }
}
public class Sample {
    public static void main(String[] args) {
        HashTable1 h1=new HashTable1(10);
        h1.put(5);
        h1.put(10);
        h1.put(15);
        h1.put(100);
        h1.display();

        
    }
    
}
