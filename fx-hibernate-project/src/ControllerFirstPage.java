import controller.UserController;
import dao.UserRepository;
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

public class ControllerFirstPage {

    ///////////////////////  FirstPage.fxml    /////////////////////////

    @FXML
    private Parent root;
    private Stage stage;
    private Scene scene;

    private javax.swing.JOptionPane JOptionPane;

    public void BacktoHomepage(ActionEvent event)throws IOException {           //  switch register form ----> Log in page

        root= FXMLLoader.load(getClass().getResource("Home.fxml"));
        stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setWidth(750);
        stage.setHeight(400);
        stage.setTitle("log in");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private TextField idTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField mobilenoTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private TextField usernameTextField;

    UserController controller=new UserController();
public void saveUser(ActionEvent event){
    try {
        UserEntity entity = new UserEntity();
        UserRepository repository = new UserRepository();
        UserDto dto = new UserDto(Integer.parseInt(idTextField.getText()),
                nameTextField.getText(),
                emailTextField.getText(),
                Integer.parseInt(mobilenoTextField.getText()),
                usernameTextField.getText(),
                passwordTextField.getText());

        String resp = controller.saveUser(dto);
        repository.saveUser(entity);
        JOptionPane.showMessageDialog(null, resp);
        clear();
    }catch (Exception e){

    }
}
public void clear(){
    nameTextField.setText("");
    idTextField.setText("");
    emailTextField.setText("");
    mobilenoTextField.setText("");
    usernameTextField.setText("");
    passwordTextField.setText("");

}
}
