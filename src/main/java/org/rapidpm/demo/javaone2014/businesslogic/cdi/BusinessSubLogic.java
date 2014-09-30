package org.rapidpm.demo.javaone2014.businesslogic.cdi;

import org.rapidpm.commons.cdi.CDINotMapped;

/**
 * Created by Sven Ruppert on 30.09.2014.
 */
@CDINotMapped
public interface BusinessSubLogic {
  public String calculate();
}
