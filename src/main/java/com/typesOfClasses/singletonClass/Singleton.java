package main.java.com.typesOfClasses.singletonClass;

/** Singleton, a class that have one object at a time. */
public class Singleton {

  private String singletonString;
  private static Singleton instance = null;

  private Singleton() {
    singletonString = "Only assign in the constructor";
  }

  /**
   * Get the same instance.
   *
   * @return Singleton object instance
   */
  public static Singleton SingletonInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }
}
