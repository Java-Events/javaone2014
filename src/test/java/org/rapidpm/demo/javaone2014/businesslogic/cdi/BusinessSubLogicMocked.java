package org.rapidpm.demo.javaone2014.businesslogic.cdi;

import org.rapidpm.demo.javaone2014.Mocked;

import javax.annotation.PostConstruct;
import java.time.Instant;

/**
 * Created by Sven Ruppert on 04.12.13.
 */
@Mocked
public class BusinessSubLogicMocked implements BusinessSubLogic {

  @PostConstruct
  public void init() {
    System.out.println("BusinessSubLogicMocked.PostConstruct -> " + Instant.now());
  }

  private int counter = 0;
  public String calculate() {
    System.out.println("BusinessSubLogicMocked.counter() = " + counter);
    String result = "Service used " + counter;
    counter = counter + 1;
    return result;
  }
}
