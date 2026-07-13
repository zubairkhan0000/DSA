import java.util.ArrayList;

interface PositionalList<E> {
    void insert(E element,int index);
    void remove(int index);
    void set(int index,E element);
    E get(int index);
    boolean isEmpty();
    int size();

}
class ArrayListPositonalList<E> implements PositionalList<E>{
    private ArrayList<E> list;
    public ArrayListPositonalList(){
        list =new ArrayList<>();
    }
    @Override
    public void insert(E element ,int index){
        list.add(index,element);
    }
    @Override
    public void remove(int index){
        list.remove(index);
    }
    public void set(int index,E element){
        list.set(index,element);
    }
    @Override
    public E get (int index){
        return list.get(index);
    }
    @Override
    public boolean isEmpty(){
        return list.isEmpty();
    }
    @Override
    public int size(){
        return list.size();
    }
}
public class Test6{
    public static void main(String[] args) {
        PositionalList<String> list=new ArrayListPositonalList<>();
        list.insert("a",0);
        list.insert("b",1);
        list.insert("c",2);
        boolean empty=list.isEmpty();
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("is list empty?:"+empty);
        System.out.println("element at position 1: "+list.get(1));
        
    }
}