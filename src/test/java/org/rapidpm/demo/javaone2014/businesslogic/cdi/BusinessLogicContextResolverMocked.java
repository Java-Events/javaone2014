package org.rapidpm.demo.javaone2014.businesslogic.cdi;

import org.rapidpm.commons.cdi.CDICommonsMocked;
import org.rapidpm.commons.cdi.contextresolver.CDIContext;
import org.rapidpm.commons.cdi.contextresolver.ContextResolver;
import org.rapidpm.commons.cdi.logger.CDILogger;
import org.rapidpm.demo.javaone2014.Mocked;
import org.rapidpm.demo.javaone2014.fxcdi.MainContext;
import org.rapidpm.module.se.commons.logger.Logger;

import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Inject;

/**
 * Created by Sven Ruppert on 30.09.2014.
 */
@CDICommonsMocked
public class BusinessLogicContextResolverMocked implements ContextResolver {

  @Inject @CDILogger Logger logger;
  @Inject CDIContext cdiContext; //only here mocked information

  @Override
  public AnnotationLiteral resolveContext(Class<?> aClass) {
    final boolean mocked = ((MainContext) cdiContext).isBusinessLogicMocked();
    System.out.println("BusinessLogicContextResolverMocked->mocked = " + mocked);
    if (mocked) {
      if(BusinessLogic.class.equals(aClass)){
        return new AnnotationLiteral<Mocked>() {
        };
      }
    }
    return null; // no mocking
  }
}
