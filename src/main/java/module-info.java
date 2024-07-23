module fr.afpa.democss {
    requires transitive javafx.controls;
    requires javafx.fxml;

    opens fr.afpa.democss to javafx.fxml;
    exports fr.afpa.democss;
}
