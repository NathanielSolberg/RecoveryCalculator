module com.example.recoverycalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.recoverycalculator to javafx.fxml;
    exports com.example.recoverycalculator;
}