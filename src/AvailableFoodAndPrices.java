public class AvailableFoodAndPrices {

    String[] products;
    int[] prices;

    public AvailableFoodAndPrices(String[] products, int[] prices) {
        this.products = products;
        this.prices = prices;
    }

    public static void showProductsWithPrice(AvailableFoodAndPrices food){
        System.out.println("Доступные продукты:");
        for (int i = 0; i < food.prices.length; i++) {
            System.out.println(food.products[i] + " : " + food.prices[i]);
        }
    }
}
