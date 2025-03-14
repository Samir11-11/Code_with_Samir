import java.util.*;
import java.util.Scanner;
public class Vow{
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a letter:");
        String letter = obj.nextLine();
        String vowels[] = {"a","e","i","o","u"};
        int detect = 0;
        int i = 0;
        while(i<=4){
            if(letter.equals(vowels[i])){
                detect = 1;
            }
            i++;
        }
        if(detect ==1){
            System.out.println("vowels");
        }
        else{
            System.out.println("non vowels");
        }
    }
}