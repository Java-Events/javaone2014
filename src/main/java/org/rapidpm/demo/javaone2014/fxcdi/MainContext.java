package org.rapidpm.demo.javaone2014.fxcdi;

import org.rapidpm.commons.cdi.contextresolver.CDIContext;
import org.rapidpm.commons.cdi.logger.CDILogger;
import org.rapidpm.module.se.commons.logger.Logger;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Sven Ruppert on 20.07.2014.
 */


@Singleton
public class MainContext implements CDIContext {

  @Inject @CDILogger Logger logger;

  private boolean businessLogicMocked = false;
  private boolean businessSubLogicMocked = false;

  @Override
  public boolean isMockedModusActive() {
    return businessLogicMocked || businessSubLogicMocked;
  }


  public boolean isBusinessLogicMocked() {
    return businessLogicMocked;
  }

  public void setBusinessLogicMocked(boolean businessLogicMocked) {
    this.businessLogicMocked = businessLogicMocked;
  }

  public boolean isBusinessSubLogicMocked() {
    return businessSubLogicMocked;
  }

  public void setBusinessSubLogicMocked(boolean businessSubLogicMocked) {
    this.businessSubLogicMocked = businessSubLogicMocked;
  }
}
