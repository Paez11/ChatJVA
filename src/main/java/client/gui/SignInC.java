package client.gui;

import client.Client;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SignInC extends Client {


    public SignInC() {
        super();
        Client.controller = this;
        LOGGER.info(chatJAXB.toString());
    }

    @FXML
    private TextField txtUser;

    @FXML
    private PasswordField txtPass;

    @FXML
    private Button btnSignIn;

    @FXML
    private Button btnSignUp;

    @FXML
    private void eventRegistro(ActionEvent event) throws IOException {
        Object evt = event.getSource();
        if(evt.equals(btnSignIn)){
            client.App.loadScene(new Stage(),"SignUpChat","Pantalla Principal", false, false);
        }
    }
    @FXML
    private void eventAction(ActionEvent event) throws IOException {
        Object evt = event.getSource();
        if(evt.equals(btnSignIn)){
            if(!txtUser.getText().isEmpty() && !txtPass.getText().isEmpty()){
                String user = txtUser.getText();
                String pass = txtPass.getText();
                /*if(){

                }*/
            }else{
                //Usar alerta de utils
            }
        }else{
            //Usar alerta de utils
        }
    }

    @Override
    public void refresh() {
        //if ()
    }
}
