public class Cal{
    void addition(int x,int y){
        int z = x = y;
        System.out.println(z);
    }
    void substraction(int m,int n){
        int l = m - n;
        System.out.println(l);
    }
    void multiplication(int b,int c){
        int a = b * c;
        System.out.println(a);
    }
    void division(int s,int t){
        int o = s / t;
        System.out.println(o);
    }
    public static void main(String args[]){
        Cal obj = new Cal();
        obj.addition(12,12);
        obj.substraction(14,4);
        obj.multiplication(3,8);
        obj.division(10,2);
    }
}