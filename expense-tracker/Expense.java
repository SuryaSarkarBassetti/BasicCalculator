import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Expense {

    private final String category;
    private final double amount;
    private final String note;
    private final LocalDateTime date;

    public Expense(String category, double amount, String note) {
        this.category = category;
        this.amount = amount;
        this.note = note == null ? "" : note;
        this.date = LocalDateTime.now();
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public String getNote() {
        return note;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getFormattedDate() {
        return date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }

    @Override
    public String toString() {
        return String.format("Category: %s | Amount: %.2f | Note: %s | Date: %s",
                category, amount, note.isEmpty() ? "(none)" : note, getFormattedDate());
    }
    // add LowestExpense 
public class LowestExpense 
{
 public static double getLowestExpense(List<Double> expenses)
     {
        return Collections.min(expenses);
    }
}
    // add Expense Count
public class ExpenseCount {

    public static int getExpenseCount(List<?> expenses) {
        return expenses.size();
    }
}


}
