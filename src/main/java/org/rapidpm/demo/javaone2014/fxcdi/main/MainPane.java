package org.rapidpm.demo.javaone2014.fxcdi.main;


import org.rapidpm.commons.cdi.fx.components.CDIBaseAnchorPane;

/**
 * Created by Sven Ruppert on 01.06.2014.
 */
public class MainPane extends CDIBaseAnchorPane<MainPane, MainPaneController> {

  public MainPane() {
    System.out.println("MainPane constructed with controller = " + controller);
  }

  @Override
  public Class<MainPane> getPaneClass() {
    return MainPane.class;
  }
}
