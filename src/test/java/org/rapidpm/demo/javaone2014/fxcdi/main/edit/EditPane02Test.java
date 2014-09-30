package org.rapidpm.demo.javaone2014.fxcdi.main.edit;

import javafx.scene.Parent;
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
public class EditPane02Test extends CDIGuiTest {

  @Override
  protected Parent getRootNode() {
    return new EditPane();
  }

  @Test
  public void testEditPaneController01() throws Exception {
    final EditPane editPane = find("#editPane");
    final Label lb = find("#lb");

    final EditPaneController controller = editPane.getController();
    Assert.assertNotNull(controller);
    FXTestUtils.invokeAndWait(controller::useService, 1);
    Assertions.verifyThat(lb, hasText("Service used 0"));
  }


}
