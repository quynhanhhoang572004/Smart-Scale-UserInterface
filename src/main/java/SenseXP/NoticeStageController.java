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
    private Button ChangeButton;

    @FXML
    private Button ChangeButton0;

    @FXML
    private Button ChangeButton2;

    @FXML
    private Button ChangeButton3;

    @FXML
    private StackPane NoticeStagePane;

    @FXML
    private AnchorPane Properties;

    @FXML
    private Label avatarLabel;

    @FXML
    private Button btn_AddConditionalStatement;

    @FXML
    private Button btn_AddCourse;

    @FXML
    private Button btn_AddGLMS;

    @FXML
    private Button btn_AddPeriodicStage;

    @FXML
    private Button btn_AddQuestionStage;

    @FXML
    private Button btn_addAudibleInstruction;

    @FXML
    private Button btn_addFoodAndTaste;

    @FXML
    private Button btn_addInput;

    @FXML
    private Button btn_addRatingContainer;

    @FXML
    private Button btn_addTasteTest;

    @FXML
    private Button btn_addTimer;

    @FXML
    private Button btn_addVasStage;

    @FXML
    private Button btn_assignSound;

    @FXML
    private Button btn_down;

    @FXML
    private Button btn_menu;

    @FXML
    private Button btn_noticeStage;

    @FXML
    private Button crossButton;

    @FXML
    private Button downButton;

    @FXML
    private Label lbl_EditExperiment;

    @FXML
    private Label lbl_SenseXP;

    @FXML
    private Label lbl_backgroundColor;

    @FXML
    private Label lbl_disable;

    @FXML
    private Label lbl_endDelay;

    @FXML
    private Label lbl_font;

    @FXML
    private Label lbl_startDelay;

    @FXML
    private Label lbl_textColor;

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
    @FXML
    void AddQuestionButton(ActionEvent event) throws IOException {
        new ScenseSwitch(NoticeStagePane,"/fxml/QuestionStage.fxml");

    }

}
