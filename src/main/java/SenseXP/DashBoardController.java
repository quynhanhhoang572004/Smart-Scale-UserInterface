package SenseXP;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

public class DashBoardController {

    @FXML
    private AnchorPane DashBoard;

    @FXML
    private AnchorPane DashBoard1;

    @FXML
    private Button DashBoardButton1;

    @FXML
    private Button DashBoardButton2;

    @FXML
    private Button DashBoardButton3;

    @FXML
    private Button DashBoardButton4;

    @FXML
    private Button DashBoardButton5;

    @FXML
    private Button DashBoardButton6;

    @FXML
    private StackPane DashBoardStackPane;

    @FXML
    private ComboBox<?> DropDown;

    @FXML
    private Label EntriesLabel;

    @FXML
    private AnchorPane SenseXPBar;

    @FXML
    private Label ShowLabel;

    @FXML
    private AnchorPane SideBar;

    @FXML
    private Button btn_AddExperiment;

    @FXML
    private Label lbl_DashBoard;

    @FXML
    private TableColumn<?, ?> lbl_Option;

    @FXML
    private Label lbl_SenseXP;

    @FXML
    private TableColumn<?, ?> lbl_createDate;

    @FXML
    private TableColumn<?, ?> lbl_creator;

    @FXML
    private TableColumn<?, ?> lbl_experimentName;

    @FXML
    private TableColumn<?, ?> lbl_iD;

    @FXML
    private TableColumn<?, ?> lbl_result;

    @FXML
    private TextField searchBar;

}
