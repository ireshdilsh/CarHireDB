import dto.UserDto;
import entity.UserEntity;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.io.IOException;
//peheadara

public class Controller {
    @FXML
    private  Parent root;
    private Stage stage;
    private Scene scene;

  private javax.swing.JOptionPane JOptionPane;

                                  ////////////////  FirstPage.fxml and MainHome.fxml  (has DashBoard view)
   @FXML
   void RegisterXindow(ActionEvent event) throws IOException {         //(sign up Button)
       root=FXMLLoader.load(getClass().getResource("FirstPage.fxml"));
       stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
       scene=new Scene(root);
       stage.setWidth(750);
       stage.setTitle("Register");
       stage.setHeight(565);
       stage.setScene(scene);
       stage.show();
   }

    public void goHome(ActionEvent event) throws IOException{             //(loginButton)
        root= FXMLLoader.load(getClass().getResource("MainHome.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setWidth(1200);
        stage.setHeight(700);
        stage.setTitle("Welcome");
        stage.setScene(scene);
        stage.show();

       // UserDto dto=new UserDto(nameT);
    }
}
