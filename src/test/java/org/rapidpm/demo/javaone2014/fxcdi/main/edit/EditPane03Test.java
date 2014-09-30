package org.rapidpm.demo.javaone2014.fxcdi.main.edit;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.junit.Test;
import org.loadui.testfx.Assertions;
import org.rapidpm.demo.javaone2014.fxcdi.CDIGuiTest;

import static org.loadui.testfx.controls.Commons.hasText;

/**
 * Created by Sven Ruppert on 30.09.2014.
 */
public class EditPane03Test extends CDIGuiTest {

  @Override
  protected Parent getRootNode() {
    return new EditPane();
  }

  @Test
  public void testEditPane02() throws Exception {
    final Button btn = find("#btn");
    final Label lb = find("#lb");

    Assertions.verifyThat(btn, hasText("Edit Button"));
    clickOn(btn);
    Assertions.verifyThat(btn, hasText("Edit pressed 0"));
    clickOn(btn);
    Assertions.verifyThat(btn, hasText("Edit pressed 1"));

    Assertions.verifyThat(lb, hasText("Hello Edit"));
  }
}
