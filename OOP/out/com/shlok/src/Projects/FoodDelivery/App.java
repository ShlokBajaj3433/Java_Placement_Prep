package Projects.FoodDelivery;

public class App {
    public static void main(String[] args) {
        // RestrauntService service = new RestrauntService();

        System.out.println(RestrauntService.Restrauntype);

        RestrauntService order = new BurgerKing("Whooper Burger");
        RestrauntService PizOrder = new Dominoz("Pizza");

        order.acceptOrder("Pankaj");
        PizOrder.acceptOrder("Shlok");

        order.PrepareFood();

        PizOrder.DeliverFood();

    }
}