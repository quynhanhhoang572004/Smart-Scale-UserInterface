package SenseXP;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class InputStageController {
    @FXML
    private StackPane InputStackPane;

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
    private Button btn_cross;

    @FXML
    private Button btn_down;

    @FXML
    private Button btn_menu;

    @FXML
    private Button btn_noticeStage;

    @FXML
    private Button btn_up;

    @FXML
    private Label lbl_ButtonText;

    @FXML
    private Label lbl_EditExperiment;

    @FXML
    private Label lbl_SenseXP;

    @FXML
    private Label lbl_help;

    @FXML
    private Label lbl_playSound;

    @FXML
    private Label lbl_question;

    @FXML
    private Label lbl_storeResponse;

    @FXML
    private TextArea textFrame;

    @FXML
    void AddGLMSButton(ActionEvent event) throws IOException {
        new ScenseSwitch(InputStackPane,"/fxml/GLMS.fxml");


    }

    @FXML
    void AddInputStageButton(ActionEvent event) throws IOException {
        new ScenseSwitch(InputStackPane,"/fxml/InputStage.fxml");



    }

    @FXML
    void AddNoticeButton(ActionEvent event) throws IOException {
        new ScenseSwitch(InputStackPane,"/fxml/NoticeStage_1.fxml");

    }

    @FXML
    void AddTasteTestButton(ActionEvent event) throws IOException {
        new ScenseSwitch(InputStackPane,"/fxml/TimerStage.fxml");


    }

    @FXML
    void AddTimerStagebutton(ActionEvent event) throws IOException {
        new ScenseSwitch(InputStackPane,"/fxml/TimerStage.fxml");


    }

    @FXML
    void AddVasButton(ActionEvent event) throws IOException {
        new ScenseSwitch(InputStackPane,"/fxml/VasStage.fxml");


    }

    @FXML
    void AssignSoundButton(ActionEvent event) throws IOException {
        new ScenseSwitch(InputStackPane,"/fxml/AddSound.fxml");



    }
    @FXML
    void AddQuestionStageButton(ActionEvent event) throws IOException {
        new ScenseSwitch(InputStackPane,"/fxml/QuestionStage.fxml");

    }

}
