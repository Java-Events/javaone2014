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
public class MainPane03Test extends CDIGuiTest {

  @Override
  protected Parent getRootNode() {
    return new MainPane();
  }


  @Test
  public void testMainPane03() throws Exception {
    final Button btnMain = find("#btn",find("#mainPane"));
    final EditPane editPane = find("#editPane");
    Assert.assertNotNull(editPane);

    final Label editPaneLabel = find("#lb", editPane);
    Assert.assertNotNull(editPaneLabel);

    clickOn(btnMain);
    Assertions.verifyThat(btnMain, hasText("Main pressed 0"));
    Assertions.verifyThat(editPaneLabel, hasText("Service used 0"));

    clickOn(btnMain);
    Assertions.verifyThat(btnMain, hasText("Main pressed 1"));
    Assertions.verifyThat(editPaneLabel, hasText("Service used 1"));
  }
}
