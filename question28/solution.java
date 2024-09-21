import java.io.*;
import java.util.*;

public class Solution {
    
    // create a stack to push the char
    private Stack<Character> stacke=new Stack<>();
    
    //create a queue to add the char to it 
    private Queue<Character> newqueue=new LinkedList<>();
    
    //method to push the char to stack
    void pushCharacter(char c){
     stacke.push(c);   
    }
    
    //method to add the char to queue
    void enqueueCharacter(char ch){
        newqueue.add(ch);
    }
    
    //method to pop the element from the stack
    public char popCharacter()
    {
        return stacke.pop();
    }
    
    //method to remove element from the queue
     public char dequeueCharacter()
    {
        return newqueue.remove();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}