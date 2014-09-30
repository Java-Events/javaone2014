package org.rapidpm.demo.javaone2014.fxcdi;

import org.loadui.testfx.GuiTest;
import org.rapidpm.commons.cdi.se.CDIContainerSingleton;

/**
 * Created by Sven Ruppert on 29.09.2014.
 */
public abstract class CDIGuiTest extends GuiTest {

  public CDIGuiTest() {
    CDIContainerSingleton.getInstance().activateCDI(this);
  }




}
