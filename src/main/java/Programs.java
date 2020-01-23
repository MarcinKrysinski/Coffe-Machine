import java.util.Scanner;

public class Programs<T> implements ICoffeMachinePrograms {

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
    public boolean menu() {


        System.out.println("Write action (buy, fill, take, remaining, exit): ");
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
            case "remaining":
                info();
                break;
            case "exit":
                exit();
                break;
        }

        return CoffeeMachineResources.exit;
    }

    @Override
    public void buy() {


//        System.out.println(coffee.water);
//        System.out.println(coffee.coffeeBeans);
//        System.out.println(coffee.money);



        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String selectedCoffee =  scanner.nextLine();

        switch(selectedCoffee){

            case "1":
                boolean x1 = conditional(Coffees.espressoWater, Coffees.espressoCoffeeBeans);
                if(x1) {
                    coffee.esspresso();
                }else{
                    break;
                }
                break;


            case "2":
                boolean x2 = conditional(Coffees.latteWater,Coffees.latteMilk, Coffees.latteCoffeeBeans);
                if(x2) {
                    coffee.latte();
                }else{
                    break;
                }
                break;


            case "3":
                boolean x3 = conditional(Coffees.cappuccinoWater, Coffees.cappuccinoMilk, Coffees.cappuccinoCoffeeBeans);
                if(x3) {
                    coffee.cappuccino();
                }else{
                    break;
                }
                break;

            case "back":
                menu();
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

        System.out.println("I gave you $" + coffee.money);
        coffee.moneyConsume(coffee.money);

    }

    @Override
    public boolean exit() {
        return CoffeeMachineResources.exit = false;
    }


    @Override
    public boolean conditional(int WATER_FOR_ONE_CUP, int BEANS_FOR_ONE_CUP){
        int maximumCups = Math.min(coffee.water / WATER_FOR_ONE_CUP, coffee.coffeeBeans / BEANS_FOR_ONE_CUP);
//
        if (maximumCups >= 1) {
            System.out.println("Yes, I can make that amount of coffee");
            return true;
//        } else if (maximumCups > 1) {
//            System.out.println("Yes, I can make that amount of coffee (and even " +
//                    (maximumCups - 1) + " more than that)");
        } else {
            System.out.println("No, I can make only " + maximumCups + " cup(s) of coffee");
            return false;
        }
    }


    @Override
    public boolean conditional(int WATER_FOR_ONE_CUP, int MILK_FOR_ONE_CUP, int BEANS_FOR_ONE_CUP){
        int maximumCups = Math.min(Math.min(coffee.water / WATER_FOR_ONE_CUP, coffee.milk / MILK_FOR_ONE_CUP), coffee.coffeeBeans / BEANS_FOR_ONE_CUP);
//
        if (maximumCups >= 1) {
            System.out.println("Yes, I can make that amount of coffee");
            return true;
//        } else if (maximumCups > 1) {
//            System.out.println("Yes, I can make that amount of coffee (and even " +
//                    (maximumCups - 1) + " more than that)");
        } else {
            System.out.println("No, I can make only " + maximumCups + " cup(s) of coffee");
            return false;
        }
    }




}
