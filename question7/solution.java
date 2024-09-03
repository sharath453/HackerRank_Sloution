import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    int n=arr.size();
    int max=arr.get(0);
    int min=arr.get(0);
    int sum=0;
    for(int i=0;i<n;i++){
        sum=sum+arr.get(i);
    }
    for(int i=0;i<n;i++)
    {
        if(arr.get(i)>max)
        {
            max=arr.get(i);
        }
        else if(arr.get(i)<min)
        {
            min=arr.get(i);
        }
    }
    int maxsum=sum-min;
    int minsum=sum-max;
    System.out.println(minsum + " "+ maxsum);  
    }
    }

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
