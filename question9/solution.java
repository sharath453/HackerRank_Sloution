import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

public static String timeConversion(String s) {
    // Extract period (AM/PM)
    String period = s.substring(s.length() - 2);
    // Extract hour, minute, second parts
    String hourStr = s.substring(0, 2);
    String minute = s.substring(3, 5);
    String second = s.substring(6, 8);

    int hour = Integer.parseInt(hourStr);

    if (period.equals("AM")) {
        if (hour == 12) {
            hour = 0; 
        }
    } else {
        if (hour != 12) {
            hour += 12; 
        }
    }


    String hourFormatted = String.format("%02d", hour);

    return hourFormatted + ":" + minute + ":" + second;
}

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
