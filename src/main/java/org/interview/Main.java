package org.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<RuleEngine> rules = new ArrayList<>();
        rules.add(new RestaurantExpenseRule(75));
        rules.add(new AirlineExpenseRule());
        rules.add(new EntertainmentExpenseRule());
        rules.add(new MaxExpenseRule(250.0));

//        expenses.add(new HashMap<String, String>() {
//           {
//        put("expense_id", "003");
//        put("trip_id", "002");
//        put("amount_usd", "153.00");
//        put("expense_type", "meals");
//        put("vendor_type", "restaurant");
//        put("vendor_name", "Olive Yurt");
//      }
//
//        {
//            put("expense_id", "004");
//            put("trip_id", "002");
//            put("amount_usd", "1996.00");
//            put("expense_type", "airfare");
//            put("vendor_type", "transportation");
//            put("vendor_name", "Southeast Airlines");
//        }
//        });

        List<Expense> expenses = new ArrayList<>();
        expenses.add(new Expense("001", "001", 49.99, ExpenseType.supplies, VendorType.restaurant , "Outback Roadhouse"));
        expenses.add(new Expense("003", "002", 153.0, ExpenseType.meals, VendorType.restaurant , "Outback Roadhouse"));
        expenses.add(new Expense("004", "002", 1996.0, ExpenseType.airline, VendorType.transportation , "Outback Roadhouse"));

        evaluateRules(rules, expenses);
    }

    private static HashMap<String, List<String>> evaluateRules(List<RuleEngine> rules,List<Expense> expenses) {
        HashMap<String, List<String>> tripsToRulesViolationsMap = new HashMap<>();
        // tripId
        // List<String> tripRulesViolation
        //  List<String> expenseRuleViolations

        for (Expense expense : expenses) {

            List<String> rulesViolating = new ArrayList<>();
            for (RuleEngine ruleEngine : rules) {
                Optional<String> ruleViolation = ruleEngine.rule(expense);
                if (ruleViolation.isPresent()) { // particular instance of rule was violated
                    rulesViolating.add(ruleViolation.get());
                }

            }
            String curTripId = expense.trip_id;


            for (int i = 0; i < rulesViolating.size(); i++) {
                System.out.println(rulesViolating.get(i));
            }
        }


        return tripsToRulesViolationsMap;
    }
}
