package org.interview;

import java.util.Optional;

public class MaxExpenseRule implements RuleEngine{
    double maxLimitAllowed;
    MaxExpenseRule(double maxLimitAllowed) {
        this.maxLimitAllowed = maxLimitAllowed;
    }
    @Override
    public Optional<String> rule(Expense expense) {
        if(expense.amount_usd > this.maxLimitAllowed) {
            return Optional.of("Value exceeds total allowed limit: "+ expense.expense_id);
        }
        return Optional.empty();
    }
}
