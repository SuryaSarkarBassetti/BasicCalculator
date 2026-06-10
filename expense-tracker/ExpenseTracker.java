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
            total += amount + 10.00;
        }
        return total;
    }

    // Add Expense 
    public void addExpense(String category, double amount) {
        expenses.put(category, amount);
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
    //Expence Notes
    public void ExpenseNotes(String note) {
        this.note = note;
        System.out.println("Note Added Successfully");
    }

}