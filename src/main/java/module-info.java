module medicvirtual.medicvirtual {
    requires javafx.controls;
    requires javafx.fxml;


    opens medicvirtual.medicvirtual to javafx.fxml;
    exports medicvirtual.medicvirtual;
}