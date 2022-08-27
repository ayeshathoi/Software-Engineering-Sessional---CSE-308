package BurgerShop.Clients;

import BurgerShop.AppetizerPackage.FrenchFries;
import BurgerShop.AppetizerPackage.OnionRings;
import BurgerShop.BurgerPackage.BeefBurger;
import BurgerShop.BurgerPackage.ChickenBurger;
import BurgerShop.BurgerPackage.VeggiBurger;
import BurgerShop.BurgerPackage.addCheese;
import BurgerShop.DrinkPackage.Coffee;
import BurgerShop.DrinkPackage.Coke;
import BurgerShop.DrinkPackage.Water;
import BurgerShop.MealDecoratorPackage.Meal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("You can order :\n" +
                "1. Beef burger with French fry and cheese\n" +
                "2. Veggi Pizza with onion rings and Bottle of Water\n" +
                "3. A combo meal with Veggi burger, French Fry and Coke\n" +
                "4. A combo meal with Veggi burger, Onion Rings, Coffee and Water\n" +
                "5. A Beef burger only\n");

        System.out.println("Enter your choice :");
        int choice = scanner.nextInt();


        int number;
        Meal bb = new BeefBurger(); //Beef Burger
        Meal vb = new VeggiBurger(); //Veggie Burger
        Meal cb = new ChickenBurger(); // Chicken Burger

//        Meal = BeefBurger with Cheese and FrenchFries
//        Meal cbb = new addCheese(bb);//add cheese
//        Meal cvb = new addCheese(vb);//add cheese
//        Meal ccb = new addCheese(cb);//add cheese
        if (choice == 1) {
            Meal food = new FrenchFries(new addCheese(bb));
            System.out.println(food.description());
            System.out.println("Cost : " + food.getCost());
        }

        //Veggi Burger 200 with onion rings 50 and Water 10 --pack
        if (choice == 2) {
            System.out.println("How many water bottle do you want Veggi Burger, Onion Rings and Water Combo?");
            number = scanner.nextInt();
            Meal meal2 = new Water(new OnionRings(vb), number);
            System.out.println(meal2.description());
            System.out.println("Cost : " + meal2.getCost());
        }


        //A combo meal with Veggi Burger 200, French Fry 70 and Coke 30
        if (choice == 3) {
            Meal ff = new FrenchFries(vb);
            System.out.println("How many coke do you want for Veggi Burger,French Fry and Coke Combo?");
            number = scanner.nextInt();
            Meal meal3 = new Coke(ff, number);
            System.out.println(meal3.description());
            System.out.println(meal3.getCost());
        }

        //A combo meal with Veggi Burger 200, Onion Rings 50 and Coffee 50 and Water 10
        if (choice == 4) {
            System.out.println("How many Coffee do you want for Veggi Burger,Onion Rings and Coffee and Water Combo?");
            number = scanner.nextInt();
            System.out.println("How many Water do you want for the same Combo?");
            int n = scanner.nextInt();
            Meal o = new OnionRings(vb);
            Meal main = new Coffee(new Water(o, n), number);
            System.out.println(main.description());
            System.out.println(main.getCost());
        }


        //A Beef Burger only
        if (choice == 5) {
            System.out.println(bb.description());
            System.out.println(bb.getCost());

        }
    }
}
