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
    private Button btn_noticeStage;

    @FXML
    private Button btn_up;

    @FXML
    private Button downButton;

    @FXML
    private Label lbl_EditExperiment;

    @FXML
    private Label lbl_SenseXP;

    @FXML
    private Button menuButton;

    @FXML
    private TextArea textResult;

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
        new ScenseSwitch(EditStackPane,"/fxml/Timer.fxml");



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
