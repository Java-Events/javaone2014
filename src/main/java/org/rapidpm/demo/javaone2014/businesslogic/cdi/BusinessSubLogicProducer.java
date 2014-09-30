package org.rapidpm.demo.javaone2014.businesslogic.cdi;

import org.rapidpm.commons.cdi.CDICommons;
import org.rapidpm.commons.cdi.ManagedInstanceCreator;
import org.rapidpm.commons.cdi.contextresolver.ContextResolver;
import org.rapidpm.demo.javaone2014.fxcdi.JavaOne2014;

import javax.enterprise.inject.Produces;
import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Inject;

/**
 * Created by Sven Ruppert on 30.09.2014.
 */
public class BusinessSubLogicProducer {

  @Inject @CDICommons ContextResolver contextResolver;
  @Inject ManagedInstanceCreator instanceCreator;

  @Produces @JavaOne2014
  public BusinessSubLogic create(){
    System.out.println("BusinessSubLogicProducer => JavaOne2014");
    final Class<BusinessSubLogic> beanType = BusinessSubLogic.class;
    final AnnotationLiteral literal = contextResolver.resolveContext(beanType);
    System.out.println("BusinessLogicProducer->literal = " + literal);
    System.out.println("beanType = " + beanType);
    final BusinessSubLogic managedInstance = instanceCreator.getManagedInstance(beanType, literal);
    return managedInstance;
  }
}
