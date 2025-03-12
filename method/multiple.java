public class Multiple{
    public int divide(int num1,int num2)
    {
        int num3 = num1 / num2;
        return num3;
    }
     public static void main(String[] args) {
        Multiple obj = new Multiple();
         int a = obj.divide(12,12);
         System.out.println(a);
     }
 }