import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainHomeController {

    //////////////////////// MainHome.fxml (has DashBoard view) ////////////////////////////////

    @FXML
    private BorderPane boaderpane;

    public void showUsers(ActionEvent event)throws  IOException{
        AnchorPane pane= FXMLLoader.load(getClass().getResource("User.fxml"));
        boaderpane.setCenter(pane);
    }

    public  void showCustomers(ActionEvent event)throws IOException {
       AnchorPane pane= FXMLLoader.load(getClass().getResource("Customer.fxml"));
        boaderpane.setCenter(pane);
   }
    public void showCars(ActionEvent event)throws  IOException{
        AnchorPane pane= FXMLLoader.load(getClass().getResource("Cars.fxml"));
        boaderpane.setCenter(pane);
    }
    public void showCarCatagories(ActionEvent event)throws  IOException{
        AnchorPane pane= FXMLLoader.load(getClass().getResource("CarCatagories.fxml"));
        boaderpane.setCenter(pane);
    }
    public void showRents(ActionEvent event)throws  IOException{
        AnchorPane pane= FXMLLoader.load(getClass().getResource("Rent.fxml"));
        boaderpane.setCenter(pane);
    }
    @FXML
    private Parent root;
    private Stage stage;
    private Scene scene;
    private  javax.swing.JOptionPane JOptionPane;
    public  void exit(ActionEvent event)throws IOException{             ////   (Exit Button)

        root= FXMLLoader.load(getClass().getResource("Home.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setWidth(750);
        stage.setHeight(400);
        stage.setTitle("log in");
        stage.setScene(scene);
        stage.show();
    }
}
