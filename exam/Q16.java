public class ShoppingCart {
    public static double calculateTotalPrice(int[] prices, boolean isPremiumMember) {
        double totalPrice = 0;
        for (int price : prices) {
            totalPrice += price; 
        }
        if (isPremiumMember) {
            totalPrice *= 0.95;
        }
        if (totalPrice > 5000) {
            totalPrice *= 0.90; 
        }
        return totalPrice;
    }
    public static void main(String[] args) {
        int[] prices = {4200, 4500, 4800}; 
        boolean isPremiumMember = true;
        double finalPrice = calculateTotalPrice(prices, isPremiumMember);
        System.out.println("The total price after discounts is: " + finalPrice);
    }
}
