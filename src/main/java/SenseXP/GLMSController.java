package SenseXP;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class GLMSController {

    @FXML
    private Label BackGroundColorLabel;

    @FXML
    private StackPane GLMSStackPane;

    @FXML
    private AnchorPane Properties;

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
    private Label textColorlabel;

    @FXML
    private TextArea textFrame;

    @FXML
    private TextArea timeField;

    @FXML
    private Button upButton;

    @FXML
    void AddGLMSbutton(ActionEvent event) {

    }

    @FXML
    void AddInputButton(ActionEvent event) throws IOException {
        new ScenseSwitch(GLMSStackPane,"/fxml/InputStage.fxml");
    }

    @FXML
    void AddNoticeButton(ActionEvent event) throws IOException {
        new ScenseSwitch(GLMSStackPane,"/fxml/NoticeStage_1.fxml");

    }

    @FXML
    void AddTimerButton(ActionEvent event) throws IOException {
        new ScenseSwitch(GLMSStackPane,"/fxml/TimerStage.fxml");



    }
    @FXML
    void AddTasteButton(ActionEvent event) throws IOException {
        new ScenseSwitch(GLMSStackPane,"/fxml/AddTasteTest.fxml");



    }

    @FXML
    void AddVasButton(ActionEvent event) throws IOException {
        new ScenseSwitch(GLMSStackPane,"/fxml/VasStage.fxml");


    }

    @FXML
    void AssignSoundButton(ActionEvent event) throws IOException {
        new ScenseSwitch(GLMSStackPane,"/fxml/AddSound.fxml");


    }

}
