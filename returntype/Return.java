public class Return{
    int addition(int num1,int num2)
    {
        int num3 = num1 + num2;
        return num3;
    }
     public static void main(String[] args) {
        Return obj = new Return();
         int a = obj.addition(12,10);
         System.out.println(a);
     }
 }