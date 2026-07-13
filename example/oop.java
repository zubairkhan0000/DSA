public class oop {
    public static void main(String[] args) {
        BoxWeight box=new BoxWeight();
        box.greeting();

    }
    
}
class Box{
    static void greeting(){
        System.out.println("main");
    }
}

class BoxWeight extends Box{
    static void greeting(){
        System.out.println("child");
    }
}

