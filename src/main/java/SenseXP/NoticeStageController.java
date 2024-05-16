package SenseXP;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class NoticeStageController {

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
    private Button btn_ChangeTextColor;

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
    private Button btn_changeBackGroudcolor;

    @FXML
    private Button btn_changeFont;

    @FXML
    private Button btn_cross;

    @FXML
    private Button btn_disable;

    @FXML
    private Button btn_down;

    @FXML
    private Button btn_menu;

    @FXML
    private Button btn_noticeStage;

    @FXML
    private Button btn_up;

    @FXML
    private Label lbl_EditExperiment;

    @FXML
    private Label lbl_SenseXP;

    @FXML
    void btn_AddConditionalStatement(ActionEvent event) {

    }

    @FXML
    void btn_AddCourse(ActionEvent event) {

    }

    @FXML
    void btn_AddGLMS(ActionEvent event) throws IOException {
        new ScenseSwitch(NoticeStagePane,"/fxml/GLMS.fxml");


    }

    @FXML
    void btn_AddPeriodicStage(ActionEvent event) {

    }

    @FXML
    void btn_AddQuestionStage(ActionEvent event) throws IOException {
        new ScenseSwitch(NoticeStagePane,"/fxml/QuestionStage.fxml");


    }

    @FXML
    void btn_addAudibleInstruction(ActionEvent event) {

    }

    @FXML
    void btn_addFoodAndTaste(ActionEvent event) {

    }

    @FXML
    void btn_addInput(ActionEvent event) throws IOException {
        new ScenseSwitch(NoticeStagePane,"/fxml/InputStage.fxml");


    }

    @FXML
    void btn_addRatingContainer(ActionEvent event) {

    }

    @FXML
    void btn_addTasteTest(ActionEvent event) {

    }

    @FXML
    void btn_addTimer(ActionEvent event) throws IOException {
        new ScenseSwitch(NoticeStagePane,"/fxml/TimerStage.fxml");


    }

    @FXML
    void btn_assignSound(ActionEvent event) {

    }

    @FXML
    void btn_changeBackGroudcolor(ActionEvent event) {

    }

    @FXML
    void btn_menu(ActionEvent event) {

    }

    @FXML
    void btn_noticeStage(ActionEvent event) throws IOException {
        new ScenseSwitch(NoticeStagePane,"/fxml/NoticeStage_1.fxml");


    }
    @FXML
    void btn_addVasStage(ActionEvent event) throws IOException {
        new ScenseSwitch(NoticeStagePane,"/fxml/NoticeStage_1.fxml");


    }

}
