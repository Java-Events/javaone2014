package org.rapidpm.demo.javaone2014.fxcdi.main.edit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.rapidpm.demo.javaone2014.businesslogic.cdi.BusinessLogic;
import org.rapidpm.demo.javaone2014.businesslogic.cdi.BusinessLogicImpl;
import org.rapidpm.demo.javaone2014.fxcdi.JavaOne2014;
import org.rapidpm.demo.javaone2014.fxcdi.MainBaseController;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

/**
 * Created by Sven Ruppert on 01.06.2014.
 */
public class EditPaneController extends MainBaseController {

//  @Inject @JavaOne2014 Instance<BusinessLogic> service;
  @Inject @JavaOne2014 Instance<BusinessLogic> serviceInstance;
  BusinessLogic service; // for demo only

  @FXML Button btn;
  @FXML Label lb;

  public EditPaneController() {
    System.out.println("EditPaneController constructor " );
  }

  @PostConstruct
  public void postconstructInfo(){
    service = serviceInstance.get(); //for demo only
    System.out.println("service = " + service);
  }

  private int counter = 0;
  public void onDoSomething(ActionEvent actionEvent){
    btn.setText("Edit pressed " + counter);
    counter = counter +1;
  }

  public void reconfigure(){
    System.out.println("reconfigure");
    service = serviceInstance.get(); //for demo only
  }

  public void useService(){
    lb.setText(service.doSomething());
  }

}
