public class NonVegFood extends FoodDecorator {
    public NonVegFood(Food newFood) {
        super(newFood);
    }

    public String prepareFood() {
        return super.prepareFood() + " with Roasted Chicken and Chicken Curry";
    }

    public double foodPrice() {
        return super.foodPrice() + 150.0;
    }
}