package SenseXP;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class NoticeStageController {

    @FXML
    private Label BackGroundColorLabel;

    @FXML
    private Button ChangeButton;

    @FXML
    private Button ChangeButton0;

    @FXML
    private Button ChangeButton2;

    @FXML
    private Button ChangeButton3;

    @FXML
    private Label DisablebuttonLabel;

    @FXML
    private Label EndDelayLabel;

    @FXML
    private StackPane NoticeStagePane;

    @FXML
    private AnchorPane Properties;

    @FXML
    private Label StartDelayLabel;

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
    private Label fontLabel;

    @FXML
    private Label labelEditExperiment;

    @FXML
    private Label labelSenseXP;

    @FXML
    private Button menuButton;

    @FXML
    private Button noticeStageButton;

    @FXML
    private Label textColorlabel;

    @FXML
    private TextArea textField1;

    @FXML
    private TextArea textField11;

    @FXML
    private TextArea textField111;

    @FXML
    private TextArea textFrame;

    @FXML
    private TextArea timeField;

    @FXML
    private TextArea timeField2;

    @FXML
    private Button upButton;

    @FXML
    void AddGLMSButton(ActionEvent event) {

    }

    @FXML
    void AddInputSoundButton(ActionEvent event) throws IOException {
        new ScenseSwitch(NoticeStagePane,"/fxml/InputStage.fxml");


    }

    @FXML
    void AddTastTestButton(ActionEvent event) throws IOException {
        new ScenseSwitch(NoticeStagePane,"/fxml/AddTasteTest.fxml");


    }

    @FXML
    void AddTimerStageButton(ActionEvent event) throws IOException {
        new ScenseSwitch(NoticeStagePane,"/fxml/TimerStage.fxml");



    }

    @FXML
    void AddVasStageButton(ActionEvent event) throws IOException {
        new ScenseSwitch(NoticeStagePane,"/fxml/TimerStage.fxml");


    }

    @FXML
    void AssignSoundButton(ActionEvent event) throws IOException {
        new ScenseSwitch(NoticeStagePane,"/fxml/TimerStage.fxml");


    }

}
