package Projects.FoodDelivery;

public class Dominoz implements RestrauntService {

    String FoodItem;

    Dominoz(String FoodItem) {
        this.FoodItem = FoodItem;
    }

    @Override
    public void acceptOrder(String CustomerName) {
        System.out.println("Hello " + CustomerName + " your " + FoodItem + " order is accepted via Dominoz");
    }

    @Override
    public void PrepareFood() {
        System.out.println("Preparing your " + FoodItem + " with extra cheese and oregano");
    }

    @Override
    public void DeliverFood() {
        System.out.println("We will deliver your pizza in 30 mins");
    }

}
