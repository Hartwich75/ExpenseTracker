package expensetracker.expensetracker.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import javax.swing.*;
import java.util.List;

public class HomeScreenView {

    private static final String title = "Expense Tracker Application";

    private static final String[] buttons = {"Add Expense", "Remove Expense"};

    public static Scene createScene() {
        BorderPane layout = new BorderPane();
        layout.setPadding(new Insets(20));

        Pane titlePane = createTitlePane();
        layout.setPadding(new Insets(20));
        layout.setTop(titlePane);

        Pane expensesPane = createExpensePane();
        layout.setPadding(new Insets(20));
        layout.setCenter(expensesPane);

        Pane buttonPane = createButtonPane();
        buttonPane.setPadding(new Insets(20));
        layout.setBottom(buttonPane);

        return new Scene(layout);
    }

    private static Pane createTitlePane() {
        HBox titlePane = new HBox();
        titlePane.setAlignment(Pos.TOP_CENTER);
        Label titleLabel = new Label(title);
        titleLabel.setFont(Font.font("Arial", FontWeight.BOLD, 40));

        titlePane.getChildren().add(titleLabel);

        return titlePane;
    }

    private static Pane createExpensePane() {
        HBox expensePane = new HBox();
        expensePane.setAlignment(Pos.CENTER);
        expensePane.setSpacing(20);

        return expensePane;
    }

    private static Pane createButtonPane() {
        HBox buttonPane = new HBox();
        buttonPane.setAlignment(Pos.CENTER);
        buttonPane.setPadding(new Insets(20));

        for (String button : buttons) {
            Button newButton = new Button(button);
            newButton.setPrefSize(200, 50);
            newButton.setOnAction(_ -> {
                switch (button) {
                    case "Add Expense":
                        //TODO: Add functionality
                        break;
                    case "Remove Expense":
                        //TODO: Add functionality
                        break;
                }
            });

            buttonPane.getChildren().add(newButton);
        }


        return buttonPane;
    }

}

