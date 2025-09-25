package org.interview;

import java.util.Optional;

public interface RuleEngine {
    Optional<String> rule(Expense expense);
}
