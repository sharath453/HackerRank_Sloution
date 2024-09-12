import java.io.*;
import java.util.*;

class Result {


    
    public static int migratoryBirds(List<Integer> arr) {
        
        int[] frequencies = new int[6]; 

        for (int bird : arr) {
            frequencies[bird]++;
        }

        int maxFrequency = 0;
        int birdTypeWithMaxFrequency = Integer.MAX_VALUE;

        for (int birdType = 1; birdType <= 5; birdType++) {
            if (frequencies[birdType] > maxFrequency) {
                maxFrequency = frequencies[birdType];
                birdTypeWithMaxFrequency = birdType;
            } else if (frequencies[birdType] == maxFrequency && birdType < birdTypeWithMaxFrequency) {
                birdTypeWithMaxFrequency = birdType;
            }
        }

        return birdTypeWithMaxFrequency;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
