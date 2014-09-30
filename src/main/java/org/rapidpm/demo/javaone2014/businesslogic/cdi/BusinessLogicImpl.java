package org.rapidpm.demo.javaone2014.businesslogic.cdi;

import org.rapidpm.demo.javaone2014.businesslogic.Production;
import org.rapidpm.demo.javaone2014.fxcdi.JavaOne2014;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.time.Instant;

/**
 * Created by Sven Ruppert on 04.12.13.
 */
@Production
public class BusinessLogicImpl implements BusinessLogic {

    @Inject @JavaOne2014 BusinessSubLogic subLogic;

    @PostConstruct
    public void init() {
        System.out.println("BusinessLogicImpl.PostConstruct -> " + Instant.now());
    }

    public String doSomething() {
        return subLogic.calculate() ;
    }
}
