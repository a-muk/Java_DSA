module com.example.java_programs {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_programs to javafx.fxml;
    exports com.example.java_programs;
    exports properties.interhitance;
    opens properties.interhitance to javafx.fxml;
}