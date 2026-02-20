import java.util.Scanner;

public class ProductsCartFillByUser {

    public static void ProductsCardFill(AvailableFoodAndPrices food) {

        System.out.println("Введите товар и его количество через пробел:");
        Scanner scanner = new Scanner(System.in);

        int[] cart = new int[food.products.length];
        int sumProducts = 0;


        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                break;
            }

            String[] inputValue = input.split(" ");

            if (inputValue.length != 2){
                System.out.println("Введите 2 числа через пробел");
                continue;
            }

            int productNumber = Integer.parseInt(inputValue[0]) - 1;
            int productCount = Integer.parseInt(inputValue[1]);

            if (productNumber >= food.products.length || productNumber < 0){
                System.out.println("Продукта с номером " + (productNumber + 1) + " не существует");
                System.out.println("Введите номер от 1 до " + food.products.length);
                continue;
            }
            int currentPrice = food.prices[productNumber];

            cart[productNumber] += productCount;
            sumProducts += currentPrice * productCount;
        }

        System.out.println("Итого: " + sumProducts);

        for (int i = 0; i < food.products.length; i++) {
            System.out.println(food.products[i] + " : " + cart[i] + " -> " +
                    (food.prices[i] * cart[i]) + " руб.");

        }
        scanner.close();
    }
}
