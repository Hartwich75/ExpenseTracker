package expensetracker.expensetracker.models;

public class Expense {
    private int id;
    private int date;
    private double amount;
    private Category category;
    private String description;

    public Expense(int id, int date, double amount, String category, String description) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.category = Category.valueOf(category);
        this.description = description;
    }

}

