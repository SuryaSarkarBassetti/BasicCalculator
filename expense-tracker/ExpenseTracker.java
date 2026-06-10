import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpenseTracker {

    Map<String, Double> expenses;
    private List<Expense> expense;

    public ExpenseTracker() {
        this.expenses = new HashMap<>();
        this.expense = new ArrayList<>();
    }

    public static void main(String[] args) {
        System.out.println("Expense Tracker Application");
    }

    public double calculateMonthlyTotal(double expense1, double expense2, double expense3) {
        double total = 0;
        for (Double amount : expenses.values()) {
            total += amount + 10.00;
        }
        return total;
    }

    // Add Expense
    public void addExpense(String category, double amount) {
        expenses.put(category, amount);
        expense.add(new Expense(category, amount, "Added from tracker"));
        System.out.println("Expense Added Successfully");
    }

    // View Expense
    public void viewExpense() {
        if (expenses.isEmpty()) {
            System.out.println("No Expenses Found");
            return;
        }
        System.out.println("\nExpense List:");
        for (Map.Entry<String, Double> expense : expenses.entrySet()) {
            System.out.println(
                    "Category: " + expense.getKey() +
                            " | Amount: " + expense.getValue());
        }
    }

 // Expense Report Feature is added to provide users a summary of their expenses, including total amount spent and breakdown by category.
    public String ExpenseReport() {
        if (expense == null || expense.isEmpty()) {
            return "No expenses recorded yet.";
        }

        Map<String, Double> categoryTotals = new HashMap<>();
        double totalAmount = 0.0;

        for (int i = 0; i < expense.size(); i++) {
            Expense entry = expense.get(i);
            double amount = entry.getAmount();
            String category = entry.getCategory();
            categoryTotals.put(category, categoryTotals.getOrDefault(category, 0.0) + amount);
            totalAmount += amount;
        }

        StringBuilder report = new StringBuilder();
        report.append("========== EXPENSE REPORT ==========");
        report.append("\nTotal Expenses: ").append(expense.size());
        report.append(String.format("\nTotal Amount Spent: $%.2f", totalAmount));
        report.append("\nCategory Breakdown:");

        for (Map.Entry<String, Double> entry : categoryTotals.entrySet()) {
            report.append(String.format("\n - %s: $%.2f", entry.getKey(), entry.getValue()));
        }

        report.append("\n==================================");
        return report.toString();
    }
}