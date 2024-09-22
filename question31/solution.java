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
import java.time.DayOfWeek;

class Result {

    public static String findDay(int month, int day, int year) {
        
        if(month==1 || month == 2)
        {
            month+=12;
            year-=1;
        }
        
        int k=year%100;
        int j=year/100;
        
        int f = day + (13 * (month + 1)) / 5 + k + k / 4 + j / 4 + 5 * j;
        int dayindex=f%7;
        
        String[] days={"SATURDAY","SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY"};
        return days[dayindex];  

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
