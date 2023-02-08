package medicvirtual.medicvirtual;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.IOException;


public class MedicVirtualApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MedicVirtualApplication.class.getResource("Dashboard.fxml"));
        stage.setTitle("Dashboard");
        String startDir = System.getProperty("user.dir");
        String imgDir = startDir + "/src/main/resources/medicvirtual/medicvirtual/images/";
        stage.getIcons().add(new Image(imgDir + "MedicVirtual_logo.png"));
        Scene scene = new Scene(fxmlLoader.load(), 787, 480);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}