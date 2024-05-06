package SenseXP;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class TimerController {

    @FXML
    private Label InstructionLabel1;

    @FXML
    private AnchorPane Properties;

    @FXML
    private Label SoundDisplayLabel;

    @FXML
    private Label TimeToWaitLablel;

    @FXML
    private StackPane TimerStackPane;

    @FXML
    private Button addConditionalStatementButton;

    @FXML
    private Button addCourseButton;

    @FXML
    private Button addFoodAndTasteButton;

    @FXML
    private Button addGLMSStageButton;

    @FXML
    private Button addInputButton;

    @FXML
    private Button addPeriodicStageButton;

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
    private TextArea textField1;

    @FXML
    private TextArea textFrame;

    @FXML
    private Button upButton;

    @FXML
    void AddGLMSbutton(ActionEvent event) throws IOException {
        new ScenseSwitch(TimerStackPane,"/fxml/GLMS.fxml");



    }

    @FXML
    void AddInputStageButton(ActionEvent event) throws IOException {
        new ScenseSwitch(TimerStackPane,"/fxml/InputStage.fxml");



    }

    @FXML
    void AddNoticeButton(ActionEvent event) throws IOException {
        new ScenseSwitch(TimerStackPane,"/fxml/NoticeStage_1.fxml");



    }

    @FXML
    void AddTasteTestButton(ActionEvent event) throws IOException {
        new ScenseSwitch(TimerStackPane,"/fxml/AddTasteTest.fxml");



    }

    @FXML
    void AddTimerStageButton(ActionEvent event) {


    }

    @FXML
    void AddVasButton(ActionEvent event) throws IOException {
        new ScenseSwitch(TimerStackPane,"/fxml/VasStage.fxml");


    }

    @FXML
    void AssignSoundButton(ActionEvent event) throws IOException {
        new ScenseSwitch(TimerStackPane,"/fxml/AddSound.fxml");



    }

}
