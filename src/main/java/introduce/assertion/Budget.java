package introduce.assertion;

public class Budget {
    private static final double NULL_EXPENSE = 0f;
    private double _expenseLimit;
    private Project _primaryProject;

    double getExpenseLimit() {
        // should have either expense limit or a primary project
        return (_expenseLimit != NULL_EXPENSE) ?
                _expenseLimit :
                _primaryProject.getMemberExpenseLimit();
    }
}
