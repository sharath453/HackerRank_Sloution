import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    public static void miniMaxSum(List<Integer> arr) {
        long totalSum = 0;
        int min = arr.get(0);
        int max = arr.get(0);
        
        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);
            totalSum += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        
        long minSum = totalSum - max;
        long maxSum = totalSum - min;
        
        System.out.println(minSum + " " + maxSum);  
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrTemp.length; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
