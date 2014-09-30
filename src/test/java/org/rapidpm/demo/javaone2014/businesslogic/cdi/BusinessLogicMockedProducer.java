package org.rapidpm.demo.javaone2014.businesslogic.cdi;

import org.rapidpm.commons.cdi.CDICommons;
import org.rapidpm.commons.cdi.ManagedInstanceCreator;
import org.rapidpm.commons.cdi.contextresolver.ContextResolver;
import org.rapidpm.demo.javaone2014.Mocked;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;

/**
 * Created by Sven Ruppert on 30.09.2014.
 */
public class BusinessLogicMockedProducer {


  @Inject @CDICommons ContextResolver contextResolver;
  @Inject ManagedInstanceCreator instanceCreator;

  @Produces @Mocked
  public BusinessLogic create(){
    System.out.println("BusinessLogicProducer (Mocked) => Production Code");
    return instanceCreator.activateCDI(new BusinessLogicMocked());
  }
}
