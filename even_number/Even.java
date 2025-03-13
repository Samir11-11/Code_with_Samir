public class Even{
    public static void main(String args[]) {
        System.out.println("Even numbers between 11 and 20:");
        for (int i = 11; i < 20; i++) {
            if (i % 2 == 0) { 
                System.out.println(i); 
            }
        }
    }
}