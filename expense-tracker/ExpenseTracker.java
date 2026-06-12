import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ExpenseTracker {
    Map<String, Double> expenses;
    public String note;
    public static void main(String[] args) {
        System.out.println("Expense Tracker Application");
    }
    public double calculateMonthlyTotal(double expense1, double expense2, double expense3) {
        double total = 0;
        for (Double amount : expenses.values()) {
            total += amount;
        }
        return total;
    }
    // Add Expense
    public void addExpense(String category, double amount) {
        
        expenses.put(category, amount);
        System.out.println("Expense Added Successfully");
    }
// Add food Expense
    public void addFoodExpense(String category, double amount) {
        
        expenses.put(category, amount);
        System.out.println("Expense Added Successfully");
    }
    public void addTravelExpense(double amount){
            public double travelExpense=0;
            travelExpense+=amount+10;
            return travelExpense;
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
    //Add Category Validation
    private static final set<string>VALID_CATEGORIES = set.of(
        "Food",
        "Travel",
        "Shopping",
        "Medical",
        "Entertainment",
        "Other"
    );
    public static boolean isValidCategory(String category){
        return VALID_CATEGORIES.contains(category);
    }
    //Expence Notes
    public void ExpenseNotes(String notestrString) {
        this.note = notestrString;
        System.out.println("Note Added Successfully");
    }
// Highest Expense
public void showHighestExpense() {
    if (expenses.isEmpty()) {
        System.out.println("No Expenses Found");
        return;
    }
    String highestCategory = "";
    double highestAmount = Double.MIN_VALUE;
    for (Map.Entry<String, Double> expense : expenses.entrySet()) {
        if (expense.getValue() > highestAmount) {
            highestAmount = expense.getValue();
            highestCategory = expense.getKey();
        }
    }
    System.out.println("Highest Expense:");
    System.out.println("Category: " + highestCategory);
    System.out.println("Amount: " + highestAmount);
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
    //Add Other Expense
    public void addotherexpenses(double amount) {
        expenses.put("Other", amount);
        System.out.println("Other Expense Added Successfully");
    }
// Expense Search by Category
public void ExpenseSearch(String category) {
    if (expenses.containsKey(category)) {
        System.out.println("Category Found: " + category);
    } else {
        System.out.println("Category Not Found: " + category);
    }
}
// Add Shopping Expense
	public void shoppingexpense(String itemName, double itemPrice, int numberOfItem){
        double totalPrice = ItemPrice * numberOfItem;
        System.out.println("Item name is :" +itemName);
        System.out.println("Item price is :" +itemPrice);
        System.out.println("Number of item is :" +numberOfItem);
        System.out.println("Total expenses for " +itemName+ " is :" +totalPrice);
    }
}
}
//Feature implimented "Add Entertainment Expense"
public class AddEntertainmentExpense {
    private double expense = 0;
    public void addEntertainmentExpense(double amt) {
        expense += amt;
    }
    public double getEntertainmentExpense() {
        return expense;
    }
}
//Add a feature Expense filter
public void filterExpense(String category, double minAmount, double maxAmount) {
    if (expenses == null || expenses.isEmpty()) {
        System.out.println("No Expenses Found");
        return;
    }
    boolean found = false;
    for (Map.Entry<String, Double> expense : expenses.entrySet()) {
        String expenseCategory = expense.getKey();
        double amount = expense.getValue();
        boolean categoryMatch = (category == null || category.isEmpty())
                || expenseCategory.equalsIgnoreCase(category);
        boolean amountMatch = amount >= minAmount && amount <= maxAmount;
        if (categoryMatch && amountMatch) {
            System.out.println(
                    "Category: " + expenseCategory +
                    " | Amount: " + amount);
            found = true;
        }
    }
    if (!found) {
        System.out.println("No matching expenses found.");
    }
    //Add Medical Expense
    public void addMedicalExpense() {
        System.out.println("Other Expense Added Successfully");
    }
}
