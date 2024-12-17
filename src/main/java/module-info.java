module com.arendjavales.gitdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.arendjavales.gitdemo to javafx.fxml;
    exports com.arendjavales.gitdemo;
}