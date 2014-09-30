package org.rapidpm.demo.javaone2014.fx.main.edit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.rapidpm.demo.javaone2014.businesslogic.Service;

/**
 * Created by Sven Ruppert on 01.06.2014.
 */
public class EditPaneController {

  private Service service = new Service();

  @FXML Button btn;
  @FXML Label lb;

  public EditPaneController() {
    System.out.println("EditPaneController = OK" );
  }

  private int counter = 0;
  public void onDoSomething(ActionEvent actionEvent){
    btn.setText("Edit pressed " + counter);
    counter = counter +1;
  }

  public void useService(){
    lb.setText(service.calculate());
  }

}
