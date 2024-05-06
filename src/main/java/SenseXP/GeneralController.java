package SenseXP;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class GeneralController {

    @FXML
    private Label CreatorLabel;

    @FXML
    private Label CurrentVersionLabel;

    @FXML
    private AnchorPane DashBoard;

    @FXML
    private Button DashBoardButton;

    @FXML
    private Label DateMLabel;

    @FXML
    private MenuButton DropDown;

    @FXML
    private Label ExprimentNameLabel;

    @FXML
    private StackPane GeneralStackPane;

    @FXML
    private Label IDLabel;

    @FXML
    private Label LastMLabel;

    @FXML
    private Label OptionLabel;

    @FXML
    private Label ResultLabel;

    @FXML
    private Button addExperimentButton;

    @FXML
    private AnchorPane dashboardPanel;

    @FXML
    private Label entriesLabel;

    @FXML
    private AnchorPane headPanel;

    @FXML
    private Label labelDashBoard;

    @FXML
    private Label labelSenseXP;

    @FXML
    private TextField searchBar;

    @FXML
    private Label showLabel;

    @FXML
    void DashBoardButtonClick(ActionEvent event) throws IOException {
        new ScenseSwitch(GeneralStackPane,"/fxml/DashBoard.fxml");

    }

}
