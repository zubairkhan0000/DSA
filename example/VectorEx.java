import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<String> v1=new Vector<String>();
        v1.add("sai");
        v1.add("somu");
        v1.add("ramu");
        @SuppressWarnings("rawtypes")
        Enumeration e1=v1.elements();
        while(e1.hasMoreElements()){
            System.out.println(e1.nextElement());
        }
    }
    
}
