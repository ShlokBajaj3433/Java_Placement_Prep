package Basic.String;


public class ProductPrice {
    static String displayPrice(String Products[], int[] price){
        String result = "";
        for(int i = 0; i < Products.length; i++){
            result += Products[i] + " : " + price[i] + "\n";
        }
        System.out.println(result);
        return result;
    }

    static String SearchProduct(String Products[], int[] price, String product){
        for(int i = 0; i < Products.length; i++){
            if(Products[i].equals(product)){
                return product + " : " + price[i];
            }
        }
        return "Product not found";
    }

    static String expensiveProduct(String Products[], int[] price){
        int maxPrice = Integer.MIN_VALUE;
        String expensiveProduct = "";
        for(int i = 0; i < price.length; i++){
            if(price[i] > maxPrice){
                maxPrice = price[i];
                expensiveProduct = Products[i];
            }
        }
        return expensiveProduct + " : " + maxPrice;
    }

    static String totalPrice(int[] price){
        int total = 0;
        for(int i : price){
            total += i;
        }
        return "Total Price : " + total;
    }

    static String suggestion(String Products[], String input){
        StringBuilder result = new StringBuilder();
        for(String p : Products){
            if(p.toLowerCase().contains(input.toLowerCase())){
                result.append(p).append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String Products[] = {"laptop" , "mouse","keybaord", "monitor", "phone"};
        int price[] = {50000, 500, 1500, 12000, 3000};
        displayPrice(Products, price);
        System.out.println(SearchProduct(Products, price, "monitor"));
        System.out.println(expensiveProduct(Products, price));
        System.out.println(totalPrice(price));
        System.out.println(suggestion(Products, "ph"));
    }
}
