import java.util.*;
import java.util.Scanner;
public class Vow{
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a letter:");
        String letter = obj.next();
        String vowels = "a","e","i","o","u";
        if (letter.length() == 1) {
            if (vowels(letter) != -1) {
                System.out.println("This is a vowel.");
            } 
            else {
                System.out.println("This is not a vowel.");
            }
        } 
        else {
            System.out.println("Enter a single letter.");
        }
        
    }
}
