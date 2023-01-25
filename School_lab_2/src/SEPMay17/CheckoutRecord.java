package SEPMay17;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {

    private List<CheckoutRecordEntry> checkoutRecordEntry;

    public CheckoutRecord() {
        checkoutRecordEntry = new ArrayList<>();
    }

    public List<CheckoutRecordEntry> getCheckoutRecordEntry() {
        return checkoutRecordEntry;
    }

    public void addCheckoutEntry(CheckoutRecordEntry checkoutRecordEntry) {
        this.checkoutRecordEntry.add(checkoutRecordEntry);
    }
}
