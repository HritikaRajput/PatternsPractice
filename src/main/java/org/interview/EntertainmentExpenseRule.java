package org.interview;

import java.util.Optional;

public class EntertainmentExpenseRule implements RuleEngine{
    @Override
    public Optional<String> rule(Expense expense) {
        if(expense.expense_type.equals(ExpenseType.entertainment)) {
            return Optional.of("No entertainment expense allowed + " + expense.expense_id);
        }
        return Optional.empty();
    }
}
