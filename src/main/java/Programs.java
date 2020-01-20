import java.util.Scanner;

public class Programs implements ICoffeMachinePrograms {

    Scanner scanner = new Scanner(System.in);
    Coffees coffee = new Coffees();


    @Override
    public void info() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(coffee.water + " of water");
        System.out.println(coffee.milk + " of milk");
        System.out.println(coffee.coffeeBeans + " of coffee beans");
        System.out.println(coffee.disposableCups + " of disposable cups");
        System.out.println(coffee.money + " of money");
        System.out.println();

    }

    @Override
    public void menu() {


        System.out.println("Write action (buy, fill, take): ");
        String action = scanner.nextLine();

        switch (action){

            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
        }

    }

    @Override
    public void buy() {


//        System.out.println(coffee.water);
//        System.out.println(coffee.coffeeBeans);
//        System.out.println(coffee.money);



        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        int selectedCoffe =  scanner.nextInt();

        switch(selectedCoffe){

            case 1:
                coffee.esspresso();
                break;

            case 2:
                coffee.latte();
                break;

            case 3:
                coffee.cappuccino();
                break;
        }

    }

    @Override
    public void fill() {

        System.out.println("Write how many ml of water do you want to add: ");
        int plusWater = scanner.nextInt();
        coffee.waterAdd(plusWater);

        System.out.println("Write how many ml of milk do you want to add: ");
        int plusMilk = scanner.nextInt();
        coffee.milkAdd(plusMilk);

        System.out.println("Write how many grams of coffee beans do you want to add: ");
        int plusCoffeeBeans = scanner.nextInt();
        coffee.coffeBeansAdd(plusCoffeeBeans);

        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        int plusDisposableCups = scanner.nextInt();
        coffee.disposableCupsAdd(plusDisposableCups);

    }

    @Override
    public void take() {

        System.out.println("I gave you " + coffee.money);
        coffee.moneyConsume(coffee.money);

    }
}
