package org.interview;

import java.util.Optional;

public class RestaurantExpenseRule implements RuleEngine{
    private static Double restaurantMaxLimit;
    RestaurantExpenseRule(double restaurantMaxLimit) {
        this.restaurantMaxLimit = restaurantMaxLimit;
    }


    @Override
    public Optional<String> rule(Expense expense) {
        if(expense.vendor_type.equals(VendorType.restaurant) && expense.amount_usd > this.restaurantMaxLimit ) {
            return Optional.of("Value exceeds restaurant max limit for expense :" + expense.expense_id);
        }
        return Optional.empty();
    }
}
