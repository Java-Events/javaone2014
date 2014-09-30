package org.rapidpm.demo.javaone2014.afterburner.orig.presentation.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import org.rapidpm.demo.javaone2014.businesslogic.Service;

import javax.inject.Inject;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Sven Ruppert on 04.12.13.
 */
public class DemoPresenter implements Initializable {
  @FXML Label messageA;

  //not working with complex CDI constructs (Scopes and so on)
//  @Inject BusinessLogic businessLogicA;
  @Inject Service businessLogicA;

  public void launch() {
    messageA.setText(businessLogicA.calculate());
  }

  @Override
  public void initialize(URL location, ResourceBundle resources) {

  }
}
