import java.util.*;
public class Method{
    void add(int a,int b){
        System.out.println("answer is "+(a+b));

    }
    void add(int a, int b,int c){
        System.out.println("answer is "+(a+b+c));
    }
    public static void main(String args[]){
        Method obj = new Method();
        obj.add(12,14);
        obj.add(16,12,10);
    }
}