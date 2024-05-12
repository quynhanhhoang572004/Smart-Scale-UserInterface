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
    private Button menuButton;

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

    @FXML
    void AddQuestionButton(ActionEvent event) throws IOException {
        new ScenseSwitch(GLMSStackPane,"/fxml/QuestionStage.fxml");

    }


}
