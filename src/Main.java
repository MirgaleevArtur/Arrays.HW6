public class Main {
    public static void main(String[] args) {
        String[] products = {"1) Хлеб", "2) Молоко", "3) Яйца", "4) Йогурт"};
        int[] prices = {50, 80, 100, 15};

       AvailableFoodAndPrices foodPackage1 = new AvailableFoodAndPrices(products, prices);
       AvailableFoodAndPrices.showProductsWithPrice(foodPackage1);

       ProductsCartFillByUser.ProductsCardFill(foodPackage1);
    }
}
