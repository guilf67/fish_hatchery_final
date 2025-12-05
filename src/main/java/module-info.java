module com.example.fish_hatchery_final {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;



    opens com.example.fish_hatchery_final to javafx.fxml;
    exports com.example.fish_hatchery_final;

    exports com.example.fish_hatchery_final.faisal;
    opens com.example.fish_hatchery_final.faisal to javafx.fxml;


}