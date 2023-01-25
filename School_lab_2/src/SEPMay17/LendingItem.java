package SEPMay17;

public class LendingItem {
    private int numCopiesInLib;

    public int getNumCopiesInLib() {
        return numCopiesInLib;
    }

    public void setNumCopiesInLib(int numCopiesInLib) {
        this.numCopiesInLib = numCopiesInLib;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Book){
            Book item = (Book)o;
            return item.equals(o);
        }else if(o instanceof CD){
            CD item = (CD)o;
            return item.equals(o);
        }else
            return false;
    }


}
