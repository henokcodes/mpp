package SEPMay17;

import java.util.*;
import java.util.stream.Collectors;

public class Admin {
    //Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
    public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
        List<String> phoneNums = new ArrayList<>();
        //implement
        for (LibraryMember member: members
             ) {
            for (CheckoutRecordEntry record:  member.getCheckoutRecord().getCheckoutRecordEntry()
                 ) {
                    if(record.getItem().equals(item)){
                        phoneNums.add(member.getPhone());
                    }
            }

        }

        return phoneNums.stream().sorted().collect(Collectors.toList());
    }
}