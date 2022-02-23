package main.java.com.typesOfClasses.staticClass;

/** Static class. */
public class Static {

  public String nonStaticString = "Can´t be access from the static nested class";
  public static String staticString = "Can be access from the static nested class";

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
