import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

   public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    int count = 0;  // Initialize a counter for valid pairs

    // Loop through each element i in the list
    for (int m = 0; m < n; m++) {
        // Loop through each element j after i to ensure i < j
        for (int j = m + 1; j < n; j++) {
            // Check if the sum of the elements ar[i] and ar[j] is divisible by k
            if ((ar.get(m) + ar.get(j)) % k == 0) {
                count++;  // Increment the count if the condition is met
            }
        }
    }

    return count;  // Return the total count of valid pairs
}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> ar = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arTemp[i]);
            ar.add(arItem);
        }

        int result = Result.divisibleSumPairs(n, k, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
