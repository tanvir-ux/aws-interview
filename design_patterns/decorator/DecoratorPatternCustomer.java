import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DecoratorPatternCustomer {
    private static int choice;

    public static void main(String[] args) throws NumberFormatException, IOException{
        do {
            System.out.println("===============MENU=================\n");
            System.out.println("             1. Veg             \n");
            System.out.println("             2. Non Veg         \n");
            System.out.println("             3. Chinese         \n");
            System.out.println("             4. Exit            \n");
            System.out.println("Enter your choice");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            choice = Integer.parseInt(br.readLine());

            switch(choice) {
                case 1: {
                    VegFood vf = new VegFood();
                    System.out.println(vf.prepareFood());
                    System.out.println(vf.foodPrice());
                } break;
                case 2: {
                    Food nonVeg = new NonVegFood( (Food) new VegFood());
                    System.out.println(nonVeg.prepareFood());
                    System.out.println(nonVeg.foodPrice());
                } break;
                case 3: {
                    Food chineseFood = new ChineseFood((Food) new VegFood());
                    System.out.println(chineseFood.prepareFood());
                    System.out.println(chineseFood.foodPrice());
                } break;
                default: {
                    System.out.println("Sorry! choose correctly");
                }
                return;
            }
        } while(choice != 4);
    }
}