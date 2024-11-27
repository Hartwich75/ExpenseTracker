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

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

