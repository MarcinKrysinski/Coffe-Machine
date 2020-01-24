public interface ICoffeMachinePrograms {
    void info();
    void menu();
    void buy();
    void fill();
    void take();
    void exit();
    boolean conditional(int WATER_FOR_ONE_CUP, int BEANS_FOR_ONE_CUP, int CUPS_FOR_ONE_CUP);
    boolean conditional(int WATER_FOR_ONE_CUP, int MILK_FOR_ONE_CUP, int BEANS_FOR_ONE_CUP, int CUPS_FOR_ONE_CUP);
}
