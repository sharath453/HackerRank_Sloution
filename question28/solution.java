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


1. push(E item)
Description: Pushes an item onto the top of the stack.
Example:
stack.push(10); Adds 10 to the top of the stack

2. pop()
Description: Removes the object at the top of the stack and returns it.
Example:
int top = stack.pop(); // Removes and returns the top element

3.peek()
Description: Looks at the object at the top of the stack without removing it.
Example:
int top = stack.peek(); // Returns the top element without removing it

5. isEmpty()
Description: Tests if the stack is empty.
Example:
if (stack.isEmpty()) {
    System.out.println("The stack is empty");
}

6. search(Object o)
Description: Returns the 1-based position of an object on the stack. If the object is not found, it returns -1.
Example:
int position = stack.search(10); // Returns the position of 10 in the stack
Additional Methods Inherited from Vector (Superclass)
Since Stack extends Vector, it inherits several additional methods:

7. size()

Description: Returns the number of elements in the stack.
Example:
int count = stack.size(); // Returns the number of elements in the stack

8. clear()

Description: Removes all elements from the stack.
Example:

stack.clear(); // Empties the stack
contains(Object o)

Description: Checks if the stack contains the specified element.
Example:
boolean exists = stack.contains(10); // Checks if 10 is in the stack

9. toArray()

Description: Returns an array containing all elements in the stack.
Example:
Object[] elements = stack.toArray(); // Converts stack elements to an array

10. iterator()

Description: Returns an iterator over the elements in the stack.
Example:
Iterator<Integer> it = stack.iterator(); 
while (it.hasNext()) {
    System.out.println(it.next());
}