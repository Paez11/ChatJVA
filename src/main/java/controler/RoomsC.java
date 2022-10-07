package controler;

import client.App;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;
import model.Room;

import java.net.URL;
import java.util.ResourceBundle;

public class RoomsC implements Initializable {

    App a = new App();
    private static Stage stg=new Stage();

    @FXML
    private TableView<Room> roomsTable;

    @FXML
    private TableColumn<Room, String> room;

    @FXML
    private Button exit;

    @FXML
    private ToggleButton darkMode;

    /**
     * Cargar rooms
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        roomList();
        roomsTable.refresh();
    }

    public void roomList(){
        room.setCellValueFactory(r ->{
            SimpleStringProperty ssp = new SimpleStringProperty();
            ssp.setValue(r.getValue().getName());
            return ssp;
        });
    }

    public void selectRoom(){

    }

    public void selectDarkMode(){
        darkMode.selectedProperty().addListener((obs, wasSelected, isSelected) -> {
            if (isSelected) {
                //scene.getStyleSheets().add("dark-theme.css");
            } else {
                //scene.getStyleSheets().remove("dark-theme.css");
            }
        });
    }

    public void exit(){
        goExit();
    }

    private void goExit(){
        App.loadScene(stg,"SingInChat.fxml","ChatJVA",true,true);
    }
}
