module com.projectg3.mavenproject1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.projectg3.mavenproject1 to javafx.fxml;
    exports com.projectg3.mavenproject1;
}
