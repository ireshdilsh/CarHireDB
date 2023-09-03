import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;
import util.SessionFactoryConfiguration;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root= FXMLLoader.load(getClass().getResource("iresh.fxml"));
        stage.setScene(new Scene(root,750,620));
        stage.setTitle("hello iresh");
        stage.show();
    }
}
