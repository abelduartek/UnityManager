package br.com.unitymanager.main;

import br.com.unitymanager.util.Constants;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(Constants.telaLoginFxml));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add(Constants.telaLoginCss);
        Image applicationIcon = new Image(getClass().getResourceAsStream(Constants.iconeUnityManager));
        stage.getIcons().add(applicationIcon);
        stage.setResizable(false);
        stage.setTitle(Constants.tituloTelaLogin);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}
