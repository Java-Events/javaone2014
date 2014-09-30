package org.rapidpm.demo.javaone2014.afterburner.orig.presentation.demo;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;
import org.loadui.testfx.GuiTest;

import static org.loadui.testfx.Assertions.verifyThat;
import static org.loadui.testfx.controls.Commons.hasText;

/**
 * Created by Sven Ruppert on 29.09.2014.
 */
public class DemoPresenterTest extends GuiTest {
  @Override
  protected Parent getRootNode() {
    return new DemoView().getView();
  }


  @Test
  public void testDemoView01() throws Exception {
    final AnchorPane demoView = find("#demoView");
    Assert.assertNotNull(demoView);
  }

  @Test
  public void testDemoView02() throws Exception {
    final AnchorPane demoView = find("#demoView");
    Assert.assertNotNull(demoView);

    final Button button = find("#launch");
    Assert.assertNotNull(button);
//    hasText("Launch");
    verifyThat(button, hasText("Launch"));

    final Label label = find("#messageA");
    Assert.assertNotNull(label);
    final Matcher<Object> matcher = hasText("Service not used until now");
    verifyThat(label, matcher);
    verifyThat(label, hasText("Service not used until now"));

    clickOn(button);
    waitUntil(label, hasText("Service used 0"), 1);
    clickOn(button);
    waitUntil(label, hasText("Service used 1"), 1);

  }
}
