package main.java.com.typesOfClasses.wrapperClass;

import main.java.com.typesOfClasses.pojoClass.POJO;

/** WrapperClass represents a conversión of a primitive object to a new object and viceversa. */
public class WrapperClass {

  /**
   * Wrap the int value of POJO to Integer object type.
   *
   * @return Integer
   */
  public Integer POJOintToWrapperClass() {
    POJO pojo = new POJO();
    pojo.setIntValue(1);
    Integer intValue = pojo.getIntValue();

    return intValue;
  }
}
