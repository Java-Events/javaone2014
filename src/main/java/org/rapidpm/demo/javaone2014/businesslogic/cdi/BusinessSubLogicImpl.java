package org.rapidpm.demo.javaone2014.businesslogic.cdi;

import org.rapidpm.demo.javaone2014.businesslogic.Production;

import javax.annotation.PostConstruct;
import java.time.Instant;

/**
 * Created by Sven Ruppert on 04.12.13.
 */
@Production
public class BusinessSubLogicImpl implements BusinessSubLogic {

  @PostConstruct
  public void init() {
    System.out.println("BusinessSubLogicImpl.PostConstruct -> " + Instant.now());
  }

  private int counter = 0;

  public String calculate() {
    String result = "Service used " + counter;
    counter = counter + 1;
    return result;
  }
}
