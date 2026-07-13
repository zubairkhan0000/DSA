import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx1{
    public static void main(String[] args) {
        ArrayList<String> l1=new ArrayList<>();
        l1.add("mango");
        l1.add("orange");
        l1.add("apple");
        Iterator<String> itr=l1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }
}