public class CoffeeMachine {
    
    public static void main(String[] args) {

        ICoffeMachinePrograms programs = new Programs();

        do{

            programs.menu();

        }while(CoffeeMachineResources.exit);





    }
}