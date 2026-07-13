public class Sample4 {
    public static void main(String[] args) {
        String text="AAAAAABCDBBBAAAA";
        String pattern="ABCD";
        System.out.println(text);
        System.out.println(pattern);
        search(text,pattern);
    }
    public static void search(String text,String pattern){
        int n=text.length();
        int m=pattern.length();
        int j=0;
        for(int i=0;i<=n-m;i++){
            for( j=0;j<m;j++){
                if(text.charAt(i+j)!=pattern.charAt(j)){
                    break;
                }
            }
            if(j==m){
                System.out.println("patter found at index:"+i);

            }
        }
    }
}
