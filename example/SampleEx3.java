import java.util.ArrayList;
import java.util.List;

public class SampleEx3 {
    private static int[] computePrefixFunction(String pattern) {
        int m = pattern.length();
        int[] prefixFunction = new int[m];
        int k = 0;
        for (int i = 1; i < m; i++) {
            while (k > 0 && pattern.charAt(k) != pattern.charAt(i)) {
                k = prefixFunction[k - 1];
            }
            if (pattern.charAt(k) == pattern.charAt(i)) {
                k++;
            }
            prefixFunction[i] = k;
        }
        return prefixFunction;
    }

    public static List<Integer> search(String text, String pattern) {
        List<Integer> matches = new ArrayList<>();
        int n = text.length();
        int m = pattern.length();
        int[] prefixFunction = computePrefixFunction(pattern);
        int q = 0; 

        for (int i = 0; i < n; i++) {
            while (q > 0 && pattern.charAt(q) != text.charAt(i)) {
                q = prefixFunction[q - 1];
            }
            if (pattern.charAt(q) == text.charAt(i)) {
                q++;
            }
            if (q == m) { 
                matches.add(i - m + 1); 
                q = prefixFunction[q - 1]; 
            }
        }
        return matches;
    }

    public static void main(String[] args) {
        String text = "ABABABACABAABABABABA";
        String pattern = "ABABA";
        List<Integer> matches = search(text, pattern);
        if(matches.isEmpty()){
            System.out.println("Pattern not found");
        }
        else{
            System.out.println("Pattern found at positions: " + matches);

        }
        
    }
}
