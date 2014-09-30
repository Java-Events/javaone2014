package org.rapidpm.demo.javaone2014.businesslogic;

import org.rapidpm.commons.cdi.contextresolver.ContextResolver;
import org.rapidpm.commons.cdi.logger.CDILogger;
import org.rapidpm.module.se.commons.logger.Logger;

import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Inject;

/**
 * Created by Sven Ruppert on 30.09.2014.
 */
public class BusinessLogicContextResolver implements ContextResolver {

  @Inject @CDILogger Logger logger;

  @Override
  public AnnotationLiteral resolveContext(Class<?> aClass) {
    if(aClass.getPackage().getName().contains("org.rapidpm.demo.javaone2014.businesslogic")){
      return new AnnotationLiteral<Production>(){};
    } else {
      return null;
    }
  }
}
