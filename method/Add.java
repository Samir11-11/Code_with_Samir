public class Add{
    public int addition(int num1,int num2)
    {
        int num3 = num1 + num2;
        return num3;
    }
     public static void main(String[] args) {
        Add obj = new Add();
         int a = obj.addition(12,12);
         System.out.println(a);
     }
 }