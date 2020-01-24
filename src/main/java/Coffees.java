class Coffees extends CoffeeMachineResources {

    static final int cupsConsume = 1;

    static final int espressoWater = 250;
    static final int espressoCoffeeBeans = 16;
    private static final int espressoCost = 4;

    static final int latteWater = 350;
    static final int latteMilk = 75;
    static final int latteCoffeeBeans = 20;
    private static final int latteCost = 7;

    static final int cappuccinoWater = 200;
    static final int cappuccinoMilk = 100;
    static final int cappuccinoCoffeeBeans = 12;
    private static final int cappuccinoCost = 6;

    void espresso(){
        waterConsume(espressoWater);
        coffeBeansConsume(espressoCoffeeBeans);
        disposableCupsConsume(cupsConsume);
        moneyAdd(espressoCost);
    }

    void latte(){
        waterConsume(latteWater);
        milkConsume(latteMilk);
        coffeBeansConsume(latteCoffeeBeans);
        disposableCupsConsume(cupsConsume);
        moneyAdd(latteCost);
    }

    void cappuccino(){
        waterConsume(cappuccinoWater);
        milkConsume(cappuccinoMilk);
        coffeBeansConsume(cappuccinoCoffeeBeans);
        disposableCupsConsume(cupsConsume);
        moneyAdd(cappuccinoCost);
    }

}
