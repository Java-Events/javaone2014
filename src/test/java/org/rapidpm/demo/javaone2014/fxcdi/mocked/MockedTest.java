package org.rapidpm.demo.javaone2014.fxcdi.mocked;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.junit.Assert;
import org.junit.Test;
import org.loadui.testfx.Assertions;
import org.loadui.testfx.utils.FXTestUtils;
import org.rapidpm.demo.javaone2014.fxcdi.CDIGuiTest;
import org.rapidpm.demo.javaone2014.fxcdi.MainContext;
import org.rapidpm.demo.javaone2014.fxcdi.main.MainPane;
import org.rapidpm.demo.javaone2014.fxcdi.main.edit.EditPane;
import org.rapidpm.demo.javaone2014.fxcdi.main.edit.EditPaneController;

import javax.inject.Inject;

import static org.loadui.testfx.controls.Commons.hasText;

/**
 * Created by Sven Ruppert on 30.09.2014.
 */
public class MockedTest extends CDIGuiTest {

  @Inject MainContext context;

  @Override
  protected Parent getRootNode() {
    return new MainPane();
  }


  @Test
  public void testMockedBusinessLogic01() throws Exception {

    final EditPane editPane = find("#editPane");
    Assert.assertNotNull(editPane);

    final EditPaneController controller = editPane.getController();
//    runTheTest(editPane, controller);

    context.setBusinessSubLogicMocked(true);
    context.setBusinessLogicMocked(true);
    controller.reconfigure();
//
    runTheTest(editPane, controller);


  }

  private void runTheTest(EditPane editPane, EditPaneController controller) throws Exception {
    FXTestUtils.invokeAndWait(controller::useService, 1); //Service used 0

    final Label editPaneLabel = find("#lb", editPane);
    Assert.assertNotNull(editPaneLabel);

    final Button btnMain = find("#btn",find("#mainPane"));
    clickOn(btnMain);
//    Assertions.verifyThat(btnMain, hasText("Main pressed 0"));
    Assertions.verifyThat(editPaneLabel, hasText("Service used 1"));
  }
}
