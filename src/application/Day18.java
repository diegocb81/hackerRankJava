package application;

import java.io.*;
import java.util.*;

public class Day18 {
    LinkedList queue;
    Stack stack;

    public Day18() {
        queue = new LinkedList();
        stack = new Stack();
    }

    void pushCaracter(char ch) {
        stack.push(ch);
    }

    void enqueueCharacter(char ch) {
        queue.addLast(ch);
    }

    char popCharacter() {
        return (char) stack.pop();
    }

    char dequeueCharacter() {
        return (char) queue.remove(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        // Convert input String to an array of characters
        char[] s = input.toCharArray();

        // Create a Day18 object:
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures
        for (char c : s) {
            p.pushCaracter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        // Finally, print whether string s is palindrome or not
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}
