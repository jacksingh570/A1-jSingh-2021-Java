package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import java.util.ResourceBundle;
import java.net.URL;

public class Controller {

    @FXML
    private Label lblFName;

    @FXML
    private Label lblLName;

    @FXML
    private Label lblSNumber;

    @FXML
    private Label lblFActivities;

    @FXML
    private Label txtFName;

    @FXML
    private Label txtLName;

    @FXML
    private Label txtSNumber;

    @FXML
    private Label txtFActivities;

    @FXML
    ListView<String> lstFActivities = new ListView<String>();

    @FXML
    private ImageView imgImage;

    @FXML
    private Button btnShowStudent;

    @FXML
    public void fillStudentProfile(){
        txtFName.setText("Jack");
        txtLName.setText("Singh");
        txtSNumber.setText(Integer.toString(1141574));
        lstFActivities.getItems().add("Hockey");
        lstFActivities.getItems().add("Seeing Friends");
        lstFActivities.getItems().add("Sleep");
    }

    public void showStudent() {
        txtFName.setText("Jack");
        txtLName.setText("Singh");
        txtSNumber.setText("1145174");
        lstFActivities.getItems().add("Hockey");
        lstFActivities.getItems().add("Seeing Friends");
        lstFActivities.getItems().add("Skiing");
        lstFActivities.getItems().add("Boxing");
    }

}
