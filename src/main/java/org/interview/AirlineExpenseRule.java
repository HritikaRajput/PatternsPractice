package org.interview;

import java.util.Optional;

public class AirlineExpenseRule implements RuleEngine{
    @Override
    public Optional<String> rule(Expense expense) {
        if(expense.expense_type.equals(ExpenseType.airline)) {
            return Optional.of("No airline expense allowed + " + expense.expense_id);
        }
        return Optional.empty();
    }
}
