package schoolLab2;

public interface IPerson {
        default void myDefault(){
            System.out.println("From default");
        }
    static void myStatic(){
        System.out.println("From static");
    }

    abstract void myAbstract();
}
