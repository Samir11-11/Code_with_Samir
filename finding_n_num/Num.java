import java.util.*;
import java.util.Scanner;
public class Num{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the number:");
        int a = obj.nextInt();
        int i = 1;
        while(i<=a){
            System.out.println(i);
            i++;
        }
    }
}