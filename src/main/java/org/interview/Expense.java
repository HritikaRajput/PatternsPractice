package org.interview;

public class Expense {
    String expense_id;
    String trip_id;
    Double amount_usd;
    ExpenseType expense_type; // enum
    VendorType vendor_type; // enum
    String vendor_name;

    Expense(String expense_id, String trip_id, Double amount_usd, ExpenseType expense_type, VendorType vendor_type
    , String vendor_name) {
        this.expense_id = expense_id;
        this.trip_id = trip_id;
        this.amount_usd = amount_usd;
        this.expense_type =expense_type;
        this.vendor_type = vendor_type;
        this.vendor_name = vendor_name;
    }
}
