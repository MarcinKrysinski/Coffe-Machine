public class CoffeeMachineResources {

    int water = 1200;
    int milk = 540;
    int coffeeBeans= 120;
    int disposableCups = 9;
    int money = 550;

    public CoffeeMachineResources() {
    }

    public CoffeeMachineResources(int water, int milk, int coffeBeans, int disposableCups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeBeans;
        this.disposableCups = disposableCups;
        this.money = money;
    }

    public void waterConsume(int minusWater){
        this.water -= minusWater;
    }

    public void waterAdd(int plusWater) {
        this.water += plusWater;
    }

    public void milkConsume(int minusMilk){
        this.milk -= minusMilk;
    }

    public void milkAdd(int plusMilk) {
        this.milk += plusMilk;
    }

    public void coffeBeansConsume(int minusCoffeBeans){
        this.coffeeBeans -= minusCoffeBeans;
    }

    public void coffeBeansAdd(int plusCoffeBeans) {
        this.coffeeBeans += plusCoffeBeans;
    }

    public void disposableCupsConsume(int minusDisposableCups){
        this.disposableCups -= minusDisposableCups;
    }

    public void disposableCupsAdd(int plusDisposableCups) {
        this.disposableCups += plusDisposableCups;
    }

    public void moneyConsume(int minusMoney){
        this.money -= minusMoney;
    }

    public void moneyAdd(int plusMoney) {
        this.money += plusMoney;
    }

    public void info(){
        System.out.println(this.water);
        System.out.println(this.coffeeBeans);
        System.out.println(this.money);
    }


    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffeBeans() {
        return coffeeBeans;
    }

    public void setCoffeBeans(int coffeBeans) {
        this.coffeeBeans = coffeBeans;
    }

    public int getDisposableCups() {
        return disposableCups;
    }

    public void setDisposableCups(int disposableCups) {
        this.disposableCups = disposableCups;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
