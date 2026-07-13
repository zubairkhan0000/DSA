import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<Object> l1=new ArrayList<Object>();
        l1.add(44);
        l1.add(" ");
        l1.add("hamilton");
        l1.add("rossi");
        l1.add(46);
        for (Object i: l1) {
            System.out.println(i);
            
        }
    }
    
}
