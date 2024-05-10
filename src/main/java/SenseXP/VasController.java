package SenseXP;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class VasController {

    @FXML
    private Label PlaySoundLabel;

    @FXML
    private AnchorPane Properties;

    @FXML
    private StackPane VasStackPane;

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
    private TextArea buttonTxtField;

    @FXML
    private CheckBox checkBoxSwap;

    @FXML
    private ChoiceBox<?> choiceBoxAvail;

    @FXML
    private Button crossButton;

    @FXML
    private Button downButton;

    @FXML
    private TextArea highAncTxtField;

    @FXML
    private TextArea highAncValField;

    @FXML
    private Label labelEditExperiment;

    @FXML
    private Label labelSenseXP;

    @FXML
    private TextArea lowAncTxtField;

    @FXML
    private TextArea lowAncValField;

    @FXML
    private Button menuButton;

    @FXML
    private Button noticeStageButton;

    @FXML
    private TextArea questionField;

    @FXML
    private RadioButton radioButtonAvailable;

    @FXML
    private RadioButton radioButtonYes;

    @FXML
    private TextArea textFrame;

    @FXML
    private Button upButton;

    @FXML
    private TextArea yesField;

    @FXML
    void AddGLMSButton(ActionEvent event) throws IOException {
        new ScenseSwitch(VasStackPane,"/fxml/GLMS.fxml");
    }

    @FXML
    void AddInputStage(ActionEvent event) throws IOException {
        new ScenseSwitch(VasStackPane,"/fxml/InputStage.fxml");
    }

    @FXML
    void AddNoticeButton(ActionEvent event) throws IOException {
        new ScenseSwitch(VasStackPane,"/fxml/NoticeStage_1.fxml");


    }

    @FXML
    void AddTimerButton(ActionEvent event) throws IOException {
        new ScenseSwitch(VasStackPane,"/fxml/TimerStage.fxml");



    }


    @FXML
    void AddTastTestButton(ActionEvent event) throws IOException {
        new ScenseSwitch(VasStackPane,"/fxml/AddTasteTest.fxml");


    }
    @FXML
    void AssignSoundButton(ActionEvent event) throws IOException {
        new ScenseSwitch(VasStackPane,"/fxml/AddSound.fxml");


    }

    @FXML
    void AddQuestionStage(ActionEvent event) throws IOException {
        new ScenseSwitch(VasStackPane,"/fxml/QuestionStage.fxml");



    }

}
