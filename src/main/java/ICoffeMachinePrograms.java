public interface ICoffeMachinePrograms {
    void info();
    boolean menu();
    void buy();
    void fill();
    void take();
    boolean exit();
    boolean conditional(int WATER_FOR_ONE_CUP, int BEANS_FOR_ONE_CUP);
    boolean conditional(int WATER_FOR_ONE_CUP, int MILK_FOR_ONE_CUP, int BEANS_FOR_ONE_CUP);
}
