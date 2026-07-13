import java.util.LinkedList;

public class Hashtable {
    private LinkedList<Integer>[] data;
    public Hashtable(int size){
        data=new LinkedList[size];
        for(int i=0;i<=size;i++){
            data[i]=new LinkedList<>();
        }
    }
    private int hash(int key){
        return key%data.length;
        
    }
    
}
