package SenseXP;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class EditExperimentController {

    @FXML
    private StackPane EditStackPane;

    @FXML
    private Button addConditionalStatemeaddGLMSStageButtonntButton;

    @FXML
    private Button addFoodAndTasteButton;

    @FXML
    private Button addGLMSStageButton;

    @FXML
    private Button addInputButton;

    @FXML
    private Button addPeriodicStageButtoaddGLMSStageButtonn;

    @FXML
    private Button addRatingsContainerButton;

    @FXML
    private Button addTasteTestButton;

    @FXML
    private Button addTimerButton;

    @FXML
    private Button addVASStageButton;

    @FXML
    private Button assignSoundButton;

    @FXML
    private Button audibleInstructionButton;

    @FXML
    private Label avatarLabel;

    @FXML
    private Button crossButton;

    @FXML
    private Button downButton;

    @FXML
    private Label labelEditExperiment;

    @FXML
    private Label labelSenseXP;

    @FXML
    private Button menuButton;

    @FXML
    private Button noticeStageButton;

    @FXML
    private TextArea textResult;

    @FXML
    private Button upButton;

    @FXML
    void AddFoodAndTasteButton(ActionEvent event) throws IOException {
        new ScenseSwitch(EditStackPane,"/fxml/AddTasteTest.fxml");

    }

    @FXML
    void AddGLMSstageButton(ActionEvent event) throws IOException {
        new ScenseSwitch(EditStackPane,"/fxml/GLMS.fxml");

    }

    @FXML
    void AddInputStageButton(ActionEvent event) throws IOException {
        new ScenseSwitch(EditStackPane,"/fxml/InputStage.fxml");

    }

    @FXML
    void AddNoticeStageButton(ActionEvent event) throws IOException {
        new ScenseSwitch(EditStackPane,"/fxml/NoticeStage_1.fxml");

    }

    @FXML
    void AddTasteTestButton(ActionEvent event) throws IOException {
        new ScenseSwitch(EditStackPane,"/fxml/AddTasteTest.fxml");

    }

    @FXML
    void AddTimerStageButton(ActionEvent event) throws IOException {

    }

    @FXML
    void AddVasStageButton(ActionEvent event) throws IOException {
        new ScenseSwitch(EditStackPane,"/fxml/VasStage.fxml");


    }

    @FXML
    void AssignSoundButton(ActionEvent event) throws IOException {
        new ScenseSwitch(EditStackPane,"/fxml/AddSound.fxml");

    }

}
