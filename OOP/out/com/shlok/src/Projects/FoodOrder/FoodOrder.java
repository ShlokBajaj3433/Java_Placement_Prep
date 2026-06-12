package Projects.FoodOrder;

public class FoodOrder {
    void Order(){
        System.out.println("NO Ithem selected");
    }

    void Order(String name){
        System.out.println("Order Ithem: "+ name);
    }

    void Order(String name, int qty){
        int price = 30;
        int total = price * qty;

        System.out.println(" Item :"+ name +" Quantity :"+ qty+" Total :" +total);
    }

    void Order(String name, int qty, int discoutn){
        int price = 20;
        int Total = price * discoutn;
        Total =Total- (Total*discoutn /100 );
        System.out.println(" Item :"+ name +" Quantity :"+ qty+" Total :" +Total);
    }

    void Order(String items[], int Quantity[]){
        if (items.length == Quantity.length) {
            
        }
        else{
            
        }
    }
}
