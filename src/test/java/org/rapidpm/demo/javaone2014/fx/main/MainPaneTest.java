package org.rapidpm.demo.javaone2014.fx.main;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.junit.Assert;
import org.junit.Test;
import org.loadui.testfx.Assertions;
import org.loadui.testfx.GuiTest;
import org.rapidpm.demo.javaone2014.fx.main.edit.EditPane;

import static org.loadui.testfx.controls.Commons.hasText;

/**
 * Created by Sven Ruppert on 29.09.2014.
 */
public class MainPaneTest extends GuiTest {

  @Override
  protected Parent getRootNode() {
    return new MainPane();
  }

  @Test
  public void testMainButton01() throws Exception {
    final Label lbMain = find("#lb");
    Assert.assertNotNull(lbMain);
    Assertions.verifyThat(lbMain, hasText("Hello World"));

    final Button btnMain = find("#btn");
    Assert.assertNotNull(btnMain);
    Assertions.verifyThat(btnMain, hasText("Main Button"));

    final EditPane editPane = find("#editPane");
    Assert.assertNotNull(editPane);
  }
  @Test
  public void testMainButton02() throws Exception {
    final Label lbMain = find("#lb");
    final Button btnMain = find("#btn");

    clickOn(btnMain);
    Assertions.verifyThat(lbMain, hasText("Hello World"));
    Assertions.verifyThat(btnMain, hasText("Main pressed 0"));
    clickOn(btnMain);
    Assertions.verifyThat(btnMain, hasText("Main pressed 1"));
  }

  @Test
  public void testMainButton03() throws Exception {
    final Button btnMain = find("#btn");
    final Label editPaneLabel = find("#lb", find("#editPane"));
    Assert.assertNotNull(editPaneLabel);

    clickOn(btnMain);
    Assertions.verifyThat(btnMain, hasText("Main pressed 0"));
    Assertions.verifyThat(editPaneLabel, hasText("Service used 0"));

    clickOn(btnMain);
    Assertions.verifyThat(btnMain, hasText("Main pressed 1"));
    Assertions.verifyThat(editPaneLabel, hasText("Service used 1"));
  }
}
