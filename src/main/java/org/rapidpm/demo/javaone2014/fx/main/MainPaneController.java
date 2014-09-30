package org.rapidpm.demo.javaone2014.fx.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.rapidpm.demo.javaone2014.fx.main.edit.EditPane;

/**
 * Created by Sven Ruppert on 01.06.2014.
 */
public class MainPaneController {

  @FXML Button btn;
  @FXML EditPane editPane;

  public MainPaneController() {
    System.out.println("MainPaneController = OK" );
  }

  private int counter = 0;

  public void onDoSomething(ActionEvent actionEvent){
    btn.setText("Main pressed " + counter);
    counter = counter +1;
    //label from Edit changing
    editPane.setLabelText();
  }

}
