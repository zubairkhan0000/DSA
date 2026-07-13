public class WrapperEx{
    public static void main(String[] args) {
        int a=10;
        Integer b=Integer.valueOf(a);
        Integer b1=a;
        System.out.println(b+" "+b1);
        int a1=b.intValue();
        int a2=b1;
        System.out.println(a1+" "+a2);
        double c=10.2;
        Double c1=Double.valueOf(c);
        System.out.println(c+" "+c1);
        
    }

}