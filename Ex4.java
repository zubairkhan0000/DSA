import java.util.PriorityQueue;
import java.util.Queue;

class Student implements Comparable<Student>{
    private String name;
    private int score;
    
    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String getName(){ 
        return name;
    }

    public int getScore(){
        return score;
    }

    @Override
    public int compareTo(Student other){
        return Integer.compare(this.score, other.score);
    }

    @Override
    public String toString(){
        return name + " " + score;
    }
}

public class Ex4{
    public static void main(String[] args) {
        Queue<Student> c1 = new PriorityQueue<Student>();
        c1.add(new Student("akaay", 33));
        c1.add(new Student("ram", 69));
        c1.add(new Student("somu", 45));
        while(!c1.isEmpty()){
            System.out.println(c1.poll());
        }
    }
}
