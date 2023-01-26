package Threads;

public class PrimeChecker implements Runnable{
    private int lowerLimit;
    private int upperLimit;

    public PrimeChecker(int lowerLimit, int upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    boolean isPrime(int n){
        if (n <= 1)
            return true;
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    @Override
    public void run() {
        for (int i=lowerLimit;i<=upperLimit;i++){
            if(isPrime(i)){
                System.out.println(i+ " ");
            }
        }
    }
}

