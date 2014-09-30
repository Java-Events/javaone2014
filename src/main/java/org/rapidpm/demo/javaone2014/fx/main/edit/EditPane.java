package org.rapidpm.demo.javaone2014.fx.main.edit;


import org.rapidpm.demo.javaone2014.fx.BasePane;

/**
 * Created by Sven Ruppert on 01.06.2014.
 */
public class EditPane extends BasePane<EditPaneController> {

  public EditPane(){ }

  public void setLabelText(){
    controller.useService();
  }
}
