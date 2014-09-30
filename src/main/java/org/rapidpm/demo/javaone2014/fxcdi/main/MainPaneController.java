package org.rapidpm.demo.javaone2014.fxcdi.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.rapidpm.commons.cdi.fx.JavaFXBaseController;
import org.rapidpm.demo.javaone2014.fxcdi.MainBaseController;
import org.rapidpm.demo.javaone2014.fxcdi.main.edit.EditPane;

import javax.inject.Inject;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Sven Ruppert on 01.06.2014.
 */
public class MainPaneController extends MainBaseController {

  @FXML Button btn;
  @FXML EditPane editPane;
//  @Inject EditPane editPane;

  public MainPaneController() {
    System.out.println("MainPaneController constructor" );
  }

  private int counter = 0;

  public void onDoSomething(ActionEvent actionEvent){
    btn.setText("Main pressed " + counter);
    counter = counter +1;
    //label from Edit changing
    editPane.setLabelText();
  }

}
