import java.util.ArrayList;
import java.util.List;

public class FactorialTime {
    public static void main(String[] args) {
        String str = "ABC";
        permute(str, "");
    }

    public static void permute(String str, String permutation) {
        if (str.isEmpty()) {
            System.out.println(permutation); // Print permutation
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rest = str.substring(0, i) + str.substring(i + 1);
            permute(rest, permutation + ch); // Recursive call
        }
    }
}
