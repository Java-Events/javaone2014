package org.rapidpm.demo.javaone2014.businesslogic;

/**
 * Created by Sven Ruppert on 01.06.2014.
 */
public class Service {

  private int counter = 0;
  public String calculate(){
    String result = "Service used " + counter;
    counter = counter +1;
    return result ;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Service{");
    sb.append("counter=").append(counter);
    sb.append('}');
    return sb.toString();
  }
}
