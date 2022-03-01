package main.java.com.typesOfClasses.innerClasses;

/** Outer class, is the class that contains inner classes. */
public class OuterClass {

  /**
   * A static class, always need to be an inner class. It is class throught the outer class.
   * Example:OuterClass.StaticInnerClass instance = new OuterClass.StaticInnerClass()
   */
  static class StaticInnerClass {}

  /** Inner nested class. */
  class InnerClass {

    /** Inner class constructor. */
    public InnerClass() {}
  }

  /**
   * Method that include a local inner class.
   *
   * @return
   */
  private <LocalInnerClass> Object getLocalClass() {

    /** Local Inner class inside a method. */
    class LocalInnerClass {

      public String stringValue = "String of localInnerClass";

      /** LocalInnerClass constructor. */
      public LocalInnerClass() {
        stringValue += " has been modify in the constructor";
      }
    }

    LocalInnerClass localInnerClass = new LocalInnerClass();
    return localInnerClass;
  }

  public Object accessToLocalInnerClass() {
    OuterClass outerClass = new OuterClass();
    outerClass.getLocalClass();
    return "Method that access to a local inner class that is inside a method: "
        + outerClass.getLocalClass();
  }
}
