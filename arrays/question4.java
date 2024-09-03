/* Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

1 2 3
4 5 6
9 8 9  
The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .

Function description

Complete the  function in the editor below.

diagonalDifference takes the following parameter:

int arr[n][m]: an array of integers
Return

int: the absolute diagonal difference

*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int primarydiagnol=0;
    int secoundrydiognal=0;
    for(int i=0;i<arr.size();i++)
    {
       primarydiagnol+=arr.get(i).get(i);
       secoundrydiognal+=arr.get(i).get(2-i); 
    }
    int difference = Math.abs(primarydiagnol - secoundrydiognal);
    return difference;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = Result.diagonalDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

------------------------------------------------------------------------------------------------------

// for all kind of matrix we have to do small change in the function

public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int primarydiagnol=0;
    int secoundrydiognal=0;
    int n=arr.size();
    for(int i=0;i<arr.size();i++)
    {
       primarydiagnol+=arr.get(i).get(i);
       secoundrydiognal+=arr.get(i).get(n-i-1); 
    }
    int difference = Math.abs(primarydiagnol - secoundrydiognal);
    return difference;
    }