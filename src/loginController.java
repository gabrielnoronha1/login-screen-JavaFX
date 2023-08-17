import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class loginController {

    @FXML
    private Button buttonLogin;

    @FXML
    private TextField passwordField;

    @FXML
    private TextField userField;

    @FXML
    void makeLogin(ActionEvent event) {
        String user = userField.getText();
        String password = passwordField.getText();

        if(user.equals("admin") && password.equals("1234")) {
            System.out.println("successfully logged in");
        } else {
            System.out.println("incorret username or password");
        }
    }

}