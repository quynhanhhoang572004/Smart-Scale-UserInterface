package SenseXP;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.input.InputMethodEvent;


import java.io.IOException;

public class GeneralController {


    @FXML
    private AnchorPane DashBoard;

    @FXML
    private Button DashBoardButton;

    @FXML
    private MenuButton DropDown;

    @FXML
    private StackPane GeneralStackPane;

    @FXML
    private Label OptionLabel;

    @FXML
    private Label UserName;

    @FXML
    private Button btn_AddExperiment;

    @FXML
    private AnchorPane dashboardPanel;

    @FXML
    private AnchorPane headPanel;

    @FXML
    private Label lbl_DashBoard;

    @FXML
    private Label lbl_SenseXP;

    @FXML
    private Label lbl_createDate;

    @FXML
    private Label lbl_creator;

    @FXML
    private Label lbl_currentVersion;

    @FXML
    private Label lbl_entries;

    @FXML
    private Label lbl_experimentName;

    @FXML
    private Label lbl_iD;

    @FXML
    private Label lbl_lastM;

    @FXML
    private Label lbl_result;

    @FXML
    private Label lbl_show;

    @FXML
    private TextField searchBar;
    private String query = "1,2,3";



    @FXML
    void DashBoardButtonClick(ActionEvent event) throws IOException {
//        new ScenseSwitch(GeneralStackPane,"/fxml/DashBoard.fxml");
        UserName.setText(query);

    }
    @FXML
    void searchQuery(InputMethodEvent event) {
        UserName.setText(searchBar.getText());

    }



}
