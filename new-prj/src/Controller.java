import dao.CustomerDao;
import dto.CustomerDto;
import entity.Customer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField addressText;
    @FXML
    private TextField nameText;
    @FXML
    private TextField provinceText;
    @FXML
    private TextField usernameText;

    public void saveUser(ActionEvent event){
      saveuser();
    }

    private void saveuser() {
        CustomerDao dao=new CustomerDao();
        Customer customer=new Customer(usernameText.getText(), nameText.getText(), addressText.getText(), provinceText.getText());
        dao.saveUser(customer);
clear();
    }
    public void clear(){
        usernameText.setText("");
        nameText.setText("");
        addressText.setText("");
        provinceText.setText("");
    }

}
