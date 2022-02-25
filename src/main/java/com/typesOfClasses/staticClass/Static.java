package main.java.com.typesOfClasses.staticClass;

/** Static class. */
public class Static {

  public String nonStaticString = "Can´t be access from the static nested class";
  public static String staticString =
      "Static class can´t be created as a object, remain in the memory. Only can be access to static members outer class";

  /** Only nested class can be static. */
  public static class StaticNestedClass {

    /**
     * Access to outer data class.
     *
     * @return String
     */
    public String returnStaticData() {
      return staticString;
    }
  }
}
