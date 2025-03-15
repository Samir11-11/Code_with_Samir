import java.util.*;
public class Digit{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
         System.out.println("Enter the number for addition");
        int n = obj.nextInt();
        int sum = 0;
        System.out.println("Enter the number");
        int num[]=new int[n+1];
        int i = 1;
        while(i<=n){
            num[i] = obj.nextInt();
            i++;
        }
        int j = 1;
        while(j<=n){
            sum = sum + num[i-1];
            j++;
        }
    System.out.println("The total sum of" + n +"number is"+sum);
}
}