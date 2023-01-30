package Threads;

import java.util.TreeSet;

public class PrimeChecker implements Runnable{
    private int lowerLimit;
    private int upperLimit;
    public static TreeSet<Integer> treeSet = new TreeSet<>();

    public PrimeChecker(int lowerLimit, int upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    boolean isPrime(int n){
        if (n <= 1)
            return true;
          for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    @Override
    public void run() {
        for (int i=lowerLimit;i<=upperLimit;i++){
            if(isPrime(i)){
                treeSet.add(i);
            }
        }

    }
    public static void print(){
        System.out.println(treeSet);
    }

}

