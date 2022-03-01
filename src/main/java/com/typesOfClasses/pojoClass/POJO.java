package main.java.com.typesOfClasses.pojoClass;

/**
 * POJO: Plain Old Java Object. Java class that contains only private variables, setter and getter.
 * It is used to define Java objects that increaste the reusability and readability of a Java
 * Program. It does not extend the predefined classes such as Arrays, it cannot contain
 * pre-specified annotations It cannot implement pre-defined interfaces, it is not required to add
 * constructor.
 */
public class POJO {

  /** String variable. */
  private String stringData = "String value";

  /** Int variable. */
  private int intValue = 1;

  /**
   * Get string value.
   *
   * @return String
   */
  public String getStringData() {
    return stringData;
  }

  /**
   * Set string value.
   *
   * @param stringData String
   */
  public void setStringData(String stringData) {
    this.stringData = stringData;
  }

  /**
   * Get int value.
   *
   * @return int
   */
  public int getIntValue() {
    return intValue;
  }

  /**
   * Set int value.
   *
   * @param intValue int
   */
  public void setIntValue(int intValue) {
    this.intValue = intValue;
  }
}
