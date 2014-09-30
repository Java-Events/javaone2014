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
 * Created by Sven Ruppert on 29.09.2014.
 */
public class MainPane01Test extends CDIGuiTest {

  @Override
  protected Parent getRootNode() {
    return new MainPane();
  }

  @Test
  public void testMainPane01() throws Exception {
    final Label lbMain = find("#lb");
    Assert.assertNotNull(lbMain);
    Assertions.verifyThat(lbMain, hasText("Hello World"));

    final Button btnMain = find("#btn");
    Assert.assertNotNull(btnMain);
    Assertions.verifyThat(btnMain, hasText("Main Button"));

    final EditPane editPane = find("#editPane");
    Assert.assertNotNull(editPane);
  }


}
