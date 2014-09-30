package org.rapidpm.demo.javaone2014.fxcdi.main;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.junit.Assert;
import org.junit.Test;
import org.loadui.testfx.Assertions;
import org.rapidpm.demo.javaone2014.fxcdi.CDIGuiTest;
import org.rapidpm.demo.javaone2014.fxcdi.main.edit.EditPane;

import static org.loadui.testfx.controls.Commons.hasText;

/**
 * Created by Sven Ruppert on 30.09.2014.
 */
public class MainPane02Test extends CDIGuiTest {

  @Override
  protected Parent getRootNode() {
    return new MainPane();
  }


  @Test
  public void testMainPane02() throws Exception {
    final Label lbMain = find("#lb");
    final Button btnMain = find("#btn");

    clickOn(btnMain);
    Assertions.verifyThat(lbMain, hasText("Hello World"));
    Assertions.verifyThat(btnMain, hasText("Main pressed 0"));
    clickOn(btnMain);
    Assertions.verifyThat(btnMain, hasText("Main pressed 1"));
  }


}
