package Threads;

public class Main {



    public static void main(String[] args) {
        PrimeChecker object1 = new PrimeChecker(1,20);
        PrimeChecker object2 = new PrimeChecker(21,40);
        PrimeChecker object3 = new PrimeChecker(41,60);
        PrimeChecker objec4 = new PrimeChecker(61,80);

        new Thread(object1).start();
        new Thread(object2).start();
        new Thread(object3).start();
        new Thread(objec4).start();



    }
}
