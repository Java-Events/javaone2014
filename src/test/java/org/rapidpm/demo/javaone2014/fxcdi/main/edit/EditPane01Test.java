package org.rapidpm.demo.javaone2014.fxcdi.main.edit;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.junit.Assert;
import org.junit.Test;
import org.loadui.testfx.Assertions;
import org.loadui.testfx.utils.FXTestUtils;
import org.rapidpm.demo.javaone2014.fxcdi.CDIGuiTest;

import static org.loadui.testfx.controls.Commons.hasText;

/**
 * Created by Sven Ruppert on 30.09.2014.
 */
public class EditPane01Test extends CDIGuiTest {


  @Override
  protected Parent getRootNode() {
    return new EditPane();
  }


  @Test
  public void testEditPane01() throws Exception {
    final EditPane editPane = find("#editPane");
    Assert.assertNotNull(editPane);

    final Button btn = find("#btn");
    Assert.assertNotNull(btn);

    final Label lb = find("#lb");
    Assert.assertNotNull(lb);

    Assertions.verifyThat(btn, hasText("Edit Button"));
    Assertions.verifyThat(lb, hasText("Hello Edit"));
  }


}
