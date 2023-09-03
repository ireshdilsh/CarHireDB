import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import util.SessionFactoryConfiguration;
import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {

        Parent root=FXMLLoader.load(getClass().getResource("Home.fxml"));
        primaryStage.setTitle("Log in");
        primaryStage.setScene(new Scene(root,750,360));  //width,height
        primaryStage.show();
        //primaryStage.close();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
//Session session=SessionFactoryConfiguration.getInstance().getSession();           //   Homepage
    }

}

