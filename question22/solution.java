import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Integer> rotateLeft(int d, List<Integer> arr)
    {
        //write Your code here
        int n=arr.size();
        List<Integer>temp=new ArrayList<>();

        //first for loop is to add teh dth element to temp
        for(int i=0;i<d;i++)
        {
            temp.add(arr.get(i));
        }
        
        //second loop is to shift the element right to left
        for(int i=0;i<n-d;i++)
        {
            arr.set(i,arr.get(i+d));
        }
        
        //third loop is to add the temp elements to end of array
        for (int i = 0; i < d; i++) 
        {
            arr.set(n - d + i, temp.get(i)); 
        }

        //return the resultant array elements   
        return arr;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.rotateLeft(d, arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
