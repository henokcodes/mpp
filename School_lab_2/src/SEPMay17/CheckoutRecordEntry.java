package SEPMay17;

import java.time.LocalDate;

public class CheckoutRecordEntry {

    private LocalDate checkoutDate;
    private LocalDate dueDate;
    private LendingItem item;
    private ItemType type;

    public CheckoutRecordEntry(LendingItem item,LocalDate checkoutDate, LocalDate dueDate,  ItemType type) {
        this.checkoutDate = checkoutDate;
        this.dueDate = dueDate;
        this.item = item;
        this.type = type;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(LocalDate checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public LendingItem getItem() {
        return item;
    }

    public void setItem(LendingItem item) {
        this.item = item;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }
}
