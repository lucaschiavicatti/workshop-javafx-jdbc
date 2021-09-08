module com.course.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.sql;
    requires mysql.connector.java;

    opens com.course.workshopjavafxjdbc to javafx.fxml;
    exports com.course.workshopjavafxjdbc;
    exports model.entities;
    opens model.entities to javafx.fxml;
    exports controller;
    opens controller to javafx.fxml;
}