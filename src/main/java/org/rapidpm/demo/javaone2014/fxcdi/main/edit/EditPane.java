package org.rapidpm.demo.javaone2014.fxcdi.main.edit;


import org.rapidpm.commons.cdi.fx.components.CDIBaseAnchorPane;

/**
 * Created by Sven Ruppert on 01.06.2014.
 */
public class EditPane extends CDIBaseAnchorPane<EditPane, EditPaneController> {

  public EditPane(){
    System.out.println("EditPane constructed with controller = " + controller);
  }

  public void setLabelText(){
    getController().useService();
  }

  @Override
  public Class<EditPane> getPaneClass() {
    return EditPane.class;
  }
}
