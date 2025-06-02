module org.example.messanger {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    requires org.hibernate.orm.core;
    requires jakarta.persistence;
    requires jakarta.transaction;
    requires jakarta.cdi;

    requires com.fasterxml.jackson.datatype.jsr310;
    requires com.fasterxml.jackson.databind;

    // Доступ к FXML и Entity-классам
    exports org.example.messenger.server;
    exports org.example.messenger.models;
    exports org.example.messenger.client;
    exports org.example.messenger.messages;

    // Открываем для рефлексии JavaFX и Hibernate
    //opens org.example.messenger to javafx.fxml, org.hibernate.orm.core;
    opens org.example.messenger.server to javafx.fxml, org.hibernate.orm.core;
    opens org.example.messenger.models to org.hibernate.orm.core;
    opens org.example.messenger.messages to com.fasterxml.jackson.databind, javafx.fxml, org.hibernate.orm.core;
    opens org.example.messenger.client to javafx.fxml, org.hibernate.orm.core;
}