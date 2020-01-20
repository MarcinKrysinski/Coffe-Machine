public class Coffees extends CoffeeMachineResources {

    void esspresso(){
        waterConsume(250);
        coffeBeansConsume(16);
        disposableCupsConsume(1);
        moneyAdd(4);
    }

    void latte(){
        waterConsume(350);
        milkConsume(75);
        coffeBeansConsume(20);
        disposableCupsConsume(1);
        moneyAdd(7);
    }

    void cappuccino(){
        waterConsume(200);
        milkConsume(100);
        coffeBeansConsume(12);
        disposableCupsConsume(1);
        moneyAdd(6);
    }

}
